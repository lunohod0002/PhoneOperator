package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;
@Entity @Table(name = "services")
public class Services extends BaseEntity {
    private String name;
    private int price;
    private String description;
    Set<ServiceContract> serviceContractSet;

    public Services(String name, int price, String description, Set<ServiceContract> serviceContractSet) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.serviceContractSet = serviceContractSet;
    }

    public Services() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(mappedBy = "service_contract")

    public Set<ServiceContract> getServiceContractSet() {
        return serviceContractSet;
    }

    public void setServiceContractSet(Set<ServiceContract> serviceContractSet) {
        this.serviceContractSet = serviceContractSet;
    }
}
