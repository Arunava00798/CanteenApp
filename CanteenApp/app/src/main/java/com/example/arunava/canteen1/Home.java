package com.example.arunava.canteen1;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity implements View.OnClickListener{

    Button btn_odr,btn_cmb,btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_odr=findViewById(R.id.btn_od);
        btn_cmb=findViewById(R.id.btn_cmb);
        btn_logout=findViewById(R.id.btn_logout);

        btn_odr.setOnClickListener(this);
        btn_cmb.setOnClickListener(this);
        btn_logout.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_od:{
                //for order
                Intent in=new Intent(Home.this,Order.class);
                startActivity(in);

                break;
            }
            case R.id.btn_cmb:{
                //for combo
                Intent in=new Intent(Home.this,Combocheck.class);
                startActivity(in);

                break;
            }
            case R.id.btn_logout:{
                Intent in = new Intent(Home.this,MainActivity.class);
                startActivity(in);
                finish();

                break;
            }
        }
    }
}