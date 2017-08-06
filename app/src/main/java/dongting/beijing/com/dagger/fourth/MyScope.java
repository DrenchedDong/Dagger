package dongting.beijing.com.dagger.fourth;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * 作者:${董婷}
 * 日期:2017/8/6
 * 类的用途:x
 * 实现思路:
 */

@Scope
@Retention(RUNTIME)//作用域范围
public @interface MyScope {//定义作用域
}
