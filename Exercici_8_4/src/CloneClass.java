import java.util.LinkedList;
import java.util.PriorityQueue;

public class CloneClass {
	
	public static void main(String[] args) {
		// 1: Clone twice the LinkedList from the previous ex.
		// Create the previous LinkedList to clone it after do it.
		LinkedList<UsingComparator> llistaCotxes = new LinkedList<UsingComparator>();

		// add 5 cars to the LinkedList.
		llistaCotxes.add(new UsingComparator("Alfa Romeo", "Giulia", 2900, 6));
		llistaCotxes.add(new UsingComparator("Dacia", "Sadero", 1200, 4));
		llistaCotxes.add(new UsingComparator("Ford", "Focus", 2000, 4));
		llistaCotxes.add(new UsingComparator("Opel", "Insignia", 2200, 4));
		llistaCotxes.add(new UsingComparator("Seat", "Ibiza", 1600, 4));

		// now lets clone the LinkedList
		LinkedList<UsingComparator> lifoAutos = (LinkedList<UsingComparator>) llistaCotxes.clone();
		LinkedList<UsingComparator> fifoAutos = (LinkedList<UsingComparator>) llistaCotxes.clone();

		// 2: create a priority queue.
		PriorityQueue<UsingComparator> llistaPrioCotxe = new PriorityQueue<UsingComparator>(6);
		PriorityQueue<UsingComparator> llistaPrioCotxe2 = new PriorityQueue<UsingComparator>(6);
		
		// Fill the priority queue.
		for (UsingComparator cotxe : fifoAutos) {
			llistaPrioCotxe.offer(cotxe);
			llistaPrioCotxe2.offer(cotxe);
		}
		// Compare the cars.
		while(!llistaPrioCotxe.isEmpty()) {
			System.out.println(llistaPrioCotxe.poll());
		}
		
		// 3: Insert a car to the queues.
		lifoAutos.addFirst(new UsingComparator("Fiat", "Panda", 900, 2));
		fifoAutos.addLast(new UsingComparator("Fiat", "Panda", 900, 2));
		llistaPrioCotxe.add(new UsingComparator("Fiat", "Panda", 900, 2));
		
		// 4: show both queues sorted.
		while(!llistaPrioCotxe2.isEmpty()) {
			System.out.println(lifoAutos.pollLast());
			System.out.println(fifoAutos.pollFirst());
			System.out.println(llistaPrioCotxe2.poll());
		}
		
		// 5: Example in real life a lifo and fifo.
		/* FIFO: un dispensador de caramels.  
		 * LIFO: el carregador d'una pistola de balins.
		 */
		
	}

}
