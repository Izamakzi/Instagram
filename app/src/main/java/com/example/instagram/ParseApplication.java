package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("izamakzi-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("CodepathInstagramMoveFast")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://izamakzi-instagram-codepath.herokuapp.com/parse").build());
    }
}
