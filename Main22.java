import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[]arr=new int[5];
	    Scanner sc=new Scanner(System.in);
	  for(int i=0;i<arr.length-1;i++) 
	  {
	      for(int j=0;j<arr.length-1-i;j++)
	  {
	      if(arr[j]>arr[j+1])
	      {
	          int temp=arr[j];
	          arr[j]=arr[j+1];
	          arr[j+1]=temp;
	      }
	  }
	  }
	}
}