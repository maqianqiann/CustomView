package com.amiao.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lenovo on 2017/4/8.
 */

public class SecondView extends View {
    //定义起始位置
    float currentX=80;
    float currentY=80;
    float currentX1=180;
    float currentY1=80;
    public SecondView(Context context) {
        super(context);
    }

    public SecondView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SecondView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        //设置抗锯齿
        paint.setAntiAlias(true);
        //设置画笔的粗细
        paint.setStrokeWidth(5);
        //设置画笔的颜色
        paint.setColor(Color.GREEN);
        //设置画笔的样式
        paint.setStyle(Paint.Style.STROKE);
        //设置画布的背景颜色
        canvas.drawColor(Color.WHITE);
        //化园
        canvas.drawCircle(currentX,currentY,60,paint);
        paint.setColor(Color.YELLOW);
          canvas.drawCircle(currentX1,currentY1,60,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX=event.getX();
        currentY=event.getY();
        invalidate();//让原来的坐标作废,


        return true;
    }
}
