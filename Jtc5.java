class Hello{
	byte b1;
	int i1;
	short s1;
	long l1;
	float f1;
	double d1;
	boolean b11;
	char c1;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println("b1");
		System.out.println("i1");
		System.out.println("s1");
		System.out.println("l1");
		System.out.println("f1");
		System.out.println("d1");
		System.out.println("b11");
		System.out.println("c1");
	}
	void m2(){
		System.out.println("m2 in Hello");
		byte b11=127;
		byte b22=-128;
		//byte b33=128;
		//byte b44=-129;
		int i11=2147483647;
		int i12=-2147483648;
		//int i13=2147483648;
		//long l14=2147483649;
		long l12=2147483648l;
		//float f11=11.11;
		float f12=11.13f;
		double d11=11.12;
		double d12=11.13d;
		System.out.println(b11);
		System.out.println(b22);
		//System.out.println(b33);
		//System.out.println(b44);
		System.out.println(i11);
		System.out.println(i12);
		//System.out.println(i13);
		//System.out.println(l14);
		System.out.println(l12);
		//System.out.println(f11);
		System.out.println(f12);
		System.out.println(d11);
		System.out.println(d12);
	}
}
public class Jtc5{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
		h1.m2();
	}
}