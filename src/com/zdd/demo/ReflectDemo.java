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
				System.out.println("���ǵ�" + i + "�������");
			}
		} else {
			System.out.println("���������0����������");
		}
	}
}
