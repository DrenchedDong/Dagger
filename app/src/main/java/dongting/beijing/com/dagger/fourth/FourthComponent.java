package dongting.beijing.com.dagger.fourth;

import dagger.Component;

/**
 * 作者:${董婷}
 * 日期:2017/8/6
 * 类的用途:
 * 实现思路:
 */
@MyScope
@Component(modules = FourthModule.class)
public interface FourthComponent {

    //添加依赖注入
    void inject(FourthActivity fourthActivity);

    void injectTest(FourthTestActivity fourthTestActivity);


}
