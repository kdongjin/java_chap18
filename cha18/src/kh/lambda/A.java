package kh.lambda;

public interface A {
	//입력 없다, 리턴 없다
	public abstract void method();
}


interface D{
	//입력 있고, 리턴 있다.
	public abstract double methodD(int a, double b );
}


interface B {
	//입력 있고, 리턴 있다.
	int methodB(String a);
}