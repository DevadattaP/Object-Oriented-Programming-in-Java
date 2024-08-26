class Pattern {
    public static void main(String args[]) {
        int n,i,j;
        n=Integer.parseInt(args[0]);
        for (i=1;i<=n;i++) {
            for(j=i;j>0;j--)
                System.out.print(j+" ");
            System.out.println("\n");
        }
    }
}
