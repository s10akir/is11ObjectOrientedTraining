/**
 * 教科書95p
 * 確認問題08 Q1
 */
public class Kakunin08Q1 {
    /**
     * "おはようございます！"と表示する
     */
    private void asaNoAisatsu() {
        System.out.println("おはようございます！");
    }


    /**
     * 1. 自クラスのインスタンスを生成する
     * 2. 生成したインスタンスのasaNoAisatsuメソッドを呼び出す
     * @param args
     */
    public static void main(String[] args) {
        Kakunin08Q1 kakunin  = new Kakunin08Q1();
        kakunin.asaNoAisatsu();
    }
}
