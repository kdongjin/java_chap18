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
		
		BObject2 b = (String name)-> {
				Scanner scan = new Scanner(System.in);
				System.out.printf("당신의 %s 입력:",name);
				int value2 = Integer.parseInt(scan.nextLine()); 
				return value2;
		};
		
		int value3 = b.methodB("국어");
		System.out.printf("당신의 점수 %d입니다.\n",value3);
		int value4 = b.methodB("영어");
		System.out.printf("당신의 점수 %d입니다.\n",value4);
		System.out.println("==============");
		
		
		
		System.out.println("The end!");
		

	}

}

















