package com.fzph.bootdubboapi.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fzph.bootdubboserviceapi.order.Order;
import com.fzph.bootdubboserviceapi.order.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderApi {
    @Reference(version = "1.0.0")
    private OrderService orderService;

    /**
     * 查询所有订单
     * @return
     */
    @PostMapping("/all")
    public IPage<Order> findAllOrders(int pageNo, int pageSize){
        return orderService.findAllOrders(pageNo,pageSize);
    }
}
