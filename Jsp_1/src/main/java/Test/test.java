package Test;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

	String[] booklist = { "된다! 네이버 블로그&포스트", "스프링 부트 실전 활용 마스터", "Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C 언어" };
	ArrayList<String> books = new ArrayList<>();
	for (String temp : booklist) {
	    books.add(temp);
	}

    }

}
