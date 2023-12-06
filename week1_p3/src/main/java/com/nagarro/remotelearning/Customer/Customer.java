package com.nagarro.remotelearning.Customer;

import com.nagarro.remotelearning.Product.Domain;
import com.nagarro.remotelearning.Seller.Reseller;

public class Customer {
    private Domain domain;
    private Reseller reseller;

    public Customer(Reseller reseller) {
        this.reseller = reseller;
    }

    public Domain getDomain()
    {
        return domain;
    }

    public void buyDomain(String domainName, String ownerDetails, String hosts) {
        System.out.println("Customer call reseller for buying domain");
        domain = reseller.contactRegistrarToBuyDomain(domainName, ownerDetails, hosts);
        System.out.println(domain);
    }
}