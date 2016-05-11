package JP0608_1;

abstract class Food {
	private int amount;
	private int calorie;
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



}
