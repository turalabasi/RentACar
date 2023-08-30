package service.impl;

import data.GlobalData;
import helper.CustomerHelper;
import model.Car;
import model.Customer;
import service.CustomerService;

import java.util.List;

import static data.GlobalData.cars;
import static data.GlobalData.customers;
import static service.impl.CarServiceImpl.id;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void showOrders() {
        List<Customer> newCustomers = GlobalData.customers;
        for (int i = 0; i < newCustomers.size(); i++) {
            if (newCustomers.get(i).getStatus() == 1){
                System.out.println(newCustomers.get(i));

        }

        }

    }

    @Override
    public void addCustomers() {
        List<Customer> newCustomers = customers;
        newCustomers.add(CustomerHelper.filAddCustomer((int) id));
    }


}
