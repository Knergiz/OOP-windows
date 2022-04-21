package abstraction.abstract_classes;

public interface BlueTooth {
    void connectBlueTooth();


    static int getYear(){
        return 2022;
    }


    default boolean isConnected(){
        return true;
    }


}
