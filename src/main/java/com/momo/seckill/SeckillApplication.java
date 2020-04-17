package com.momo.seckill;

import com.momo.seckill.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.momo.seckill.mapper")
public class SeckillApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillApplication.class, args);
	}
	@Autowired
	private RedisService redisService;

	public void run(ApplicationArguments args) throws Exception {
		redisService.put("watch", 10, 20);
	}

}
