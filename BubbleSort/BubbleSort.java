class BubbleSort {
  
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        
        int j;
        boolean flag = true;
        int temp;

        System.out.println("\n** Bubble Sort Demo **");

        System.out.println("\nElements before sorting ");
        for ( int i=0; i<arr.length ; i++ )
             System.out.print(arr[i] + " ");
        System.out.println(); 

         while ( flag ) {
                flag= false;
                for( j=0;  j < arr.length -1;  j++ )
                {
                       if ( arr[ j ] > arr[j+1] )
                       {
                               temp = arr[ j ];
                               arr[ j ] = arr[ j+1 ];
                               arr[ j+1 ] = temp;
                              flag = true;
                      } 
                }
          }
  
        System.out.println("\nElements after sorting "); 
        for ( int i=0; i<arr.length ; i++ )
             System.out.print(arr[i] + " ");
        System.out.println(); 

    }
}