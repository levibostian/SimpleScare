package com.levibostian.simplescare;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

    private Button mPressMeButton;
    private ImageView mScaryImageView;

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
    }

    private void showScaryPicture() {
        mScaryImageView.setImageResource(R.drawable.scary_picture);
    }

}
