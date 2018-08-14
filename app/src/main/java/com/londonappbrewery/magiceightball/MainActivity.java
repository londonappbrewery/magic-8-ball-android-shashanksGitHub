package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
       final TextView textView = (TextView) findViewById(R.id.textView);


        Button button = (Button)findViewById(R.id.button) ;

        final int[] imageHolderArray = {R.mipmap.ball5,
        R.mipmap.ball1,
        R.mipmap.ball2,
        R.mipmap.ball3,
        R.mipmap.ball4
                           };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();

                int number = randomNumber.nextInt(5);

                imageView3.setImageResource(imageHolderArray[number]);
            }
        });
    }
}
