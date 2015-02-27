package com.jybb.wxclient.requests.menu;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.WXCommonResult;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;

/**
 * create custom menu request.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/menu/create")
public class CreateMenuRequest extends TextHttpRequest<WXCommonResult> {

	@QueryString("access_token")
	private final String accessToken;

	@JsonProperty("button")
	private final List<Button> buttons = new ArrayList<Button>(3);

	/**
	 * 
	 * @param accessToken
	 */
	public CreateMenuRequest(final String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 
	 * @param button
	 */
	public void addButton(final Button button) {
		if (this.buttons.size() < 3) {
			this.buttons.add(button);
		} else {
			throw new IllegalArgumentException("menu button max size is 3");
		}
	}

	/**
	 * 
	 * @param parent
	 * @param button
	 */
	public void addSubButton(final Button parent, final Button button) {
		parent.appendButton(button);
	}

}
