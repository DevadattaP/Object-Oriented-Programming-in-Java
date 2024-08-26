class Leap {
    public static void main(String args[]){
        int y=Integer.parseInt(args[0]);
        if(y%100==0)
        {
            if(y%400==0)
                System.out.println(y+" is leap year");
            else
                System.out.println(y+" is not leap year");
        }
        else if (y%4==0)
            System.out.println(y+" is leap year");
        else 
            System.out.println(y+" is not leap year");
    }
}
