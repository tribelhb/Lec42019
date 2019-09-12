package edu.up.cs301.tribelhb.lec4_2019;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.SurfaceView;
import android.util.AttributeSet;


public class MySurfaceView extends SurfaceView {

    private int radius;

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // Tell android to call my draw function, so I can actually draw something
        setWillNotDraw(false);  // #IMPORTANT
        radius = 0;
    }

    public void	onDraw(Canvas canvas)
    {
        Bitmap theImg = BitmapFactory.decodeResource(getResources(), R.drawable.myimage);
        canvas.drawBitmap(theImg, 100, 10, null);

        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5.0f);

        canvas.drawCircle(200,200,radius, paint);
    }

     public void setRadius(int r)
     {
         radius = r;
         invalidate();
        Log.i("MySurfaceView.setRadius","I just set the radius");
     }
}
