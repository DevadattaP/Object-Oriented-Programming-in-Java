class Box
{
    int h;
    int b;
    int l;
    Box()
    {
        h=b=l=0;
    }
    Box(int ht,int bd,int lt)
    {
        h=ht;
        b=bd;
        l=lt;
    }
    void show()
    {
        System.out.println("l="+l+" h="+h+" b="+b);
    }
}
class BoxDemo
{
    public static void main(String[] args)
    {
        Box b1 = new Box();
        Box b2 = new Box(5,5,5);
        b1.show();
        b2.show();
    }
}