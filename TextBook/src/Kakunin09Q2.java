/**
 * 教科書100p
 * 確認問題09 Q2
 */
public class Kakunin09Q2 {
    public static void main(String[] args) {
        Gohan2 gohan1 = new Gohan2();
        gohan1.asaGohan();

        Gohan2 gohan2 = new Gohan2();
        gohan2.hiruGohan();

        Gohan2 gohan3 = new Gohan2();
        gohan3.yoruGohan();
    }
}


class Gohan2 {
    void asaGohan() {
        System.out.println("目玉焼きとみそ汁です。");
    }


    void hiruGohan() {
        System.out.println("とんかつ定食です。");
    }


    void yoruGohan() {
        System.out.println("焼肉食べ放題です。");
    }
}