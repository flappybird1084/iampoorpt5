package com.calc.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rich; // Button with text "Rich"
    Button poor; // Button with text "Poor"

    TextView topLabel; // TextView with text "I am Currently Confused"

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Called when the activity is first created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the content view to use the activity_main.xml layout

        rich = findViewById(R.id.button); // Find the button with id "button"
        poor = findViewById(R.id.button2); // Find the button with id "button2"

        topLabel = findViewById(R.id.textView); // Find the TextView with id "textView"

        // no javadocs >:)
        // runs a function on the buttons
        rich.setOnClickListener(v -> verifyRichness(rich)); // When the button with id "button" is clicked it calls the verifyRichness method
        poor.setOnClickListener(v -> verifyRichness(poor)); // When the button with id "button2" is clicked it calls the verifyRichness method

    }


    /**
     * sets text to "i am" plus the text of the button
     * buttons are named "rich" and "poor"
     * @param button
     */
    public void verifyRichness(Button button){
        topLabel.setText("I am " + button.getText()); //verifies richness by appending button text to the end string and puts that in toplabel
    }
}