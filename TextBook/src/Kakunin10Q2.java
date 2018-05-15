/**
 * 教科書106p
 * 確認問題10 Q2
 */
public class Kakunin10Q2 {
    private int nibai(int suchi) {
        return suchi * 2;
    }


    private int sanbai(int suchi) {
        return suchi * 3;
    }


    public static void main(String[] args) {
        int debugInt = 1;
        int doubleInt;
        int tripleInt;


        Kakunin10Q2 kakunin = new Kakunin10Q2();
        doubleInt = kakunin.nibai(debugInt);
        tripleInt = kakunin.sanbai(debugInt);

        System.out.println("渡した数値[" + debugInt + "]の倍数は" + doubleInt);
        System.out.println("渡した数値[" + debugInt + "]の3倍の数は" + tripleInt);
    }
}
