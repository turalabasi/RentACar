package helper;

import model.Car;
import model.Customer;
import util.InputUtil;

import java.time.LocalDate;

public class CustomerHelper {
    static long carId = 0;
    static long customerId = 0;


    public static Car fillAddCar(){
        try {
            String brand = InputUtil.inputRequiredString("Enter the brand: ");
            String engine = InputUtil.inputRequiredString("Enter the engine: ");
            String production = InputUtil.inputRequiredString("Enter the production: ");
            String bodyType = InputUtil.inputRequiredString("Enter the bodyType: ");
            Integer seats = InputUtil.inputInteger("Enter the seats: ");
            Integer doors = InputUtil.inputInteger("Enter the doors: ");
            Integer speed = InputUtil.inputInteger("Enter the speed: ");
            Integer rentAmount = InputUtil.inputInteger("Enter the rentAmount: ");
            return new Car(++carId,brand,engine,production,bodyType,seats,doors,speed,rentAmount,0);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Customer filAddCustomer(Integer id){
        try {
            String name = InputUtil.inputRequiredString("Enter the name: ");
            String surname = InputUtil.inputRequiredString("Enter the surname: ");
            String birthday = InputUtil.inputRequiredString("Enter the birthday: ");
            String fin = InputUtil.inputRequiredString("Enter the fin: ");
            String passwordSerial = InputUtil.inputRequiredString("Enter the passwordSerial: ");
            return new Customer(++customerId,name,surname,birthday,fin,passwordSerial, id,0);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }
        return null;
    }
}