package JP602_1;

class LCD extends Part {
	int inch;

	LCD(int i) {
		inch = i;
		if (i == 10)
			cost = 2000;
		else if (i == 15)
			cost = 2500;
		else if (i == 17)
			cost = 3000;
	}

	int inch() {
		return inch;
	}
}
