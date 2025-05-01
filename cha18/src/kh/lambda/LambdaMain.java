package kh.lambda;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		//임시객체  부 = new 자식()
		//입력 없다, 출력 없다 => 람다식
		A a = ()-> System.out.println("입력 없고, 리턴 없다"); 
		
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이된다.
		a.method();
		System.out.println("==============");
		
		
		D d = (c, b)->c+b;
		double value = d.methodD(10, 20.5);
		System.out.printf("d.methodD(10, 20.5) = %.2f \n", value);
		
		System.out.println("==============");
		System.out.println("The end!");
	}
}

















