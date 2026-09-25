import java.util.*;

class MinHeap {
    private ArrayList<Integer> heap = new ArrayList<>();

    // Insert element into heap
    public void insert(int value) {
        heap.add(value);

        int index = heap.size() - 1;

        // Heapify Up
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent) <= heap.get(index)) {
                break;
            }

            // Swap parent and child
            int temp = heap.get(parent);
            heap.set(parent, heap.get(index));
            heap.set(index, temp);

            index = parent;
        }
    }

    // Get minimum element
    public int peek() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty!");
            return -1;
        }

        return heap.get(0);
    }

    // Delete minimum element
    public int deleteMin() {
        if (heap.isEmpty()) {
            System.out.println("Heap is empty!");
            return -1;
        }

        int min = heap.get(0);

        // Move last element to root
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);

            // Heapify Down
            int index = 0;

            while (true) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int smallest = index;

                if (left < heap.size() &&
                    heap.get(left) < heap.get(smallest)) {
                    smallest = left;
                }

                if (right < heap.size() &&
                    heap.get(right) < heap.get(smallest)) {
                    smallest = right;
                }

                if (smallest == index) {
                    break;
                }

                // Swap
                int temp = heap.get(index);
                heap.set(index, heap.get(smallest));
                heap.set(smallest, temp);

                index = smallest;
            }
        }

        return min;
    }

    // Display heap
    public void display() {
        System.out.println("Heap: " + heap);
    }
}

public class BinaryHeap {
    public static void main(String[] args) {

        MinHeap h = new MinHeap();

        // Insert elements
        h.insert(50);
        h.insert(30);
        h.insert(20);
        h.insert(15);
        h.insert(10);
        h.insert(8);
        h.insert(16);

        System.out.println("After insertion:");
        h.display();

        // Peek
        System.out.println("Minimum element: " + h.peek());

        // Delete minimum
        System.out.println("Deleted: " + h.deleteMin());

        System.out.println("After deletion:");
        h.display();

        // Delete again
        System.out.println("Deleted: " + h.deleteMin());

        System.out.println("After deletion:");
        h.display();
    }
}