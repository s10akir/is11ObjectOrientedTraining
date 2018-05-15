/**
 * 教科書118p
 * 確認問題12 Q1
 */
public class Kakunin12Q1 {
    public static void main(String[] args) {
        HensuCheck hc1 = new HensuCheck();
        HensuCheck hc2 = new HensuCheck();


        for (int i = 0; i < 50; i++) {
            hc1.plus();
            hc2.minus();
        }

        System.out.println("プラス側のクラス変数\t: " + hc1.classHensu);  // static member accessed via instance reference.
        System.out.println("プラス側のインスタンス変数\t: " + hc1.instanceHensu);
        System.out.println("マイナス側のクラス変数\t: " + hc2.classHensu);  // static member accessed via instance reference.
        System.out.println("マイナス側のインスタンス変数\t: " + hc2.instanceHensu);

    }
}


class HensuCheck {
    public static int classHensu = 0;  // access can be package-private
    public int instanceHensu = 0;  // access can be package-private

    void plus() {
        classHensu++;
        instanceHensu++;
    }


    void minus() {
        classHensu--;
        instanceHensu--;
    }
}