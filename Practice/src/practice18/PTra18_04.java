/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {

            	Player player = new Player();
            	String line = scanner.nextLine();
            	String[] lines = line.split(",");

            	player.setPosition(lines[0]);
            	player.setName(lines[1]);
            	player.setCountry(lines[2]);
            	player.setTeam(lines[3]);

                // ★ 1行ごとにArrayListに格納してください
                array.add(player);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

        Collections.shuffle(array);

        ArrayList<Player> DF = new ArrayList<>();
        ArrayList<Player> MF = new ArrayList<>();
        ArrayList<Player> FW = new ArrayList<>();

        for(Player value : array) {

        	if(value.getPosition().equals("GK")) {

        		System.out.println(value);
        		System.out.println();
        		break;

        	}

        }

        for(Player value : array) {

        	if(value.getPosition().equals("DF")) {

        		DF.add(value);

        	}

        	if(DF.size() == 4) {

        		for(Player df : DF) {

        			System.out.println(df);

        		}

        		System.out.println();
        		break;

        	}

        }

        for(Player value : array) {

        	if(value.getPosition().equals("MF")) {

        		MF.add(value);

        	}

        	if(MF.size() == 4) {

        		for(Player mf : MF) {

        			System.out.println(mf);

        		}

        		System.out.println();
        		break;

        	}

        }

        for(Player value : array) {

        	if(value.getPosition().equals("FW")) {

        		FW.add(value);

        	}

        	if(FW.size() == 2) {

        		for(Player fw : FW) {

        			System.out.println(fw);

        		}

        		System.out.println();
        		break;

        	}

        }


	}
}
