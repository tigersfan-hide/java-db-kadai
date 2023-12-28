package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice(){
		while(true) {
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			Scanner scanner = new Scanner(System.in);
			String myChoice = scanner.next();
			String[]  choice = { "r", "s", "p"};
			for(int i=0;i<choice.length;i++) {
				if(myChoice.equals(choice[i])) {
					scanner.close();
					return myChoice;
				}
			}
			System.out.println("再度入力しましょう");
		}
	}
	public String getRandom() {
		String[]  choice = { "r", "s", "p"};
		int ranNum =(int) Math.floor(Math.random()*3);
		String yourChoice = choice[ranNum];
		return yourChoice;
	}
	public void playGame() {
		String a =getMyChoice();
		String b =getRandom();
		HashMap <String , String> hashMap =new HashMap <String , String>();
		hashMap.put("r","グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");
		System.out.println("自分の手は"+hashMap.get(a)+",対戦相手の手は"+hashMap.get(b));
		if(a.equals(b)) {
			System.out.println("あいこです");
		} else if(a.equals("r") && b.equals("s")){
			System.out.println("自分の勝ちです");
		}  else if(a.equals("r") && b.equals("p")){
			System.out.println("自分の負けです");
		}  else if(a.equals("s") && b.equals("r")){
			System.out.println("自分の負けです");
		}  else if(a.equals("s") && b.equals("p")){
			System.out.println("自分の勝ちです");
		}  else if(a.equals("p") && b.equals("r")){
			System.out.println("自分の勝ちです");
		}  else if(a.equals("p") && b.equals("s")){
			System.out.println("自分の負けです");
		}
	}
}
