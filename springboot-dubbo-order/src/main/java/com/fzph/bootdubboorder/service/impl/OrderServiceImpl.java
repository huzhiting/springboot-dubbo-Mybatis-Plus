package com.fzph.bootdubboorder.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fzph.bootdubboorder.mapper.OrderMapper;
import com.fzph.bootdubboserviceapi.order.Order;
import com.fzph.bootdubboserviceapi.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Service(version = "1.0.0")
@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public IPage<Order> findAllOrders(int pageNo, int pageSize) {
        Page<Order> orderPage=new Page<>();
        orderPage.setSize(pageNo);
        orderPage.setTotal(pageSize);
        return orderMapper.selectPage(orderPage,null);
    }

    @Override
    public List<Order> findAllOrders() {
        List<Order> orderList=new ArrayList<>();
        Order order=orderMapper.selectById(1);
        if (order != null) {
            orderList.add(order);
        }
        if (orderList.size()>0) {
            for (Order orderInfo : orderList) {
                System.out.println(orderInfo.getId() + ";" + orderInfo.getNo());
            }
        }
        return orderList;
    }
}
