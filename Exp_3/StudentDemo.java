class Student 
{
	int r;
	String n;
	int m1;
	int m2;
	int m3;
	void set(int roll,String nm,int mk1,int mk2,int mk3)
	{
		r=roll;
		n=nm;
		m1=mk1;
		m2=mk2;
		m3=mk3;
	}
	void display()
	{
		System.out.println("\nRoll No.: "+r+"\nName: "+n+"\nMarks 1: "+m1+"\nMarks 2: "+m2+"\nMarks 3: "+m3);
	}
	double avg()
	{
		return (double)((m1+m2+m3)/3);
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.set(1,"ABC",35,45,55);
		s1.display();
		System.out.println("Average = "+s1.avg());
	}
}