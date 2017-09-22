package com.lamsey.mapper;

import com.lamsey.pojo.Item;
import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    Item selectByPrimaryKey(Long id);

    List<Item> selectAll();

    int updateByPrimaryKey(Item record);
}