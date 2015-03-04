package com.ysyx.commons.wx.requests.account;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.account.respbeans.QRCodeResult;
import com.ysyx.commons.wx.util.JsonUtil;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * create a string permanent two-dimension code.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/qrcode/create")
public class CreateStringPermanentQRCodeRequest extends TextHttpRequest<QRCodeResult> {

	@QueryString("access_token")
	private final String accessToken;

	private static final String ACTION_NAME = "QR_LIMIT_STR_SCENE";

	private final String sceneStr;

	/**
	 * 
	 * @param accessToken
	 * @param sceneStr
	 */
	public CreateStringPermanentQRCodeRequest(final String accessToken, final String sceneStr) {
		this.accessToken = accessToken;
		this.sceneStr = sceneStr;
	}

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("action_name", ACTION_NAME);
		final Map<String, Object> actionInfoMap = new LinkedHashMap<String, Object>();
		final Map<String, String> sceneIdMap = new LinkedHashMap<String, String>();
		sceneIdMap.put("scene_str", this.sceneStr);
		actionInfoMap.put("scene", sceneIdMap);
		data.put("action_info", actionInfoMap);
		return JsonUtil.toJson(data);
	}

}
