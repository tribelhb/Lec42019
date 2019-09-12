package edu.up.cs301.tribelhb.lec4_2019;

import android.widget.SeekBar;
import android.widget.TextView;

public class TheSeekBarListener implements  SeekBar.OnSeekBarChangeListener{

    private TextView theTextBox;
    private MySurfaceView theSV;

    public TheSeekBarListener(TextView theText, MySurfaceView aSV)
    {
        theTextBox = theText;
        theSV = aSV;
    }

    public void	onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        theTextBox.setText(""+progress);
        //Want to tell the surface view what the progress is
        theSV.setRadius(progress);
        //Need to tell the surface view that I updated, so it should re-draw
        //theSV.invalidate();
    }

    public void	onStartTrackingTouch(SeekBar seekBar)
    {

    }

    public void	onStopTrackingTouch(SeekBar seekBar)
    {

    }
}
