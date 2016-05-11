package JP602_1;

class Note15 extends Notebook {

	Note15() {
		lcd = new LCD(15);
		cpu = new CPU(2.2);
		hd = new HD(160);
	}
}