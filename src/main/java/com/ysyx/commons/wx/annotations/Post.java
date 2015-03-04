package com.ysyx.commons.wx.annotations;

import com.ysyx.commons.wx.EnumContentType;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
/**
 * post request.
 *
 * @author duanbn
 */
public @interface Post {

	/**
	 * uri for post request.
	 */
	String value();

	/**
	 * content type for post request. default is json.
	 * 
	 * @return
	 */
	EnumContentType reqContentType() default EnumContentType.JSON;

	/**
	 * content type for post request. default is string.
	 */
	EnumContentType respContentType() default EnumContentType.JSON;

}
