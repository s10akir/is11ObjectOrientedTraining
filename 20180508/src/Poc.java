/**
 * デイリーで使うバッチを想定 細部はアーキテクチャがわからないと組用がないので省略
 * 半年間の累計利息を加算して記録していく。利率オブザデイは記録しない(DBのコミットログから差分を取れる)
 */

public class Poc {
    public static void main(String[] args) {
        Poc poc = new Poc();
    }


    /**
     * logic
     */
    private Poc() {
        int balance = getBalance();
        double rate = getRate();
        int interest = getInterest();

        interest += (int) (balance * rate);
        if (commitInterest(interest)) {
            System.out.println("done. (" + interest + ")");
        } else {
            System.out.println("failed");
            System.exit(1);
        }

        System.exit(0);
    }

    /**
     * 現時点の口座残高を取ってくるダミーメソッド
     * @return int: 口座残高
     */
    private int getBalance() {
        return 100000;  // 本来であればDBなりなんなりから取ってくる
    }

    /**
     * 当日の利率を取ってくるダミーメソッド
     * @return double: 利率
     */
    private double getRate() {
        return 0.10;  // 本来であれば社内APIなりなんなりから取ってくる
    }

    /**
     * 現時点の累計利息を取ってくるメソッド
     * @return int: 累計利息
     */
    private int getInterest() {
        return 9999;  // 本来であればDBなりなんなりから取ってくる
    }

    /**
     * DBなりなんなりに累計利息を反映するダミーメソッド
     * @return boolean: コミットの結果
     */
    private boolean commitInterest(int newInterest) {
        return true;  // 本来であればコミットがの結果でBoolを返す
    }
}
