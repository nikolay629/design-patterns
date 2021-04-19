package HomeworkObserver;

public class Car implements Observer{

    private String car;
    private Observable customer;

    public Car(String car) {
        this.car = car;
    }

    @Override
    public void update() {

        if(this.customer == null){
            System.out.println(this.getCar() + " is in stock!");
        }
        String newCustomer = this.customer.getUpdate();
        System.out.println(this.getCar() + " is get from: " + newCustomer);
    }

    @Override
    public void setCustomer(Observable customer) {
        this.customer = customer;
    }

    private String getCar() {
        return this.car;
    }

}
