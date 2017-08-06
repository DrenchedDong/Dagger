package dongting.beijing.com.dagger.first;

import dagger.Component;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Component(modules = FirstModule.class)
public interface FirstComponent {

    //进行依赖注入
    void inject(FirstActivity firstActivity);

}
