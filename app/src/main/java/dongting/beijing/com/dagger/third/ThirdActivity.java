package dongting.beijing.com.dagger.third;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dongting.beijing.com.dagger.R;

/**
 * 单例注解
 */
public class ThirdActivity extends Activity {

    @Inject
    ThirdPresenter thirdPresenter1;

    @Inject
    ThirdPresenter thirdPresenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        DaggerThirdComponent.create().inject(this);

        System.out.println("thirdPresenter1 = " + thirdPresenter1);
        System.out.println("thirdPresenter2 = " + thirdPresenter2);
    }
}
