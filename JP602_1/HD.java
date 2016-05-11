package JP602_1;

class HD extends Part {
	int size;
	HD(int i) {
		size = i;
		if (i == 120)
			cost = 2400;
		else if (i == 160)
			cost = 2800;
	}

	int size() {
		return size;
	}

	
}