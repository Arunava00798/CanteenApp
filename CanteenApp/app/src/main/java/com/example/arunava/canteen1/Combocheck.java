package com.example.arunava.canteen1;



import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Combocheck extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner combo_pack;
    TextView meal,amount;
    String items[]=null;
    String itemname[]=null;
    String price1[]=null;
    List<String> additems=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combocheck);

        combo_pack=findViewById(R.id.combo_pack);
        meal=findViewById(R.id.meal);
        amount=findViewById(R.id.amount);

        price1=getResources().getStringArray(R.array.price);
        itemname=getResources().getStringArray(R.array.combolist);
        items=getResources().getStringArray(R.array.fullfood);
        additems= Arrays.asList(items);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,additems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_pack.setAdapter(adapter);

        combo_pack.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        meal.setText(itemname[i]);
        amount.setText(price1[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}