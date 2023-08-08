// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        Observable observable = Observable.getInstance();

        observable.setOb(new Window("Sender 1"));
        observable.setOb(new Window("Sender 2"));
        observable.setOb(new Window("Sender 3"));
    }
}