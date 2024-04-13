package school.com.School.dao;

import school.com.School.entity.School;

import java.util.List;

public interface SchoolDAO {
    List<School> findAll();

    School findById(int theId);

    School save(School theSchool);

    void deleteById(int theId);
}
