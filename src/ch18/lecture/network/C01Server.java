package ch18.lecture.network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) throws Exception {

		// 서버소켓만들기
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress(30000)); // bind 포트 번호 할당

		// 소켓 연결
		Socket socket = serverSocket.accept();
		System.out.println(socket.getRemoteSocketAddress());	//연결된 사람 ip주소 가져오기
		
		// 클 -> 서버 
		// 서버입장에선 받는거. -> Input/stream/reader
		
		
		
	}
}
