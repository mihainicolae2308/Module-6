package com.example.module6.utils;

import android.util.Log;

import com.example.module6.BuildConfig;

public class Logging {
    public static void show(Object obj, String message) {
        if (BuildConfig.DEBUG) {
            Log.e(obj.getClass().getName(), message);
        }
    }
}