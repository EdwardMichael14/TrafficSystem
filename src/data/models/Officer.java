package data.models;

public class Officer {
    private String name;
    private int id;
    private String rank;
    private String email;

//    public Officer(String name, String id, String rank) {
//        this.name = name;
//        this.id = id;
//        this.rank = rank;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
