package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class knowmore extends AppCompatActivity {

    ImageView y1,y2,y3,y4,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowmore);

        y1=(ImageView) findViewById(R.id.y1);
        y2=(ImageView) findViewById(R.id.y2);
        y3=(ImageView) findViewById(R.id.y3);
        y4=(ImageView) findViewById(R.id.y4);
        b1=(ImageView) findViewById(R.id.b1);


        y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/live/MLbTv9VEZWw?si=xaHfgY6ZVAekv46U"; // Replace with your desired external link
                Intent i11 = new Intent(Intent.ACTION_VIEW);
                i11.setData(Uri.parse(url));
                startActivity(i11);
            }
        });

        y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtu.be/5jrvd6Nx_qk?si=htoEAhl6Orck7sut"; // Replace with another external link
                Intent i22 = new Intent(Intent.ACTION_VIEW);
                i22.setData(Uri.parse(url));
                startActivity(i22);
            }
        });
        y3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtube.com/playlist?list=PLOSo0A8ngEXUNqNesQ6cFtmtsL95UZWYh&si=Xtw3CEmD2oS84poK"; // Replace with another external link
                Intent i33 = new Intent(Intent.ACTION_VIEW);
                i33.setData(Uri.parse(url));
                startActivity(i33);
            }
        });
        y4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://youtube.com/playlist?list=PLzvGATksl5N6jHnxsui9m0_TYngrX_z84&si=xsqPcAr8FIHPfv-4"; // Replace with another external link
                Intent i44 = new Intent(Intent.ACTION_VIEW);
                i44.setData(Uri.parse(url));
                startActivity(i44);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.ieltsportal.com/cam-books/"; // Replace with another external link
                Intent i55 = new Intent(Intent.ACTION_VIEW);
                i55.setData(Uri.parse(url));
                startActivity(i55);
            }
        });







    }
}