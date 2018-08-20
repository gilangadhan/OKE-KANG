package com.veronica.sfpcc.okekang.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.veronica.sfpcc.okekang.helper.KonstantaString;
import com.veronica.sfpcc.okekang.model.TukangModel;
import com.veronica.sfpcc.okekang.R;

import java.util.ArrayList;
import java.util.List;

public class TukangAdapter extends RecyclerView.Adapter<TukangAdapter.ViewHolder>{
    private Context context;
    private ArrayList<TukangModel> listData;

    public TukangAdapter(ArrayList<TukangModel> listData, Context context) {
        this.context = context;
        this.listData = listData;
    }

    @Override
    public TukangAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_tukang_ac, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TukangAdapter.ViewHolder holder, final int position) {
        holder.tvNama.setText(listData.get(position).getNamaTukang());
        holder.tvNomor.setText(listData.get(position).getKontakTukang());
        holder.tvAlamat.setText(listData.get(position).getAlamatTukang());
        Picasso.with(context)
                .load("http://codinate.hol.es/okekang/public/profil_tukang/"+ listData.get(position).getFotoTukang())
                .placeholder(R.drawable.no_image_found)
                .error(R.drawable.no_image_found)
                .into(holder.gmb);

        //kirim data

        final Bundle dataKiriman = new Bundle();
        dataKiriman.putString(KonstantaString.DATA_NAMA, listData.get(position).getNamaTukang());
        dataKiriman.putString(KonstantaString.DATA_NOMOR, listData.get(position).getKontakTukang());
        dataKiriman.putString(KonstantaString.DATA_ALAMAT, listData.get(position).getAlamatTukang());
        dataKiriman.putString(KonstantaString.DATA_GAMBAR, listData.get(position).getFotoTukang());
    }

        //Jumlah Item
    @Override
    public int getItemCount() {
        return listData.size();
    }

        //Inisialisasi Widget pada Item

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gmb;
        private CardView cv_ac;
        private TextView tvNama, tvNomor, tvAlamat;
        public ViewHolder(View itemView) {
            super(itemView);
            gmb = (ImageView)itemView.findViewById(R.id.img_profil);
            tvNama = (TextView)itemView.findViewById(R.id.tv_nama_tukang);
            tvNomor = (TextView)itemView.findViewById(R.id.tv_nomor_tukang);
            tvAlamat = (TextView)itemView.findViewById(R.id.tv_alamat_tukang);
        }
    }
}
