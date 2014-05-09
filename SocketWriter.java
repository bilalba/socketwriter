import java.io.*;
import java.net.*;
import java.util.Scanner;
public class SocketWriter {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		SocketRead socketread = new SocketRead(in);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				out.writeBytes(sc.nextLine()+ "\n");
			} catch (Exception e) { e.printStackTrace(); 
			}
		}

	}
}