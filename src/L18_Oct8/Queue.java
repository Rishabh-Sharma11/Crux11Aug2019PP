package L18_Oct8;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 12-Oct-2019
 *
 */

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full.");
		}

		int idx = (front + size) % data.length;
		data[idx] = item;

		size++;

	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int temp = data[front];
		data[front] = 0;

		front = (front + 1) % data.length;
		size--;

		return temp;

	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int temp = data[front];
		return temp;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public void display() {

		System.out.println("------------------------");

		for (int i = 0; i < size; i++) {

			int idx = (i + front) % data.length;
			System.out.print(data[idx] + " ");

		}

		System.out.println(".");
		System.out.println("------------------------");
	}

}
