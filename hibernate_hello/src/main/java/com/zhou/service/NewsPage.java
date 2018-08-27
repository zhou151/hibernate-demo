package com.zhou.service;

import java.util.List;

import com.zhou.dao.entity.User;
/**
 * --------------------------------------
 * @author Mr_zhou 2018年8月27日 下午8:13:27
 * TODO hibernate分页插件封装
 * -------------------------------------
 *         bottomPageNo:2, ---- 尾页序号
 *         nextPageNo:2,---- 下一页的序号
 *         pageNo:1 ---- 当前页数字
 *         pageSize:3, ---- 每页显示多少行数据
 *         previousPageNo":1 -----上一页的序号
 *         topPageNo:1,  -----首页序号
 *         totalPages:2,  -----页数量
 *         totalRecords:4 ----全部记录,总数据行数
 *-------------------------------------*/
public class NewsPage<T>
{
	// 结果集
	private List<T> list;

	// 查询记录总数
	private int totalRecords;

	// 每页多少条记录
	private int pageSize;

	// 第几页
	private int pageNo;

	/**
	 * @return 总页数
	 */
	public int getTotalPages()
	{
		return (totalRecords + pageSize - 1) / pageSize;
	}

	/**
	 * 计算当前页开始记录
	 * 
	 * @param pageSize
	 *            每页记录数
	 * @param currentPage
	 *            当前第几页
	 * @return 当前页开始记录号
	 */
	public int countOffset(int currentPage, int pageSize)
	{
		int offset = pageSize * (currentPage - 1);
		return offset;
	}

	/**
	 * @return 首页
	 */
	public int getTopPageNo()
	{
		return 1;
	}

	/**
	 * @return 上一页
	 */
	public int getPreviousPageNo()
	{
		if (pageNo <= 1)
		{
			return 1;
		}
		return pageNo - 1;
	}

	/**
	 * @return 下一页
	 */
	public int getNextPageNo()
	{
		if (pageNo >= getBottomPageNo())
		{
			return getBottomPageNo();
		}
		return pageNo + 1;
	}

	/**
	 * @return 尾页
	 */
	public int getBottomPageNo()
	{
		return getTotalPages();
	}

	public List<T> getList()
	{
		return list;
	}

	public void setList(List<T> list)
	{
		this.list = list;
	}

	public int getTotalRecords()
	{
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords)
	{
		this.totalRecords = totalRecords;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getPageNo()
	{
		return pageNo;
	}

	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}
}
