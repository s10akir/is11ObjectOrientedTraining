import java.io.IOException;

/**
 * 教科書106p
 * 確認問題10 Q2
 */
public class Kakunin10Q3 {
    private int nibai(int suchi) {
        return suchi * 2;
    }


    private int sanbai(int suchi) {
        return suchi * 3;
    }


    public static void main(String[] args) {
        int debugInt = 0;
        int doubleInt;
        int tripleInt;


        // コマンドライン引数の処理
        try {
            debugInt = Integer.parseInt(args[0]);
        } catch (IndexOutOfBoundsException | NumberFormatException err) {
            String errorMessage;
            if(err instanceof IndexOutOfBoundsException) {
                errorMessage = "should given 1 argument.";
            } else {
                errorMessage = args[0] + " is not integer.";
            }

            System.err.println(errorMessage);
            System.exit(1);
        }



        Kakunin10Q3 kakunin = new Kakunin10Q3();
        doubleInt = kakunin.nibai(debugInt);
        tripleInt = kakunin.sanbai(debugInt);

        System.out.println("渡した数値[" + debugInt + "]の倍数は" + doubleInt);
        System.out.println("渡した数値[" + debugInt + "]の3倍の数は" + tripleInt);
    }
}
