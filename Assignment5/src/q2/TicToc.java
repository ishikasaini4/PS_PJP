package q2;

class Tic extends Thread{
	ThreadLock lock;
	
	Tic(ThreadLock lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {

		try{
			synchronized (lock) {

				for (int i = 0; i < 10; i++) {

					while(lock.flag!=1){
						lock.wait();
					}

					System.out.print("Tic - ");
					lock.flag = 2;
					lock.notify();
				}

			}
		}catch (Exception e) {
			System.out.println("Exception in class Tic :"+e.getMessage());
		}
	}
}


class Toc extends Thread{
	ThreadLock lock;
	
	Toc(ThreadLock lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {

		try{
			synchronized (lock) {

				for (int i = 0; i < 10; i++) {

					while(lock.flag!=2){
						lock.wait();
					}

					System.out.print("Toc\n");
					lock.flag = 1;
					lock.notify();
				}

			}
		}catch (Exception e) {
			System.out.println("Exception in class Toc :"+e.getMessage());
		}
	}
}

public class TicToc{
	public static void main(String[] args) {  
		
		ThreadLock lock = new ThreadLock();
		
		Tic thread1 = new Tic(lock);
		Toc thread2 = new Toc(lock);
		
		thread1.start();
		thread2.start();
		

	}
}

