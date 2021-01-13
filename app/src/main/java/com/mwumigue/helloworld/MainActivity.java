package com.mwumigue.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Android_text = ((TextView) findViewById(R.id.text));

        //Change text color button
        findViewById(R.id.text_color_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Android_text.setTextColor(getResources().getColor(R.color.imperial_red));
            }
        });

        //Change background color button
        findViewById(R.id.background_color_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.general).setBackgroundColor(getResources().getColor(R.color.powder_blue));
            }
        });

        //Change text button
        findViewById(R.id.text_change_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Android_text.setText("Android is Incredible!");
            }
        });

        //Upload custom text button
        findViewById(R.id.text_upload_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.custom_text)).getText().toString();
                Android_text.setText(userEnteredText);
                //Default text in case the custom text field is empty
                if (userEnteredText.isEmpty()) {
                    Android_text.setText("Enter your custom text!");
                } else {
                    Android_text.setText(userEnteredText);
                }
            }
        });

        //Reset all views to default settings
        findViewById((R.id.general)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Android_text.setText("Hello from Miguel!");
                Android_text.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.general).setBackgroundColor(getResources().getColor(R.color.honeydew));
            }
        });
    }
}