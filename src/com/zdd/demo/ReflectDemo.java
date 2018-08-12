package com.zdd.demo;

public class ReflectDemo {

	public ReflectDemo() {
	}

	public String zdd(String prefect, Integer x, Integer y) {
		return prefect + x + y;
	}
/**
 * 
 * @param number
 */
	public void print(int number) {
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				System.out.println("这是第" + i + "次输出！");
			}
		} else {
			System.out.println("请输入大于0的正整数！");
		}
	}
}
