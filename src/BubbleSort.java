import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	Scanner s = new Scanner(System.in);

	  void bubbleSort(int arr[]) {
	    int n = arr.length;
	    System.out.println("1. Ascending \n2. Descending");
	    int order = s.nextInt();

	    for (int i = 0; i < n - 1; i++)

	      for (int j = 0; j < n - i - 1; j++)

	        if (order == 1) {
	          if (arr[j] > arr[j + 1]) {  //Ascending

	            int t = arr[j];
	            arr[j] = arr[j + 1];
	            arr[j + 1] = t;
	          }
	        }

	        else {
	          if (arr[j] < arr[j + 1]) {   //Descending

	            int t = arr[j];
	            arr[j] = arr[j + 1];
	            arr[j + 1] = t;
	          }
	          }
	        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 7,-17,12,512,100 };

		    BubbleSort bs = new BubbleSort();

		    bs.bubbleSort(arr);
		    System.out.println("Sorted Array:");

		    System.out.println(Arrays.toString(arr));

	}

}
