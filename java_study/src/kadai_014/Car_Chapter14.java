package kadai_014;

public class Car_Chapter14 { 
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter14() {
	}
	public void gearChange(int afterGear) {
		System.out.println("ギア"+this.gear+"から"+afterGear+"に切り替えました");
		this.gear=afterGear;
		this.speed =switch(afterGear){
		case 2-> 20;
		case 3-> 30;
		case 4-> 40;
		case 5-> 50;
		default -> 10;
		};
	}
	public void run() {
		System.out.println("速度は時速"+this.speed+"kmです");
	}
}

