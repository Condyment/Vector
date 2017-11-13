import java.util.Vector;

public class Vect {

	public static void main(String[] args) {

		Vector<Integer> a = new Vector<Integer>();
		Vector<Integer> muppet = new Vector<Integer>();
		int array[] = { 1, 2, 2, 2, 3, 4, 5, 2, 2 };
		for (int i = 0; i < array.length; i++) {

			a.add(array[i]);
		}

		try {
		} catch (Exception e) {
		}
		System.out.println(a);

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				try {
					if (i != j) {
						if (a.get(i).equals(a.get(j))) {
							muppet.add(a.get(j));
							a.remove(j);

						}
					}
				} catch (Exception e) {
					i = 0;
					j = 0;
				}

			}

		}
		System.out.println(muppet);

		for (int i = 0; i < muppet.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if (muppet.get(i).equals(a.get(j))) {
					a.remove(j);
				}

			}

		}
		System.out.println(a);
		int sum = 0;
		if (a.isEmpty() == false) {
			for (int i = 0; i < a.size(); i++) {
				sum = sum + a.get(i);
			}
		} else {
			System.out.println("Its imposible");
		}
		System.out.println(sum);
	}
}
