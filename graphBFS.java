// BFS algorithm in Java
// Referend : https://www.programiz.com/dsa/graph-bfs
import java.util.*;

public class graphBFS {
    private int V;
    private LinkedList<Integer> adj[];

    // Create a graph
    graphBFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Add edges to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algorithm
    void BFS(int s) {

        boolean visited[] = new boolean[V]; // สร้างอาร์เรย์ visited ที่มีขนาดเท่ากับจำนวนจุดในกราฟ(จำนวนโหนด 'V')
                                            // เพื่อใช้เก็บข้อมูลเกี่ยวกับการสำรวจแต่ละจุด

        LinkedList<Integer> queue = new LinkedList(); // สร้าง LinkedList ชื่อ queue
                                                      // เพื่อเก็บลำดับของจุดที่จะถูกสำรวจในกระบนการ BFS

        visited[s] = true; // กำหนดตัวเเอร 'visited'ที่เกี่ยวกับจุด 's' ให้เป็น true
                           // (เพื่อให้รู้ว่าจุด's'ได้รับการสำรวจเเล้ว)
        queue.add(s);

        while (queue.size() != 0) { // ตรวจสอบว่า'Queue'ว่างไหม โดย'Queue'ใช้เก็บลำดับจุดที่ยังไม่ได้สำรวจใน BFS
            s = queue.poll(); // จะลบและคืนค่าจากตัวแรกของ'Queue'เเล้วเก็บไว้ในตัวเเปร 's'
            System.out.print(s + " "); // เเสดงค่า 's' ซึ่งเป็นจุดมรากำลังสำรวจบนหน้าจอ

            Iterator<Integer> i = adj[s].listIterator(); // สร้าง Iterator('i')พื่อสำรวจเส้นเชื่อมจุด's' โดยที่ 'adj[s]'
                                                         // คือลิงก์ลิสต์ของเส้นเชื่อมจุดที่ต่อกับจุด 's'
            while (i.hasNext()) { // ตรวจสอบว่า Iterator (i) มีองค์ประกอบถัดไปให้สำรวจไหม
                int n = i.next(); // คืนค่าของจุดถัดไปที่เชื่อมโยงกับจุด 's' แล้วเก็บในตัวแปร 'n'
                if (!visited[n]) { // ตรวจสอบว่าจุด n ยังไม่เคยถูกสำรวจ
                    visited[n] = true; // กำหนดให้ visited[n] เป็น true เพื่อระบุว่าจุด n ได้รับการสำรวจแล้ว
                    queue.add(n); // เพิ่มจุด n เข้าไปใน Queue (queue) เพื่อทำให้จุด n
                                  // เป็นจุดถัดไปที่จะถูกสำรวจใน= BFS
                }
            }
        }
    }

    public static void main(String args[]) {
        graphBFS g = new graphBFS(4);

        g.addEdge(0, 1); // เพิ่มเส้นเชื่อมระหว่างจุด 0 และ 1
        g.addEdge(0, 2); // เพิ่มเส้นเชื่อมระหว่างจุด 0 และ 2
        g.addEdge(1, 2); // เพิ่มเส้นเชื่อมระหว่างจุด 1 และ 2
        g.addEdge(2, 0); // เพิ่มเส้นเชื่อมระหว่างจุด 2 และ 0
        g.addEdge(2, 3); // เพิ่มเส้นเชื่อมระหว่างจุด 2 และ 3
        g.addEdge(3, 3); // เพิ่มเส้นเชื่อมระหว่างจุด 2 และ 3

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

        g.BFS(2);
    }
}
