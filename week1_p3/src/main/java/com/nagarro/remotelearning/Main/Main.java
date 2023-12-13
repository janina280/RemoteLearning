package com.nagarro.remotelearning.Main;

import com.nagarro.remotelearning.Customer.Customer;
import com.nagarro.remotelearning.Seller.Registrar;
import com.nagarro.remotelearning.Seller.Registry;
import com.nagarro.remotelearning.Seller.Reseller;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Registrar registrar = new Registrar(registry);
        Reseller reseller = new Reseller(registrar);
        Customer customer = new Customer(reseller);

        customer.buyDomain("myDomain","rich","host.ro");

        System.out.println("The domain:\n" + customer.getDomain().toString());
    }
}