package character;

/**
 * ＲＰＧの主人公のクラス
 *
 * 保存したい情報は、経験値と名前
 *
 * @author Masanori Murakami
 *
 */
public class 主人公 {

	private int 最大体力=0;
	private int 今の体力=0;
	private int 攻撃力 = 0;
	private int 素早さ = 0;
	private int 防御力 = 0;
	private int 経験値 = 0;
	private int レベル = 0;
	private String 名前 = "";

	/** クラス生成時に呼び出されるメソッド
	 *
	 * 保存した経験値を読み込み、各パラメータをセットする。
	 *
	 *
	 * @param _名前
	 */
	public 主人公(String _名前) {
		// 名前をセット
		名前 = _名前;
		// 保存された経験値情報の取得
		経験値 = 10;					// ダミー実装
		// 経験値からレベルを取得
		レベル = getレベル(経験値);
		// 保存された体力情報を取得
		今の体力 = 10;						// ダミー実装
		// 最大体力をセット
		最大体力 = get最大体力(レベル);
		// 攻撃力をセット
		攻撃力 = get攻撃力(レベル);
		// 防御力をセット
		防御力 = get防御力(レベル);
		// 素早さをセット
		素早さ = get素早さ(レベル);
	}

	/**
	 * 経験値からレベルをセットする。
	 *
	 *
	 * @param _経験値
	 * @return
	 */
	private int getレベル(int _経験値) {
		// 経験値からレベルをセットする。
		return 0;
	}

}
