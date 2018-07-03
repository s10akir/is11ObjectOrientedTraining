package syokai;

/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class Kakunin20Q2 {
    public static void main(String[] args) {
        Syumi syumi = new Syumi("この教科書の粗探し");
        Namae namae = new Namae("もじゃ");

        namae.namaeHyouji();
        syumi.syumiHyouji();
    }
}