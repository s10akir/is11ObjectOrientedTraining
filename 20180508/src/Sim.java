public class Sim {
    private int balance;
    private double rate;

    public static void main(String[] args) {
        int inputs[] = new int[3];

        if (args.length != 3) {
            System.out.println("fuck you. example: 'java Sim 残高 利率(%) 期間' just the fucking do it.");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("[0-9]+")) {
                inputs[i] = Integer.parseInt(args[i]);
            } else {
                System.out.println("intで打てintで");
                System.exit(1);
            }
        }

        Sim sim = new Sim(inputs[0], inputs[1], inputs[2]);
    }

    /**
     * 処理部
     * @param initBalance: 初期時点の口座残高
     * @param initRate: 利率
     * @param period: 期間
     */
    private Sim(int initBalance, int initRate, int period) {
        // debug
        balance = initBalance;
        rate = initRate / 100.0;

        for (int i = 0; i < (period * 2); i++) {
            halfOfYear();
        }

        System.out.println(balance);
    }

    /**
     * 半年ごとの利息計算をするメソッド
     */
    private void halfOfYear() {
        balance += balance * rate;
    }
}
