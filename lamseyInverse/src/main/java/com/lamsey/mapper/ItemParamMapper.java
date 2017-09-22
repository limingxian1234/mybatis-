package com.lamsey.mapper;

import com.lamsey.pojo.ItemParam;
import java.util.List;

public interface ItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemParam record);

    ItemParam selectByPrimaryKey(Long id);

    List<ItemParam> selectAll();

    int updateByPrimaryKey(ItemParam record);
}