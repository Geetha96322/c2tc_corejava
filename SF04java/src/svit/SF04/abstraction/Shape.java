package svit.SF04.abstraction;

public abstract class Shape {
	float area;
	public abstract float calculateArea();
	//non abstract method
	
	public void display()
	{
		System.out.println("area of the shape:"+area);
	}

}
