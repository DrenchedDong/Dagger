package dongting.beijing.com.dagger.third;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Module
public class ThirdModule {

    @Provides
    @Singleton
    public  ThirdPresenter providerThirdPresenter(){
        return new ThirdPresenter();
    }
}
