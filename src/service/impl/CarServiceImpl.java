package service.impl;

import data.GlobalData;
import helper.CustomerHelper;
import model.Car;
import model.Customer;
import service.CarService;
import util.InputUtil;

import java.util.List;

import static data.GlobalData.cars;
import static data.GlobalData.customers;


public class CarServiceImpl implements CarService {
    static long id = 0;
    static int customerCount=0;

    @Override
    public void orderCar() {

        List<Car> newCars = cars;
        List<Customer> newCustomers = GlobalData.customers;

        System.out.println(newCars);

            byte id = InputUtil.inputRequiredByte("enter car id : ");

           for (int i = 0; i < newCars.size(); i++) {
                if (id == newCars.get(i).getId()) {
                    System.out.println("Customer form");
                    CustomerHelper.filAddCustomer((int) customers.get(i).getId());
                    newCustomers.get(i).setCarId((int) id);
                    newCars.get(i).setStatus(1);
                    newCustomers.get(i).setStatus(1);




                }
            }
        }

        @Override
        public void addCar() {
                    List<Car> newCars = cars;
                    newCars.add(CustomerHelper.fillAddCar());

        }

    }

