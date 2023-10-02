
import java.util.*;

public class Main
{
    
    private static int [] cyclicRotate(int arr[]){
        
        int temp =0;
        int n = arr.length;
        int last = arr[n-1];
        
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        
        return arr;
        
    }
    
    private static int [] antiClock(int arr[]){
        
        int temp =0;
        int n = arr.length;
        int first = arr[0];
        
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
        
        return arr;
        
    }
    
    private static void display(int[] arr){
        
    for(int i = 0; i < arr.length ; ++i)
        System.out.print(arr[i] + " ");
          
         System.out.println();
    }
    
	public static void main(String[] args) {
		int str []= {1, 2, 3, 4, 5};
		int anti [] ={1, 2, 3, 4, 5};
		display(str);
		System.out.println("After cyclic rotation:=");
	   int 	arr[] = cyclicRotate(str);
		display(arr);
		System.out.println("After anti clock rotation:=");
		arr = antiClock(anti);
		display(arr);
		
        
	}
}
