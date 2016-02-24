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

	// 主人公のパラメータ
	private double 最大体力 = 0;
	private double 今の体力 = 0;
	private double 攻撃力 = 0;
	private double 素早さ = 0;
	private double 防御力 = 0;
	private double 経験値 = 0;
	private double レベル = 0;
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
		経験値 = 3500; // ダミー実装
		// ファイルからレコードを読み込む
		// 同じ名前があれば、経験値を取り込む
		// 経験値からレベルを取得
		レベル = getレベル(経験値);
		// 保存された体力情報を取得
		今の体力 = 10; // ダミー実装
		// 最大体力をセット
		最大体力 = get最大体力(レベル);
		// 攻撃力をセット
		攻撃力 = get攻撃力(レベル);
		// 防御力をセット
		防御力 = get防御力(レベル);
		// 素早さをセット
		素早さ = get素早さ(レベル);
	}

	private double get素早さ(double _レベル) {
		// TODO 自動生成されたメソッド・スタブ
		return 0.010203041 * Math.pow(_レベル, 2) + 10;
	}

	private double get防御力(double _レベル) {
		// TODO 自動生成されたメソッド・スタブ
		return 0.051015203 * Math.pow(_レベル, 2) + 10;
	}

	private double get攻撃力(double _レベル) {
		// TODO 自動生成されたメソッド・スタブ
		return 0.071421284 * Math.pow(_レベル, 2) + 10;
	}

	private double get最大体力(double _レベル) {
		// 最大体力を計算する。
		return 0.101928375 * Math.pow(_レベル, 2) + 10;
	}

	/**
	 * 経験値からレベルをセットする。
	 *
	 *
	 * @param _経験値
	 * @return
	 */
	private double getレベル(double _経験値) {
		// 経験値からレベルをセットする。
		return Math.sqrt(_経験値/51.01520253);
	}

	/**
	 * ユーザーデータの保存をします。
	 *
	 * ゲームの進捗も保存しなければならないので、
	 * ここには、ユーザーデータの保存だけを書くか、
	 * 保存してほしいユーザーデータの文字列を生成するだけにした方が良い
	 *
	 */
	public String 保存() {
		return null;
	}

	public double get最大体力() {
		return 最大体力;
	}

	public void set最大体力(double 最大体力) {
		this.最大体力 = 最大体力;
	}

	public double get今の体力() {
		return 今の体力;
	}

	public void set今の体力(double 今の体力) {
		this.今の体力 = 今の体力;
	}

	public double get攻撃力() {
		return 攻撃力;
	}

	public void set攻撃力(double 攻撃力) {
		this.攻撃力 = 攻撃力;
	}

	public double get素早さ() {
		return 素早さ;
	}

	public void set素早さ(double 素早さ) {
		this.素早さ = 素早さ;
	}

	public double get防御力() {
		return 防御力;
	}

	public void set防御力(double 防御力) {
		this.防御力 = 防御力;
	}

	public double get経験値() {
		return 経験値;
	}

	public void set経験値(double 経験値) {
		this.経験値 = 経験値;
	}

	public double getレベル() {
		return レベル;
	}

	public void setレベル(double レベル) {
		this.レベル = レベル;
	}

	public String get名前() {
		return 名前;
	}

	public void set名前(String 名前) {
		this.名前 = 名前;
	}

}
