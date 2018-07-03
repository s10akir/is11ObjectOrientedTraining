import java.util.Arrays;

/**
 * @author Akira Shinohara
 * @since 2018.06.19
 */
public class Kakunin17Q1 {
    public static void main(String[] args) {
        int[] data = {10, 20, 23, 0, 21, 18, 8, 58, 34, 2};
        SelectionSort select = new SelectionSort();
        BubbleSort bubble = new BubbleSort();

        select.sort(data);
        select.disp();

        System.out.println();

        bubble.sort(data);
        bubble.disp();
    }
}


interface Narabikae {
    void sort(int[] data);
    void disp();
}


class SelectionSort implements Narabikae {
    private int[] data;


    @Override
    public void sort(int[] data) {
        // TODO: 選択ソートのアルゴリズム
        data = data.clone();

        for (int i = 0; i < data.length; i++ ) {
            int min = i;

            // 未整列要素内の最小データを探索
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }

            // 最小要素を前へ
            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }

        this.data = data;
    }


    @Override
    public void disp() {
        System.out.println("Selection sort:");

        Arrays.stream(data).forEach((datum) -> System.out.print(datum + "  "));
        System.out.println();
    }
}


class BubbleSort implements Narabikae {
    private int[] data;


    @Override
    public void sort(int[] data) {
        // TODO: バブルソートのアルゴリズム
        data = data.clone();

        for (int i = 0; i < (data.length - 1); i++) {
            for (int j = 0; j < (data.length - (i + 1)); j++) {
                if (data[j + 1] < data[j]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }

        this.data = data;
    }


    @Override
    public void disp() {
        System.out.println("Bubble sort:");

        Arrays.stream(data).forEach((datum) -> System.out.print(datum + "  "));
        System.out.println();
    }
}