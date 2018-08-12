package com.zdd.demo;

import org.junit.jupiter.api.Test;

public class JunitTest {

	@Test
	public void test() {
		System.out.println("Hello world !");
		try {
			
			System.out.println(1024/0);
		}catch (Exception e) {
//			e.printStackTrace();
		}
	}
}
