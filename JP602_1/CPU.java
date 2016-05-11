package JP602_1;

class CPU extends Part {
	double speed;
	CPU(double d) {
		speed = d;
		if (d == 1.66)
			cost = 6000;
		else if (d == 2.2)
			cost = 8000;
		else if (d == 2.4)
			cost = 11000;
	}

	double speed() {
		return speed;
	}	
}