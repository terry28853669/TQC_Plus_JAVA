package JP602_1;

abstract class Notebook {
	LCD lcd;
	CPU cpu;
	HD hd;

	double getCost() {
		return (double) (lcd.getCost() + cpu.getCost() + hd.getCost()) * 1.4;
	}

	int getPrice() {
		return (lcd.getCost() + cpu.getCost() + hd.getCost()) * 2;
	}
}