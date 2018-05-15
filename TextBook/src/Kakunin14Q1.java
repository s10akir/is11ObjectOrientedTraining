/**
 * 教科書135p
 * 確認問題14 Q1
 */
public class Kakunin14Q1 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        PatrolCar patCar = new PatrolCar();


        bus.noseru(1);
        bus.drive(2);
        bus.ororsu(3);
        patCar.siren();
        patCar.drive(4);
    }
}


class Car {
    void drive(int suchi) {
        System.out.println(suchi + "Km走りました");
    }
}


class Bus extends Car {
    void noseru(int su) {
        System.out.println("乗客を" + su + "人乗せました");
    }


    void ororsu(int su) {
        System.out.println("乗客を" + su + "人降ろしました");
    }
}


class PatrolCar extends Car {
    void siren() {
        System.out.println("サイレンを鳴らしました");
    }
}