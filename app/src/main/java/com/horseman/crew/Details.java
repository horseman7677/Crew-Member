package com.horseman.crew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    private int postionPerson;

    TextView name,agency,status;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setTitle("Crew Member");

        Intent intent = getIntent();
        postionPerson = intent.getIntExtra("position",0);

        name = findViewById(R.id.dName);
        agency = findViewById(R.id.dAgency);
        status = findViewById(R.id.dStatus);
        image = findViewById(R.id.dImage);

        String url = MainActivity.personModelList.get(postionPerson).getImage();
        Glide.with(this).load(url).into(image);
        name.setText(MainActivity.personModelList.get(postionPerson).getName());
        agency.setText(MainActivity.personModelList.get(postionPerson).getAgency());
        status.setText(MainActivity.personModelList.get(postionPerson).getStatus());

    }
}