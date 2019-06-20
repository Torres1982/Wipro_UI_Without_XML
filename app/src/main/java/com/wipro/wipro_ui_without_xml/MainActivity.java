package com.wipro.wipro_ui_without_xml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout1, layout2, layout3;
    LinearLayout.LayoutParams param1, param2;
    EditText leftEditText, rightEditText;
    Button redButton, blueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.linear1);
        layout2 = findViewById(R.id.linear2);
        layout3 = findViewById(R.id.linear3);
        leftEditText = new EditText(this);
        rightEditText = new EditText(this);
        redButton = new Button(this);
        blueButton = new Button(this);
        LinearLayout [] layouts = {layout2, layout3};
        param1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
        param2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0.5f);
        //int count = 0;

        layout1.setOrientation(LinearLayout.VERTICAL);

        for (LinearLayout layout: layouts) {
            layout.setLayoutParams(param1);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            //Toast.makeText(this, "Layout: " + ++count, Toast.LENGTH_SHORT).show();
        }

        setUpEditTexts(leftEditText, rightEditText);
        setUpButtons(redButton, blueButton);

        layout3.setBackgroundColor(Color.BLUE);
        layout2.addView(leftEditText);
        layout2.addView(rightEditText);
        layout3.addView(redButton);
        layout3.addView(blueButton);
    }

    private void setUpEditTexts(EditText editText1, EditText editText2) {
        editText1.setText(R.string.left_edit_text);
        editText2.setText(R.string.right_edit_text);
        editText1.setLayoutParams(param2);
        editText2.setLayoutParams(param2);
    }

    private void setUpButtons(Button button1, Button button2) {
        button1.setText(R.string.red_button);
        button2.setText(R.string.blue_button);
        button1.setLayoutParams(param2);
        button2.setLayoutParams(param2);
        button1.setTextColor(Color.RED);
        button2.setTextColor(Color.BLUE);
    }
}