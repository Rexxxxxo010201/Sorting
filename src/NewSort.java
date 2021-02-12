public class NewSort {
   public static void main(String args[]){
      int array[] = {12,-16,106,56,1};
      int size = array.length;

      for (int i = 0 ;i< size-1; i++){
         int min = i;

         for (int j = i+1; j<size; j++){
            if (array[j] < array[min]){
            min = j;
            }
         }
         int t = array[min];
         array[min] = array[i];
         array[i] = t;
      }

      for (int i = 0 ;i< size; i++){
         System.out.print(" "+array[i]);
      }
   }  
}