package util;

import model.Customer;

import static util.InputUtil.inputRequiredByte;

public class MenuUtil {
     public static byte EntryMenu(){
          System.out.println(
                  "[0]. System exit  \n"+
                  "[1].order car\n" +
                  "[2].show orders\n" +
                          "[3].add customer\n" +
                  "[4].add car  \n");
          return inputRequiredByte("" + "Enter the option");



     }

}
