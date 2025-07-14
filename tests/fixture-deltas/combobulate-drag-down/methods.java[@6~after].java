// -*- combobulate-test-point-overlays: ((1 outline 302) (2 outline 360) (3 outline 413) (4 outline 506) (5 outline 558) (6 outline 588) (7 outline 639) (8 outline 685) (9 outline 782) (10 outline 846)); eval: (combobulate-test-fixture-mode t); -*-
package example;

public abstract class Methods {

	static {
		System.out.println("Static initializer");
	}

	{
		System.out.println("Instance initializer");
	}

	public Methods() {
		System.out.println("Instance initializer");
	}

	/**
	 * Comment.
	 */
	@Getter
	private int parameter1;

	// Line comment
	private String parameter 2;

	public static void main(String[] args) {
	}

	// ....
	private abstract int add(int a, int b);

	@Deprecated
	@SumeAnnotation(value = 24)
	protected int sum(int a, int b) {
		return a + b;
	}

	private Map<Integer, String> returnNull() {
		return null;
	}

	interface PackageLocalInt {
		int i;
		String s;
	}
}
