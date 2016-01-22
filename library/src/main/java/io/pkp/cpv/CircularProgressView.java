package io.pkp.cpv;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by praveen on 22.01.16.
 */
public class CircularProgressView extends RelativeLayout {
    Context context;

    ImageView imageView;
    com.github.rahatarmanahmed.cpv.CircularProgressView progressView;

    public CircularProgressView(Context context) {
        super(context);
        init(context);
        applyAttributes(null, 0);
    }

    public CircularProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        applyAttributes(attrs, 0);
    }

    public CircularProgressView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
        applyAttributes(attrs, defStyle);
    }

    private void init(Context context) {
        View root = View.inflate(context, R.layout.circular_progress_view,
                this);

        imageView = (ImageView) root.findViewById(R.id.image_view);
        progressView = (com.github.rahatarmanahmed.cpv.CircularProgressView)
                root.findViewById(R.id.progress_view);
    }

    private void applyAttributes(AttributeSet attrs, int defStyle) {
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.CircularProgressView, defStyle, 0);
        Resources resources = getResources();
        // -TODO- Apply attribute values
        a.recycle();
    }


    /******************************************************************
     *                   Start of Public API for the View
     *******************************************************************/

    /**
     * Get the ImageView that is at the center of the progressBar
     */
    public ImageView getImageView(){
        return imageView;
    }

    /**
     * Get the CircularProgressView is used for circular progress. This view is the
     * CircularProgressView of https://github.com/rahatarmanahmed/CircularProgressView
     */
    public com.github.rahatarmanahmed.cpv.CircularProgressView getProgressView(){
        return progressView;
    }

    // -TODO- CPV methods shadowing and Image setting methods too!


    /******************************************************************
     *                   End of Public API for the View
     *******************************************************************/



}
