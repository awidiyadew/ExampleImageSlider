package cf.awidiyadew.exampleimageslider;

import android.content.Context;
import android.util.AttributeSet;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;

/**
 * Created by awidiyadew on 18/10/16.
 */
public class MySliderLayout extends SliderLayout {
    public MySliderLayout(Context context) {
        super(context);
    }

    public MySliderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySliderLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void startAutoCycle(long delay, long duration, boolean autoRecover) {
        super.startAutoCycle(delay, 5000, autoRecover);
    }

}
