/**
 * 教科書114p
 * 確認問題11 Q2
 */
public class Kakunin11Q2 {
    public static void main(String[] args) {
        KeisanNormal keisanNormal = new KeisanNormal();
        int debugFirstInt = 0;
        int debugSecondInt = 0;
        int tmp;


        // コマンドライン引数の処理
        try {
            debugFirstInt = Integer.parseInt(args[0]);
            debugSecondInt = Integer.parseInt(args[1]);
        } catch (IndexOutOfBoundsException | NumberFormatException err) {
            String errorMessage;
            if(err instanceof IndexOutOfBoundsException) {
                errorMessage = "should given 2 argument.";
            } else {
                errorMessage = "args is not integer.";
            }

            System.err.println(errorMessage);
            System.exit(1);
        }


        tmp = keisanNormal.tashisan(debugFirstInt, debugSecondInt);
        System.out.println("Normalの加算結果" + tmp);

        tmp = KeisanStatic.tashisan(debugFirstInt, debugSecondInt);
        System.out.println("Staticの加算結果" + tmp);

        tmp = keisanNormal.hikisan(debugFirstInt, debugSecondInt);
        System.out.println("Normalの減算結果" + tmp);

        tmp = KeisanStatic.hikisan(debugFirstInt, debugSecondInt);
        System.out.println("Staticの減算結果" + tmp);
    }
}


// クラスがパッケージ内で重複してエラー起こすので隔離
//class KeisanStatic {
//    static int tashisan(int su1, int su2) {
//        return su1 + su2;
//    }
//
//
//    static int hikisan(int su1, int su2) {
//        return su1 - su2;
//    }
//}
//
//
//class KeisanNormal {
//    int tashisan(int su1, int su2) {
//        return su1 + su2;
//    }
//
//
//    int hikisan(int su1, int su2) {
//        return su1 - su2;
//    }
//}