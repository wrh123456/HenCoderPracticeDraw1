package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.os.Binder;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.hencoderpracticedraw1.R;

public class TestView6 extends View{

    public TestView6(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private Paint paint=new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        setLayerType(LAYER_TYPE_SOFTWARE, null);//关闭硬件加速


//        //给图形的轮廓设置效果
//        PathEffect pathEffect = new DashPathEffect(new float[]{10, 5}, 10);
//        paint.setPathEffect(pathEffect);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(300,300,200,paint);
//
//        //将拐角变成圆角
//        PathEffect pathEffect1=new CornerPathEffect(20);
//        paint.setPathEffect(pathEffect1);
//        Path path=new Path();
//        path.moveTo(100,100);
//        path.lineTo(200,200);
//        path.lineTo(300,200);
//        path.lineTo(100,500);
//        canvas.drawPath(path,paint);
//
//        //把线条进行随机的偏离，让轮廓变得乱七八糟
//        PathEffect pathEffect2=new DiscretePathEffect(20,5);
//        paint.setPathEffect(pathEffect2);
//        Path path1=new Path();
//        path1.moveTo(200,100);
//        path1.lineTo(300,400);
//        path1.lineTo(200,500);
//        path1.lineTo(600,100);
//        canvas.drawPath(path1,paint);
//
//        //使用虚线来绘制线条
//        PathEffect pathEffect3=new DashPathEffect(new float[]{20,10,5,10},0);
//        paint.setPathEffect(pathEffect3);
//        Path path2=new Path();
//        path2.moveTo(50,50);
//        path2.lineTo(60,400);
//        path2.lineTo(700,20);
//        path2.lineTo(60,150);
//        canvas.drawPath(path2,paint);

        //使用一个path来绘制（虚线）
//        Path path3=new Path();
//        path3.moveTo(300,300);
//        path3.lineTo(340,340);
//        path3.lineTo(260,340);
//        path3.close();
//        paint.setStyle(Paint.Style.STROKE);
//        PathEffect pathEffect4=new PathDashPathEffect(path3,40,0, PathDashPathEffect.Style.MORPH);
//        paint.setPathEffect(pathEffect4);
//
//        Path path4=new Path();
//        path4.moveTo(100,100);
//        path4.lineTo(300,300);
//        path4.lineTo(400,200);
//        canvas.drawPath(path4,paint);

        //组合效果画虚线
//        PathEffect p1=new DashPathEffect(new float[]{20,10},0);
//        PathEffect p2=new DiscretePathEffect(20,5);
//        PathEffect p3=new ComposePathEffect(p1,p2);//组合效果
//        paint.setPathEffect(p3);
//        paint.setStyle(Paint.Style.STROKE);
//        Path path=new Path();
//        path.moveTo(200,200);
//        path.lineTo(350,350);
//        path.lineTo(450,150);
//        path.lineTo(550,300);
//        path.lineTo(650,100);
//        canvas.drawPath(path,paint);

        //在之后的绘制内容下面加一层阴影
//        paint.setShadowLayer(10,0,0,Color.RED);
//        paint.setTextSize(70);
//        canvas.drawText("Hello HenCoder",80,300,paint);
        //如果要清除阴影层，使用 clearShadowLayer()

        //模糊效果的MaskFilter
        paint.setMaskFilter(new BlurMaskFilter(50,BlurMaskFilter.Blur.OUTER));
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.a2);
        canvas.drawBitmap(bitmap,100,100,paint);

        //浮雕效果的MaskFilter
        paint.setMaskFilter(new EmbossMaskFilter(new float[]{0,1,1},0.2f,8,10));
        canvas.drawBitmap(bitmap,100,100,paint);


    }
}
