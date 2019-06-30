package com.example.arunava.canteen1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;



public class Main2Activity extends AppCompatActivity
{

        String URL = "http://www.msitparidhi.com";

        JSONParser jsonParser = new JSONParser();
        UniqueRandomNumbers ob = new UniqueRandomNumbers();
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        final EditText user_edt, name_edt, address_edt, phone_edt, email_edt, age_edt, password_edt;

        RadioButton male_radio, female_radio;

        Button btnRegister;

        user_edt = findViewById(R.id.user_edt);
        name_edt = findViewById(R.id.name_edt);
        address_edt = findViewById(R.id.address_edt);
        phone_edt = findViewById(R.id.phone_edt);
        email_edt = findViewById(R.id.email_edt);
        password_edt = findViewById(R.id.password_edt);

        male_radio = findViewById(R.id.male_radio);
        female_radio = findViewById(R.id.female_radio);

        btnRegister = findViewById(R.id.register_btn);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 11111; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        int num = list.get(0) * 776;
        user_edt.setText(String.valueOf(num));



        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AttemptLogin attemptLogin = new AttemptLogin();

                attemptLogin.execute(user_edt.getText().toString(), name_edt.getText().toString(), address_edt.getText().toString(), phone_edt.getText().toString(), email_edt.getText().toString(), password_edt.getText().toString());


            }
        });
    }


    private class AttemptLogin extends AsyncTask<String, String,JSONObject> {

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

        }

        @Override

        protected JSONObject doInBackground(String... args) {


            String phone=args[3];
            String email = args[4];
            String password = args[5];
            String address = args[2];
            String name = args[1];
            String userid= args[0];

            ArrayList params = new ArrayList();
            params.add(new BasicNameValuePair("username", name));
            params.add(new BasicNameValuePair("password", password));
            params.add(new BasicNameValuePair("phone", phone));
            params.add(new BasicNameValuePair("address", address));
            params.add(new BasicNameValuePair("userid", userid));

            if(email.length()>0)
                params.add(new BasicNameValuePair("email",email));

            JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);


            return json;

        }

        protected void onPostExecute(JSONObject result) {

            // dismiss the dialog once product deleted
            //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            try {
                if (result != null) {
                    Toast.makeText(getApplicationContext(),result.getString("message"),Toast.LENGTH_LONG).show();
                    Intent iv =new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(iv);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }
}
