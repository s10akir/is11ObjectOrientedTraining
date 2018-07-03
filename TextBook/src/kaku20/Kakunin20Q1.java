package kaku20;

/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class Kakunin20Q1 {
    public static void main(String[] args) {
        Syumi syumi = new Syumi("この教科書の粗探し");
        Namae namae = new Namae("もじゃ");

        namae.namaeHyouji();
        syumi.syumiHyouji();
    }
}


class Syumi {
    private String hobby;


    Syumi(String hobby) {
        this.hobby = hobby;
    }


    void syumiHyouji() {
        System.out.println("趣味は" + hobby + "です。");
    }
}


class Namae {
    private String name;


    Namae(String name) {
        this.name = name;
    }


    void namaeHyouji() {
        System.out.println("名前は" + name + "です。");
    }
}