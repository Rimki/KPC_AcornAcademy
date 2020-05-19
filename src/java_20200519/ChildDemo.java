package java_20200519;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		System.out.println(p.money);

		Child c = new Child();
		c.money = 100_000_000;
		c.setParentMoney(1_000_000);
		c.makeMoney();
		c.chicken = "교촌";
		c.gotoSchool();
		c.play("omok");
		
		System.out.println(c.money);
		System.out.println(c.getParentMoney());
		System.out.println(c.chicken);
	}
}
