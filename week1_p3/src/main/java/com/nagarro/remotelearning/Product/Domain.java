package com.nagarro.remotelearning.Product;
public class Domain {
    public String DomainName;
    public String OwnerDetails;
    public String Hosts;

    @Override
    public String toString(){
        return "DomainName: " + DomainName +"\nOwnerDetails: " + OwnerDetails + "\nHosts: " + Hosts;
    }
}
