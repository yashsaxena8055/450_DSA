
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   
	  
	   
	   Scanner sn = new Scanner(System.in);
	   String input = sn.nextLine();
	   String str[] = input.split(",");
	    int arr[] = new int[str.length];
	  
	   
	   for(int i=0;i< str.length;i++){
	       arr[i] = Integer.parseInt(str[i]);
	   
	   }
	   
	   int k=arr.length -1;
	   int count =1;
	   int temp =0;
	   
	   for(int i=0;i<arr.length;i++){
	       
	       if(i > k || i ==k)
	           break;
	       
	       temp = arr[i];
	       arr[i] = arr[k];
	       arr[k] = temp;
	       k--;
	       count ++;
	   }
	  
	  for(int i =0 ;i< arr.length ;i++){
	     System.out.print(arr[i] + " ");
	  }
	  
	}
}
