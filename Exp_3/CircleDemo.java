class Circle
{
	int r;
	void setValue(int radius)
	{
		r=radius;
	}
	void getValue()
	{
		System.out.println("Radius = "+r);
	}
	void findArea()
	{
		System.out.println("Area = "+(22*r*r/7.0));
	}
	void findPerimeter()
	{
		System.out.println("Perimeter = "+(2*22*r/7.0));
	}
}
class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		c1.setValue(10);
		c1.getValue();
		c1.findArea();
		c1.findPerimeter();
	}
}