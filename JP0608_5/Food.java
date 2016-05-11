package JP0608_5;

abstract class Food {

	Food() {
	}

	Food(int i) {
		amount = i;
	}

	void setCaloriePerGram(int i) {
		calorie = i;
	}

	int getAmount() {
		return amount;
	}

	int getCalorie() {
		return amount * calorie;
	}

	void setUnitCost(int i) {
		unitCost = i;
	}

	int getCost() {
		return amount * unitCost;
	}

	private int amount;
	private int calorie;
	private int unitCost;
}