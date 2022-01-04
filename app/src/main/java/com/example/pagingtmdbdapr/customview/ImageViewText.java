package com.example.pagingtmdbdapr.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.example.pagingtmdbdapr.R;

public class ImageViewText extends RelativeLayout {

    private TypedArray attributes;
    public ImageViewText(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.image_with_text,null);
        attributes = context.obtainStyledAttributes(attrs, R.styleable.imageViewText);

    }


    public String getText()
    {
        // below aint correct they used ImageWithText_text
        return  attributes.getString(R.styleable.ImageFilterView_crossfade);
    }

}
