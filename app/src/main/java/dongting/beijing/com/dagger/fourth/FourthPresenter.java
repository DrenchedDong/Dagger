package dongting.beijing.com.dagger.fourth;

import javax.inject.Inject;

/**
 * 作者:${董婷}
 * 日期:2017/8/6
 * 类的用途:
 * 实现思路:
 */

public class FourthPresenter {

    String name;

    @Inject
    public FourthPresenter(String name){
this.name=name;
    }

}
