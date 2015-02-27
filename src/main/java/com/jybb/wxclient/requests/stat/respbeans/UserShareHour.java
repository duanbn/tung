package com.jybb.wxclient.requests.stat.respbeans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * statisic data of user share hour.
 *
 * @author duanbn
 */
public class UserShareHour {

    @JsonProperty("list")
    private List<Summary> list;

    /**
     *
     */
    public List<Summary> getList() {
        return this.list;
    }

    /**
     *
     */
    public void setList(final List<Summary> list) {
        this.list = list;
    }


    /**
	 * 
	 * @author duanbn
	 *
	 */
	public static class Summary {
		@JsonProperty("ref_date")
		private String refDate;

        @JsonProperty("ref_hour")
        private int refHour;

		@JsonProperty("share_scene")
		private int shareScene;

		@JsonProperty("share_count")
		private int shareCount;

		@JsonProperty("share_user")
		private int shareUser;

		/**
		 * 
		 * @return
		 */
		public String getRefDate() {
			return refDate;
		}

		/**
		 * 
		 * @param refDate
		 */
		public void setRefDate(final String refDate) {
			this.refDate = refDate;
		}

        /**
         *
         */
        public int getRefHour() {
            return this.refHour;
        }

        /**
         *
         */
        public void setRefHour(final int refHour) {
            this.refHour = refHour;
        }

		/**
		 * 
		 * @return
		 */
		public int getShareScene() {
			return shareScene;
		}

		/**
		 * 
		 * @param shareScene
		 */
		public void setShareScene(final int shareScene) {
			this.shareScene = shareScene;
		}

		/**
		 * 
		 * @return
		 */
		public int getShareCount() {
			return shareCount;
		}

		/**
		 * 
		 * @param shareCount
		 */
		public void setShareCount(final int shareCount) {
			this.shareCount = shareCount;
		}

		/**
		 * 
		 * @return
		 */
		public int getShareUser() {
			return shareUser;
		}

		/**
		 * 
		 * @param shareUser
		 */
		public void setShareUser(final int shareUser) {
			this.shareUser = shareUser;
		}
	}
}
