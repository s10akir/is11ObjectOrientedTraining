/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class Kakunin18Q1 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Kestrel kestrel = new Kestrel();
        Merlin merlin = new Merlin();

        dictionary.showBirdFeature(kestrel);
        dictionary.showBirdFeature(merlin);
    }
}


class BirdFeature {
    void showName() {
        System.out.println("鳥の名前を表示します。");
    }


    void about() {
        System.out.println("特徴や習性を表示します。");
    }
}


class Kestrel extends BirdFeature {
    @Override
    void showName() {
        System.out.println("タカ目ハヤブサ科チョウゲンボウ");
    }


    @Override
    void about() {
        System.out.println( "素早く羽ばたいてホバリングを行った後、急降下して獲物を捕らえる。");
    }
}


class Merlin extends BirdFeature {
    @Override
    void showName() {
        System.out.println("タカ目ハヤブサ科コチョウゲンボウ");
    }


    @Override
    void about() {
        System.out.println( "日本でも田園などで見ることができる冬鳥。\nハトくらいの大きさ。");
    }
}


class Dictionary {
    void showBirdFeature(BirdFeature birdFeature) {
        birdFeature.showName();
        birdFeature.about();
    }
}