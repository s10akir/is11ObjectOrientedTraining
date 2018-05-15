/**
 * 教科書125p
 * 確認問題13 Q1
 */
public class Kakunin13Q1 {
    public static void main(String[] args) {
        GamePlayer gp = new GamePlayer();


        gp.play("格闘ゲーム");
        gp.play("カンフー映画", 2);
    }
}


class GamePlayer {
    void play(String name) {
        System.out.println(name + "で遊びました");
    }


    void play(String name, int jikan) {
        System.out.println(name + "を" + jikan + "時間鑑賞しました");
    }
}