package entities;

import jakarta.persistence.*;

@Entity @Table(name = "phones")
public class Phones extends BaseEntity{
    private String phoneNumber;
    private boolean blocked;
    private boolean free;

    private String communication_type;
    public Phones(Long id, String phoneNumber, boolean blocked, boolean free, String communication_type) {
        this.phoneNumber = phoneNumber;
        this.blocked = blocked;
        this.free = free;
        this.communication_type = communication_type;
    }

    public Phones() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getConnection_type() {
        return communication_type;
    }

    public void setConnection_type(String connection_type) {
        this.communication_type = connection_type;
    }
}
