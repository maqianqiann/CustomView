package com.amiao.text.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amiao.text.R;

/**
 * Created by lenovo on 2017/4/8.
 */

public class ThreeView extends Button {
    public ThreeView(Context context) {
        super(context);
    }

    public ThreeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //获得自定义属性
        initAttrs(attrs);
    }


    public ThreeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        //获得属性结合的对象
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.ThreeView);
        int anInt = array.getInt(R.styleable.ThreeView_buttonNum, 20);

        int resourceId = array.getResourceId(R.styleable.ThreeView_itemBack, -1);
        setText(anInt+"按");
         setBackgroundResource(resourceId);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(getContext(), "点击啦", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
