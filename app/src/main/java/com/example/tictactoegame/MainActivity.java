package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;

    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0;

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        init();


    }

    public void init()
    {
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
    }

    public void Check(View view)
    {
        count++;
        Button btn_current=(Button) view;
        if(btn_current.getText().toString().equals("")) {
            if (flag == 0) {
                btn_current.setText("X");
                flag = 1;
            } else {
                btn_current.setText("0");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn_1.getText().toString();
                b2 = btn_2.getText().toString();
                b3 = btn_3.getText().toString();
                b4 = btn_4.getText().toString();
                b5 = btn_5.getText().toString();
                b6 = btn_6.getText().toString();
                b7 = btn_7.getText().toString();
                b8 = btn_8.getText().toString();
                b9 = btn_9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is " + b8, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                    Toast.makeText(this, "Winner is " + b5, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b3.equals(b6) && b5.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is " + b9, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, "Winner is " + b5, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b5, Toast.LENGTH_SHORT).show();
                    restart();

                }
                else if (count==9)
                {
                    Toast.makeText(this,"Game is Draw",Toast.LENGTH_SHORT).show();
                    restart();
                }

            }
        }

    }

    public void restart()
    {
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        btn_9.setText("");
        count=0;
        flag=0;
    }

}
