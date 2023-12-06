package com.nagarro.remotelearning.Seller;

import com.nagarro.remotelearning.Product.Domain;

public class Registrar {
    private final Registry registry;

    public Registrar(Registry registry) {
        this.registry = registry;}

    public Domain talkToTheRegistryToCreateDomain(String domainName, String ownerDetails, String hosts) {
        System.out.println("Registrar talk to the registry for create domain");
        return registry.createDomain(domainName, ownerDetails, hosts);
    }
}