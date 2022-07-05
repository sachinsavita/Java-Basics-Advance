class BubbleSort
{
    void bubbleSort(int arr[])
    {
    	
    	// time complexity O(n ki power 2)
    	
    	/*int[] arr = {4,2,5,3,1};
    	 for(int i = 1;i<=arr.length;i++)
    	 {
    	 for(int j=0;j<arr.length-1;j++)
    	 {
    	 if(arr[j]>arr[j+1])
    	 {
    	 int temp = arr[j];
    	 arr[j] = arr[j+1];
    	 arr[j+1] = temp;
    	 }
    	 }
    	 }
    	 for(int x : arr)
    	 {
    	 sysout("x");
    	 }    */
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90,89,76,57,49};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
