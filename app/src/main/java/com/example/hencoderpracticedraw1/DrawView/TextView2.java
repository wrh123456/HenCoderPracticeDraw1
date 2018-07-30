package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class TextView2 extends View {
    public TextView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private Paint paint=new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);

        //黑心圆
        paint.setColor(Color.rgb(00,00,00));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(150,150,80,paint);

        //线条圆
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(330,150,80,paint);

        //蓝心圆
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(152,245,255));
        canvas.drawCircle(150,350,80,paint);

        //组合空心圆
        Path path=new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.addCircle(360,360,90,Path.Direction.CW);//CW顺时针，CCW逆时针
        path.addCircle(360,360,60,Path.Direction.CW);
        paint.setColor(Color.rgb(00,00,00));
        canvas.drawPath(path,paint);

    }
}
