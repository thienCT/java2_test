package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name + "t" + phone;
    }

    public class CRM {
        public static void main(String[] args) {
            Map<String, Customer> customerMap = new HashMap<>();

            Customer customer1 = new Customer("Pham Anh Doi", "email2@expamle.com",
                    "0904818238");
            customerMap.put(customer1.getName(),customer1);
            Customer customer2 = new Customer("Dang Kim Thi","eamil2@exmaple.com",
                    "0904949494");
            customerMap.put(customer2.getName(),customer2);
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("CRM Menu: ");
                System.out.println("1. Add new Customer");
                System.out.println("2. Find by name");
                System.out.println("3. Display all");
                System.out.println("4. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Customer Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter Customer Email: ");
                        String email = scanner.nextLine();
                        System.out.println("Enter Customer Phone: ");
                        String phone = scanner.nextLine();
                        Customer customer = new Customer(name, email, phone);
                        customerMap.put(name, customer);
                        break;
                    case 2:
                        System.out.println("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        Customer foundCustomer = customerMap.get(searchName);

                        if (foundCustomer != null) {
                            System.out.println("Customer Name: ");
                            System.out.println("Name: " + foundCustomer.getName());
                            System.out.println("Email: " + foundCustomer.getEmail());
                            System.out.println("Phone: " + foundCustomer.getPhone());
                        } else {
                            System.out.println("Customer not found: ");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting CRM ");
                        break;
                    default:
                        System.out.println("invalid choice. Please try again. ");
                }
                System.out.println();
            }
                while (choice != 4) ;
                scanner.close();
            }
        }
    }
