package HomeworkObserver;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observable{

    private List<Observer> cars;
    private String customerName;

    public Customer(){
        this.cars = new ArrayList<>();
    }

    @Override
    public void rentCar(Observer car) {
        this.cars.add(car);
        car.setCustomer(this);
    }

    @Override
    public void returnCar(Observer car) {
        this.cars.remove(car);
    }

    @Override
    public void notifyCars() {
        for(Observer car : this.cars){
            car.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.customerName;
    }

    public void setCustomer(String customerName){
        this.customerName = customerName;
        this.notifyCars();
    }
}
