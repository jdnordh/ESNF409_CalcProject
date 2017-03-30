package com.lab.jdnordh.esnf409_calcproject;

import android.icu.text.DecimalFormat;
import android.os.Binder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * androidauthority.com was for guidence for lots of features
 */
public class Calculator extends AppCompatActivity {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char TIMES = '*';
    private static final char DIVISION = '/';
    private static final char NO_OP = 'N';

    private Binder binding;

    private char currentOp = NO_OP;

    private double v1, v2;

    private double result;

    //private DecimalFormat format = new DecimalFormat();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        String app_name = "Calculator";
        this.setTitle(app_name);

        this.setButtonListeners();



    }

    private void setButtonListeners(){
        final Button button0 = (Button) findViewById(R.id.buttonZero);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "0");
                }
            }
        });
        final Button button1 = (Button) findViewById(R.id.buttonOne);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "1");
                }
            }
        });
        final Button button2 = (Button) findViewById(R.id.buttonTwo);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "2");
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.buttonThree);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "3");
                }
            }
        });
        final Button button4 = (Button) findViewById(R.id.buttonFour);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "4");
                }
            }
        });
        final Button button5 = (Button) findViewById(R.id.buttonFive);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "5");
                }
            }
        });
        final Button button6 = (Button) findViewById(R.id.buttonSix);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "6");
                }
            }
        });
        final Button button7 = (Button) findViewById(R.id.buttonSeven);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "7");
                }
            }
        });
        final Button button8 = (Button) findViewById(R.id.buttonEight);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "8");
                }
            }
        });
        final Button button9 = (Button) findViewById(R.id.buttonNine);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "9");
                }
            }
        });
        final Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (currentOp == NO_OP) {
                    currentOp = ADDITION;
                    final TextView text = (TextView) findViewById(R.id.textView);
                    if (text.getText().length() < 18) {
                        text.setText(text.getText() + "+");
                    }
                }
            }
        });
        final Button buttonMinus = (Button) findViewById(R.id.buttonSub);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (currentOp == NO_OP) {
                    currentOp = SUBTRACTION;
                    final TextView text = (TextView) findViewById(R.id.textView);
                    if (text.getText().length() < 18) {
                        text.setText(text.getText() + "-");
                    }
                }
            }
        });
        final Button buttonTimes = (Button) findViewById(R.id.buttonTimes);
        buttonTimes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (currentOp == NO_OP) {
                    currentOp = TIMES;
                    final TextView text = (TextView) findViewById(R.id.textView);
                    if (text.getText().length() < 18) {
                        text.setText(text.getText() + "*");
                    }
                }
            }
        });
        final Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (currentOp == NO_OP) {
                    currentOp = DIVISION;
                    final TextView text = (TextView) findViewById(R.id.textView);
                    if (text.getText().length() < 18) {
                        text.setText(text.getText() + "/");
                    }
                }
            }
        });
        final Button buttonDec = (Button) findViewById(R.id.buttonDec);
        buttonDec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + ".");
                }
            }
        });
        final Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                currentOp = NO_OP;
                final TextView text = (TextView) findViewById(R.id.textView);
                final TextView answer = (TextView) findViewById(R.id.editText);
                text.setText("");
                answer.setText("");
                result = v1 = v2 = 0.0;
            }
        });

        final Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                final TextView answer = (TextView) findViewById(R.id.editText);
                answer.setText("");
                if (currentOp == NO_OP) {
                    try {
                        result = Double.parseDouble(text.getText().toString());
                    } catch(Exception e){
                        answer.setText("Syntax Error");
                    }
                }
               else {
                    if (currentOp == ADDITION){

                    }
                    else if (currentOp == SUBTRACTION){

                    }
                    else if (currentOp == TIMES){

                    }
                    else if (currentOp == DIVISION){

                    }
                }
            }
        });
    }
}