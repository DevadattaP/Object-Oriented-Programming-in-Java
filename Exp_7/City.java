import java.util.*;
class City
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<String> v=new Vector<String>();
		String s,ns;
		int option;
		do
		{
			System.out.println("***** Menu *****\n1.Insert new city\n2.Update existing city\n3.Search a city\n4.Delete a city\n5.Exit\nEnter an option");
			option = sc.nextInt();
			switch(option)
			{
				case 1: System.out.println("Enter new city name: ");
					s=sc.next();
					if(v.contains(s))
						System.out.println("City already exists!");
					else
					{
						v.addElement(s);
						System.out.println(s+" added successfully!");
						System.out.println("Updated list of cities: "+v);
					}					
					break;
				case 2: System.out.println("Enter city name to modify: ");
					ns=sc.next();
					if(v.contains(ns))
					{
						int i=v.indexOf(ns);
						System.out.println("Enter modified city name: ");
						s=sc.next();
						v.setElementAt(s,i);
						System.out.println("City updated successfully!");
						System.out.println("Updated list of cities: "+v);
					}
					else
						System.out.println("City doesn't exist in vector!!");
					break;
				case 3: System.out.println("Enter city name to search: ");
					s=sc.next();
					if(v.contains(s))
						System.out.println(s+" is present at location "+v.indexOf(s));
					else
						System.out.println("City doesn't exist in vector!!");	
					break;
				case 4: System.out.println("Enter a city name to delete");
					s=sc.next();
					if(v.contains(s))
					{
						v.removeElement(s);
						System.out.println(s+" deleted successfully!");
						System.out.println("Updated list of cities: "+v);
					}
					else
						System.out.println("City doesn't exist in vector!!");
					break;
				case 5: System.out.println("Exitting...");
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		}while(option!=5);
	}
}