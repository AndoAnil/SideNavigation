package com.example.uianimationsidenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView homeUser;
    private RelativeLayout mainContent;
    private LinearLayout menuContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeUser=(ImageView)findViewById(R.id.userHome);

        mainContent=(RelativeLayout)findViewById(R.id.Home);

        menuContent=(LinearLayout)findViewById(R.id.myMenu);

        homeUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainContent.animate().translationX(0);
                menuContent.animate().translationX(0);
            }
        });

        menuContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuContent.animate().translationX(-700);
                mainContent.animate().translationX(-570);
            }
        });

    }
}