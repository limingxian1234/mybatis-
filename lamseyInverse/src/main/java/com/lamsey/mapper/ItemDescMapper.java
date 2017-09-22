package com.lamsey.mapper;

import com.lamsey.pojo.ItemDesc;
import java.util.List;

public interface ItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(ItemDesc record);

    ItemDesc selectByPrimaryKey(Long itemId);

    List<ItemDesc> selectAll();

    int updateByPrimaryKey(ItemDesc record);
}