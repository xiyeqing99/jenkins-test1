package other;

/**
 * Created by xiyeqing on 2017-二月-27.
 */
public class TestNG {
    public String sayHello() {
        return "Hallo Welt!";
    }
    public static void main(String [] args) {
        TestNG objOfMain = new TestNG();
        System.out.println(objOfMain.sayHello());
    }
}
