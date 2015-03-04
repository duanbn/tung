package com.ysyx.commons.wx.requests.wxmsg;

import java.util.HashMap;
import java.util.Map;

/**
 * media type for request.
 *
 * @author duanbn
 */
public enum EnumSendType {

	MPNEWS("mpnews"), TEXT("text"), IMAGE("image"), VOICE("voice"), MPVIDEO("mpvideo"), VIDEO("video");

	private final String value;

	private static final Map<String, EnumSendType> MAP = new HashMap<String, EnumSendType>(4);

	static {
		for (final EnumSendType type : EnumSendType.values()) {
			MAP.put(type.value, type);
		}
	}

	private EnumSendType(final String value) {
		this.value = value;
	}

	/**
	 * get enum type.
	 * 
	 * @param value
	 * @return
	 */
	public static EnumSendType getEnum(final String value) {
		return MAP.get(value);
	}

	/**
     *
     */
	public String getValue() {
		return value;
	}
}
