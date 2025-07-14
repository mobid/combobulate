// -*- combobulate-test-point-overlays: ((1 outline 302) (2 outline 360) (3 outline 413) (4 outline 506) (5 outline 558) (6 outline 588) (7 outline 639) (8 outline 685) (9 outline 782) (10 outline 846)); eval: (combobulate-test-fixture-mode t); -*-
package example;

public abstract class Methods {

	{
		System.out.println("Instance initializer");
	}

	static {
		System.out.println("Static initializer");
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

	private abstract int add(int a, int b);

	// ....
	public static void main(String[] args) {
	}

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
