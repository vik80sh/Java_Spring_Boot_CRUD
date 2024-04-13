package school.com.School.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.com.School.dao.SchoolDAO;
import school.com.School.entity.School;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    private SchoolDAO schoolDAO;

    @Autowired
    public SchoolServiceImpl(SchoolDAO theSchoolDAO){
        schoolDAO = theSchoolDAO;
    }

    @Override
    public List<School> findAll(){
     return schoolDAO.findAll();
    }

    @Override
    public School findById(int theId) {
        return schoolDAO.findById(theId);
    }

    @Transactional
    @Override
    public School save(School theSchool) {
        return schoolDAO.save(theSchool);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        schoolDAO.deleteById(theId);
    }
}
