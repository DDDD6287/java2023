package s0904;

import java.util.Scanner;

public class RobotRace {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("로봇 선택:");
		Scanner s = new Scanner(System.in);
		String myRobot = s.next();
		
		Race a = new Race("A");
		Race b = new Race("B");
		Race c = new Race("C");
		
		a.start();
		b.start();
		c.start();
		
		System.out.print("당신이 선택한" + myRobot + "은 00등입니다.");
	}
	
}

class Race extends Thread{
	static int score = 0;
	int myScore = 0;
	String name;
	Race(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			if(name.equals("A")) {
				System.out.println("A");
			}else if(name.equals("B")) {
				System.out.println("	B");
			}else if(name.equals("C")) {
				System.out.println("		C");
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		score += 1;
		myScore = score;
		System.out.println(name+"이 결승선에 도착함");
		System.out.println(name + ": " + myScore + "등");
	}
	
}