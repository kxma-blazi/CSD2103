package CaseFromGPT;
// Java program for implementation
// of Bubble Sort
class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // เปรียบเทียบสองสมาชิกที่ติดกัน
                if (arr[j] > arr[j + 1]) {
                    // สลับค่า arr[j] และ arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // เเสดง array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method to test above ( ใช้เมธอดหรือฟังก์ชันในคลาสหลักของโปรแกรม )
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        
        // เรียกใช้งานฟังก์ชัน bubbleSort เพื่อเรียงลำดับอาร์เรย์
        ob.bubbleSort(arr);
        
        System.out.println("Sorted array:");
        
        // เรียกใช้งานฟังก์ชัน printArray เพื่อแสดงผลลำดับที่เรียงแล้ว
        ob.printArray(arr);
    }
}
