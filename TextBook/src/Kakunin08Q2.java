/**
 * 教科書95p
 * 確認問題08 Q2
 */
public class Kakunin08Q2 {
    /**
     * "おはようございます！"と表示する
     */
    private void asaNoAisatsu() {
        System.out.println("おはようございます！");
    }


    /**
     * "こんにちは！"と表示する
     */
    private void hiruNoAisatsu() {
        System.out.println("こんにちは！");
    }


    /**
     * "こんばんは！"と表示する
     */
    private void yoruNoAisatsu() {
        System.out.println("こんばんは！");
    }


    /**
     * 1. 自クラスのインスタンスを3つ生成する
     * 2. 生成したインスタンスの各メソッドを呼び出す
     * @param args
     */
    public static void main(String[] args) {
        Kakunin08Q2 kakunin1  = new Kakunin08Q2();
        kakunin1.asaNoAisatsu();

        Kakunin08Q2 kakunin2  = new Kakunin08Q2();
        kakunin2.hiruNoAisatsu();

        Kakunin08Q2 kakunin3  = new Kakunin08Q2();
        kakunin3.yoruNoAisatsu();
    }
}
