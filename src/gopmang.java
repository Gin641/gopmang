import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("nhập vào mảng 1: ");
        a = sc.nextInt();
        int[] arr1 = new int[a];
        inputElement(arr1);
        System.out.print("nhập vào mảng 2: ");
        b = sc.nextInt();
        int[] arr2 = new int[b];
        inputElement(arr2);
        c = a + b;
        int[] arr3 = new  int[c];
        for (int i = 0; i < c - b;i++){
            arr3[i]= arr1[i];
        }
        for (int i = a; i < c;i++){
            arr3[i] = arr2[i - a];
        }
        System.out.print("mảng 1: ");
        displayArr(arr1);
        System.out.println();
        System.out.print("mảng 2: ");
        displayArr(arr2);
        System.out.println();
        System.out.print("mảng3: ");
        displayArr(arr3);
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void inputElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length;i++){
            System.out.printf("nhập vào phần tử thứ %d của mảng: ",i+1);
            arr[i] = sc.nextInt();
        }
    }
}
