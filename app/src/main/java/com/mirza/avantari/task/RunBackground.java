package com.mirza.avantari.task;

import android.app.Application;
import android.content.Intent;

/**
 * Created by AHMED on 23-07-2017.
 */

public class RunBackground extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, Tracking.class));
    }
}
