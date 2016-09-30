package tech.shutu.fastreader.reader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by raomengyang on 30/09/2016.
 */

public class Reader extends TextView {
    public Reader(Context context) {
        super(context);
    }

    public Reader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Reader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initReader(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Reader(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void initReader(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


}
