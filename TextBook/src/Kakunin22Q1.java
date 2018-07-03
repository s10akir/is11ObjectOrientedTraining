/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class Kakunin22Q1 {
    public static void main(String[] args) {
        Syain1 white = new Syain1(1, "初代", "キュアホワイト", 120000);

        System.out.println("社員番号\t" + white.syainBangou);
        System.out.println("部署\t" + white.busyo);
        System.out.println("名前\t" + white.namae);
        System.out.println("基本給\t" + white.kihonkyu);
    }
}


class Syain1 {
    public int syainBangou;
    public String busyo;
    public String namae;
    public int kihonkyu;


    Syain1(int syainBangou, String busyo, String namae, int kihonkyu) {
        this.syainBangou = syainBangou;
        this. busyo = busyo;
        this.namae = namae;
        this.kihonkyu = kihonkyu;
    }
}