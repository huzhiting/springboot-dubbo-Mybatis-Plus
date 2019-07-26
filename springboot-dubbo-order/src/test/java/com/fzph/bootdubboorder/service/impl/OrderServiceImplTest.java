package com.fzph.bootdubboorder.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fzph.bootdubboserviceapi.order.Order;
import com.fzph.bootdubboserviceapi.order.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.fzph.bootdubboorder.mapper")
public class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void findAllOrders() {
        IPage<Order> orders = orderService.findAllOrders(1,10);
        if (orders != null) {
            List<Order> orderList = orders.getRecords();
            if (orderList != null && orderList.size()>0) {
                for (Order order : orderList) {
                    System.out.println(order.getId() + ";" + order.getNo());
                }
            }
        }
    }

//    @Test
//    public void findAllOrders() {
//        List<Order> orders = orderService.findAllOrders();
//        if (orders != null && orders.size()>0) {
//            for (Order order : orders) {
//                System.out.println(order.getId() + ";" + order.getNo());
//            }
//        }
//    }
}