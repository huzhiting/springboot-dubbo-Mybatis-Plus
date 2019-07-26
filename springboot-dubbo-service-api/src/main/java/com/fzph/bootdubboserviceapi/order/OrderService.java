package com.fzph.bootdubboserviceapi.order;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;


public interface OrderService {
    IPage<Order> findAllOrders(int pageNo, int pageSize);

    List<Order> findAllOrders();
}
