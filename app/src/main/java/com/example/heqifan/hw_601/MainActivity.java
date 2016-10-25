package com.example.heqifan.hw_601;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonRock;
    private ImageButton buttonScissor;
    private ImageButton buttonPaper;
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

        buttonRock = (ImageButton) findViewById(R.id.buttonRock);
        buttonPaper = (ImageButton) findViewById(R.id.buttonPaper);
        buttonScissor = (ImageButton) findViewById(R.id.buttonScissor);
        buttonReset = (Button)findViewById(R.id.buttonReset);
        buttonShow = (Button)findViewById(R.id.buttonShow);


        ButtonListenerRock buttonListenerRock = new ButtonListenerRock();
        ButtonListenerScissor buttonListenerScissor = new ButtonListenerScissor();
        ButtonListenerPaper buttonListenerPaper = new ButtonListenerPaper();
        ButtonListenerReset buttonListenerReset = new ButtonListenerReset();
        ButtonListenerShow buttonListenerShow = new ButtonListenerShow();


        buttonRock.setOnClickListener(buttonListenerRock);
        buttonPaper.setOnClickListener(buttonListenerPaper);
        buttonScissor.setOnClickListener(buttonListenerScissor);
        buttonReset.setOnClickListener(buttonListenerReset);
        buttonShow.setOnClickListener(buttonListenerShow);



        



    }

    class ButtonListenerRock implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (p1 == 0){
                p1 = 1;
                textView.setText("P2 Select");
            }
            else if(p2 == 0){
                p2 = 1;
                textView.setText("Click SHOW Button!");
            }
        }
    }
    class ButtonListenerScissor implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (p1 == 0){
                p1 = 2;
                textView.setText("P2 Select");
            }
            else if(p2 == 0){
                p2 = 2;
                textView.setText("Click SHOW Button!");
            }
        }
    }
    class ButtonListenerPaper implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (p1 == 0){
                p1 = 3;
                textView.setText("P2 Select");
            }
            else if(p2 == 0){
                p2 = 3;
                textView.setText("Click SHOW Button!");
            }
        }
    }
    class ButtonListenerReset implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            p1 = 0;
            p2 = 0;
            textView.setText("P1 Select");
        }
    }
    class ButtonListenerShow implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (p1 == p2){
                textView.setText("Tie!");
            }
            if (p1 == 1 && p2 == 2){
                textView.setText("P1 WINS!");
            }
            if (p1 == 2 && p2 == 3){
                textView.setText("P1 WINS!");
            }
            if (p1 == 3 && p2 == 1){
                textView.setText("P1 WINS!");
            }
            if (p1 == 1 && p2 == 3){
                textView.setText("P2 WINS!");
            }
            if (p1 == 2 && p2 == 1){
                textView.setText("P2 WINS!");
            }
            if (p1 == 3 && p2 == 2){
                textView.setText("P2 WINS!");
            }
        }
    }
}
