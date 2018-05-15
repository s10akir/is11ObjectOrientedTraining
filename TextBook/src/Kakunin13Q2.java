/**
 * 教科書126p
 * 確認問題13 Q2
 */
public class Kakunin13Q2 {
    public static void main(String[] args) {
        Keisan keisan = new Keisan();
        int debugFirstInt = 2;
        int debugSecondInt = 3;
        int debugThirdInt = 4;
        int tmp;


        tmp = keisan.enzan(debugFirstInt);
        System.out.println("数値を1つ[" + debugFirstInt + "]渡した結果\t: " + tmp);

        tmp = keisan.enzan(debugFirstInt, debugSecondInt);
        System.out.println("数値を2つ[" + debugFirstInt + "," + debugSecondInt + "]渡した結果\t: " + tmp);

        tmp = keisan.enzan(debugFirstInt, debugSecondInt, debugThirdInt);
        System.out.println("数値を3つ[" + debugFirstInt + "," + debugSecondInt + "," + debugThirdInt + "]渡した結果\t: " + tmp);
    }
}


class Keisan {
    int enzan(int su1) {
        return su1 * su1;
    }


    int enzan(int su1, int su2) {
        return su1 - su2;
    }


    int enzan(int su1, int su2, int su3) {
        return su1 + su2 + su3;
    }
}