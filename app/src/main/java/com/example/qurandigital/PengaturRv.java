package com.example.qurandigital;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PengaturRv {
    @GET("data")
    Call<List<Surat>> ambilSurat();
}
