package L30_Nov2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Nov-2019
 *
 */

public class HeapGeneric2<T> {

	ArrayList<T> data = new ArrayList<>();
	Comparator<T> comp;

	public HeapGeneric2(Comparator<T> comp) {
		this.comp = comp;
	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(T item) {

		data.add(item);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (comp.compare(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {

		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public T remove() {

		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int mini = pi;

		if (lci < data.size() && comp.compare(data.get(lci), data.get(mini)) > 0) {
			mini = lci;
		}

		if (rci < data.size() && comp.compare(data.get(rci), data.get(mini)) > 0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

	public T get() {
		return data.get(0);
	}

	public void display() {
		System.out.println(data);
	}

}
