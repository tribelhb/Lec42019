package edu.up.cs301.tribelhb.lec4_2019;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class clickedButton implements View.OnClickListener {

    private TextView theTextBox;
    private int clickCounter;

    public clickedButton(TextView theText)
    {
        theTextBox = theText;
        clickCounter = 0;
    }

    public void onClick(View v)
    {
        // Location where I want to do something about my click

        Button theOneClicked = (Button)v;
        CharSequence label = theOneClicked.getText();

        if(label.charAt(0) != 'D') {
            clickCounter += 1;
            theTextBox.setText("You clicked the button " + clickCounter + " times!");
        }
        else
            theTextBox.setText("You're a BAD LISTENER, get it??");
    }
}
