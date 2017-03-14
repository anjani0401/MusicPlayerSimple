package com.example.anjanimittal.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Anjani Mittal on 20-Nov-16.
 */

public class MyOwnService  extends Service{
    MediaPlayer mp;

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this,R.raw.addicted);
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        mp.start();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
