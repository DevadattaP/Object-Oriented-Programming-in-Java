class Area 
{
    void getArea(int r)
    {
        System.out.println("Area of circle = "+(22*r*r/7.0));
    }
    void getArea(int l,int b)
    {
        System.out.println("Area of rectangle = "+l*b);
    }
    public static void main(String args[]) 
    {
        Area a1=new Area();
        a1.getArea(10);
        a1.getArea(5,3);
    }
}
