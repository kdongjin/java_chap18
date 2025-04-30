package kh.lambda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		//구현객체를 생성한다.
		TestChild tc = new TestChild(); 

		//부자관계
		Test test = tc;
		
		//다형성을 구현한다.
		int kor =test.methodTest("국어");
		System.out.printf("국어점수 = %d \n",kor);
		System.out.println("=================");
		
		Test test2 = a -> {
				Scanner scan = new Scanner(System.in);
				System.out.printf("%s 점수요청:",a);
				int value = Integer.parseInt(scan.nextLine());
				return value;
		};
		String subject = "영어";
		int eng =test2.methodTest(subject);
		System.out.printf("%s점수 = %d \n",subject, eng);
		
		System.out.println("The end");
	}

}















