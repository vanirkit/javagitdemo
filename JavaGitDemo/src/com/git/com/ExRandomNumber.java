package com.git.com;

import java.util.concurrent.ThreadLocalRandom;

public class ExRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=ThreadLocalRandom.current().nextInt();
		int b=ThreadLocalRandom.current().nextInt();
		System.out.println("Random Generated Integer Values:");
		System.out.println(a);
		System.out.println(b);
		double c=ThreadLocalRandom.current().nextDouble();
		double d=ThreadLocalRandom.current().nextDouble();
		System.out.println("Random Generated Double Values:");
		System.out.println(c);
		System.out.println(d);
		float e=ThreadLocalRandom.current().nextFloat();
		float f=ThreadLocalRandom.current().nextFloat();
		System.out.println("Random Generated Float Values:");
		System.out.println(e);
		System.out.println(f);




		


	}

}
