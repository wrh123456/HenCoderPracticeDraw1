package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class TestView1 extends View{

    public TestView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private Paint paint=new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(50,50,100));
        canvas.drawRect(0,0,getWidth(),400,paint);
    }
}
