package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class TextView4 extends View {
    public TextView4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    Paint paint= new Paint(Paint.ANTI_ALIAS_FLAG);
    private float interval = 25;
    private float perWidth = 80;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(3);
        paint.setColor(Color.parseColor("#000000"));
        paint.setStyle(Paint.Style.STROKE);
        //画两条线
        float[] f={80,80,80,580,80,580,680,580};
        canvas.drawLines(f,paint);

        //画两个三角
        float[] f2={60,100,80,80,80,80,100,100,660,560,680,580,680,580,660,600};
        canvas.drawLines(f2,paint);

        //竖线上
        float[] f3={
                80,530,85,530,
                80,480,85,480,
                80,430,85,430,
                80,380,85,380,
                80,330,85,330,
                80,280,85,280,
                80,230,85,230,
                80,180,85,180,
                80,130,85,130,
        };
        canvas.drawLines(f3,paint);

        //横线上的点
        float[] f4={
                135,580,135,575,
                185,580,185,575,
                235,580,235,575,
                285,580,285,575,
                335,580,335,575,
                385,580,385,575,
                435,580,435,575,
                485,580,485,575,
                535,580,535,575,
                585,580,585,575,

        };
        canvas.drawLines(f4,paint);
        paint.setColor(Color.parseColor("#FFE4E1"));
        RectF r1=new RectF(134,200,184,577);
        RectF r2=new RectF(234,200,284,577);
        RectF r3=new RectF(334,200,384,577);
        RectF r4=new RectF(434,200,484,577);
        RectF r5=new RectF(534,200,584,577);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawRect(r1,paint);
        canvas.drawRect(r2,paint);
        canvas.drawRect(r3,paint);
        canvas.drawRect(r4,paint);
        canvas.drawRect(r5,paint);


    }
}
