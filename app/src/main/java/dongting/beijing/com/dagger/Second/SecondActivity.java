package dongting.beijing.com.dagger.Second;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dongting.beijing.com.dagger.R;

/**
 * ①。不加@inject注解进行传值的方式
 * ②。加@inject注解进行传值的方式
 */
public class SecondActivity extends Activity {

    @Inject
    SecondPresenter secondPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       DaggerSecondComponent.builder().secondModule(new SecondModule("haha")). build().inject(this);

        // DaggerSecondComponent

        System.out.println("secondPresenter = " + secondPresenter.name);
    }
}
