/**
 * 【Javaバイブルシリーズのここがダメ】
 * - スズメは"Suzume"なのにペンギンは"Pengin"ではなく"Penguin"
 * - 移動手段は"idou"なのに食性は"eat"
 * - そもそも出力するStringを丸々オーバライドするのがアホっぽい
 *
 * @author Akira Shinohara
 * @since 2018.06.12
 */
public class Kakunin15Q1 {
    public static void main(String[] args) {
        Suzume sparrow = new Suzume();
        Penguin penguin = new Penguin();

        System.out.println("スズメは");
        sparrow.idou();
        sparrow.eat();

        System.out.println("ペンギンは");
        penguin.idou();
        penguin.eat();
    }
}


class Bird {
    void idou() {
        System.out.println("飛んで移動します。");
    }

    void eat() {
        System.out.println("餌を食べます。");
    }
}


class Suzume extends Bird {
    @Override
    void eat() {
        System.out.println("昆虫などを食べます。");
    }
}


class Penguin extends Bird {
    @Override
    void idou() {
        System.out.println("泳いで移動します。");
    }


    @Override
    void eat() {
        System.out.println("魚を食べます。");
    }
}