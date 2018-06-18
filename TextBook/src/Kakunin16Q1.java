/**
 * 【Javaバイブルシリーズのここが産業廃棄物】
 * - 命名規則がゴミofゴミ
 *     - kingaku: 何の金額だよ
 *     - calc: 英語,  hyouji: 日本語ローマ字  <= なんでだよ
 *     - なんでバイトを特化させたら店になるんだよ
 *
 * @author Akira Shinohara
 * @since 2018.06.12
 */
public class Kakunin16Q1 {
    public static void main(String[] args) {
        GasStation gas = new GasStation();
        Convenience conveni = new Convenience();
        CDshop cd = new CDshop();

        gas.calc(3);
        gas.hyouji();

        conveni.calc(4);
        conveni.hyouji();

        cd.calc(2);
        cd.hyouji();
    }
}


abstract class Arbeit {
    int kingaku;


    abstract void calc(int hour);


    void hyouji() {
        System.out.println(kingaku + "円入手しました。");
    }
}


class Convenience extends Arbeit {
    @Override
    void calc(int hour) {
        System.out.println("コンビニで" + hour + "時間働きました。");
        kingaku = 1000 * hour;
    }
}


class CDshop extends Arbeit {
    @Override
    void calc(int hour) {
        System.out.println("CDショップで" + hour + "時間働きました。");
        kingaku = 850 * hour;
    }
}


class GasStation extends Arbeit {
    @Override
    void calc(int hour) {
        System.out.println("ガソリンスタンドで" + hour + "時間働きました。");
        kingaku = 1000 * hour + 500;
    }
}