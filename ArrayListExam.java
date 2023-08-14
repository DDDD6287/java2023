package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		ArrayList<String> list = new ArrayList<>();
		//데이터 추가
		list.add("김동현");
		list.add("유재석");
		list.add("김재우");
		list.add("서준민");
		list.add("이승재");
		System.out.println(list.toString());
		list.remove("유재석");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("--------------------");
		// 리스트에 들어있는 모든 데이터를 하나씩 출력하기
		
		for (String s: list) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		list.removeAll(list);
		list.clear();
		System.out.println("지운후 사이즈" + list.size());
		
		System.out.println("---------------------");
		list.add("서울");
		list.add("로봇");
		if(list.contains("서울")==true) {
			System.out.println("서울을 포함하고 있음");
		}
	}

}