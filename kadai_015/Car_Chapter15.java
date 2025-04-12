package kadai_015;

public class Car_Chapter15 {
	private int gear = 1 ;
	private int speed = 10;
	
	public void gearCange(int afterGear){
		int beforegear = this.gear;
		switch(afterGear) {
			case 1:
				this.gear = 1 ;
				this.speed = 10;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
			case 2:
				this.gear = 2 ;
				this.speed = 20;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
			case 3:
				this.gear = 3 ;
				this.speed = 30;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
			case 4:
				this.gear = 4 ;
				this.speed = 40;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
			case 5:
				this.gear = 5 ;
				this.speed = 50;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
			default :
				this.gear = 1 ;
				this.speed = 10;
				System.out.println("ギア" + beforegear + "から" + this.gear + "に切り替えました");
				break;
		}
	}
	public void run() {
		System.out.println("速度は" + this.speed + "kmです");
	}
}
