package com.veronica.sfpcc.okekang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.veronica.sfpcc.okekang.adapter.TukangAdapter;
import com.veronica.sfpcc.okekang.koneksi.ApiService;
import com.veronica.sfpcc.okekang.koneksi.RetrofitConfig;
import com.veronica.sfpcc.okekang.model.ListTukangModel;
import com.veronica.sfpcc.okekang.model.TukangModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TukangACActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TukangAdapter adapter;
    private ArrayList<TukangModel> listData;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukang_ac);

        recyclerView = (RecyclerView) findViewById(R.id.rv_tukang_ac);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(TukangACActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        listData = new ArrayList<>();
        ambilData();
    }

    private void ambilData() {
//        ApiService apiService = RetrofitConfig.getApiServices();
//        Call<ListTukangModel> call = apiService.getAllTukang();
//        call.enqueue(new Callback<ListTukangModel>() {
//            @Override
//            public void onResponse(Call<ListTukangModel> call, Response<ListTukangModel> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<ListTukangModel> call, Throwable t) {
//
//            }
//        });
    }
}