package com.example.displayspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinneritem;
    UserPojo userPojo;
    UserAdapter userAdapter;
    List<UserPojo> userPojoList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {



       try {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           spinneritem = findViewById(R.id.spinnerlist);

           loadUserData1();

           spinneritem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                   Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                   intent.putExtra("cimg", userPojoList.get(i).getImage());
                   intent.putExtra("cname", userPojoList.get(i).getCountryname());
                   intent.putExtra("ccapital",userPojoList.get(i).getCapital());


                   startActivity(intent);
               }
           });
       }catch (Exception e)
       {
           e.printStackTrace();
       }



    }

    private void loadUserData1() {



      userPojo = new UserPojo(R.drawable.india,"India","New Delhi");
      userPojoList.add(userPojo);
      userPojo = new UserPojo(R.drawable.australia, "Australia","Canberra");
      userPojoList.add(userPojo);
      userPojo = new UserPojo(R.drawable.germany1,"Germany","Berlin");
      userPojoList.add(userPojo);
      userPojo = new UserPojo(R.drawable.unitedkingdom,"United Kingdom","London");
      userPojoList.add(userPojo);

        userAdapter=new UserAdapter(this,userPojoList);
        spinneritem.setAdapter(userAdapter);
        
        userAdapter.notifyDataSetChanged();

    }
}