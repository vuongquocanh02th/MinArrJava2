import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap size mang: ");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Do dai cua mang it nhat la 1! Nhap lai!");
            }
        } while (size <= 0);
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        //Hien thi mang
        System.out.println("Danh sach cac phan tu trong mang: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        //Tim min
        int min = arr[0];
        int index = 1;
        for (int j = 0; j < size; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("Min = " + min+" o vi tri "+index);
    }
}
