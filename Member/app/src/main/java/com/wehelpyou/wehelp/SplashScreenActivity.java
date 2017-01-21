package com.wehelpyou.wehelp;

/**
 * Created by Sneh Pahilwani on 1/21/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
                SplashScreenActivity.this.startActivity(intent);
                SplashScreenActivity.this.finish();

            }
        }, 1000);
    }
}
