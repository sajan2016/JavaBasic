class fibonaci{
	public static int[] fib(int n){
	 int[] temp= new int[n];
	 int a,b,c;
	 temp[0]=0;
	 temp[1]=temp[2]=1;
	 a=b=1;
	 for(int i=3;i<n;i++){
	  c=a+b;
	  temp[i]=c;
	  a=b; b=c;
	 }
	 return temp;
	}

  public static void main(String[] felight){
    int n=51;
    for(int a:fib(n))
    System.out.println(a);
  }	
}