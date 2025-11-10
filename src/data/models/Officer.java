package data.models;

public class Officer {
    public String name;
    public String id;
    public String rank;

    public Officer(String name, String id, String rank) {
        this.name = name;
        this.id = id;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
