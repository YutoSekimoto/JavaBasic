package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car[] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 51;

		Car car3 = new Car();
		car3.color = "Yellow";
		car3.gasoline = 52;

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;

		for(int i = 0; i < cars.length; i++) {

		int run_times = 0;
		int destination_times = 0;

		while(true) {

			int num = cars[i].run();

			if(num == -1) {

				System.out.println("目的地に到達できませんでした");
				break;

			}

			run_times++;
			destination_times += num;

			if(destination_times >= 300) {

				System.out.println(cars[i].color + "色です");
				System.out.println("目的にまで" + run_times + "時間かかりました" + "残りのガソリンは" + cars[i].gasoline + "リットルです");
				break;

			}

		}

		}

	}
}
