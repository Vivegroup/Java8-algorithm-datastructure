package com.innerClass.examples;

public class Test1 {

	int x = 10;
	static int y = 20;

	public static void methodOne() {
		class Inner {
			public void methodTwo() {
				System.out.println(x);// 10
				System.out.println(y);// 20
			}
		}
		Inner i = new Inner();
		i.methodTwo();
	}

	public static void main(String[] args) {
		new Test1().methodOne();
	}

}
