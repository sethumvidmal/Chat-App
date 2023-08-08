public class Main{
    public static void main(String[] args) {
        Observable observable =Observable.getInstance();
        observable.setOb(new Window("Sender 1"));
        observable.setOb(new Window("Sender 2"));
        observable.setOb(new Window("Sender 3"));
    }
}