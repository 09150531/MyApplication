package com.example.administrator.lessson_pre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnmin, btnmul, btnmod, btnspo, btnequ, bthclean, bthdel;
    TextView textView;
    boolean clicked = false;
    StringBuffer text = new StringBuffer();
    String number1 = "", number2 = "";
    byte style = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        btn1 = (Button) this.findViewById(R.id.one);
        btn2 = (Button) this.findViewById(R.id.two);
        btn3 = (Button) this.findViewById(R.id.three);
        btn4 = (Button) this.findViewById(R.id.four);
        btn5 = (Button) this.findViewById(R.id.five);
        btn6 = (Button) this.findViewById(R.id.six);
        btn7 = (Button) this.findViewById(R.id.seven);
        btn8 = (Button) this.findViewById(R.id.eight);
        btn9 = (Button) this.findViewById(R.id.nine);
        btn0 = (Button) this.findViewById(R.id.zero);
        btnadd = (Button) this.findViewById(R.id.Add);
        btnmin = (Button) this.findViewById(R.id.Min);
        btnmod = (Button) this.findViewById(R.id.Mod);
        btnmul = (Button) this.findViewById(R.id.Mul);
        btnspo = (Button) this.findViewById(R.id.Spo);
        btnequ = (Button) this.findViewById(R.id.Equ);
        bthclean = (Button) this.findViewById(R.id.clean);
        bthdel = (Button) this.findViewById(R.id.DEL);

        btn1.setOnClickListener(new myClick());
        btn2.setOnClickListener(new myClick());
        btn3.setOnClickListener(new myClick());
        btn4.setOnClickListener(new myClick());
        btn5.setOnClickListener(new myClick());
        btn6.setOnClickListener(new myClick());
        btn7.setOnClickListener(new myClick());
        btn8.setOnClickListener(new myClick());
        btn9.setOnClickListener(new myClick());
        btn0.setOnClickListener(new myClick());

        textView = (TextView) this.findViewById(R.id.tv);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    number2 = textView.getText().toString();
                    if (number1.equals("") && number2.equals("")) {
                        return;
                    }
                    Double d1 = Double.valueOf(number1);
                    Double d2 = Double.valueOf(number2);
                    Double r = 0.0;
                    switch (style) {
                        case 1:
                            r = d1 + d2;
                            break;
                        case 2:
                            r = d1 - d2;
                            break;
                        case 3:
                            r = d1 * d2;
                            break;
                        case 4:
                            if (d2 != 0) {
                                r = d1 / d2;
                            } else {
                                text.setLength(0);
                                number1 = "";
                                number2 = "";
                                style = 0;
                                clicked = false;
                                textView.setText("Error!");
                                return;
                            }
                            break;
                    }
                    number1 = r.toString();
                    number2 = "";
                    text.setLength(0);
                    textView.setText(r.toString());
                    style = 1;
                } else {
                    number1 = textView.getText().toString();
                    style = 1;
                    clicked = true;
                }
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    number2 = textView.getText().toString();
                    if (number1.equals("") && number2.equals("")) {
                        return;
                    }
                    Double d1 = Double.valueOf(number1);
                    Double d2 = Double.valueOf(number2);
                    Double r = 0.0;
                    switch (style) {
                        case 1:
                            r = d1 + d2;
                            break;
                        case 2:
                            r = d1 - d2;
                            break;
                        case 3:
                            r = d1 * d2;
                            break;
                        case 4:
                            if (d2 != 0) {
                                r = d1 / d2;
                            } else {
                                text.setLength(0);
                                number1 = "";
                                number2 = "";
                                style = 0;
                                clicked = false;
                                textView.setText("Error!");
                                return;
                            }
                            break;
                    }
                    number1 = r.toString();
                    number2 = "";
                    text.setLength(0);
                    textView.setText(r.toString());
                    style = 2;
                } else {
                    number1 = textView.getText().toString();
                    style = 2;
                    clicked = true;
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    number2 = textView.getText().toString();
                    if (number1.equals("") && number2.equals("")) {
                        return;
                    }
                    Double d1 = Double.valueOf(number1);
                    Double d2 = Double.valueOf(number2);
                    Double r = 0.0;
                    switch (style) {
                        case 1:
                            r = d1 + d2;
                            break;
                        case 2:
                            r = d1 - d2;
                            break;
                        case 3:
                            r = d1 * d2;
                            break;
                        case 4:
                            if (d2 != 0) {
                                r = d1 / d2;
                            } else {
                                text.setLength(0);
                                number1 = "";
                                number2 = "";
                                style = 0;
                                clicked = false;
                                textView.setText("Error!");
                                return;
                            }
                            break;
                    }
                    number1 = r.toString();
                    number2 = "";
                    text.setLength(0);
                    textView.setText(r.toString());
                    style = 3;
                } else {
                    number1 = textView.getText().toString();
                    style = 3;
                    clicked = true;
                }
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    number2 = textView.getText().toString();
                    if (number1.equals("") && number2.equals("")) {
                        return;
                    }
                    Double d1 = Double.valueOf(number1);
                    Double d2 = Double.valueOf(number2);
                    Double r = 0.0;
                    switch (style) {
                        case 1:
                            r = d1 + d2;
                            break;
                        case 2:
                            r = d1 - d2;
                            break;
                        case 3:
                            r = d1 * d2;
                            break;
                        case 4:
                            if (!d2.equals(0)) {
                                r = d1 / d2;
                            } else {
                                text.setLength(0);
                                number1 = "";
                                number2 = "";
                                style = 0;
                                clicked = false;
                                textView.setText("Error!");
                                return;
                            }
                            break;
                    }
                    number1 = r.toString();
                    number2 = "";
                    text.setLength(0);
                    textView.setText(r.toString());
                    style = 4;
                } else {
                    number1 = textView.getText().toString();
                    style = 4;
                    clicked = true;
                }
            }
        });

        bthclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setLength(0);
                number1 = "";
                number2 = "";
                style = 0;
                clicked = false;
                textView.setText(text.toString());
            }
        });
        bthdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.toString().equals("")) {
                } else {
                    text.deleteCharAt(text.length() - 1);
                }
                textView.setText(text.toString());
            }
        });
        btnspo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    textView.setText("");
                    clicked = false;
                    text.setLength(0);
                }
                if (!textView.getText().toString().contains(".")) {
                    if (text.length() == 0) {
                        text.append("0.");
                    } else {
                        text.append(".");
                    }
                    textView.setText(text.toString());
                }
            }
        });
        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (style != 0) {
                    number2 = textView.getText().toString();
                    if (number1.equals("") && number2.equals("")) {
                        return;
                    }
                    Double d1 = Double.valueOf(number1);
                    Double d2 = Double.valueOf(number2);
                    Double r = 0.0;
                    switch (style) {
                        case 1:
                            r = d1 + d2;
                            break;
                        case 2:
                            r = d1 - d2;
                            break;
                        case 3:
                            r = d1 * d2;
                            break;
                        case 4:
                            if (!d2.equals(0.0)) {
                                r = d1 / d2;
                            } else {
                                text.setLength(0);
                                number1 = "";
                                number2 = "";
                                style = 0;
                                clicked = false;
                                textView.setText("Error!");
                                return;
                            }
                            break;
                    }
                    textView.setText(r.toString());
                    text.setLength(0);
                    number1 = "";
                    number2 = "";
                    style = 0;
                    clicked = false;
                } else {
                    return;
                }

            }
        });
    }

    class myClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (clicked) {
                textView.setText("");
                clicked = false;
                text.setLength(0);
            }
            switch (v.getId()) {
                case R.id.one:
                    text.append("1");
                    textView.setText(text.toString());
                    break;
                case R.id.two:
                    text.append("2");
                    textView.setText(text.toString());
                    break;
                case R.id.three:
                    text.append("3");
                    textView.setText(text.toString());
                    break;
                case R.id.four:
                    text.append("4");
                    textView.setText(text.toString());
                    break;
                case R.id.five:
                    text.append("5");
                    textView.setText(text.toString());
                    break;
                case R.id.six:
                    text.append("6");
                    textView.setText(text.toString());
                    break;
                case R.id.seven:
                    text.append("7");
                    textView.setText(text.toString());
                    break;
                case R.id.eight:
                    text.append("8");
                    textView.setText(text.toString());
                    break;
                case R.id.nine:
                    text.append("9");
                    textView.setText(text.toString());
                    break;
                case R.id.zero:
                    text.append("0");
                    textView.setText(text.toString());
                    break;
            }
        }
    }
}

