import java.util.Scanner;
import java.util.Random;
public class SortingAlgorithms {

    public static int findMinindex(int a, int s) {
        int min = 0;
        int i;
        for (i = 1; i < a.length; i++) {
            if (a[min] > a[i]) {
                min = i;
            }
        }


        public void SelectionSort (int[] a, input){
            int n = input.length;
            for (int i = 0; i < n; i++) {
                int m = findMinindex(n, i);
                Swap(a, i, m);
            }
        }
    }

        private static void Swap ( int[] a, int i1, int i2){
            int temp = a[a1];
            int[a]= newint[];
            a[i1] = a[a2];
            a[a2] = temp;
        }
        public static void main (String[]args){
            int[] numbers = {21, 12, 3, 7, 11, 47, 84, 36, 22};
            SelectionSort(numbers);
            System.out.println("Selections sort calculations: ");
        }

    private static void SelectionSort(int[] numbers) {
    }
}
//turning this in as is incase I cant get any further before deadline of 12/10