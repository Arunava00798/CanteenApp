package com.example.arunava.canteen1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Order extends AppCompatActivity {

    CheckBox chktea,chkcoffee,chkvsandwich,chkcsandwich,chkvpizza,chkppizza,chkcpizza,chkvburger,chkcburger,chkchburger,chkvmomo,chkcmomo,chkfmomo,chkcake,chkvthali,chkfrice,chkproti,chkrroti,chkckosha,chkcchilli,chkcbiriyani,chkcombo1,chkcombo2,chkcombo3,chkcombo4;
    TextView tea,coffee,vsandwich,csandwich,vpizza,ppizza,cpizza,vburger,cburger,chburger,vmomo,cmomo,fmomo,cake,vthali,frice,proti,rroti,ckosha,cchilli,cbiriyani,combo1,combo2,combo3,combo4;
    TextView quantea,quancoffee,quanvsandwich,quancsandwich,quanvpizza,quanppizza,quancpizza,quanvburger,quancburger,quanchburger,quanvmomo,quancmomo,quanfmomo,quancake,quanvthali,quanfrice,quanproti,quanrroti,quanckosha,quancchilli,quancbiriyani,quancombo1,quancombo2,quancombo3,quancombo4;
    TextView pay;
    Button order,reset,confirm;
    int paypal=0;
    ArrayList<String> food=new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //CheckBox Initialisation
        chktea = findViewById(R.id.chktea);
        chkcoffee = findViewById(R.id.chkcoffee);
        chkvsandwich = findViewById(R.id.chkvsandwich);
        chkcsandwich = findViewById(R.id.chkcsandwich);
        chkvpizza = findViewById(R.id.chkvpizza);
        chkppizza = findViewById(R.id.chkppizza);
        chkcpizza = findViewById(R.id.chkcpizza);
        chkvburger = findViewById(R.id.chkvburger);
        chkcburger = findViewById(R.id.chkcburger);
        chkchburger = findViewById(R.id.chkchburger);
        chkvmomo = findViewById(R.id.chkvmomo);
        chkcmomo = findViewById(R.id.chkcmomo);
        chkfmomo = findViewById(R.id.chkfmomo);
        chkcake = findViewById(R.id.chkcake);
        chkvthali = findViewById(R.id.chkvthali);
        chkfrice = findViewById(R.id.chkfrice);
        chkproti = findViewById(R.id.chkproti);
        chkrroti = findViewById(R.id.chkrroti);
        chkckosha = findViewById(R.id.chkckasha);
        chkcchilli = findViewById(R.id.chkcchilli);
        chkcbiriyani = findViewById(R.id.chkcbiriyani);
        chkcombo1 = findViewById(R.id.chkcombo1);
        chkcombo4 = findViewById(R.id.chkcombo4);
        chkcombo2 = findViewById(R.id.chkcombo2);
        chkcombo3 = findViewById(R.id.chkcombo3);
        //TextView Initialisation
        tea = findViewById(R.id.tea);
        coffee = findViewById(R.id.coffee);
        vsandwich = findViewById(R.id.vsandwich);
        csandwich = findViewById(R.id.csandwich);
        vpizza = findViewById(R.id.vpizza);
        ppizza = findViewById(R.id.ppizza);
        cpizza = findViewById(R.id.cpizza);
        vburger = findViewById(R.id.vburger);
        cburger = findViewById(R.id.cburger);
        chburger = findViewById(R.id.chburger);
        vmomo = findViewById(R.id.vmomo);
        cmomo = findViewById(R.id.cmomo);
        fmomo = findViewById(R.id.fmomo);
        cake = findViewById(R.id.cake);
        vthali = findViewById(R.id.vthali);
        frice = findViewById(R.id.frice);
        proti = findViewById(R.id.proti);
        rroti = findViewById(R.id.rroti);
        ckosha = findViewById(R.id.ckasha);
        cchilli = findViewById(R.id.cchilli);
        cbiriyani = findViewById(R.id.cbiriyani);
        combo1 = findViewById(R.id.combo1);
        combo4 = findViewById(R.id.combo4);
        combo2 = findViewById(R.id.combo2);
        combo3 = findViewById(R.id.combo3);
        //EditTextInitialisaton
        quantea = findViewById(R.id.quantea);
        quancoffee = findViewById(R.id.quancoffee);
        quanvsandwich = findViewById(R.id.quanvsandwich);
        quancsandwich = findViewById(R.id.quancsandwich);
        quanvpizza = findViewById(R.id.quanvpizza);
        quanppizza = findViewById(R.id.quanppizza);
        quancpizza = findViewById(R.id.quancpizza);
        quanvburger = findViewById(R.id.quanvburger);
        quancburger = findViewById(R.id.quancburger);
        quanchburger = findViewById(R.id.quanchburger);
        quanvmomo = findViewById(R.id.quanvmomo);
        quancmomo = findViewById(R.id.quancmomo);
        quanfmomo = findViewById(R.id.quanfmomo);
        quancake = findViewById(R.id.quancake);
        quanvthali = findViewById(R.id.quanvthali);
        quanfrice = findViewById(R.id.quanfrice);
        quanproti = findViewById(R.id.quanproti);
        quanrroti = findViewById(R.id.quanrroti);
        quanckosha = findViewById(R.id.quanckasha);
        quancchilli = findViewById(R.id.quancchilli);
        quancbiriyani = findViewById(R.id.quancbiriyani);
        quancombo1 = findViewById(R.id.quancombo1);
        quancombo4 = findViewById(R.id.quancombo4);
        quancombo2 = findViewById(R.id.quancombo2);
        quancombo3 = findViewById(R.id.quancombo3);
        pay = findViewById(R.id.pay);
        order = findViewById(R.id.btn_order);
        confirm = findViewById(R.id.btn_confirm);


        reset = findViewById(R.id.reset);

        quantea.setEnabled(false);
        quancoffee.setEnabled(false);
        quanvburger.setEnabled(false);
        quanchburger.setEnabled(false);
        quancburger.setEnabled(false);
        quanvpizza.setEnabled(false);
        quancpizza.setEnabled(false);
        quanppizza.setEnabled(false);
        quanvsandwich.setEnabled(false);
        quancsandwich.setEnabled(false);
        quanvthali.setEnabled(false);
        quancake.setEnabled(false);
        quancbiriyani.setEnabled(false);
        quancchilli.setEnabled(false);
        quanckosha.setEnabled(false);
        quancmomo.setEnabled(false);
        quanvmomo.setEnabled(false);
        quanfmomo.setEnabled(false);
        quanfrice.setEnabled(false);
        quanrroti.setEnabled(false);
        quanproti.setEnabled(false);
        quancombo1.setEnabled(false);
        quancombo2.setEnabled(false);
        quancombo3.setEnabled(false);
        quancombo4.setEnabled(false);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chktea.setChecked(false);
                chkcoffee.setChecked(false);
                chkvsandwich.setChecked(false);
                chkcsandwich.setChecked(false);
                chkvburger.setChecked(false);
                chkcbiriyani.setChecked(false);
                chkcburger.setChecked(false);
                chkchburger.setChecked(false);
                chkvpizza.setChecked(false);
                chkppizza.setChecked(false);
                chkcpizza.setChecked(false);
                chkvmomo.setChecked(false);
                chkcmomo.setChecked(false);
                chkfmomo.setChecked(false);
                chkcake.setChecked(false);
                chkvthali.setChecked(false);
                chkfrice.setChecked(false);
                chkrroti.setChecked(false);
                chkproti.setChecked(false);
                chkckosha.setChecked(false);
                chkcchilli.setChecked(false);
                chkcombo1.setChecked(false);
                chkcombo2.setChecked(false);
                chkcombo3.setChecked(false);
                chkcombo4.setChecked(false);

                quantea.setEnabled(false);
                quancoffee.setEnabled(false);
                quanvburger.setEnabled(false);
                quanchburger.setEnabled(false);
                quancburger.setEnabled(false);
                quanvpizza.setEnabled(false);
                quancpizza.setEnabled(false);
                quanppizza.setEnabled(false);
                quanvsandwich.setEnabled(false);
                quancsandwich.setEnabled(false);
                quanvthali.setEnabled(false);
                quancake.setEnabled(false);
                quancbiriyani.setEnabled(false);
                quancchilli.setEnabled(false);
                quanckosha.setEnabled(false);
                quancmomo.setEnabled(false);
                quanvmomo.setEnabled(false);
                quanfmomo.setEnabled(false);
                quanfrice.setEnabled(false);
                quanrroti.setEnabled(false);
                quanproti.setEnabled(false);
                quancombo1.setEnabled(false);
                quancombo2.setEnabled(false);
                quancombo3.setEnabled(false);
                quancombo4.setEnabled(false);

                quantea.setText("0");
                quancoffee.setText("0");
                quanvsandwich.setText("0");
                quancsandwich.setText("0");
                quanvburger.setText("0");
                quancburger.setText("0");
                quanchburger.setText("0");
                quanvpizza.setText("0");
                quanppizza.setText("0");
                quancpizza.setText("0");
                quanvmomo.setText("0");
                quancmomo.setText("0");
                quanfmomo.setText("0");
                quanckosha.setText("0");
                quancchilli.setText("0");
                quanfrice.setText("0");
                quanrroti.setText("0");
                quanproti.setText("0");
                quancbiriyani.setText("0");
                quancake.setText("0");
                quancombo1.setText("0");
                quancombo2.setText("0");
                quancombo3.setText("0");
                quancombo4.setText("0");

                paypal = 0;

                confirm.setEnabled(true);






            }
        });












        chktea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chktea.isChecked())
                    quantea.setEnabled(true);
                else
                    quantea.setEnabled(false);
            }
        });


        chkcoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcoffee.isChecked())
                    quancoffee.setEnabled(true);
                else
                    quancoffee.setEnabled(false);
            }
        });

        chkvsandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkvsandwich.isChecked())
                    quanvsandwich.setEnabled(true);
                else
                    quanvsandwich.setEnabled(false);
            }
        });

        chkcsandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcsandwich.isChecked())
                    quancsandwich.setEnabled(true);
                else
                    quancsandwich.setEnabled(false);
            }
        });

        chkvburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkvburger.isChecked())
                    quanvburger.setEnabled(true);
                else
                    quanvburger.setEnabled(false);
            }
        });

        chkcburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcburger.isChecked())
                    quancburger.setEnabled(true);
                else
                    quancburger.setEnabled(false);
            }
        });

        chkchburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkchburger.isChecked())
                    quanchburger.setEnabled(true);
                else
                    quanchburger.setEnabled(false);
            }
        });

        chkvpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkvpizza.isChecked())
                    quanvpizza.setEnabled(true);
                else
                    quanvpizza.setEnabled(false);
            }
        });

        chkcpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcpizza.isChecked())
                    quancpizza.setEnabled(true);
                else
                    quancpizza.setEnabled(false);
            }
        });

        chkppizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkppizza.isChecked())
                    quanppizza.setEnabled(true);
                else
                    quanppizza.setEnabled(false);
            }
        });

        chkfmomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkfmomo.isChecked())
                    quanfmomo.setEnabled(true);
                else
                    quanfmomo.setEnabled(false);
            }
        });

        chkvmomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkvmomo.isChecked())
                    quanvmomo.setEnabled(true);
                else
                    quanvmomo.setEnabled(false);
            }
        });


        chkcmomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcmomo.isChecked())
                    quancmomo.setEnabled(true);
                else
                    quancmomo.setEnabled(false);
            }
        });
        chkcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcake.isChecked())
                    quancake.setEnabled(true);
                else
                    quancake.setEnabled(false);
            }
        });


        chkfrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkfrice.isChecked())
                    quanfrice.setEnabled(true);
                else
                    quanfrice.setEnabled(false);
            }
        });



        chkrroti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkrroti.isChecked())
                    quanrroti.setEnabled(true);
                else
                    quanrroti.setEnabled(false);
            }
        });


        chkckosha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkckosha.isChecked())
                    quanckosha.setEnabled(true);
                else
                    quanckosha.setEnabled(false);
            }
        });

        chkcchilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcchilli.isChecked())
                    quancchilli.setEnabled(true);
                else
                    quancchilli.setEnabled(false);
            }
        });

        chkcbiriyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcbiriyani.isChecked())
                    quancbiriyani.setEnabled(true);
                else
                    quancbiriyani.setEnabled(false);
            }
        });


        chkcombo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcombo1.isChecked())
                    quancombo1.setEnabled(true);
                else
                    quancombo1.setEnabled(false);
            }
        });

        chkcombo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcombo2.isChecked())
                    quancombo2.setEnabled(true);
                else
                    quancombo2.setEnabled(false);
            }
        });




        chkcombo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcombo3.isChecked())
                    quancombo3.setEnabled(true);
                else
                    quancombo3.setEnabled(false);
            }
        });




        chkcombo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkcombo4.isChecked())
                    quancombo4.setEnabled(true);
                else
                    quancombo4.setEnabled(false);
            }
        });









        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirm.setEnabled(false);
                //tea
                if (chktea.isChecked()) {
                    String qua = quantea.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    paypal += (quan) * 10;
                } else {
                    quantea.setEnabled(false);
                }
                //coffee
                if (chkcoffee.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancoffee.getText().toString().trim();
                    int quan = Integer.parseInt(qua);

                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 15;
                } else {
                    quancoffee.setEnabled(false);
                }
                //Vsandwich
                if (chkvsandwich.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanvsandwich.getText().toString().trim();
                    int quan = Integer.parseInt(qua);

                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 25;
                } else {
                    quanvsandwich.setEnabled(false);
                }
                //Csandwich
                if (chkcsandwich.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancsandwich.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 35;
                } else {
                    quancsandwich.setEnabled(false);
                }
                //VPizza
                if (chkvpizza.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanvpizza.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 30;

                } else {
                    quanvpizza.setEnabled(false);
                }
                //PPizza
                if (chkppizza.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanppizza.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 30;

                } else {
                    quanppizza.setEnabled(false);
                }
                //Chicken Pizza
                if (chkcpizza.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancpizza.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 35;

                } else {
                    quancpizza.setEnabled(false);
                }
                //vBurger
                if (chkvburger.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanvburger.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 30;

                } else {
                    quanvburger.setEnabled(false);
                }
                //CBurger
                if (chkcburger.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancburger.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 40;

                } else {
                    quancburger.setEnabled(false);
                }
                //ChBurger
                if (chkchburger.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanchburger.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 35;

                } else {
                    quanchburger.setEnabled(false);
                }
                //Vmomo
                if (chkvmomo.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanvmomo.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 30;

                } else {
                    quanvmomo.setEnabled(false);
                }https://juthikamoni.000webhostapp.com/
                //Cmomo
                if (chkcmomo.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancmomo.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 40;

                } else {
                    quancmomo.setEnabled(false);
                }
                //Fmomo
                if (chkfmomo.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanfmomo.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 50;

                } else {
                    quanfmomo.setEnabled(false);
                }
                //Cake
                if (chkcake.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancake.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 20;

                } else {
                    quancake.setEnabled(false);
                }
                //VegThali
                if (chkvthali.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanvthali.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 25;

                } else {
                    quanvthali.setEnabled(false);
                }
                //Frice
                if (chkfrice.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanfrice.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 50;

                } else {
                    quanfrice.setEnabled(false);
                }
                //PRoti
                if (chkproti.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanproti.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 3;

                } else {
                    quanproti.setEnabled(false);
                }
                //RRoti
                if (chkrroti.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanrroti.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 6;

                } else {
                    quanrroti.setEnabled(false);
                }
                //CKosha
                if (chkckosha.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quanckosha.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 40;

                } else {
                    quanckosha.setEnabled(false);
                }
                //CChillli
                if (chkcchilli.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancchilli.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 40;

                } else {
                    quancchilli.setEnabled(false);
                }
                //CBiriyani
                if (chkcbiriyani.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancbiriyani.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 80;

                } else {
                    quancbiriyani.setEnabled(false);
                }
                //Combo1
                if (chkcombo1.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancombo1.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 60;

                } else {
                    quancombo1.setEnabled(false);
                }
                //Combo2
                if (chkcombo2.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancombo2.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 70;

                } else {
                    quancombo2.setEnabled(false);
                }
                //Combo3
                if (chkcombo3.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancombo3.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 70;

                } else {
                    quancombo3.setEnabled(false);
                }
                //Combo4
                if (chkcombo4.isChecked()) {
                    //quantea.setEnabled(true);
                    String qua = quancombo4.getText().toString().trim();
                    int quan = Integer.parseInt(qua);
                    //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();
                    paypal += (quan) * 100;

                } else {
                    quancombo4.setEnabled(false);
                }
                pay.setText(String.valueOf(paypal));
            }
        });


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!confirm.isEnabled()) {
                    if (chktea.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quantea.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        String fo = tea.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }

                    //coffee
                    if (chkcoffee.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancoffee.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = coffee.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Vsandwich
                    if (chkvsandwich.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanvsandwich.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = vsandwich.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Csandwich
                    if (chkcsandwich.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancsandwich.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = csandwich.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //VPizza
                    if (chkvpizza.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanvpizza.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = vpizza.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //PPizza
                    if (chkppizza.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanppizza.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = ppizza.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Chicken Pizza
                    if (chkcpizza.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancpizza.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cpizza.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //vBurger
                    if (chkvburger.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanvburger.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = vburger.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //CBurger
                    if (chkcburger.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancburger.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cburger.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //ChBurger
                    if (chkchburger.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanchburger.getText().toString().trim();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = chburger.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Vmomo
                    if (chkvmomo.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanvmomo.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = vmomo.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Cmomo
                    if (chkcmomo.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancmomo.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cmomo.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Fmomo
                    if (chkfmomo.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanfmomo.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = fmomo.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Cake
                    if (chkcake.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancake.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cake.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //VegThali
                    if (chkvthali.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanvthali.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = vthali.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Frice
                    if (chkfrice.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanfrice.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = frice.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //PRoti
                    if (chkproti.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanproti.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = proti.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //RRoti
                    if (chkrroti.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanrroti.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = rroti.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //CKosha
                    if (chkckosha.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quanckosha.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = ckosha.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //CChillli
                    if (chkcchilli.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancchilli.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cchilli.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //CBiriyani
                    if (chkcbiriyani.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancbiriyani.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = cbiriyani.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Combo1
                    if (chkcombo1.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancombo1.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = combo1.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Combo2
                    if (chkcombo2.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancombo2.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = combo2.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Combo3
                    if (chkcombo3.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancombo3.getText().toString();
                        int quan = Integer.parseInt(qua);
                        String fo = combo3.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }
                    //Combo4
                    if (chkcombo4.isChecked()) {
                        //quantea.setEnabled(true);
                        String qua = quancombo4.getText().toString();
                        int quan = Integer.parseInt(qua);
                        //Toast.makeText(getApplicationContext(),quan,Toast.LENGTH_LONG).show();

                        String fo = combo4.getText().toString();
                        food.add(fo);
                        quantity.add(quan);
                    }


                    Intent in = new Intent(Order.this, lastActivity.class);
                    in.putExtra("food", food);
                    in.putExtra("quantity", quantity);
                    in.putExtra("bill", "Rs " + String.valueOf(paypal));
                    startActivity(in);
                    finish();
                }
            }
        });
    }

}


