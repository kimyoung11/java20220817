package ch18.lecture;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C08PrintStream {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(55000);
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		bis.read();
	}
}
