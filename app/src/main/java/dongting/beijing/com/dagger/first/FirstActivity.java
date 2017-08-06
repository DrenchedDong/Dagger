package dongting.beijing.com.dagger.first;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dongting.beijing.com.dagger.R;

/**
 * new 对象
 * 有参  (@inject):
 * (没有@inject)  :  让对象在module中创建,定义方法返回对应类
 */

public class FirstActivity extends Activity {

    @Inject
    FirstPresenter firstPresenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //在编译后生成相应的component
        //DaggerFirstComponent.builder().build().inject(this);

       DaggerFirstComponent.builder().firstModule(new FirstModule()).build().inject(this);

        System.out.println("firstPresenter==="+firstPresenter);
    }
}
