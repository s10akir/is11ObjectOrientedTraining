/**
 * 教科書106p
 * 確認問題10 Q1
 */
public class Kakunin10Q1 {
    private int nibai(int suchi) {
        return suchi * 2;
    }

    public static void main(String[] args) {
        int debugInt = 1;
        int doubleInt;


        Kakunin10Q1 kakunin = new Kakunin10Q1();
        doubleInt = kakunin.nibai(debugInt);

        System.out.println("渡した数値[" + debugInt + "]の倍数は" + doubleInt);
    }
}
