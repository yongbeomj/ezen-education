package Day06;

public class Day06_2 {

	public static void main(String[] args) {
		
		// p.221
		Car3 car1 = new Car3();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		Car3 car2 = new Car3("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car3 car3 = new Car3("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.model : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
		
		Car3 car4 = new Car3("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.model : " + car4.color);
		System.out.println("car4.model : " + car4.maxSpeed);
		System.out.println();
		
		
	}
}
