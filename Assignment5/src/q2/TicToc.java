package q2;

class A extends Thread {
	public void run() {
		System.out.print("Tic");
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Toc");
	}
}

public class TicToc {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();

		for (int i = 0; i < 10; i++) {
			a.run();
			a.join();
			System.out.print("-");
			b.run();
			b.join();
		}
	}

}
