package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
}

class A {
	A(int a) {

	}

	A() {
		
	}
}

class B extends A {

}

/*
 * class A extends Object { A() { super(); }
 * 
 * }
 * 
 * class B extends A { B() { super(); } }
 */