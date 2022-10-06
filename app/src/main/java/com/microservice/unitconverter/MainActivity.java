/*
 *
 *   Created Tanmayi Shinde on 06-10-2022  08:28 AM
 *   Copyright Ⓒ 2022. All rights reserved Ⓒ 2022 http://freefuninfo.com/
 *   Last modified: 06-10-2022  08:28 AM
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENS... Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *    either express or implied. See the License for the specific language governing permissions and
 *    limitations under the License.
 * /
 */

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

    //2 ways  of setting Button Function:
    //1. By Event Listner
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //if  add Tost
//                //Toast.makeText(MainActivity.this, "Hi Tanmayi here!!!", Toast.LENGTH_SHORT).show();
//                //Get Input in String format
//                String getInputInString = editText.getText().toString();
//                //Save it in Integer format
//               double kgIsconvrtInputToDouble = Double.parseDouble(getInputInString);
//
//               double pound = kgIsconvrtInputToDouble * 2.205;
//
//               textView.setText("The corresponding value in pound is " +pound);
//            }
//        });

    }
    //2. Using Method to set Button Function:
    // Need to also declare this method in xml: android:onClick="onCalculate"
        public void onCalculate(View view){
            //Get Input in String format
                String getInputInString = editText.getText().toString();
                //Save it in Integer format
               double kgIsconvrtInputToDouble = Double.parseDouble(getInputInString);
                //Calculate
               double pound = kgIsconvrtInputToDouble * 2.205;
                //Display
               textView.setText("The corresponding value in pound is " +pound);
        }


}