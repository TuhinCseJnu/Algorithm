package dataStructure;
import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("---------------------------------------\n"
						   +"             * Algoithm *             \n"
						   +"--------------------------------------\n"
						   +"	1. Data Structure\n"
						   +"	2. Graph Algorithm\n");
		System.out.println();
		System.out.print("Type your choice >: ");
		int choice = s.nextInt();
		
		if(choice == 1) {
			Input in = new Input();
			System.out.println("---------------------------------------\n"
					           +"             * Data Structure *       \n"
					           +"--------------------------------------\n"
					           +"    1. Linear Search\n"
					           +"    2. Binary Search\n"
					           +"    3. Bubble Sort\n"
					           +"    4. Insertion Sort\n"
					           +"    5. Selection Sort\n"
					           +"    6. Merge Sort\n"
					           +"    7. Quick Sort\n"
					           +"    8. Counting Sort\n"
					           +"    9. Radix Sort\n"
					           +"   10. Bucket Sort\n"
					           +"   11. Shell Sort\n"
					           +"   12. Stack\n"
					           +"   13. Queue\n"
					           +"   14. Link List\n"
					           +"   15. Heap Sort\n"
					           +"   16. Binary Search Tree");
			System.out.println();
			System.out.print("Enter your Data Structure choice >: ");
			int n1 = s.nextInt();
			
			switch(n1) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				BubbleSort b = new BubbleSort();
				b.bubble_sort(in.sort_input());
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
			case 16:
				break;
			default:
				break;
			}
			
		}
		
		else {
			System.out.println("---------------------------------------\n"
			           		  +"             * Graph Algorithm *       \n"
			                  +"--------------------------------------\n"
			                  +"    1.  Graph Representaion\n"
			                  +"    2.  BFS\n"
			                  +"    3.  DFS\n"
			                  +"    4.  Topological Sort\n"
			                  +"    5.  Krushkal\n"
			                  +"    6.  Prim's\n"
			                  +"    7.  Dijkastra\n"
			                  +"    8.  Bellman-Ford\n"
			                  +"    9.  Floyed-Warshall\n");
			System.out.println();
			System.out.print("Type your Graph Algorithm choice >: ");
			int n2 = s.nextInt();
			
			switch(n2) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			default:
				break;
		}
		
		}

	}

}

}