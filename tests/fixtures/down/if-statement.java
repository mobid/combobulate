// -*- combobulate-test-point-overlays: ((1 outline 275) (2 outline 307) (3 outline 322) (4 outline 326) (5 outline 350) (6 outline 355) (7 outline 371) (8 outline 388) (9 outline 394)); eval: (combobulate-test-fixture-mode t); -*-
package example;

public class Example {
	@First
	public static void main(String[] args) {
		if (Math.random() < 10) {
			final var fn = (int a, int b) -> {
				return a + b;
			};
		}
	}
}
