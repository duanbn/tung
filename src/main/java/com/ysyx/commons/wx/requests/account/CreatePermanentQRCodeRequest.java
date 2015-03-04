package com.ysyx.commons.wx.requests.account;

import com.ysyx.commons.wx.TextHttpRequest;
import com.ysyx.commons.wx.annotations.Post;
import com.ysyx.commons.wx.annotations.QueryString;
import com.ysyx.commons.wx.requests.account.respbeans.QRCodeResult;
import com.ysyx.commons.wx.util.JsonUtil;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * create a permanent two-dimension code.
 * 
 * @author duanbn
 *
 */
@Post("/cgi-bin/qrcode/create")
public class CreatePermanentQRCodeRequest extends TextHttpRequest<QRCodeResult> {

	@QueryString("access_token")
	private final String accessToken;

	private static final String ACTION_NAME = "QR_LIMIT_SCENE";

	private final int sceneId;

	/**
	 * 
	 * @param accessToken
	 * @param sceneId
	 */
	public CreatePermanentQRCodeRequest(final String accessToken, final int sceneId) {
		this.accessToken = accessToken;
		this.sceneId = sceneId;
	}

	/**
	 * 
	 */
	@Override
	protected String getPostData() {
		final Map<String, Object> data = new LinkedHashMap<String, Object>();
		data.put("action_name", ACTION_NAME);
		final Map<String, Object> actionInfoMap = new LinkedHashMap<String, Object>();
		final Map<String, Integer> sceneIdMap = new LinkedHashMap<String, Integer>();
		sceneIdMap.put("scene_id", this.sceneId);
		actionInfoMap.put("scene", sceneIdMap);
		data.put("action_info", actionInfoMap);
		return JsonUtil.toJson(data);
	}

}
