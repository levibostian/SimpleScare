package com.levibostian.simplescare;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

    private Button mPressMeButton;
    private ImageView mScaryImageView;

    private static final int VIBRATE_TIME_PERIOD = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPressMeButton = (Button) findViewById(R.id.press_me_button);
        mScaryImageView = (ImageView) findViewById(R.id.scary_imageview);

        setupViews();
    }

    private void setupViews() {
        mPressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showScaryPicture();
            }
        });

        getSupportActionBar().hide();
    }

    private void showScaryPicture() {
        mScaryImageView.setImageResource(R.drawable.scary_picture);

        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(VIBRATE_TIME_PERIOD);
    }

}
