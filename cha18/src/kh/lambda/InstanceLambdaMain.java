package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		//람다식(함수형인터페이스 -> 인스턴스메소드 System.out.Println()
		C c = a-> System.out.println(a);
		
		C c2 = System.out::println;
		
		c.methodC(10);
		c2.methodC(100);
		//================================
		System.out.println("==============");
		A a = ()-> Bobject.bcd();
		
		A a2 = Bobject::bcd;
		
		a.method();
		a2.method();
		//================================
		System.out.println("==============");
		Atest atest = ( b, k)-> b.bcd(k);
		Atest atest2 = BObject2::bcd;
		
		atest.abc(new BObject2(), 10000);
		atest2.abc(new BObject2(), 20000);
		
		
		System.out.println("The end!");
	}

}













