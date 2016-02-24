package main;

import character.主人公;

public class Main {

	public static void main(String[] args) {
		// 主人公の生成

		主人公 松浦 = new 主人公("松浦");
		主人公 村上 = new 主人公("村上");

		String バトル結果 = バトル(松浦,村上);
		System.out.println(" " + バトル結果);

//		System.out.println(勇者.get名前() + "のレベルは、" + String.valueOf(勇者.getレベル()));

	}

	private static String バトル(主人公 _松浦, 主人公 _村上) {
		// TODO 自動生成されたメソッド・スタブ
		return _松浦.get名前() + "の勝ち。";
	}

}
