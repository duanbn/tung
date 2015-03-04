package com.ysyx.commons.wx.annotations;

import com.ysyx.commons.wx.EnumContentType;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
/**
 * get request.
 *
 * @author duanbn
 */
public @interface Get {

	/**
	 * uri for get request.
	 */
	String value();

	/**
	 * content type for get request. default is json.
	 * 
	 * @return
	 */
	EnumContentType reqContentType() default EnumContentType.JSON;

	/**
	 * content type for get request. default is string.
	 */
	EnumContentType respContentType() default EnumContentType.JSON;

}
