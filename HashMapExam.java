package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학번(정수), 이름(문자)
		//순서없음
		HashMap<Integer, String> map = new HashMap<>();
		map.put(20304, "구예성");
		map.put(20303, "권순호");
		map.put(20301, "구예성");
		map.put(20306, "김시겸");
		
		System.out.println(map.toString());
		System.out.println(map.size());
		
		//20304학생의 이름을 출력
		System.out.println(map.get(20303));
		map.put(20307,"김로봇");
		System.out.println(map.toString());
		
		//키만 출력하기
		for (Integer a : map.keySet()) {
			System.out.println(a);
		}
		for (String s : map.values()) {
			System.out.println(s);
		}
		
		//키와 값 출력하기
		for (Integer a : map.keySet()) {
			System.out.print("학번:" + a);
			System.out.println("이름"+ map.get(a));
		}
		map.remove(20306);
		map.clear();
		
		System.out.println(map.toString());
	}
}


