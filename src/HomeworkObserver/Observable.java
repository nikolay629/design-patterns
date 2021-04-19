package HomeworkObserver;

public interface Observable {

    void rentCar(Observer car);
    void returnCar(Observer car);

    void notifyCars();

    String getUpdate();
}
