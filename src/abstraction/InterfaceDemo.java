package abstraction;
interface Animal{
	public void lion();
	public void tiger();
	public void deer();
	public void fox();
}
class Sounds implements Animal{

	@Override
	public void lion() {
		// TODO Auto-generated method stub
		System.out.println("Iam lion.Iam roaring");
	}

	@Override
	public void tiger() {
		// TODO Auto-generated method stub
		System.out.println("Iam Tiger.Iam growling");
	}

	@Override
	public void deer() {
		// TODO Auto-generated method stub
		System.out.println("Iam deer.Iam snorting");
	}

	@Override
	public void fox() {
		// TODO Auto-generated method stub
		System.out.println("Iam fox.Iam raspy barking");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sounds s1=new Sounds();
		s1.lion();
		s1.tiger();
		s1.deer();
		s1.fox();

	}

}
