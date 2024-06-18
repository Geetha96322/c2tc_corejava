package svit.SF04.polymorphism;

public class MetodOverloadingMain {

	public static void main(String[] args) {
		Rbi bankOne=new Sbi();
		System.out.println(bankOne.getratrOfInterest());
		
		Rbi bankTwo=new Hdfc();
		System.out.println(bankTwo.getratrOfInterest());
	}

}
