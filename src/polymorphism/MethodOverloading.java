package polymorphism;
class Maths{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths exp=new Maths();
		exp.add(25, 25);
		exp.add(25, 25, 25);
		

	}

}
