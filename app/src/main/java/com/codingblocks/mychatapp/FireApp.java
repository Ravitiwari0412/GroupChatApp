package com.codingblocks.mychatapp;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by buck on 7/22/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if(!FirebaseApp.getApps(this).isEmpty())
        {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }

    }
}
