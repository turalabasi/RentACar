package service.impl;

import exception.EmptyListException;
import exception.InvalidException;
import exception.InvalidOptionExceptions;
import service.CustomerService;
import service.RentManagementService;
import service.CarService;
import util.MenuUtil;

import java.util.InputMismatchException;

public class RentManagementServiceImpl implements RentManagementService {
    @Override
    public void management() {
        while (true){ try{
            byte option = MenuUtil.EntryMenu();
            CarService carService = new CarServiceImpl() ;
            CustomerService customerService = new CustomerServiceImpl();

            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    carService.orderCar();
                    break;
                case 2:
                    customerService.showOrders();
                    break;
                case 3:
                    customerService.addCustomers();
                    break;
                case 4:
                    carService.addCar();
                    break;


                default:
                    System.out.println("null");

            }
        }catch (InvalidOptionExceptions | InvalidException | EmptyListException
                | NumberFormatException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
        }}}


