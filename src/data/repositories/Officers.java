package data.repositories;

import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Officers implements OfficerRepository{
    private static List<Officer> registeredOfficers = new ArrayList<>();
    public int generateId;
    public static int count;

    @Override
    public Officer save(Officer officer) {
        if (officer.getId() == 0) {
            officer.setId(generateId());
            registeredOfficers.add(officer);
            count++;
        }
        else{
            for (Officer officer2 : registeredOfficers) {
                if (officer.getId() == officer2.getId()) {
                    officer2 = officer;
                    break;
                }
            }

        }

        return officer;
    }

    private int generateId() {
        generateId++;
        return generateId;
    }

    @Override
    public Officer findById(int id) {
        for (Officer officer : registeredOfficers) {
            if(officer.getId() == id) {
                return officer;

            }

        }
        throw new IllegalArgumentException("Officer with id " + id + " not found");
    }

    @Override
    public List<Officer> findAll() {
        return registeredOfficers;
    }

    @Override
    public void deleteById(int id) {
        for (Officer officer : registeredOfficers) {
            if (officer == registeredOfficers.get(id)) {
                registeredOfficers.remove(officer);
                break;
            }
        }
        count --;

    }


    @Override
    public void deleteAll() {
        registeredOfficers.clear();
        count = 0;
    }

    @Override
    public void delete(Officer officer) {
        for (Officer officer1 : registeredOfficers) {
            if (officer1 == officer) {
                registeredOfficers.remove(officer);
                break;
            }
        }
        count--;
    }


    public long count() {
        return count;
    }


    @Override
   public Officer findByEmail(String email){
        for (Officer officer : registeredOfficers) {
            if(officer.getEmail().equals(email))
                return officer;
        }
        return null;
   }







}
