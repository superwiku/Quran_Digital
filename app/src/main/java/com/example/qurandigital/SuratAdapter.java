package com.example.qurandigital;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SuratAdapter extends RecyclerView.Adapter<SuratAdapter.SuratHolder> {
    List<Surat> suratList;
    Activity activity;

    public SuratAdapter(List<Surat> suratList, Activity activity) {
        this.suratList = suratList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public SuratHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_item,parent,false);
        return new SuratHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuratHolder holder, int position) {
        holder.asmanya.setText(suratList.get(position).getAsma());
        holder.namanya.setText(suratList.get(position).getNama());
        holder.jmlAyatnya.setText(Integer.toString(suratList.get(position).getAyat()));
    }

    @Override
    public int getItemCount() {
        return suratList.size();
    }

    static class SuratHolder extends RecyclerView.ViewHolder{
        TextView asmanya;
        TextView namanya;
        TextView jmlAyatnya;

        public SuratHolder(@NonNull View itemView) {
            super(itemView);
            asmanya=(TextView)itemView.findViewById(R.id.txt_asma);
            namanya=(TextView)itemView.findViewById(R.id.txt_nama);
            jmlAyatnya=(TextView)itemView.findViewById(R.id.txt_jml_ayat);
        }
    }
}
