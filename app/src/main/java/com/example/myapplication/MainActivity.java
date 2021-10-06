package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> fc = new ArrayList<>();
        fc.add(R.drawable.psg);
        fc.add(R.drawable.mu);
        fc.add(R.drawable.borussia);
        fc.add(R.drawable.chelsea);
        fc.add(R.drawable.liverpoll);
        fc.add(R.drawable.manchestercity);
        fc.add(R.drawable.yuvantus);
        fc.add(R.drawable.unnamed);

        List<String> fc_name = new ArrayList<>();
        fc_name.add("Парі Сен-Жермен");
        fc_name.add("Манчестер Юнайтед");
        fc_name.add("Боруссія Дортмунд");
        fc_name.add("Челсі");
        fc_name.add("Ліверпуль");
        fc_name.add("Манчестер Сіті");
        fc_name.add("Ювентус");
        fc_name.add("Барселона");

        Button startButton = (Button) findViewById(R.id.buttonStart);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button buttonYes = (Button)findViewById(R.id.buttonYes);
                Button buttonNo = (Button)findViewById(R.id.buttonNo);
                TextView vopros = (TextView) findViewById(R.id.textView);
                TextView text = (TextView) findViewById(R.id.text);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.getDrawable();

                startButton.setVisibility(View.INVISIBLE);
                vopros.setVisibility(View.VISIBLE);
                buttonNo.setVisibility(View.VISIBLE);
                buttonYes.setVisibility(View.VISIBLE);

                Random random = new Random();
                int currentFc = fc.get(random.nextInt(fc.size()));
                imageView.setImageDrawable(getDrawable(currentFc));
                text.setText(fc_name.get(random.nextInt(fc_name.size())));
                final int[] answer = {0, 0};

                buttonYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println(currentFc);
                        switch (currentFc){
                            case 2131165317:
                                colorTextView.getCurrentTextColor()
                        }
                    }
                });
            }
        });
    }

    /*public void onClick(View view) {
        Random random = new Random();
        List<Integer> fc = new ArrayList<>();
        fc.add(R.drawable.psg);
        fc.add(R.drawable.mu);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageDrawable(getDrawable(fc.get(random.nextInt(fc.size()))));
    }
    */

}