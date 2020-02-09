package com.example.work322;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button one = findViewById(R.id.one);
        clicButton(one, "1");
        Button two = findViewById(R.id.two);
        clicButton(two, "2");
        Button three = findViewById(R.id.three);
        clicButton(three, "3");
        Button four = findViewById(R.id.four);
        clicButton(four, "4");
        Button five = findViewById(R.id.five);
        clicButton(five, "5");
        Button six = findViewById(R.id.six);
        clicButton(six, "6");
        Button seven = findViewById(R.id.seven);
        clicButton(seven, "7");
        Button eight = findViewById(R.id.eight);
        clicButton(eight, "8");
        Button nine = findViewById(R.id.nine);
        clicButton(nine, "9");
        Button zero = findViewById(R.id.zero);
        clicButton(zero, "0");
        Button point = findViewById(R.id.point);
        clicPoit(point, ".");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        LinearLayout enginer = findViewById(R.id.five_layout);
        switch (item.getItemId()){
            case R.id.engineering:
                enginer.setVisibility(View.VISIBLE);
                return true;
            case R.id.normal:
                enginer.setVisibility(View.GONE);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clicButton(Button button, final String number){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.output);
                String num  = output.getText().toString() + number;
                output.setText(num);
            }
        });
    }
    public void clicPoit(Button button, final String number){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView output = findViewById(R.id.output);
                if(output.getText().toString().contains(".")){
                    Toast.makeText(MainActivity.this, getText(R.string.point_tosk), Toast.LENGTH_LONG).show();
                }else {
                    String num  = output.getText().toString() + number;
                    output.setText(num);
                }
            }
        });
    }
}
