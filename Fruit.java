package com.ty;

public class Fruit {
	

		public void m1() {
			System.out.println("Fruit");
		}
	}

	class Apple extends Fruit{
		
		public void m1() {
			System.out.println("Apple");
		}
	}

	class Mango extends Fruit{
		
		public void m1() {
			System.out.println("mango");
		}
	}

	class Test{
		public static void main(String[] args) {
			Fruit f=new Apple();
			System.out.println(f instanceof Apple) ;
		}
	}

