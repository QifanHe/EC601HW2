package com.example.heqifan.hw_601;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonRock1;
    private Button buttonRock2;
    private Button buttonScissor1;
    private Button buttonScissor2;
    private Button buttonPaper1;
    private Button buttonPaper2;
    private Button buttonReset;
    private Button buttonShow;
    private TextView textView;
    int p1;
    int p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);

        buttonRock1 = (Button)findViewById(R.id.buttonRock1);
        buttonRock2 = (Button)findViewById(R.id.buttonRock2);
        buttonPaper1 = (Button)findViewById(R.id.ButtonPaper1);
        buttonPaper2 = (Button)findViewById(R.id.ButtonPaper2);
        buttonScissor1 = (Button)findViewById(R.id.buttonScissor1);
        buttonScissor2 = (Button)findViewById(R.id.buttonScissor2);
        buttonReset = (Button)findViewById(R.id.buttonReset);
        buttonShow = (Button)findViewById(R.id.buttonShow);


        ButtonListenerRock1 buttonListenerRock1 = new ButtonListenerRock1();
        ButtonListenerRock2 buttonListenerRock2 = new ButtonListenerRock2();
        ButtonListenerScissor1 buttonListenerScissor1 = new ButtonListenerScissor1();
        ButtonListenerScissor2 buttonListenerScissor2 = new ButtonListenerScissor2();
        ButtonListenerPaper1 buttonListenerPaper1 = new ButtonListenerPaper1();
        ButtonListenerPaper2 buttonListenerPaper2 = new ButtonListenerPaper2();
        ButtonListenerReset buttonListenerReset = new ButtonListenerReset();
        ButtonListenerShow buttonListenerShow = new ButtonListenerShow();


        buttonRock1.setOnClickListener(buttonListenerRock1);
        buttonRock2.setOnClickListener(buttonListenerRock2);
        buttonPaper1.setOnClickListener(buttonListenerPaper1);
        buttonPaper2.setOnClickListener(buttonListenerPaper2);
        buttonScissor1.setOnClickListener(buttonListenerScissor1);
        buttonScissor2.setOnClickListener(buttonListenerScissor2);
        buttonReset.setOnClickListener(buttonListenerReset);
        buttonShow.setOnClickListener(buttonListenerShow);



        



    }

    class ButtonListenerRock1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p1 = 1;
            textView.setText("P2 select");
        }
    }
    class ButtonListenerRock2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p2 = 1;
            textView.setText("Click show");
        }
    }
    class ButtonListenerScissor1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p1 = 2;
            textView.setText("P2 select");
        }
    }
    class ButtonListenerScissor2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p2 = 2;
            textView.setText("Click show");
        }
    }
    class ButtonListenerPaper1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p1 = 3;
            textView.setText("P2 select");
        }
    }
    class ButtonListenerPaper2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p2 = 3;
            textView.setText("Click show");
        }
    }
    class ButtonListenerReset implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            textView.setText("P1 select");
        }
    }
    class ButtonListenerShow implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (p1 == p2){
                textView.setText("Tie");
            }
            if (p1 == 1 && p2 == 2){
                textView.setText("P1 WINS");
            }
            if (p1 == 2 && p2 == 3){
                textView.setText("P1 WINS");
            }
            if (p1 == 3 && p2 == 1){
                textView.setText("P1 WINS");
            }
            if (p1 == 1 && p2 == 3){
                textView.setText("P2 WINS");
            }
            if (p1 == 2 && p2 == 1){
                textView.setText("P2 WINS");
            }
            if (p1 == 3 && p2 == 2){
                textView.setText("P2 WINS");
            }
        }
    }
}
