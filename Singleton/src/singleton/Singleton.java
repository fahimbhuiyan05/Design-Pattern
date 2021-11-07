package singleton;

public class Singleton {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
