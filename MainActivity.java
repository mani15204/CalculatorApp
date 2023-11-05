package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCancel, btnNegation, btnPercentage, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnSubtract, btn1, btn2, btn3, btnAdd,btn0, btnDecimal, btnEquals;
    TextView txtResult;
    String op = "";
    String oprnd1 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnCancel = findViewById(R.id.btnCancel);
        btnNegation = findViewById(R.id.btnNegation);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEquals = findViewById(R.id.btnEquals);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnNegation.setOnClickListener(this);
        btnPercentage.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn0){
            txtResult.setText(txtResult.getText()+btn0.getText().toString());
        }if (view.getId() == R.id.btn1){
            txtResult.setText(txtResult.getText()+btn1.getText().toString());
        }if (view.getId() == R.id.btn2){
            txtResult.setText(txtResult.getText()+btn2.getText().toString());
        }if (view.getId() == R.id.btn3){
            txtResult.setText(txtResult.getText()+btn3.getText().toString());
        }if (view.getId() == R.id.btn4){
            txtResult.setText(txtResult.getText()+btn4.getText().toString());
        }if (view.getId() == R.id.btn5){
            txtResult.setText(txtResult.getText()+btn5.getText().toString());
        }if (view.getId() == R.id.btn6){
            txtResult.setText(txtResult.getText()+btn6.getText().toString());
        }if (view.getId() == R.id.btn7){
            txtResult.setText(txtResult.getText()+btn7.getText().toString());
        }if (view.getId() == R.id.btn8){
            txtResult.setText(txtResult.getText()+btn8.getText().toString());
        }if (view.getId() == R.id.btn9){
            txtResult.setText(txtResult.getText()+btn9.getText().toString());
        }

        if (view.getId() == R.id.btnDecimal){
            txtResult.setText(txtResult.getText()+btnDecimal.getText().toString());
        }if (view.getId() == R.id.btnCancel){
            txtResult.setText("");
        }if (view.getId() == R.id.btnNegation){
            Double num = Double.parseDouble(txtResult.getText().toString());
            if (num%1 !=0){
                txtResult.setText(String.valueOf(-1*Double.parseDouble(txtResult.getText().toString())));
            }else{
                txtResult.setText(String.valueOf( Double.valueOf(num*-1).intValue()));
            }
        }

        if(view.getId() == R.id.btnPercentage){
            txtResult.setText(String.valueOf((Double.parseDouble(txtResult.getText().toString()))/100));
        }

        if(view.getId() == R.id.btnAdd){
            op = "+";
            //txtResult.setText("op="+op);
            oprnd1 = txtResult.getText().toString();
            txtResult.setText("");
        }if(view.getId() == R.id.btnSubtract){
            op = "-";
            oprnd1 = txtResult.getText().toString();
            txtResult.setText("");
        }if(view.getId() == R.id.btnMultiply){
            op = "*";
            oprnd1 = txtResult.getText().toString();
            txtResult.setText("");
        }if(view.getId() == R.id.btnDivide){
            op = "/";
            oprnd1 = txtResult.getText().toString();
            txtResult.setText("");
        }

        if(view.getId() == R.id.btnEquals){
            //txtResult.setText("Im in op="+op);
            String oprnd2 = txtResult.getText().toString();
            if(op=="+"){
                Double val = Double.parseDouble(oprnd1)+Double.parseDouble(oprnd2);
                if (val%1==0){
                    txtResult.setText(String.valueOf(Double.valueOf(val).intValue()));
                }else{
                    txtResult.setText(String.valueOf(val));
                }
            }else if(op=="-"){
                Double val = Double.parseDouble(oprnd1)-Double.parseDouble(oprnd2);
                if (val%1==0){
                    txtResult.setText(String.valueOf(Double.valueOf(val).intValue()));
                }else{
                    txtResult.setText(String.valueOf(val));
                }
            }else if(op=="*"){
                Double val = Double.parseDouble(oprnd1)*Double.parseDouble(oprnd2);
                if (val%1==0){
                    txtResult.setText(String.valueOf(Double.valueOf(val).intValue()));
                }else{
                    txtResult.setText(String.valueOf(val));
                }
            }else if(op=="/"){
                Double val = Double.parseDouble(oprnd1)/Double.parseDouble(oprnd2);
                if (val%1==0){
                    txtResult.setText(String.valueOf(Double.valueOf(val).intValue()));
                }else{
                    txtResult.setText(String.valueOf(val));
                }
            }



        }
    }
}