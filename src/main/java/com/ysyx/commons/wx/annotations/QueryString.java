package com.ysyx.commons.wx.annotations;

import java.lang.annotation.*;

/**
 * annotate a field of get request.
 *
 * @author duanbn
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface QueryString {

    /**
     * query stirng name.
     */
    String value() default "";

}
