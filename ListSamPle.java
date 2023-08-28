package s0828;

import java.util.ArrayList;

public class ListSamPle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> list = new ArrayList<>(); 
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(2,9);
			list.add(3);
			System.out.println(list.toString());
			list.remove(2);
			System.out.println(list.toString());
			
			if(list.contains(5)) {
				System.out.println("5있음");
			}
			
			System.out.println(list.get(0));
			
			list.clear();
			System.out.println(list.toString());
	}

}
