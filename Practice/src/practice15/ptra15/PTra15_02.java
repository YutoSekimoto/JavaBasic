/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import java.util.Arrays;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month jRoom = (Java2Month)room;
		String[] rooms = jRoom.getCurriculum();


		// 取得したカリキュラム情報を全て出力してください
		System.out.println(Arrays.toString(rooms));

	}
}
