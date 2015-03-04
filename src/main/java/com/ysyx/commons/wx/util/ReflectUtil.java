package com.ysyx.commons.wx.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * reflect util.
 * 
 * @author duanbn
 *
 */
public final class ReflectUtil {
	
	private ReflectUtil() {
	}

	/**
	 * 
	 * @param clazz
	 * @param index
	 * @return
	 */
	public static Class<Object> getSuperClassGenricType(final Class clazz, final int index) {

		// 返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。
		final Type genType = clazz.getGenericSuperclass();

		if (!(genType instanceof ParameterizedType)) {
			return Object.class;
		}
		// 返回表示此类型实际类型参数的 Type 对象的数组。
		final Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

		if (index >= params.length || index < 0) {
			return Object.class;
		}
		if (!(params[index] instanceof Class)) {
			return Object.class;
		}

		return (Class) params[index];
	}

}
