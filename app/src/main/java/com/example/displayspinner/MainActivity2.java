package com.example.displayspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView countryImage;
    TextView countryname, capitalname;

    String nameStr, capitalstr ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        countryImage=findViewById(R.id.displayImage);
        countryname=findViewById(R.id.displayText);
        capitalname = findViewById(R.id.displaycapital);

        nameStr=getIntent().getStringExtra("cname");
        countryname.setText(nameStr);

        capitalstr=getIntent().getStringExtra("ccapital");
        capitalname.setText(capitalstr);

        int cImage=getIntent().getIntExtra("cimg",0);
        countryImage.setImageResource(cImage);






    }
}