package com.lamsey.mapper;

import com.lamsey.pojo.ItemParamItem;
import java.util.List;

public interface ItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemParamItem record);

    ItemParamItem selectByPrimaryKey(Long id);

    List<ItemParamItem> selectAll();

    int updateByPrimaryKey(ItemParamItem record);
}