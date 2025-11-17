package data.models;

public class Owner {
    public String ownerName;
    public String address;
    public String phone;
    public String gender;
    public String email;
    public String id;

//    public Owner(String name, String address, String phone, String gender, String email, String id) {
//        this.ownerName = name;
//        this.address = address;
//        this.phone = phone;
//        this.gender = gender;
//        this.email = email;
//        this.id = id;
//    }
    public String getName() {
        return ownerName;
    }

    public void setName(String name) {
        this.ownerName = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
