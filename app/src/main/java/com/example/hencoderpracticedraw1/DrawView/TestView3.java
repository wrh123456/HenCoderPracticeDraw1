package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;


public class TestView3 extends View{

    public TestView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private Paint paint=new Paint();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        //第一个扇形
        paint.setColor(Color.rgb(255,106,106));
        canvas.drawArc(135,135,635,635,180,120,true,paint);

        //第二个扇形
        paint.setColor(Color.rgb(255,255,0));
        canvas.drawArc(155,145,655,645,-60,60,true,paint);

        //第三个扇形
        paint.setColor(Color.rgb(139,101,8));
        canvas.drawArc(155,150,655,650,0,10,true,paint);

        //第四个扇形
        paint.setColor(Color.rgb(190,190,190));
        canvas.drawArc(153,153,653,653,10,10,true,paint);

        //第五个扇形
        paint.setColor(Color.rgb(67,205,128));
        canvas.drawArc(150,155,650,655,20,55,true,paint);

        //第六个扇形
        paint.setColor(Color.rgb(100,149,237));
        canvas.drawArc(145,155,645,655,75,105,true,paint);

        //第一条二折线
        Path path=new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(215,215);
        path.lineTo(180,180);
        path.lineTo(120,180);
        canvas.drawPath(path,paint);
        paint.setTextSize(25);
        canvas.drawText("我的",95,180,paint);

        //第二条二折线
        path.moveTo(630,300);
        path.lineTo(650,280);
        path.lineTo(680,280);
        canvas.drawPath(path,paint);
        canvas.drawText("你的",685,280,paint);

        //第3条二折线
        path.moveTo(230,580);
        path.lineTo(200,605);
        path.lineTo(130,605);
        canvas.drawPath(path,paint);
        canvas.drawText("他的",100,605,paint);




    }
}
