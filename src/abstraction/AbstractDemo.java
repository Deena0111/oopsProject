package abstraction;

abstract class Bike{
	public void display() {
		System.out.println("Iam Bike");
	}
	 public abstract void run();
}
class Honda extends Bike{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Honda bike is running");	
		}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda b1=new Honda();
		b1.display();
		b1.run();

	}

}