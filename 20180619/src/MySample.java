/**
 * @author Akira Shinohara
 * @since 2018.06.19
 */
public class MySample {
    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        OuterClass oc1 = new OuterClass(ic);
        OuterClass oc2 = new OuterClass(ic);

        oc1.setValue(100);
        oc2.setValue(200);
        oc1.printValue();
        oc2.printValue();
    }
}

class InnerClass {
    int value;
}

class OuterClass {
    private InnerClass ic;

    OuterClass(InnerClass ic) {
        this.ic = ic;
    }

    void setValue(int i) {
        ic.value = i;
    }

    void printValue() {
        System.out.println(ic.value);
    }
}