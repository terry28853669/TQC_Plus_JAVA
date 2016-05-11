package JP0608_5;

import java.util.*;

class SaleReport {

	SaleReport() {
		list = new ArrayList();
	}

	void add(LunchBox lunchbox) {
		list.add(lunchbox);
	}

	int getNumberOfLunchBox() {
		return list.size();
	}

	int getProfit() {
		int i = 0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			LunchBox lunchbox = (LunchBox) iterator.next();
			int j = 0;
			Vector vector = lunchbox.getContent();
			for (Iterator iterator1 = vector.iterator(); iterator1.hasNext();) {
				Food food = (Food) iterator1.next();
				j += food.getCost();
			}

			i = (int) ((double) i + (lunchbox.getPrice() - (double) j));
		}

		return i;
	}

	private ArrayList list;
}
