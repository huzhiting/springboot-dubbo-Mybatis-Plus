package com.fzph.bootdubboserviceapi.order;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("order_info")
public class Order implements Serializable {

    private Long id;

    private String no;

}
