package org.azhon.common.security.annotation;

/**
 * 项目名:    Floret
 * 包名       org.azhon.common.security.annotation
 * 文件名:    User
 * 创建时间:  2019-04-24 on 00:41
 * 描述:     TODO 用户权限注解
 *
 * @author ZJB
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface User {

    String value();

}
