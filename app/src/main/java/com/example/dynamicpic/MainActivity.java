package com.example.dynamicpic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int curr = 0;
    ArrayList arrayList = new ArrayList<>();

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList.add(0,R.drawable.image1);
        arrayList.add(1,R.drawable.image2);
        arrayList.add(2,R.drawable.image3);

         imageView = findViewById(R.id.imageView);

         imageView.setImageResource((Integer) arrayList.get(curr));


    }

    public void prev(View view){
        if(curr == 0){
            curr = arrayList.size()-1;
        }else{
            curr--;
        }
        imageView.setImageResource((Integer)arrayList.get(curr));
    }

    public void next(View view){
        if(curr < arrayList.size()-1){
            curr++;
        }else{
            curr = 0;
        }
        imageView.setImageResource((Integer) arrayList.get(curr));
    }
}