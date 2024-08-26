class Armstrong {
    public static void main(String args[]) {
    int n,temp,sum=0;
    n=Integer.parseInt(args[0]);
    temp=n;
    while(n!=0) {
        n=n%10;
        sum+=n*n*n;
        n=temp/10;
    }
    if(temp==sum)
        System.out.println(temp+" is armstrong number");
    else
        System.out.println(temp+" is not armstrong number");
    }
}
