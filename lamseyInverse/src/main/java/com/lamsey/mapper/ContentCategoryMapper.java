package com.lamsey.mapper;

import com.lamsey.pojo.ContentCategory;
import java.util.List;

public interface ContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContentCategory record);

    ContentCategory selectByPrimaryKey(Long id);

    List<ContentCategory> selectAll();

    int updateByPrimaryKey(ContentCategory record);
}