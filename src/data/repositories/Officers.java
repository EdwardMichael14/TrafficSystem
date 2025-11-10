package data.repositories;

public class Officers implements OfficerRepository{
    public String name;
    public String id;
    public String rank;

    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void id(String id) {
        this.id = id;
    }

    @Override
    public void rank(String rank) {
        this.rank = rank;
    }
}
