/**
 * 教科書119p
 * 確認問題12 Q2
 */
public class Kakunin12Q2 {
    private int[] bunpu = new int[10];

    private void ransu() {
        for (int i = 0; i < 10; i++) {
            int ret = (int) (Math.random() * 10);
            bunpu[ret]++;
        }
    }


    public static void main(String[] args) {
        Kakunin12Q2 kakunin1 = new Kakunin12Q2();
        Kakunin12Q2 kakunin2 = new Kakunin12Q2();


        kakunin1.ransu();
        kakunin2.ransu();

        for (int i = 0; i < 10; i++) {
            int sum = kakunin1.bunpu[i] + kakunin2.bunpu[i];
            System.out.println("[" + i + "]が出た回数: " + sum);
        }
    }
}
