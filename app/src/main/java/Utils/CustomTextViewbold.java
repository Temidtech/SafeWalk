package Utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by popoolaadebimpe on 14/05/2018.
 */

public class CustomTextViewbold extends android.support.v7.widget.AppCompatTextView {


    public CustomTextViewbold(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "/font/gotham_bold_regular.ttf");
        this.setTypeface(face);
    }

    public CustomTextViewbold(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "/font/gotham_bold_regular.ttf");
        this.setTypeface(face);
    }

    public CustomTextViewbold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "/font/gotham_bold_regular.ttf");
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }

}