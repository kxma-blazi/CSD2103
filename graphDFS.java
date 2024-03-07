// referend : https://www.programiz.com/dsa/graph-dfs

// DFS algorithm in Java

import java.util.*;

class Graph {
  private LinkedList<Integer> adjLists[]; // adjList: เก็บรายการของโหนดที่เชื่อมต่อกับเเต่ละโหนด
  private boolean visited[]; // visited: อาร์เรย์ boolean เก็บข้อมูลเพื่อติดตามสถานะการเยี่ยมชมของโหนด

  // Graph creation
  Graph(int vertices) {
    adjLists = new LinkedList[vertices]; // สร้างอาร์เรย์adjLists และ visited ขนาดเท่ากับจำนวนโหนด (vertices)
                                         // ที่ถูกส่งเข้ามา
    visited = new boolean[vertices]; // สร้าง LinkedList ว่าง สำหรับแต่ละโหนดใน adjLists.

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  // Add edges
  void addEdge(int src, int dest) { // เมทอด addEdge จะเพิ่มเส้นเชื่อมระหว่างโหนด src และ dest โดยเพิ่ม dest
                                    // เข้าไปใน LinkedList ของ src
    adjLists[src].add(dest);
  }

  // DFS algorithm เมทอด DFS ทำการท่องไปทุกโหนดในกราฟโดยใช้ Depth First Search
  // (DFS) โดยรับโหนดเริ่มต้นเป็นอาร์กิวเมนต์
  void DFS(int vertex) { // การท่องจะเริ่มต้นที่โหนดนี้ และทำการเช็คให้โหนดนี้เป็น visited
                         // (เพื่อไม่ให้ทำงานซ้ำ) และแสดงค่าของโหนดนี้.
                         // จากนั้นท่องไปยังโหนดที่ต่อไปที่ยังไม่ได้เยี่ยมชม
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator(); // ใช้ Iterator ใน LinkListของโหนดปัจจุบัน
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  // สร้างอ็อบเจ็กต์ของคลาส Graph และกำหนดจำนวนโหนดในกราฟเท่ากับ 4 โหนด
  // และเพิ่มเส้นเชื่อมระหว่างโหนดต่างๆ ตามที่กำหนด
  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 3);

    System.out.println("Following is Depth First Traversal");

    g.DFS(2); // เรียกใช้เมทอด DFS โดยระบุโหนดเริ่มต้นเป็น 2
  }
}
// ผลลัพธ์
// Following is Depth First Traversal
// 2 0 1 3
