package data.repositories;

import data.models.Officer;
import data.models.Vehicle;

import java.util.List;

public interface OfficerRepository {


    Officer save(Officer officer);
    Officer findById(int id);
    List<Officer> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Officer officer);
    long count();
    Officer findByEmail(String email);


//    void name(String name);
//    void id(String id);
//    void rank(String rank);
}
