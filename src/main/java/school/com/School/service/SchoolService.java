package school.com.School.service;

import school.com.School.dao.SchoolDAO;
import school.com.School.entity.School;

import java.util.List;

public interface SchoolService {

    List<School> findAll();
    School findById(int theId);

    School save(School theSchool);

    void deleteById(int theId);
}
