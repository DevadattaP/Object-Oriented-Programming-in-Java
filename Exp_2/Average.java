class Average {
    public static void main(String args[]) 
    {
        double a,b,c,d,e,avg;
        a=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
        c=Double.parseDouble(args[2]);
        d=Double.parseDouble(args[3]);
        e=Double.parseDouble(args[4]);
        avg=(a+b+c+d+e)/5;
        System.out.println("Average: " + avg);
    }
}
