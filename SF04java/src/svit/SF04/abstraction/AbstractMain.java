package svit.SF04.abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sOne=new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo=new Rectangle(12,13);
		sTwo.calculateArea();
		sTwo.display();
		

	}

}
