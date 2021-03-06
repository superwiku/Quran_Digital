package com.example.qurandigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.azoft.carousellayoutmanager.CarouselZoomPostLayoutListener;
import com.azoft.carousellayoutmanager.CenterScrollListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    PengaturRv pengaturRv;
    CarouselLayoutManager layoutManager;
    List<Surat> listSuratnya;
    RecyclerView daftarSuratRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daftarSuratRv=(RecyclerView)findViewById(R.id.rv_quran);
        daftarSuratRv.setHasFixedSize(true);
        layoutManager=new CarouselLayoutManager(CarouselLayoutManager.VERTICAL);
        layoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());
        daftarSuratRv.setLayoutManager(layoutManager);
        daftarSuratRv.addOnScrollListener(new CenterScrollListener());
        pengaturRv=ApiClient.getApiClient().create(PengaturRv.class);
        Call<List<Surat>> call=pengaturRv.ambilSurat();
        call.enqueue(new Callback<List<Surat>>() {
            @Override
            public void onResponse(Call<List<Surat>> call, Response<List<Surat>> response) {
                listSuratnya=response.body();
                SuratAdapter a = new SuratAdapter(listSuratnya,MainActivity.this);
                daftarSuratRv.setAdapter(a);
            }

            @Override
            public void onFailure(Call<List<Surat>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"gak dapat data",Toast.LENGTH_LONG).show();
            }
        });
    }
}