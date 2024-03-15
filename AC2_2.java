/*
int g2(int n, int a[]) {
    s = 0;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            s = s + a[i]*a[j];
        }       
    }
    return s; 
}
 */
// Method นี้ใช้สำหรับคำนวณผลรวมของค่าในอาเรย์
// n: จำนวนข้อมูลในอาเรย์
// a: อาเรย์ที่เก็บข้อมูล
public class AC2_2 {
    static int g2(int n, int a[]) {
        int s = 0; // เก็บผลรวมของค่าในอาเรย์
        for (int i = 0; i < n; ++i) {
            s += a[i]; // เพิ่มค่าในอาเรย์เข้าไปในผลรวม s
        }
        return s; // ส่งค่าผลรวมกลับเป็นผลลัพธ์ของ Method
    }
}
