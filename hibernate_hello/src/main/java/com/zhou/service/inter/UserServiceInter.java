package com.zhou.service.inter;

import com.zhou.service.PageUtil;

public interface UserServiceInter {

	PageUtil queryForNewsPage(Integer currentPage, Integer pageSize);

}