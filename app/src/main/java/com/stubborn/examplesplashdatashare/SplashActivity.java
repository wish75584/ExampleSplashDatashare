package com.stubborn.examplesplashdatashare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mySong=MediaPlayer.create(SplashActivity.this,R.raw.howl);
        mySong.start();


        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        };
        thread.start();
    }

    protected void onPause(){
        super.onPause();
        mySong.release();
        finish();
    }

    }
