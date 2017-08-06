package dongting.beijing.com.dagger.first;

import dagger.Module;
import dagger.Provides;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Module
public class FirstModule {

    @Provides
    public FirstPresenter providerFirstPresenter(){

        return new FirstPresenter();
    }
}
