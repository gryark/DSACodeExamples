package OOP;

import java.util.Date;

public class Employee {
    private String name;
    private Date birthDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date bitrhDate) {
        this.birthDate = bitrhDate;
    }
}