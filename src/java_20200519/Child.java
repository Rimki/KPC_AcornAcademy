package java_20200519;

public class Child extends Parent {
	String chicken;
	int money;

	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}

	@Override
	public void play(String starcraft) {
		// TODO Auto-generated method stub
		//super.play(starcraft);
		System.out.println("Child play()");
	}

	public void setParentMoney(int money) {
		super.money = money;
	}

	public long getParentMoney() {
		return super.money;
	}
}
