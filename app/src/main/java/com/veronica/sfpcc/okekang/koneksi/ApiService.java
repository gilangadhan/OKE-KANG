package com.veronica.sfpcc.okekang.koneksi;

import com.veronica.sfpcc.okekang.model.ListTukangModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("admin/read_tukang.php")
    Call<ListTukangModel>getAllTukang(@Query("id_tukang")String id_tukang,
                                      @Query("nama_tukang") String nama_tukang,
                                      @Query("alamat_tukang") String alamat_tukang,
                                      @Query("jnk") String jnk);
    @GET("user/search_tukang.php")
    Call<ListTukangModel>getSearchTukang(@Query("id_tukang")String id_tukang,
                                         @Query("nama_tukang") String nama_tukang,
                                         @Query("alamat_tukang") String alamat_tukang,
                                         @Query("foto_tukang")String foto_tukang,
                                         @Query("email_tukang") String email_tukang,
                                         @Query("kontak_tukang") String kontal_tukang);
}
