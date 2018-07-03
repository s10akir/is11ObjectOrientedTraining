/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class Kakunin19Q1 {
    public static void main(String[] args) {
        int total = 0;
        Fruit f1;
        Fruit f2;
        Fruit f3;

        f1 = new Fruit("りんご", 100);
        f2 = new Fruit("みかん", 50);
        f3 = new Fruit("ぶどう", 200);

        total += f1.buy(3);
        total += f2.buy(6);
        total += f3.buy(2);

        System.out.println("合計は" + total + "円です。");
    }
}


class Fruit {
    private String name;  // わざわざメンバ変数にしておく理由がない…
    private int price;


    Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }


    int buy(int cnt) {
        return price * cnt;
    }
}
