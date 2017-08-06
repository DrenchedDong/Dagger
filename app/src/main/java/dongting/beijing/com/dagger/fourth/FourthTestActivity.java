package dongting.beijing.com.dagger.fourth;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dongting.beijing.com.dagger.R;

public class FourthTestActivity extends Activity {

    @Inject
    FourthPresenter fourthPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_test);

        FourthApplication.fourthComponent.injectTest(this);
        System.out.println("2==fourthPresenter = " + fourthPresenter);
    }
}
