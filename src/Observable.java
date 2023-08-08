public class Observable{
    private Observable(){}
    private static Observable instance;
    public static Observable getInstance(){
        if(instance == null){
            instance = new Observable();
        }
        return instance;
    }
     Observer [] observerArray  = new Observer[0];
    private void extendArrays(){
        Observer [] tempObserverArray = new Observer[observerArray.length+1];
        for(int i = 0; i < observerArray.length; i++){
            tempObserverArray[i] = observerArray[i];
        }
        observerArray = tempObserverArray;
    }
    public  void getMessage(String senderName,String message) {
        notifyMessage(senderName, message);
    }
    public  void notifyMessage(String senderName, String message) {
        for(int i = 0; i < observerArray.length; i++){
            observerArray[i].setMessage(senderName, message);
        }
    }
    public void setOb(Observer observer){
        extendArrays();
        observerArray [observerArray.length-1] = observer;
    }
}