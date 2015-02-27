package com.jybb.wxclient.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.jybb.wxclient.EnumContentType;

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
