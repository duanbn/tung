package com.ysyx.commons.wx.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * json util.
 * 
 * @author duanbn
 *
 */
public final class JsonUtil {

	private static final ObjectMapper OBJ_MAPPER = new ObjectMapper();

	static {
		OBJ_MAPPER.setSerializationInclusion(Inclusion.NON_NULL);
	}

	private JsonUtil() {
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(final Object obj) {
		try {
			return OBJ_MAPPER.writeValueAsString(obj);
		} catch (Exception e) {
			throw new IllegalArgumentException("write to json failure", e);
		}
	}

	/**
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> T parseObject(final String json, final Class<T> clazz) {
		try {
			return OBJ_MAPPER.readValue(json, clazz);
		} catch (Exception e) {
			throw new IllegalArgumentException("parse to object failure", e);
		}
	}

}
