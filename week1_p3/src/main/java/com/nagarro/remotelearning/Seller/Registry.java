package com.nagarro.remotelearning.Seller;

import com.nagarro.remotelearning.Product.Domain;

public class Registry {
    public Domain createDomain(String domainName, String ownerDetails, String hosts)
    {
        var domain = new Domain();
        domain.DomainName = domainName;
        domain.Hosts = hosts;
        domain.OwnerDetails = ownerDetails;
        return domain;
    }
}
