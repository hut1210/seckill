package com.momo.seckill;

import com.momo.seckill.pojo.Order;
import com.momo.seckill.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeckillApplicationTests {

	@Autowired
	private OrderService orderService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateOrder(){
		Order order = new Order();
		order.setOrder_name("watch");
		order.setOrder_user("zs");
		orderService.createOrder(order);
	}

}
