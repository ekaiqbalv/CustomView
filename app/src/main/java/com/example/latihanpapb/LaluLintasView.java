package com.example.latihanpapb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class LaluLintasView extends View {
    Paint paint;
    int circleColor;
    public LaluLintasView(Context context) {
        super(context);
        init(null);
    }

    public LaluLintasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public LaluLintasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public LaluLintasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    void init(@Nullable AttributeSet set){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        if(set == null){
            return;
        }

        TypedArray ta = getContext().obtainStyledAttributes(set, R.styleable.LaluLintasView);
        circleColor = ta.getColor(R.styleable.LaluLintasView_circle_color, Color.GREEN);
        paint.setColor(circleColor);
        ta.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(getWidth()/2f,getHeight()/2f, 200, paint);
    }
}