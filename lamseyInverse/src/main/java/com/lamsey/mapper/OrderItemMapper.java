package com.lamsey.mapper;

import com.lamsey.pojo.OrderItem;
import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    OrderItem selectByPrimaryKey(String id);

    List<OrderItem> selectAll();

    int updateByPrimaryKey(OrderItem record);
}