package com.zhou.service;

import java.util.List;

import com.zhou.dao.entity.User;
import com.zhou.service.inter.NewsPageInter;
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
public class NewsPage<T> implements NewsPageInter<T>
{
	// 结果集
	private List<T> list;

	// 查询记录总数
	private int totalRecords;

	// 每页多少条记录
	private int pageSize;

	// 第几页
	private int pageNo;

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getTotalPages()
	 */
	@Override
	public int getTotalPages()
	{
		return (totalRecords + pageSize - 1) / pageSize;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#countOffset(int, int)
	 */
	@Override
	public int countOffset(int currentPage, int pageSize)
	{
		int offset = pageSize * (currentPage - 1);
		return offset;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getTopPageNo()
	 */
	@Override
	public int getTopPageNo()
	{
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getPreviousPageNo()
	 */
	@Override
	public int getPreviousPageNo()
	{
		if (pageNo <= 1)
		{
			return 1;
		}
		return pageNo - 1;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getNextPageNo()
	 */
	@Override
	public int getNextPageNo()
	{
		if (pageNo >= getBottomPageNo())
		{
			return getBottomPageNo();
		}
		return pageNo + 1;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getBottomPageNo()
	 */
	@Override
	public int getBottomPageNo()
	{
		return getTotalPages();
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getList()
	 */
	@Override
	public List<T> getList()
	{
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#setList(java.util.List)
	 */
	@Override
	public void setList(List<T> list)
	{
		this.list = list;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getTotalRecords()
	 */
	@Override
	public int getTotalRecords()
	{
		return totalRecords;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#setTotalRecords(int)
	 */
	@Override
	public void setTotalRecords(int totalRecords)
	{
		this.totalRecords = totalRecords;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getPageSize()
	 */
	@Override
	public int getPageSize()
	{
		return pageSize;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#setPageSize(int)
	 */
	@Override
	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#getPageNo()
	 */
	@Override
	public int getPageNo()
	{
		return pageNo;
	}

	/* (non-Javadoc)
	 * @see com.zhou.service.NewsPageInter#setPageNo(int)
	 */
	@Override
	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}
}
