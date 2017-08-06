package dongting.beijing.com.dagger.Second;

import dagger.Module;
import dagger.Provides;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Module
public class SecondModule {

    String name;

    public SecondModule(String name){
        this.name=name;
    }

    @Provides
    public SecondPresenter providerSecondPresenter(){
        return new SecondPresenter(name);
    }

   /* @Provides
    public String providerString(){
        return name;
    }*/
}
