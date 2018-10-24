package com.zhou.service.inter;

import java.util.List;

public interface NewsPageInter<T> {

	/**
	 * @return 总页数
	 */
	int getTotalPages();

	/**
	 * 计算当前页开始记录
	 * 
	 * @param pageSize
	 *            每页记录数
	 * @param currentPage
	 *            当前第几页
	 * @return 当前页开始记录号
	 */
	int countOffset(int currentPage, int pageSize);

	/**
	 * @return 首页
	 */
	int getTopPageNo();

	/**
	 * @return 上一页
	 */
	int getPreviousPageNo();

	/**
	 * @return 下一页
	 */
	int getNextPageNo();

	/**
	 * @return 尾页
	 */
	int getBottomPageNo();

	List<T> getList();

	void setList(List<T> list);

	int getTotalRecords();

	void setTotalRecords(int totalRecords);

	int getPageSize();

	void setPageSize(int pageSize);

	int getPageNo();

	void setPageNo(int pageNo);

}