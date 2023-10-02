
public class Main
{
    
    private static int[] arrangeNumbers(int arr[]){
        
        int first = 0;
        int temp =0;
        for(int i=0 ;i< arr.length ;i++){
            if(arr[i] < 0){
                temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                first++;
            }
        }
        
        return arr;
        
    }
    
    private static void display(int[] arr){
        
    for(int i = 0; i < arr.length ; ++i)
        System.out.print(arr[i] + " ");
          
    System.out.println();
}
    
	public static void main(String[] args) {
		int arr []= {0, 11, -13, -5, 0, -7, 5, -3, -6};
		arr = arrangeNumbers(arr);
		display(arr);
        
	}
}
