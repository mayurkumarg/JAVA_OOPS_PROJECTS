
import java.util.ArrayList;


interface RentalService
{
    public boolean checkAvailability();
    public void rent();
    public void returnCar();
    public double  calculateRentalCost(int days,int distance);
}

class Car implements RentalService
{
    String make,model;
    int year, dailyRate;
    boolean isAvailable;

    public Car(String make,String model,int year,int dailyRate)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.dailyRate=dailyRate;
        isAvailable=true;
    }

    public void displayDetails()
    {
        System.out.println(make+"\n"+model+"\n"+year+"\n"+dailyRate+"\n"+isAvailable);
    }

    public boolean checkAvailability()
    {
        return isAvailable;
    }

    public void rent()
    {
        if(isAvailable)
        {
            isAvailable=false;
        }
    }

    public void returnCar()
    {
            isAvailable=true;
    }

    public double  calculateRentalCost(int days,int distance)
    {
        return (days * dailyRate) + (0.2 * distance);
    }

    public Car compareRates(Car other)
    {
        return this.dailyRate>other.dailyRate? this:other;
    }

    public String getMake(){ return make;}

}

class CarRentalService
{
    ArrayList<Car> cars;

    public CarRentalService() {

        this.cars=new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public Car findCar(String make)
    {
        for(Car car:cars)
        {
            if(car.getMake().equalsIgnoreCase(make))
        {
            return car;
        }
        }
        return null;
    }

    public void displayAvailableCars()
    {
        for(Car car:cars)
        {
            if(car.isAvailable)
            {
                car.displayDetails();
            }
        }
    }
    
}





public class CarRentalApplication {
    public static void main(String[] args) {

        CarRentalService rentalService=new CarRentalService();

        Car car1=new Car("Bugatti", "Fantam", 2005, 20);
        Car car2=new Car("Honda", "Civic", 2021, 45);
        Car car3=new Car("Ford", "Focus", 2023, 55);

      

        rentalService.addCar(car1);
        rentalService.addCar(car2);
        rentalService.addCar(car3);

        System.out.println("Available cars before renting:");
        rentalService.displayAvailableCars();

        car1.rent();
        System.out.println("\nAvailable cars after renting Toyota Camry:");
        rentalService.displayAvailableCars();

        car1.returnCar();
        System.out.println("\nAvailable cars after returning Toyota Camry:");
        rentalService.displayAvailableCars();

        Car cheaperCar = car1.compareRates(car2);
        System.out.println("\nCheaper car between Toyota Camry and Honda Civic:");
        cheaperCar.displayDetails();

        double cost = car2.calculateRentalCost(5, 100);
        System.out.println("\nRental cost for Honda Civic for 5 days and 100 miles: $" + cost);
        
    }
}
