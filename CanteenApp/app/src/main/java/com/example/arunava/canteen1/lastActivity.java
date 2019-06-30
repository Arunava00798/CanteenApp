package com.example.arunava.canteen1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class lastActivity extends AppCompatActivity {

    Button btn_confirm,btn_home,btn_exit;
    TextView txt_bno,txt_tid,txt_date,txt_time,txt_uid,txt_total;
    ListView listview;
    ArrayList<DataModel> arrayList=new ArrayList<>();
    ArrayList<String> foodlist=new ArrayList<>();
    ArrayList<Integer> qlist=new ArrayList<>();
    CustomAdapter customAdapter;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        btn_home = findViewById(R.id.btnhome);
        btn_exit = findViewById(R.id.btnback);
        btn_confirm=findViewById(R.id.btn_confirm);
        listview=findViewById(R.id.listview);

        txt_date=findViewById(R.id.txt_date);
        txt_time=findViewById(R.id.txt_time);
        txt_uid=findViewById(R.id.txt_uid);
        txt_total=findViewById(R.id.txt_total);
        txt_tid = findViewById(R.id.txt_tid);
        txt_bno = findViewById(R.id.txt_bno);

        sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);


        Bundle b=getIntent().getExtras();
        if(b!=null)
        {
            txt_total.setText(b.getString("bill"));
            txt_uid.setText(sharedPreferences.getString("ID",""));
            String s = sharedPreferences.getString("ID","");
            int value1 = Integer.valueOf(s);
            value1= value1+89;
            int value2 = value1 + 992;

            txt_bno.setText(String.valueOf(value1));
            txt_tid.setText(String.valueOf(value2));
            foodlist=b.getStringArrayList("food");
            qlist=b.getIntegerArrayList("quantity");

        }

        for(int i=0;i<foodlist.size();i++)
        {
            arrayList.add(new DataModel(foodlist.get(i),qlist.get(i).toString()));
        }

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(lastActivity.this,Home.class);
                startActivity(i);
                finish();
            }
        });



        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat disdate=new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat distime=new SimpleDateFormat("HH:mm:ss a");
        txt_date.setText(disdate.format(calendar.getTime()));
        txt_time.setText(distime.format(calendar.getTime()));

        customAdapter=new CustomAdapter(lastActivity.this,arrayList);
        listview.setAdapter(customAdapter);


    }
}