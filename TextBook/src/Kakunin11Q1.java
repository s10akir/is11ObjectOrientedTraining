/**
 * 教科書113p
 * 確認問題11 Q1
 */
public class Kakunin11Q1 {
    public static void main(String[] args) {
        KeisanNormal keisanNormal = new KeisanNormal();
        int debugFirstInt = 1;
        int debugSecondInt = 2;
        int tmp;


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


class KeisanStatic {
    static int tashisan(int su1, int su2) {
        return su1 + su2;
    }


    static int hikisan(int su1, int su2) {
        return su1 - su2;
    }
}


class KeisanNormal {
    int tashisan(int su1, int su2) {
        return su1 + su2;
    }


    int hikisan(int su1, int su2) {
        return su1 - su2;
    }
}