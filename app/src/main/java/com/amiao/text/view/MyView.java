package com.amiao.text.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/4/7.
 */

public class MyView extends View {
    Context context;
    public MyView(Context context) {
        super(context);
        this.context=context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔
      Paint paint=new Paint();

        //设置画笔的粗细
        paint.setColor(Color.GREEN);
         paint.setStrokeWidth(5);
         paint.setAntiAlias(true);
         paint.setTextSize(30);
        paint.setStyle(Paint.Style.FILL);



        //样式的设置
        paint.setFakeBoldText(true);//是否为粗字体
        paint.setUnderlineText(true);
        paint.setStrikeThruText(true);//是否设置有删除的线



        //设置字体的倾斜水平
        paint.setTextSkewX((float) -0.25);

        canvas.drawText("嗨爱你们每一天",10,100,paint);
        paint.setColor(Color.YELLOW);
        paint.setTextSkewX((float) 0.25);

        canvas.drawText("嗨爱你们每一天",10,200,paint);



        paint.setColor(Color.RED);  //设置画笔颜色

      /*  paint.setStrokeWidth (5);//设置画笔宽度
        paint.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
        paint.setTextSize(50);//设置文字大小*/

        //绘图样式，设置为填充
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("欢迎光临merry的博客", 10,300, paint);

         //绘图样式设置为描边
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextScaleX(2);//水平方向拉伸两倍
        canvas.drawText("欢迎光临merry的博客", 10,400, paint);

        //绘图样式设置为填充且描边
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        //将拉伸放回
        paint.setTextScaleX(1);
        canvas.drawText("欢迎光临merry的博客", 10,500, paint);

/*
         Paint paint1=new Paint();
        paint1.setColor(Color.RED);  //设置画笔颜色

        paint1.setStrokeWidth (5);//设置画笔宽度
        paint1.setAntiAlias(true); //指定是否使用抗锯齿功能，如果使用，会使绘图速度变慢
        paint1.setTextSize(30);//设置文字大小
        paint1.setStyle(Paint.Style.FILL);//绘图样式，设置为填充

        //样式设置
        paint1.setFakeBoldText(true);//设置是否为粗体文字
        paint1.setUnderlineText(true);//设置下划线
        paint1.setStrikeThruText(true);//设置带有删除线效果

        //设置字体水平倾斜度，普通斜体字是-0.25，可见往右斜
        paint1.setTextSkewX((float) -0.25);
        canvas.drawText("嗨爱你们每一天", 10,100, paint1);

        //水平倾斜度设置为：0.25，往左斜
        paint1.setTextSkewX((float) 0.25);
        paint1.setColor(Color.YELLOW);
        canvas.drawText("嗨爱你们每一天", 10,200, paint1);*/

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        float[] pos={50,550,
                     50,600,
        50,650,50,700};
        canvas.drawPosText("这是阿喵",pos,paint);


        paint.setColor(Color.RED);  //设置画笔颜色

        paint.setStyle(Paint.Style.STROKE);//绘图样式，设置为填充

        String string="这是学习自定义View";


    //先创建两个相同的圆形路径，并先画出两个路径原图
        Path circlePath=new Path();
        circlePath.addCircle(220,200, 180, Path.Direction.CCW);
      //  canvas.drawPath(circlePath, paint);//绘制出路径原形

        Path circlePath2=new Path();
        circlePath2.addCircle(220,500, 180, Path.Direction.CW);
       // canvas.drawPath(circlePath2, paint);//绘制出路径原形

        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(50);
       //hoffset、voffset参数值全部设为0，看原始状态是怎样的
     //   canvas.drawTextOnPath(string, circlePath, 0, 0, paint);
    //第二个路径，改变hoffset、voffset参数值
      //  canvas.drawTextOnPath(string, circlePath2, 80, 30, paint);
        //设置字体的样式
        String strName="楷体";
        //通过字体名称设置字体的样式，参数是正常状态下
        Typeface typeface=Typeface.create(strName,Typeface.NORMAL);
        //将样式设置给画笔
        paint.setTypeface(typeface);
        //画出
        canvas.drawText("新的一天，美好开始",50,500,paint);

        //设置assets文件夹下的字体
        AssetManager manager=context.getAssets();//拿到管理者
        Typeface type=Typeface.createFromAsset(manager,"fonts/jian_luobo.ttf");
        paint.setTypeface(type);
        canvas.drawText("加油，每天",60,600,paint);

    }
}
