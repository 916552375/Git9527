
package com.zdd.demo;

import java.lang.reflect.Method;

public class TestDemo {

	public TestDemo() {
	}

	public static int function() {
		return 1024;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("��һ��������������ǣ�" + TestDemo.function());
		ReflectDemo reflectDemo = (ReflectDemo) Class.forName("com.zdd.demo.ReflectDemo").newInstance();
		
		Method method1 = reflectDemo.getClass().getMethod("zdd", String.class,Integer.class,Integer.class);				
		String result =(String) method1.invoke(reflectDemo, "Prefect",10,24);
		System.out.println(result);
		Method method2 = reflectDemo.getClass().getMethod("print", int.class);
		int number = 10 ;
		try {
			
			method2.invoke(reflectDemo, number);
		}catch (Exception e) {			
			e.printStackTrace();
			System.out.println("���������0����������");
		}
	}

}
