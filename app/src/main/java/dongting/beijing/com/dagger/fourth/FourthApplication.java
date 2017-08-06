package dongting.beijing.com.dagger.fourth;

import android.app.Application;

/**
 * 作者:${董婷}
 * 日期:2017/8/6
 * 类的用途:
 * 实现思路:
 */

public class FourthApplication extends Application {

    public  static  FourthComponent fourthComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        fourthComponent = DaggerFourthComponent.builder().fourthModule(new FourthModule("haha")).build();
    }
}
