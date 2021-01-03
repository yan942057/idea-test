package com.baizhi.dao;

import com.baizhi.entity.Category;
import com.baizhi.entity.User;

import java.util.List;

public interface CategoryDao {

    List<Category> queryByCategory();

    Category queryById(String id);
}
