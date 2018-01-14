package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
       /* Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        };
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName() {
                return "Ukraine";
            }
        };
        RowItem rowItem = new DataAdapter(customer,contact);
        System.out.println(rowItem.getContactFirstName());
        System.out.println(rowItem.getContactLastName());
        System.out.println(rowItem.getCountryCode());
        System.out.println(rowItem.getCompany());
        System.out.println(rowItem.getDialString());*/
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, String> pair = iterator.next();
                if (pair.getValue().equals(customer.getCountryName())){
                    return pair.getKey();
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String fullName = contact.getName();
            String firstName = fullName.substring(fullName.indexOf(',') + 2);
            return firstName;
        }

        @Override
        public String getContactLastName() {
            String fullName = contact.getName();
            String lastName = fullName.substring(0, fullName.indexOf(','));
            return lastName;
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber();
            String result = "callto://" + phoneNumber.replaceAll("[-()]", "");
            /*String resultNumber = phoneNumber.substring(0,3) + phoneNumber.substring(4,7) +
                    phoneNumber.substring(8,11) + phoneNumber.substring(12,14) + phoneNumber.substring(15);*/
            //return "callto://" + resultNumber;
            return result;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}