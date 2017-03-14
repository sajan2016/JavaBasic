class QuickSort{
	public static void quickSort(int lowIndex,int highIndex,int[] list){
       int i=lowIndex;
       int j=highIndex;
       int pivot=list[lowIndex + (highIndex - lowIndex)/2];

       while(i<=j){
        while(list[i]<pivot){
          i++;
        }
        while(list[j]>pivot){
          j--;
        }
        if(i<=j){
         exchangeNumbers(i,j,list);
         i++; j--;
        }
       }
       if(lowIndex <j)
       quickSort(lowIndex,j,list);

       if(i < highIndex)
        quickSort(i,highIndex,list);
	}
	public static void exchangeNumbers(int i,int j,int[] list){
	   int temp=list[i];
	   list[i]=list[j];
	   list[j]=temp;
	}
	public static void main(String[] felight){
		 
        int[] list={33,5,66,23,88,9,12,2,54,30,4,49,92,56};
        for(int i:list)
        	System.out.print(" "+ i );
      quickSort(0,list.length-1,list);
        System.out.println("\n");
        for(int i:list)
        	System.out.print(" "+ i );

    }

}