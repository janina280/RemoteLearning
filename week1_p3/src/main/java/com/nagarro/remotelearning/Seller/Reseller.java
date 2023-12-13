package com.nagarro.remotelearning.Seller;

import com.nagarro.remotelearning.Product.Domain;

public class Reseller {
    private final Registrar registrar;
    public Reseller(Registrar registrar) {
        this.registrar = registrar;
    }

    public Domain contactRegistrarToBuyDomain(String domainName, String ownerDetails, String hosts) {
        System.out.println("Reseller call registrar for deal to the registry");
        return registrar.createDomain(domainName, ownerDetails, hosts);
    }
}