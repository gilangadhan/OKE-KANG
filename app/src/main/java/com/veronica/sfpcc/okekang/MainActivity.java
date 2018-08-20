package com.veronica.sfpcc.okekang;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private SliderLayout sliderLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_beranda:
                    Intent in = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(in);
                    overridePendingTransition(0, 0);
                    finish();
                    return true;
                case R.id.menu_lainnya:
                    Intent in3 = new Intent(getApplicationContext(), LainnyaActivity.class);
                    startActivity(in3);
                    overridePendingTransition(0, 0);
                    finish();
                    return true;
                case R.id.menu_notifikasi:
                    Intent in2 = new Intent(getApplicationContext(), NotifikasiActivity.class);
                    startActivity(in2);
                    overridePendingTransition(0, 0);
                    finish();
                    return true;
                case R.id.menu_saya:
                    Intent in1 = new Intent(getApplicationContext(), SayaActivity.class);
                    startActivity(in1);
                    overridePendingTransition(0, 0);
                    finish();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderLayout = (SliderLayout) findViewById(R.id.slider);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();

        file_maps.put("ACE", R.drawable.iklan1);
        file_maps.put("American Standard", R.drawable.iklan2);
        file_maps.put("Dulux", R.drawable.iklan3);
        file_maps.put("Krisbow", R.drawable.iklan4);
        file_maps.put("Platinum", R.drawable.iklan5);
        file_maps.put("Majestic", R.drawable.iklan6);
        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);
            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            sliderLayout.addSlider(textSliderView);
            sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
            sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
            sliderLayout.setCustomAnimation(new DescriptionAnimation());
            sliderLayout.setDuration(4000);



        }

    }

}