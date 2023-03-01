package polymorphism;


 class Teacher{
	
	public void roles(){
		System.out.println("Iam a Teachers");
	}

}
 class Student extends Teacher{
		
		public void roles(){
			System.out.println("Iam a Students");
		}

	}
public class MethodOverriding {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Student s1=new Student();
		t1.roles();
		s1.roles();
	}

}
