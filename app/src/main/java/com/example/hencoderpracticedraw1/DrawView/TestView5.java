package com.example.hencoderpracticedraw1.DrawView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Xfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.hencoderpracticedraw1.R;

public class TestView5 extends View{

    public TestView5(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private Paint paint=new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        //线性渐变
        Shader shader=new LinearGradient(100,100,500,500,Color.parseColor("#e91e63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        //TileMode 一共有 3 个值可选： CLAMP, MIRROR 和 REPEAT。
        // CLAMP 会在端点之外延续端点处的颜色；
        // MIRROR 是镜像模式；
        // REPEAT 是重复模式;

        //辐射渐变
        Shader shader1=new RadialGradient(300,300,200,Color.parseColor("#e91e63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);

        //扫描渐变
        Shader shader2=new SweepGradient(300,300,Color.parseColor("#e91e63"),
                Color.parseColor("#2196F3"));

        //BitmapShader ,图片填充
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.a1);
        Shader shader3=new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        //ComposeShader:结合两个Sahader
        Shader shader4=new ComposeShader(shader3,shader1, PorterDuff.Mode.SRC_OVER);


//        paint.setShader(shader4);
//        canvas.drawCircle(400,400,300,paint);


        Xfermode xfermode=new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

        int saved=canvas.saveLayer(null,null,Canvas.ALL_SAVE_FLAG);
        canvas.drawRect(100,100,400,400,paint);
        paint.setXfermode(xfermode);//设置Xfermore
        canvas.drawCircle(400,400,200,paint);
        paint.setXfermode(null);//用完要几时清除Xfermode

        canvas.restoreToCount(saved);

//        paint.setDither(true);抖动，设置抖动来优化色彩深度降低时的绘制效果
//        paint.setFilterBitmap(true);双线性过滤，设置双线性过滤来优化 Bitmap 放大绘制的效果。
    }
}
