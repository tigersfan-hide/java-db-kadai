package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int userAge = 0;
		int serviceCost = 0;
		userAge =30+(int)(Math.random()*10);
		if (userAge >= 10 && userAge <= 19) {
			userAge =10;
		} else if (userAge >= 20 && userAge <= 29) {
			userAge =20;
		} else if (userAge >= 30 && userAge <= 39) {
			userAge =30;
		} else if (userAge >= 40 && userAge <= 49) {
			userAge =40;
		} else if (userAge >= 50 && userAge <= 59) {
			userAge =50;
		} else if (userAge >= 60 && userAge <= 69) {
			userAge =60;
		} else if (userAge >= 70 && userAge <= 79) {
			userAge =70;
		} else if (userAge >= 80 && userAge <= 89) {
			userAge =80;
		} else {
			
		}
		serviceCost =switch(userAge) {
		case 10 ->1000;
		case 20 ->2000;
		case 30,40 ->3000;
		case 50,60,70 ->4000;
		case 80 ->5000;
		default ->500;
		};
		switch(userAge) {
		case 10,20,30,40,50,60,70,80 -> System.out.println(userAge+"代の料金は"+serviceCost+"円");
		default ->System.out.println("その他の年代は料金は"+serviceCost+"円");
		}
	}

}
