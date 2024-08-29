package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

    // Nhập mảng
    static float[] importData(float[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextFloat();
        }
        return arr;
    }

    // xuất mảng
    static void printData(float[] arrays) {
        System.out.print("Mang da nhap: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    // Tìm giá trị lớn thứ 2 trong mang
    static float findMax2(float[] arr) {
        float max1 = 0;
        float max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            float num = arr[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else //if (num > max2 && num < max1) */
            {
                max2 = num;
            }
        }
        return max2;
    }

    // Xóa phần tử lẻ ra khỏi mảng
    static float[] deleteOddNumber(float[] arr) {
        ArrayList<Float> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1.add(arr[i]);
            }
        }

        // Chuyển ArrayList về lại mảng
        float[] result = new float[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            result[i] = arr1.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        float[] arr = new float[n];

        arr = importData(arr);
        printData(arr);

        float max2 = findMax2(arr);
        System.out.println("Gia tri lon thu hai cua mang la: " + max2);

        arr = deleteOddNumber(arr);
        System.out.print("Mang khi xoa phan tu le: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
