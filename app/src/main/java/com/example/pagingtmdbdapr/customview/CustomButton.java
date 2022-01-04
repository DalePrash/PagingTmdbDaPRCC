package com.example.pagingtmdbdapr.customview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pagingtmdbdapr.R;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {


    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setButtonTypeface(context,attrs,defStyleAttr);
    }


    private void setButtonTypeface(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        TypedArray mTyped = context.getTheme().obtainStyledAttributes(attrs, R.styleable.customWidgetA,defStyleAttr,R.style.CoreThemeButton);
        String buttonTypeFaced = mTyped.getString(R.styleable.Transform_android_scaleX);// ? not good
        Typeface buttonTyepFace = Typeface.createFromAsset(context.getAssets(),"path");
        setTypeface(buttonTyepFace);
    }
    public void disabledButton(boolean enabled)
    {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = getContext().getTheme();
        theme.resolveAttribute(R.attr.inactiveButton,typedValue,true);
        @ColorInt int colorx = typedValue.data;
        setTextColor(colorx);
    }

    }
