package com.microservice.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.microservice.unitconverterr.R;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if  add Tost
                //Toast.makeText(MainActivity.this, "Hi Tanmayi here!!!", Toast.LENGTH_SHORT).show();
                //Get Input in String format
                String getInputInString = editText.getText().toString();
                //Save it in Integer format
               double kgIsconvrtInputToDouble = Double.parseDouble(getInputInString);

               double pound = kgIsconvrtInputToDouble * 2.205;

               textView.setText("The corresponding value in pound is " +pound);
            }
        });
    }
}