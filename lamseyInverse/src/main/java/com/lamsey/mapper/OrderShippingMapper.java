package com.lamsey.mapper;

import com.lamsey.pojo.OrderShipping;
import java.util.List;

public interface OrderShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderShipping record);

    OrderShipping selectByPrimaryKey(String orderId);

    List<OrderShipping> selectAll();

    int updateByPrimaryKey(OrderShipping record);
}