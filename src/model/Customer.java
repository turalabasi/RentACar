package model;

public class Customer {
    private long id;
   private String name;
    private String surname;
    private String birthday;
    private String fin;
    private String serialNumber;
    private Integer carId;
    private Integer status;


    public Customer(String name, String surname, String birthday, String fin, String serialNumber, Integer carId, Integer status) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.fin = fin;
        this.serialNumber = serialNumber;
        this.carId = carId;
        this.status = status;
    }

    public Customer(long id, String name, String surname, String birthday, String fin, String serialNumber, Integer carId, Integer status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.fin = fin;
        this.serialNumber = serialNumber;
        this.carId = carId;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", fin='" + fin + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", carId=" + carId +
                ", status=" + status +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
