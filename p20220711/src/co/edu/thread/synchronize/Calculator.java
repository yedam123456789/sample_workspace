package co.edu.thread.synchronize;


public class Calculator {

	private int memory;
	 
	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(memory);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);;
}
}
