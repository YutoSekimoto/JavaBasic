package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for(int i = 1; i <= 10; i++) {

			if(i <= 6) {

				for(int j = 1; j <= i - 1; j++ ) {

					System.out.print("■");

				}

				for(int k = 1; k <= 6 -i; k++ ) {

					System.out.print("□");

				}

			}

			if(i >= 7) {

				for(int j = 1; j <= i - 3; j++) {

					System.out.print("■");

				}

			}

			System.out.println();

		}

	}
}
