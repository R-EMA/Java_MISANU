package niti;

public class A extends Thread {
		
	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("A_"+i);
		System.out.println("A end");
	}
	
}
