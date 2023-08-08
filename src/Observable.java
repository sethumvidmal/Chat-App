public class Observable{
    private Observable(){}
    private static Observable instance;
    public static Observable getInstance(){
        if(instance == null){
            instance = new Observable();
        }
        return instance;
    }
    Observer observerArray [] = new Observer[0];
    private void extendArrays(){
        Observer [] tempObserverArray = new Observer[observerArray.length+1];
        for(int i = 0; i < observerArray.length; i++){
            tempObserverArray[i] = observerArray[i];
        }
        observerArray = tempObserverArray;
    }
    public static void getMessage(String message) {

        notifyMessage();
    }

    public static void notifyMessage() {
    }
    public void setOb(Observer observer){
        extendArrays();
        observerArray [observerArray.length-1] = observer;
    }
}
