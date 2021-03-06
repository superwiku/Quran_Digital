package com.example.qurandigital;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientAyat {
    public static final String BASE_URL="https://raw.githubusercontent.com/penggguna/QuranJSON/master/";
    public static Retrofit retrofit;
    public static Retrofit getApiClient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
