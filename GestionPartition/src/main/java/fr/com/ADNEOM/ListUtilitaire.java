package fr.com.ADNEOM;

import java.util.ArrayList;
import java.util.List;

public class ListUtilitaire {

	@SuppressWarnings("unchecked")
	public static <E, F> List<F> partition(List<E> list, int size) {

		try {
			if (size < 0) {
				System.out.println("la taille doit être > 0");
				System.out.println("**************************");
			} else {

				List<F> result = new ArrayList<F>(list.size() / size + 1);

				List<E> sublist = null;

				for (int i = 0; i < list.size(); i++) {

					if (i % size == 0) {
						if (sublist != null)
							result.add((F) (sublist));
						sublist = new ArrayList<E>(size);
					}
					sublist.add(list.get(i));
				}
				result.add((F) (sublist));

				return result;
			}
		} catch (ArithmeticException e) {
			System.out.println(" operation Invalid: " + e.getMessage());
			System.out.println("**************************");
		}
		return null;
	}

}
