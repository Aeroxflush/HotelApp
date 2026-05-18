package com.gerorius.hotelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {
    private ImageView _imageView2;
    Button btnToActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        _imageView2 = findViewById(R.id.imageView2);
        String imageUrl= "https://salsawisata.com/wp-content/uploads/2022/11/pantai-karang-sanur-bali.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView2);

        btnToActivity = findViewById(R.id.btnToActivity1);

        btnToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
