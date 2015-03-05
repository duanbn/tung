package com.ysyx.commons.wx.requests.menu;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract button.
 * 
 * @author duanbn
 *
 */
public class Button {

	@JsonProperty("name")
	protected String name;

	@JsonProperty("type")
	protected String type;

	@JsonProperty("key")
	private String key;

	@JsonProperty("url")
	private String url;

	@JsonProperty("sub_button")
	protected final List<Button> subButtons = new ArrayList<Button>();

	/**
	 * 
	 */
	public Button() {
		this(null, null);
	}

	/**
	 * 
	 * @param name
	 * @param type
	 */
	public Button(final String name, final EnumButtonType type) {
		this.name = name;
		if (type != null) {
			this.type = type.getValue();
		}
	}

	/**
	 * 
	 * @param button
	 */
	public void appendButton(final Button button) {
		if (this.subButtons.size() < 5) {
			this.subButtons.add(button);
		} else {
			throw new IllegalArgumentException("menu button max size is 5");
		}
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Button [name=" + name + ", type=" + type + ", key=" + key + ", url=" + url + ", subButtons="
				+ subButtons + "]";
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return
	 */
	public String getKey() {
		return key;
	}

	/**
	 * 
	 * @param key
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	/**
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 */
	public void setUrl(final String url) {
		this.url = url;
	}

}
