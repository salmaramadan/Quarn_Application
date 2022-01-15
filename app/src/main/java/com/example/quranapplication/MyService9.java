package com.example.quranapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService9 extends Service {
    MediaPlayer mp ;

    public MyService9() {
    }
    @Override
    public void onCreate(){
        super.onCreate();
        mp= MediaPlayer.create(this,R.raw.noah);
    }
    @Override

    public int onStartCommand(Intent intent ,int flags ,int startId){
        if(!mp.isPlaying())
            mp.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mp.isPlaying()) {
            mp.stop();
            mp.release();
            Toast.makeText(this, "السورة مكية", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}