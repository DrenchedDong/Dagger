package dongting.beijing.com.dagger.Second;

import dagger.Component;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Component(modules = SecondModule.class) //让module与component产生关联
  //  @Component
public interface SecondComponent {

    void inject(SecondActivity secondActivity);
}
