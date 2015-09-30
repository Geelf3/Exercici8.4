import java.util.LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CloneClass {
	
	public static void main(String[] args) {
		// 1: Clone twice the LinkedList from the previous ex.
		// Create the previous LinkedList to clone it after do it.
		LinkedList<Cotxe> llistaCotxes = new LinkedList<Cotxe>();

		// add 5 cars to the LinkedList.
		llistaCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		llistaCotxes.add(new Cotxe("Dacia", "Sadero", 1200, 4));
		llistaCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		llistaCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		llistaCotxes.add(new Cotxe("Seat", "Ibiza", 1600, 4));

		// now lets clone the LinkedList
		LinkedList<Cotxe> lifoAutos = (LinkedList<Cotxe>) llistaCotxes.clone();
		LinkedList<Cotxe> fifoAutos = (LinkedList<Cotxe>) llistaCotxes.clone();

		// 2: create a priority queue.
		PriorityQueue<Cotxe> llistaPrioCotxe = new PriorityQueue<Cotxe>(6);
		
	}

}
