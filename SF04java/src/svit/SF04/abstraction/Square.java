package svit.SF04.abstraction;

public  class Square extends Shape{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	public  float calculateArea()
	{
		return area =side*side;
	}
	

}
