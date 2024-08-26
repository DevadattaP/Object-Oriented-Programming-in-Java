class StrBufTest
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Devadatta");
		System.out.println("Content= "+sb);
		System.out.println("Length= "+sb.length());
		System.out.println("Capacity= "+sb.capacity());
		System.out.println("Append (Pokharanakar)= "+sb.append(" Pokharanakar"));
		System.out.println("Insert (M at 9)= "+sb.insert(9," M"));
		System.out.println("Character at (15)= "+sb.charAt(15));
	}
}