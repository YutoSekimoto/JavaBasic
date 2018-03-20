package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{


	public String getCourseName() {

		String str = "Eラーニング】DB基礎";
		return str;

	}

	public String[] getCourseUnit() {

		String[] array = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return array;

	}


}
