package com.example.nhl71.maytinhdemo;

import android.graphics.drawable.LevelListDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_num1,btn_num2,btn_num3,btn_num4,btn_num5,btn_num6,btn_num7,btn_num8,btn_num9,btn_num0,btn_phay,btn_phantram,btn_AC,btn_chia,btn_kq,btn_cong,btn_tru,btn_nhan;
    EditText edittxt_hienthi,edittxt_PhepTinh;
    ImageButton btn_bsp;
    TextWatcher k = null;
    ScrollView scrview_;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
        //Click Event
        btn_num0.setOnClickListener(this);
        btn_num1.setOnClickListener(this);
        btn_num2.setOnClickListener(this);
        btn_num3.setOnClickListener(this);
        btn_num4.setOnClickListener(this);
        btn_num5.setOnClickListener(this);
        btn_num6.setOnClickListener(this);
        btn_num7.setOnClickListener(this);
        btn_num8.setOnClickListener(this);
        btn_num9.setOnClickListener(this);
        btn_bsp.setOnClickListener(this);
        btn_phay.setOnClickListener(this);
        btn_phantram.setOnClickListener(this);
        btn_AC.setOnClickListener(this);
        btn_chia.setOnClickListener(this);
        btn_kq.setOnClickListener(this);
        btn_cong.setOnClickListener(this);
        btn_tru.setOnClickListener(this);
        btn_nhan.setOnClickListener(this);

        //Textchanged Event
        edittxt_PhepTinh.addTextChangedListener(k = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    if (edittxt_PhepTinh.getText().toString().length() >= 0) {
                        String str = edittxt_PhepTinh.getText().toString().replace(",", "");
                        String soThuc = "";
                        if (str.length() > 0) {
                          if (Double.parseDouble(str) < 1  && Double.parseDouble(str)>-1 ) {
                               return;
                            } else {
                                if (str.contains(".")) {
                                    soThuc = str.substring(str.indexOf('.'), str.length());
                                    str = str.substring(0, str.indexOf('.'));
                                    str = String.valueOf(Integer.parseInt(str));
                                }

                            }
                        }

                        StringBuilder strB = new StringBuilder(str);
                        int dem = 0;
                        int temp;
                        if(Double.parseDouble(str)>0 ){
                            temp =0;
                        }
                        else {
                            temp=1;
                        }
                        for (int i = strB.length() - 1; i > temp; i--) {

                            dem++;

                            if (dem == 3) {
                                strB.insert(i, ",");
                                dem = 0;
                            }

                        }
                        edittxt_PhepTinh.removeTextChangedListener(k);

                        edittxt_PhepTinh.setText(strB.toString() + soThuc);
                        edittxt_PhepTinh.addTextChangedListener(k);


                    }
                }
                catch (Exception e){

                }

            }
        });

    }
    protected void connectView(){
        btn_num1 = (Button) findViewById(R.id.btn_num1);
        btn_num2 = (Button) findViewById(R.id.btn_num2);
        btn_num3 = (Button) findViewById(R.id.btn_num3);
        btn_num4 = (Button) findViewById(R.id.btn_num4);
        btn_num5 = (Button) findViewById(R.id.btn_num5);
        btn_num6 = (Button) findViewById(R.id.btn_num6);
        btn_num7 = (Button) findViewById(R.id.btn_num7);
        btn_num8 = (Button) findViewById(R.id.btn_num8);
        btn_num9 = (Button) findViewById(R.id.btn_num9);
        btn_num0 = (Button) findViewById(R.id.btn_num0);
        edittxt_hienthi= (EditText) findViewById(R.id.edittxt_Hienthi);
        btn_bsp = (ImageButton) findViewById(R.id.btn_bsp);
        edittxt_PhepTinh = (EditText) findViewById(R.id.edittxt_PhepTinh);
        btn_phay= (Button) findViewById(R.id.btn_phay);
        btn_phantram= (Button) findViewById(R.id.btn_phantram);
        btn_AC = (Button) findViewById(R.id.btn_AC);
        btn_chia = (Button) findViewById(R.id.btn_chia);
        btn_kq = (Button) findViewById(R.id.btn_kq);
        btn_cong = (Button) findViewById(R.id.btn_cong);
        btn_tru = (Button) findViewById(R.id.btn_tru);
        btn_nhan = (Button) findViewById(R.id.btn_nhan);
        scrview_ = (ScrollView) findViewById(R.id.scrview_);




    }
    @Override
    public void onClick(View v) {
        if(edittxt_PhepTinh.getText().toString().replace(",","").length()<28) {
            if (btn_num0 == v) {
                if(edittxt_PhepTinh.getText().length()>0) {
                    edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num0.getText().toString());
                }
            }
            else if (btn_num1 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num1.getText().toString());
            }
            else if (btn_num2 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num2.getText().toString());
            }
            else if (btn_num3 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num3.getText().toString());
            }
            else if (btn_num4 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num4.getText().toString());
            }
            else if (btn_num5 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num5.getText().toString());
            }
            else if (btn_num6 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num6.getText().toString());
            }
            else if (btn_num7 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num7.getText().toString());
            }
            else if (btn_num8 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num8.getText().toString());
            }
            else if (btn_num9 == v) {
                edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_num9.getText().toString());
            }
            else if (btn_phay == v && edittxt_PhepTinh.getText().toString().replace(",","").length()<20) {
                String s = edittxt_PhepTinh.getText().toString();
                if (!s.contains(".")) {
                    if(s.length() ==0){
                        edittxt_PhepTinh.setText("0"+ btn_phay.getText().toString());
                    }
                    else {
                        edittxt_PhepTinh.setText(edittxt_PhepTinh.getText() + btn_phay.getText().toString());
                    }
                }
            }
        }
             if(btn_bsp == v) {


                 if (edittxt_PhepTinh.getText().toString().length() != 0) {
                     String s = edittxt_PhepTinh.getText().toString();
                     edittxt_PhepTinh.setText(s.substring(0, s.length() - 1));
                 }
             }
            else if (btn_phantram == v) {
                 if(edittxt_PhepTinh.getText().length()>0) {
                     Double kq = Double.parseDouble(edittxt_PhepTinh.getText().toString().replaceAll(",", "")) / 100;

                     String s = String.valueOf(kq);
                     edittxt_PhepTinh.setText(s);
                 }

            }
            else if(btn_AC == v){
                 edittxt_PhepTinh.setText("");
                 edittxt_hienthi.setText("");
             }
             else if(btn_chia == v){

                 String dau = edittxt_PhepTinh.getText().toString().replace(",","");

                 if(edittxt_PhepTinh.getText().length()>0) {
                     try{
                         double chuyen = Double.parseDouble(dau);
                     }
                     catch (Exception e){
                         return;
                     }
                     edittxt_hienthi.setText("");
                     edittxt_hienthi.setText(edittxt_PhepTinh.getText() + "\n÷ ");
                     edittxt_PhepTinh.setText("");
                 }

             }
             else if(btn_tru == v){
                 String dau = edittxt_PhepTinh.getText().toString().replace(",","");

                 if(edittxt_PhepTinh.getText().length()>0) {
                     try{
                         double chuyen = Double.parseDouble(dau);
                     }
                     catch (Exception e){
                         return;
                     }
                     if(edittxt_hienthi.getText().length()>0){
                         btn_kq.callOnClick();
                     }
                     edittxt_hienthi.setText("");
                     edittxt_hienthi.setText(edittxt_PhepTinh.getText() + "\n- ");
                     edittxt_PhepTinh.setText("");
                 }
                 else {
                     edittxt_PhepTinh.setText("-");
                 }
             }
             else if(btn_cong == v){
                 String dau = edittxt_PhepTinh.getText().toString().replace(",","");

                 if(edittxt_PhepTinh.getText().length()>0) {
                     try{
                         double chuyen = Double.parseDouble(dau);
                     }
                     catch (Exception e){
                         return;
                     }
                     if(edittxt_hienthi.getText().length()>0){
                         btn_kq.callOnClick();
                     }
                     edittxt_hienthi.setText("");
                     edittxt_hienthi.setText(edittxt_PhepTinh.getText() + "\n+ ");
                     edittxt_PhepTinh.setText("");
                 }

             }
             else if(btn_nhan == v){
                 String dau = edittxt_PhepTinh.getText().toString().replace(",","");

                 if(edittxt_PhepTinh.getText().length()>0) {
                     try{
                         double chuyen = Double.parseDouble(dau);
                     }
                     catch (Exception e){
                         return;
                     }
                     if(edittxt_hienthi.getText().length()>0){
                         btn_kq.callOnClick();
                     }
                     edittxt_hienthi.setText("");
                     edittxt_hienthi.setText(edittxt_PhepTinh.getText() + "\nx ");
                     edittxt_PhepTinh.setText("");
                 }

             }
             else if(btn_kq == v){
                 if(edittxt_hienthi.getText().length()!=0 && edittxt_PhepTinh.getText().length()!=0) {
                     String s = edittxt_hienthi.getText().toString().replaceAll(",", "");
                     String str = s.substring(s.lastIndexOf("\n"));
                     String strr = s.substring(0, s.lastIndexOf("\n"));
                     if(str.contains("---")){
                         return;
                     }
                     Double a = Double.parseDouble(strr);
                     if (str.contains("÷")) {
                         String kq;
                         edittxt_hienthi.setText(edittxt_hienthi.getText() + "\n" + edittxt_PhepTinh.getText().toString() + "\n----------------");
                         double kq_ = a / (Double.parseDouble(edittxt_PhepTinh.getText().toString().replaceAll(",", "")));
                         if(kq_ == (int)kq_){
                             kq = String.valueOf(String.valueOf((int)kq_));
                         }
                         else{
                             kq = String.valueOf(String.valueOf(kq_));
                         }



                         edittxt_PhepTinh.setText(kq);
                     }
                     if (str.contains("x")) {
                         String kq;
                         edittxt_hienthi.setText(edittxt_hienthi.getText() + "\n" + edittxt_PhepTinh.getText().toString() + "\n----------------");
                         double kq_ = a * (Double.parseDouble(edittxt_PhepTinh.getText().toString().replaceAll(",", "")));
                         if(kq_ == (int)kq_){
                             kq = String.valueOf(String.valueOf((int)kq_));
                         }
                         else{
                             kq = String.valueOf(String.valueOf(kq_));
                         }



                         edittxt_PhepTinh.setText(kq);
                     }
                     if (str.contains("-")) {
                         String kq;
                         edittxt_hienthi.setText(edittxt_hienthi.getText() + "\n" + edittxt_PhepTinh.getText().toString() + "\n----------------");
                         double kq_ = a - (Double.parseDouble(edittxt_PhepTinh.getText().toString().replaceAll(",", "")));
                         if(kq_ == (int)kq_){
                             kq = String.valueOf(String.valueOf((int)kq_));
                         }
                         else{
                             kq = String.valueOf(String.valueOf(kq_));
                         }



                         edittxt_PhepTinh.setText(kq);
                     }
                     if (str.contains("+")) {
                         String kq;
                         edittxt_hienthi.setText(edittxt_hienthi.getText() + "\n" + edittxt_PhepTinh.getText().toString() + "\n----------------");
                         double kq_ = a + (Double.parseDouble(edittxt_PhepTinh.getText().toString().replaceAll(",", "")));
                         if(kq_ == (int)kq_){
                              kq =String.valueOf(String.valueOf((int)kq_));
                         }
                         else{
                             kq = String.valueOf(String.valueOf(kq_));
                         }



                         edittxt_PhepTinh.setText(kq);
                     }
                 }
             }
        }


    }

