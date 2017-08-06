package dongting.beijing.com.dagger.third;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者:${董婷}
 * 日期:2017/8/5
 * 类的用途:
 * 实现思路:
 */

@Singleton
@Component(modules = ThirdModule.class)
public interface ThirdComponent {

    void inject(ThirdActivity thirdActivity);
}
