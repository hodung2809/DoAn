package com.chau.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ChiTietphim extends AppCompatActivity {

    ImageView imageView1,imageView2;
    TextView txtTitle, txtDetail, txtTheLoai;
    Button btnMuaVe1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tietphim);

        imageView1 = findViewById(R.id.img_chi_tiet_phim);
        txtTitle = (TextView) findViewById(R.id.txt_title);
        txtDetail = findViewById(R.id.detail_movie);
        txtTheLoai = (TextView) findViewById(R.id.txtTheLoai);
        btnMuaVe1 = (Button) findViewById(R.id.btnMuaVe);

        String title = getIntent().getExtras().getString("title");
        String detail = getIntent().getExtras().getString("detail");
        String theloai = getIntent().getExtras().getString("theloai");
        int img = getIntent().getExtras().getInt("imgURL");

        Glide.with(this).load(img).into(imageView1);
        imageView1.setImageResource(img);

        txtTitle.setText(title);
        txtDetail.setText(detail);
        txtTheLoai.setText(theloai);
    }
}