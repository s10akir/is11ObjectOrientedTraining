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
    }

    @Override
    public void disp() {
        System.out.println("Selection sort:");

        Arrays.stream(data).forEach((datum) -> {
            System.out.print(datum + "  ");
        });
        System.out.println();
    }
}


class BubbleSort implements Narabikae {
    private int[] data;

    @Override
    public void sort(int[] data) {
        // TODO: バブルソートのアルゴリズム
    }

    @Override
    public void disp() {
        System.out.println("Bubble sort:");

        Arrays.stream(data).forEach((datum) -> System.out.print(datum + "  "));
        System.out.println();
    }
}