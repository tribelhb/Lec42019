package edu.up.cs301.tribelhb.lec4_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the object from the layout
        Button clickThisButton = (Button)findViewById(R.id.clickThisButton);

        // Link the object to some kind of code-based functionality

        // Need to find the text box so I can give it to the listener to modify later
        TextView theTextBox = findViewById(R.id.infoTextView);

        // First we create the listener object
        clickedButton theClickButtonListener = new clickedButton(theTextBox);

        // Finally, we can link the listener to the button
        clickThisButton.setOnClickListener(theClickButtonListener);

        //For my second button, find it and then set the listener
        Button lameButton = (Button)findViewById(R.id.lameButton);
        lameButton.setOnClickListener(theClickButtonListener);

        //STILL IN MAIN ACTIVITY

        SeekBar theSeekBar = (SeekBar)findViewById(R.id.seekBar);


        TheSeekBarListener tempListener = new TheSeekBarListener(
                (TextView)findViewById(R.id.valueTextView),
                (MySurfaceView)findViewById(R.id.surfaceView)
        );

        theSeekBar.setOnSeekBarChangeListener(tempListener);

    }
}























