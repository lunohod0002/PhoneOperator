package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity @Table(name = "subscriber")
public class Subscriber  extends BaseEntity{
    private String fio;
    private int age;
    private int debt;
    private boolean beneficiary;
    private int bonus_number;
    private Set<Services> services_number;

    public Subscriber(String fio, int age, int debt, boolean beneficiary, int bonus_number, Set<Services> services_number) {
        this.fio = fio;
        this.age = age;
        this.debt = debt;
        this.beneficiary = beneficiary;
        this.bonus_number = bonus_number;
        this.services_number = services_number;
    }

    public Subscriber() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public boolean isBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        this.beneficiary = beneficiary;
    }

    public int getBonus_number() {
        return bonus_number;
    }

    public void setBonus_number(int bonus_number) {
        this.bonus_number = bonus_number;
    }
    @ManyToMany(mappedBy = "service_contract",targetEntity = Services.class)

    public Set<Services> getServices_number() {
        return services_number;
    }

    public void setServices_number(Set<Services> services_number) {
        this.services_number = services_number;
    }
}
