package practice14.ptra14;

import practice14.common.Course;

public class javaCourse implements Course{

	public String getCourseName() {

		String str = "Eラーニング】Java";
		return str;
	}

	public String[] getCourseUnit() {

		String[] array = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return array;
	}

}
