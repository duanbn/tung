package com.jybb.wxclient.requests.account;

import java.util.LinkedHashMap;
import java.util.Map;

import com.jybb.wxclient.TextHttpRequest;
import com.jybb.wxclient.annotations.Post;
import com.jybb.wxclient.annotations.QueryString;
import com.jybb.wxclient.requests.account.respbeans.QRCodeResult;
import com.jybb.wxclient.util.JsonUtil;

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
