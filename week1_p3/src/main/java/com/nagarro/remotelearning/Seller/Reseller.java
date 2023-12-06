package com.nagarro.remotelearning.Seller;

import com.nagarro.remotelearning.Product.Domain;

public class Reseller {
    private final Registrar registrar;
    private final Trigger trigger;

    public Reseller(Registrar registrar, Trigger trigger) {
        this.registrar = registrar;
        this.trigger = trigger;
    }

    public Domain contactRegistrarToBuyDomain(String domainName, String ownerDetails, String hosts) {
        System.out.println("Reseller call registrar for deal to the registry");
        //call trigger
        return registrar.talkToTheRegistryToCreateDomain(domainName, ownerDetails, hosts);
    }
}