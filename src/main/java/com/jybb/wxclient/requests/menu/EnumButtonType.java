package com.jybb.wxclient.requests.menu;

import java.util.HashMap;
import java.util.Map;

/**
 * button type.
 * 
 * @author duanbn
 *
 */
public enum EnumButtonType {

	CLICK("click"), VIEW("view"), SCANCODE_PUSH("scancode_push"), SCANCODE_WAITMSG("scancode_waitmsg"), PIC_SYSPHOTO("pic_sysphoto"), PIC_PHOTO_OR_ALBUM(
			"pic_photo_or_album"), PIC_WEIXIN("pic_weixin"), LOCATION_SELECT("location_select");

	private final String value;

	private static final Map<String, EnumButtonType> MAP = new HashMap<String, EnumButtonType>(7);

	static {
		for (final EnumButtonType type : EnumButtonType.values()) {
			MAP.put(type.value, type);
		}
	}

	/**
	 * 
	 * @param value
	 */
	private EnumButtonType(final String value) {
		this.value = value;
	}

	/**
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static EnumButtonType getEnum(final String value) {
		return MAP.get(value);
	}

}
