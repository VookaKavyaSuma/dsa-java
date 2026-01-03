import mypack.FlrstClass;
import mypack.subpack.SubPack;

public class TestPackage {
    public static void main(String[] args) {
        FlrstClass pack = new FlrstClass();
        pack.display();
        SubPack sp = new SubPack();
        sp.display();
    }
}
