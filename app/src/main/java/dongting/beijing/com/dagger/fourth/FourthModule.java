package dongting.beijing.com.dagger.fourth;

import dagger.Module;
import dagger.Provides;

/**
 * 作者:${董婷}
 * 日期:2017/8/6
 * 类的用途:
 * 实现思路:
 */
@Module
public class FourthModule {

    String name;
    public FourthModule(String name){
        this.name=name;
    }

   /* @MyScope
    @Provides
    public String providerString(){
        return name;
    }*/

    @MyScope
    @Provides
    public FourthPresenter providerFourthPresenter(){
        return new FourthPresenter(name);
    }
}
