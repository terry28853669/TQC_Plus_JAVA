package JP602_5;

class JPA06_5 {
	public static void main(String args[]) {
		Order order = new Order();
		order.in(new MiniNote());
		order.in(new Note15());
		order.in(new PC());
		if (order.revenue() > 20000D)
			System.out.println("This order exceeds 20000:" + order.revenue());
	}
}