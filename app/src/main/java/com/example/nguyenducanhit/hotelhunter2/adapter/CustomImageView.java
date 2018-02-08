package com.example.nguyenducanhit.hotelhunter2.adapter;

import android.content.Context;

/**
 * Created by vanph on 01/02/2018.
 */

public class
CustomImageView extends android.support.v7.widget.AppCompatImageView {
    public CustomImageView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(100,100);
    }
}
