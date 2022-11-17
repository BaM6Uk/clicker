package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countmoney=0;
    int money=2;
    Button clicker;
    Button minus;
    Button dele;
    Button Ymno;
    TextView textmoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicker=(Button)findViewById(R.id.clicker);
        textmoney=(TextView)findViewById(R.id.textmoney);
        minus=(Button)findViewById(R.id.minus);
        Ymno=(Button) findViewById(R.id.ymno);
        dele=(Button)findViewById(R.id.dele);


        clicker();
        minus();
        Ymno();
        dele();
    }
    void clicker(){
        clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countmoney+=money;
                textmoney.setText(countmoney+"");
            }
        });
    }
    void minus(){
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countmoney-=money;
                textmoney.setText(countmoney + "");
            }
        });
    }
    void Ymno() {
        Ymno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countmoney *= money;
                textmoney.setText(countmoney + "");
            }
        });
    }
    void dele(){
        dele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countmoney /= money;
                textmoney.setText(countmoney + "");
            }
        });
    }
}
