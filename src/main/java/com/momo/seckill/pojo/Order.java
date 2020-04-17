package com.momo.seckill.pojo;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: Hut
 * @Date: 2020/03/21 0:28
 */
@Data
@Table(name="t_order")
public class Order implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_name")
    private String order_name;

    @Column(name = "order_user")
    private String order_user;
}
