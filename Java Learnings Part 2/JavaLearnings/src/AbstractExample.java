abstract class vishnu {
	abstract void method1();

	void method2() {
		System.out.println("vishnu");
	}

	vishnu() {
		System.out.println("inside no arg vishnu constructor");
	}

	vishnu(int a) {
		System.out.println("inside int arg vishnu constructor" + a);
	}
}

public class AbstractExample extends vishnu {
	public AbstractExample() {
		super();
		System.out.println("inside abstract example no arg");
	}

	AbstractExample(int a) {
		super();
		System.out.println("inside int arg abstract example");
	}

	private void increment(int i) {
		i++;
		System.out.println("print i" + i);
		increment(i);
		if (i == 10) {
			return;
		}
	}

	public static void main(String a[]) {
		// AbstractExample abs = new AbstractExample();
		vishnu abs1 = new vishnu(12) {

			@Override
			void method1() {
				System.out.println("inside abstract example method");

			}
		};

		AbstractExample abs = new AbstractExample();
		abs.increment(1);
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub

	}
}
