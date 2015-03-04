package com.ysyx.commons.wx.requests.menu;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.WXCommonResult;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

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
     */
    public void setButtons(final List<Button> buttons) {
        if (this.buttons.size() <= 3) {
			this.buttons.addAll(buttons);
		} else {
			throw new IllegalArgumentException("menu button max size is 3");
		}
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
