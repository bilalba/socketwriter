import java.io.*;
public class SocketRead implements Runnable{
	BufferedReader in;
	public SocketRead(BufferedReader inx){
		in = inx;
		Thread t = new Thread(this);
		t.start();
	}
	public void run() {
		while (true) {
			String h = "";
			try {
				if ((h = in.readLine()) != null)
					System.out.println(h);
			} catch (Exception e) { 
				e.printStackTrace();
				return;
			}
		}
	}
}