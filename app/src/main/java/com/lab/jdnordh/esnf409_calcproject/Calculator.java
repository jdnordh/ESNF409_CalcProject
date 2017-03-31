package com.lab.jdnordh.esnf409_calcproject;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * androidauthority.com was for guidance for lots of features
 */
public class Calculator extends AppCompatActivity {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char TIMES = '*';
    private static final char DIVISION = '/';
    private static final char NO_OP = 'N';

    private boolean equalsJustPressed = false;

    private char currentOp = NO_OP;

    private double v1 = Double.NaN;
    private double v2;
    private double ans;
    private double result;

    private String oldOp = "";

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
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "0");
                }
            }
        });
        final Button button1 = (Button) findViewById(R.id.buttonOne);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "1");
                }
            }
        });
        final Button button2 = (Button) findViewById(R.id.buttonTwo);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "2");
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.buttonThree);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "3");
                }
            }
        });
        final Button button4 = (Button) findViewById(R.id.buttonFour);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "4");
                }
            }
        });
        final Button button5 = (Button) findViewById(R.id.buttonFive);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "5");
                }
            }
        });
        final Button button6 = (Button) findViewById(R.id.buttonSix);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "6");
                }
            }
        });
        final Button button7 = (Button) findViewById(R.id.buttonSeven);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "7");
                }
            }
        });
        final Button button8 = (Button) findViewById(R.id.buttonEight);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
                if (text.getText().length() < 18) {
                    text.setText(text.getText() + "8");
                }
            }
        });
        final Button button9 = (Button) findViewById(R.id.buttonNine);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView text = (TextView) findViewById(R.id.textView);
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
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
                    if (equalsJustPressed) {
                        text.setText("");
                        equalsJustPressed = false;
                    }
                    if (text.getText() == null || text.getText() == ""){
                        text.setText("ans");
                    }
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
                    if (equalsJustPressed) {
                        text.setText("");
                        equalsJustPressed = false;
                    }
                    if (text.getText() == null || text.getText() == ""){
                        text.setText("ans");
                    }
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
                    if (equalsJustPressed) {
                        text.setText("");
                        equalsJustPressed = false;
                    }
                    if (text.getText() == null || text.getText() == ""){
                        text.setText("ans");
                    }
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
                    if (equalsJustPressed) {
                        text.setText("");
                        equalsJustPressed = false;
                    }
                    if (text.getText() == null || text.getText() == ""){
                        text.setText("ans");
                    }
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
                if (equalsJustPressed) {
                    text.setText("");
                    equalsJustPressed = false;
                }
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
                equalsJustPressed = true;
                final TextView text = (TextView) findViewById(R.id.textView);
                final TextView answer = (TextView) findViewById(R.id.editText);
                answer.setText("");
                oldOp = text.getText().toString();
                if (currentOp == NO_OP) {
                    if (oldOp.equals(text.getText().toString())){
                        String check = text.getText().toString();
                        for (int i = 0; i < check.length(); i++){
                            if (check.charAt(i) == ADDITION){
                                currentOp = ADDITION;
                                break;
                            }
                            else if (check.charAt(i) == SUBTRACTION){
                                currentOp = SUBTRACTION;
                                break;
                            }
                            else if (check.charAt(i) == TIMES){
                                currentOp = TIMES;
                                break;
                            }
                            else if (check.charAt(i) == DIVISION){
                                currentOp = DIVISION;
                                break;
                            }
                            if (i == check.length() - 1){
                                try {
                                    result = Double.parseDouble(text.getText().toString());
                                } catch (NullPointerException e) {
                                    result = 0.0;
                                } catch (Exception e) {
                                    answer.setText("Syntax Error");
                                }
                                answer.setText(Double.toString(result));
                                return;
                            }
                        }
                    }
                    /*else if (currentOp == NO_OP){
                        try {
                            result = Double.parseDouble(text.getText().toString());
                        } catch (NullPointerException e) {
                            result = 0.0;
                        } catch (Exception e) {
                            answer.setText("Syntax Error");
                        }
                        return;
                    }*/
                }

                try {
                    String[] arr;
                    String s;
                    if (currentOp == ADDITION) {
                        s = text.getText().toString().replace("+", " +");
                        arr = s.split(" +");
                        if (arr[0].equals("ans")) {
                            v1 = ans;
                        } else v1 = Double.parseDouble(arr[0]);
                        v2 = Double.parseDouble(arr[1]);
                        result = v1 + v2;
                    } else if (currentOp == SUBTRACTION) {
                        s = text.getText().toString().replace("-", " -");
                        arr = s.split(" -");
                        if (arr[0].equals("ans")) {
                            v1 = ans;
                        } else v1 = Double.parseDouble(arr[0]);
                        v2 = Double.parseDouble(arr[1]);
                        result = v1 - v2;
                    } else if (currentOp == TIMES) {
                        s = text.getText().toString().replace("*", " x");
                        arr = s.split(" x");
                        if (arr[0].equals("ans")) {
                            v1 = ans;
                        } else v1 = Double.parseDouble(arr[0]);
                        v2 = Double.parseDouble(arr[1]);
                        result = v1 * v2;
                    } else if (currentOp == DIVISION) {
                        s = text.getText().toString().replace("/", " /");
                        arr = s.split(" /");
                        if (arr[0].equals("ans")) {
                            v1 = ans;
                        } else v1 = Double.parseDouble(arr[0]);
                        v2 = Double.parseDouble(arr[1]);
                        if (v2 == 0) throw new ArithmeticException();
                        result = v1 / v2;
                    }

                    answer.setText(Double.toString(result));
                    ans = result;
                    currentOp = NO_OP;
                } catch (ArithmeticException e) {
                    currentOp = NO_OP;
                    answer.setText("Division by zero");
                } catch (Exception e){
                    currentOp = NO_OP;
                    answer.setText("Error");
                }
            }
        });
    }
}
