package com.zjs;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class FlappingHealthIndicator implements HealthIndicator{

	private Random rd = new Random(System.currentTimeMillis());
	@Override
	public Health health() {
//		for(int i=0;i<rd.nextInt(100);i++){
		int i = rd.nextInt(100);
			if(i<50){
				return Health.down().withDetail("flapper","failure").withDetail("rd", i).build();
			}else{
				return Health.up().withDetail("flapper", "OK").withDetail("rd", i).build();
			}
//		}
	}

	
}
