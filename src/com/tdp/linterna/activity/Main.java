
package com.tdp.linterna.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.tdp.linterna.LinternaApp;
import com.tdp.linterna.R;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageButton = (ImageView) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if (LinternaApp.isLightOn) {
                    LinternaApp.turnOffFlashLight();
                } else {
                    LinternaApp.turnOnFlashLight();
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public void onBackPressed() {
        if (LinternaApp.isLightOn) {
            LinternaApp.turnOffFlashLight();
        }
        super.onBackPressed();
    }
}
