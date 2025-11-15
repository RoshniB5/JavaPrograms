import java.util.*;

public class DiskTower {

    static void solve(int[] disks, int day, int max, PriorityQueue<Integer> heap) {
        if (day == disks.length) return;

        heap.add(disks[day]);
        System.out.print("Day " + (day + 1) + ": ");

        while (!heap.isEmpty() && heap.peek() == max) {
            System.out.print(heap.poll() + " ");
            max--;
        }
        System.out.println();

        solve(disks, day + 1, max, heap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        int[] disks = new int[n];
        System.out.println("Enter the disk sizes:");
        for (int i = 0; i < n; i++)
            disks[i] = sc.nextInt();

        int max = n;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Tower construction order:");
        solve(disks, 0, max, heap);
    }
}
