package com.zhou.service;

import com.zhou.util.PageUtil;

public interface UserService {

	PageUtil queryForNewsPage(Integer currentPage, Integer pageSize);

}