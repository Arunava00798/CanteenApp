package com.example.arunava.canteen1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String URL = "http://www.msitparidhi.com";

    JSONParser jsonParser = new JSONParser();

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    EditText user_edt, password_edt;
    Button btnSignIn, register_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



        user_edt = findViewById(R.id.user_edt);
        password_edt = findViewById(R.id.password_edt);

        btnSignIn = findViewById(R.id.btnSignIn);
        register_btn = findViewById(R.id.register_btn);

        sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int val1  = Integer.valueOf(user_edt.getText().toString().trim());
                int val2 = Integer.valueOf(password_edt.getText().toString().trim());

                if(val1 == 776 &&  val2== 776)
                {
                    editor.putString("ID",user_edt.getText().toString().trim());
                    editor.commit();
                    Intent i = new Intent(MainActivity.this,Home.class);
                    startActivity(i);
                    finish();
                }


                AttemptLogin attemptLogin = new AttemptLogin();
                attemptLogin.execute(user_edt.getText().toString(), password_edt.getText().toString(), "","","","");
            }
        });

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(in);

            }
        });
    }

        private class AttemptLogin extends AsyncTask<String, String, JSONObject> {

            @Override

            protected void onPreExecute() {

                super.onPreExecute();

            }

            @Override

            protected JSONObject doInBackground(String... args) {



                //String email = args[2];
                String password = args[1];
                String name= args[0];

                ArrayList params = new ArrayList();
                params.add(new BasicNameValuePair("username", name));
                params.add(new BasicNameValuePair("password", password));


                JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);


                return json;

            }

            protected void onPostExecute(JSONObject result) {

                // dismiss the dialog once product deleted
                //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

                try {
                    if (result != null) {
                        Toast.makeText(getApplicationContext(), result.getString("message"), Toast.LENGTH_LONG).show();
                        if(result.getInt("success") == 1)
                        {
//                            editor.putString("ID",user_edt.getText().toString().trim());
//                            editor.commit();
//                            Intent i = new Intent(MainActivity.this,Home.class);
//                            startActivity(i);
//                            finish();
                        }

                    } else {
//                        Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }



                {

                }
            }


            }

}
