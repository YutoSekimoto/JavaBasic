package practice10;

public class Car {

	int seriaINo;
	String color;
	int gasoline;

	int run() {

		int num = new java.util.Random().nextInt(15);
		this.gasoline--;

		if(gasoline == -1) {

			return -1;

		}else {

			return num;

		}

	}

}
