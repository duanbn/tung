package com.jybb.wxclient;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * represent a update result.
 *
 * @author duanbn
 */
public class WXMediaUploadResult {

    @JsonProperty("type")
    private String type;

    @JsonProperty("media_id")
    private String mediaId;

    @JsonProperty("created_at")
    private long createdAt;

    /**
     * 
     */
    @Override
	public String toString() {
		return "WXMediaUploadResult [type=" + type + ", mediaId=" + mediaId + ", createdAt=" + createdAt + "]";
	}

	/**
     *
     */
    public String getType() {
        return type;
    }
    
    /**
     *
     */
    public void setType(final String type) {
        this.type = type;
    }
    
    /**
     *
     */
    public String getMediaId() {
        return mediaId;
    }
    
    /**
     *
     */
    public void setMediaId(final String mediaId) {
        this.mediaId = mediaId;
    }
    
    /**
     *
     */
    public long getCreatedAt() {
        return createdAt;
    }
    
    /**
     *
     */
    public void setCreatedAt(final long createdAt) {
        this.createdAt = createdAt;
    }
}
