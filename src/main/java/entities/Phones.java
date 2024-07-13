package entities;

import jakarta.persistence.*;

@Entity @Table(name = "phones")
public class Phones extends BaseEntity{
    private String phone_number;
    private boolean blocked;
    private boolean free;

    private String communication_type;
    public Phones(Long id, String phone_number, boolean blocked, boolean free, String communication_type) {
        this.phone_number = phone_number;
        this.blocked = blocked;
        this.free = free;
        this.communication_type = communication_type;
    }

    public Phones() {

    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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
