import java.util.Scanner;

public class MaxMin {
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Min = "+arr[0]);
        System.out.println("Max = "+arr[n-1]);
    }

    public static void main(String[] args) {
        MaxMin mm = new MaxMin();

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        mm.bubbleSort(arr);
        mm.printArray(arr);


    }
}
