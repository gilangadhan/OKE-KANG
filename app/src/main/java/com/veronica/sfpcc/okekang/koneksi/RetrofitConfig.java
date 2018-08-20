package com.veronica.sfpcc.okekang.koneksi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    private static Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://codinate.hol.es/okekang_api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
    public static ApiService getApiServices(){
        return getRetrofit().create(ApiService.class);
    }
}
