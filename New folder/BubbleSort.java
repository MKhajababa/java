public class BubbleSort {
    int count;
    void bubblesort(int array[]){
        count = 0;
        int temp;
        int n = array.length;
        int i,j;
        for(i = 0;i<n-1;i++){
            for(j = 0;j<n-i-1;j++){
                if(array[j]<array[j+1]){
                    System.out.println("\n InterChanging "+array[j]+"and"+array[j+1]);
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    count ++;
                }
            }

        }
        System.out.println("Total no of Interchanges:"+count);
    }
    void printArray(int array[]){
        int n = array.length;
        for(int i = 0;i<n;i++){
            System.out.println(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64,32,25,112,56,75};
        ob.bubblesort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
