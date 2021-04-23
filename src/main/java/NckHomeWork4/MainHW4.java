package NckHomeWork4;

public class MainHW4 {

	static volatile char ch = 'A';
	static Object monitor = new Object();

	static class WaitNotifyClass {

		public void print(char letter, char nextLetter) {
			synchronized (monitor) {
				try {
					for (int i = 0; i < 5; i++) {
						while (letter != ch) {
							monitor.wait();
						}
						System.out.print(letter);
						ch = nextLetter;
						monitor.notifyAll();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public static void main(String[] args) {
		WaitNotifyClass waitNotifyClass = new WaitNotifyClass();
		new Thread(() -> waitNotifyClass.print('A', 'B')).start();
		new Thread(() -> waitNotifyClass.print('B', 'C')).start();
		new Thread(() -> waitNotifyClass.print('C', 'A')).start();

	}
}
