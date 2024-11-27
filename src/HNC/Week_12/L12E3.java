package Week_12;

public class L12E3 {
    public static void displayCar(car thisCar){
        System.out.format("%s %s %d %d %s %d %s %d",thisCar.make,thisCar.model,thisCar.year,thisCar.vin,thisCar.colour,thisCar.mileage,thisCar.condition,thisCar.price);
    }
    public static void main(String[] args) {
        // create student object and display
        car car1 = new car();
        displayCar(car1);

        // update values of student object and display

       car1.make = "Lambo";
       car1.model = "Urus";
       car1.year = 2023;
       car1.vin = 763476;
       car1.colour = "yellow";
       car1.mileage = 122323;
       car1.condition = "Good";
       car1.price = 300020203;

       displayCar(car1);

    }
}
