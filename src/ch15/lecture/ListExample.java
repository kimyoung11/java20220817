package ch15.lecture;

import java.util.List;
import java.util.ArrayList;

class Board{ //775pgs 7번
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title =title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}

class BoardDao{

	public ArrayList<Board> getBoardList() {
		ArrayList<Board> list = new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3")); //for문 돌려도됨
		return list;
	}
}

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+ "-" + board.getContent());
		}
	}
}
