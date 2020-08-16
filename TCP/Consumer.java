import java.io.*;
import java.net.*;

public class Consumer {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String address=br.readLine();
		Socket socket=new Socket(address,2888);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("4");
		bw.flush();
		bw.close();
		socket.close();
	}

}
