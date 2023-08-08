public class Observable{
    private Observable(){}
    private static Observable instance;
    public static Observable getInstance(){
        if(instance == null){
            instance = new Observable();
        }
        return instance;
    }
    static Observer observerArray [] = new Observer[0];
    private void extendArrays(){
        Observer [] tempObserverArray = new Observer[observerArray.length+1];
        for(int i = 0; i < observerArray.length; i++){
            tempObserverArray[i] = observerArray[i];
        }
        observerArray = tempObserverArray;
    }
    public static void getMessage(String message) {
        notifyMessage(message);
    }

    public static void notifyMessage(String message) {
        for(int i = 0; i < observerArray.length; i++){
            observerArray[2].setMessage(message);
        }
    }
    public void setOb(Observer observer){
        extendArrays();
        observerArray [observerArray.length-1] = observer;
    }
}
