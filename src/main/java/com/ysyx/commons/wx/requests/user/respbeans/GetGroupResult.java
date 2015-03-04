package com.ysyx.commons.wx.requests.user.respbeans;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * get group result.
 * 
 * @author duanbn
 *
 */
public class GetGroupResult {

	@JsonProperty("groups")
	private List<GroupInfo> groups = new ArrayList<GroupInfo>();

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "GetGroupResult [groups=" + groups + "]";
	}

	/**
	 * 
	 * @return
	 */
	public List<GroupInfo> getGroups() {
		return groups;
	}

	/**
	 * 
	 * @param groups
	 */
	public void setGroups(final List<GroupInfo> groups) {
		this.groups = groups;
	}

	/**
	 * 
	 * @author apple
	 *
	 */
	public static class GroupInfo {
		private int id;

		private String name;

		private int count;

		/**
		 * 
		 * @return
		 */
		public int getId() {
			return id;
		}

		/**
		 * 
		 * @param id
		 */
		public void setId(final int id) {
			this.id = id;
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
		 * @return
		 */
		public int getCount() {
			return count;
		}

		/**
		 * 
		 * @param count
		 */
		public void setCount(final int count) {
			this.count = count;
		}

		/**
		 * 
		 */
		@Override
		public String toString() {
			return "GroupInfo [id=" + id + ", name=" + name + ", count=" + count + "]";
		}
	}

}
