// Java program to implement Max Heap
// Main class
public class maxHeap {
	private int[] Heap;
	private int size;
	private int maxsize;

	// Constructor to initialize an empty max heap with given maximum capacity : คอนสตรักเตอร์เพื่อสร้าง Max Heap ว่างด้วยความจุสูงสุดที่กำหนด
	public maxHeap(int maxsize)
	{
		// this Keyword refers to current instance itself : คำว่า this ใช้เพื่ออ้างอิงถึงอินสแตนซ์ปัจจุบัน
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize];
	}

	// Method 1
	// Returning position of parent : คืนค่าตำเเหน่งของโหนดเเม่
	private int parent(int pos) { return (pos - 1) / 2; }

	// Method 2
	// Returning left children : คืนค่าตำแหน่งของโหนดลูกทางซ้าย
	private int leftChild(int pos) { return (2 * pos) + 1; }

	// Method 3
	// Returning right children : คืนค่าตำแหน่งของโหนดลูกทางขวา
	private int rightChild(int pos)
	{
		return (2 * pos) + 2;
	}

	// Method 4
	// Returning true if given node is leaf : คืนค่า true ถ้าโหนดที่กำหนดเป็นโหนดใบ (leaf)
	private boolean isLeaf(int pos)
	{
		if (pos > (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// Method 5
	// Swapping nodes : สลับโหนด
	private void swap(int fpos, int spos)
	{
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	// Method 6
	// Recursive function to max heapify given subtree : ฟังก์ชันแบบทำซ้ำเพื่อทำให้ Max Heap ถูกต้องสำหรับต้นไม้ย่อยที่กำหนด
	private void maxHeapify(int pos)
	{
		if (isLeaf(pos))
			return;

		if (Heap[pos] < Heap[leftChild(pos)]
			|| Heap[pos] < Heap[rightChild(pos)]) {

			if (Heap[leftChild(pos)]
				> Heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
			}
			else {
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		}
	}

	// Method 7
	// Inserts a new element to max heap : แทรกองค์สมบูรณ์ใหม่เข้าไปใน Max Heap
	public void insert(int element)
	{
		Heap[size] = element;

		// Traverse up and fix violated property : วนลูปขึ้นไปที่โหนดที่ถูกเปลี่ยนแปลงและแก้ไขคุณสมบัติที่ไม่ถูกต้อง
		int current = size;
		while (Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		size++;
	}

	// Method 8
	// To display heap : เเสดง heap
	public void print()
	{

		for (int i = 0; i < size / 2; i++) {

			System.out.print("Parent Node : " + Heap[i]);

			if (leftChild(i)
				< size) // if the child is out of the bound
						// of the array
				System.out.print(" Left Child Node: "
								+ Heap[leftChild(i)]);

			if (rightChild(i)
				< size) // the right child index must not
						// be out of the index of the array
				System.out.print(" Right Child Node: "
								+ Heap[rightChild(i)]);

			System.out.println(); // for new line
		}
	}

	// Method 9
	// Remove an element from max heap : ดึงค่าสูงสุดออกจาก Max Heap
	public int extractMax()
	{
		int popped = Heap[0];
		Heap[0] = Heap[--size];
		maxHeapify(0);
		return popped;
	}

	// Method 10
	// main driver method : เมธอดหลัก
	public static void main(String[] arg)
	{
		// Display message for better readability
		System.out.println("The Max Heap is ");

		maxHeap maxHeap = new maxHeap(15);

		// Inserting nodes : แทรกโหนด
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);

		// Calling maxHeap() as defined above
		maxHeap.print();

		// Print and display the maximum value in heap
		System.out.println("The max val is "
						+ maxHeap.extractMax());
	}
}

// THANKS geeksforgeeks