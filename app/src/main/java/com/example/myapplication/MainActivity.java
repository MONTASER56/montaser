package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Animation car,name;
    private static final int S=7000;
    RelativeLayout relativeLayout;
    ImageView image;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        relativeLayout=findViewById(R.id.re);
        image=findViewById(R.id.img);
        textView=findViewById(R.id.textView);
        car= AnimationUtils.loadAnimation(this,R.anim.car_anim);
        name= AnimationUtils.loadAnimation(this,R.anim.name_anim);
        image.setAnimation(car);
        textView.setAnimation(name);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },S);



    }
}