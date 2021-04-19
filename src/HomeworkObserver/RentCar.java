package HomeworkObserver;

public class RentCar{
    public static void main(String[] args) {

        Customer customer = new Customer();
        Car car1 = new Car("Audi A5");
        Car car2 = new Car("Audi A4");

        customer.rentCar(car1);
        customer.rentCar(car2);


        customer.setCustomer("Nikolay");
        customer.setCustomer("Dzhan");




    }

}
