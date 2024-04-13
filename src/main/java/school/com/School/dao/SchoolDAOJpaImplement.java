package school.com.School.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import school.com.School.entity.School;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SchoolDAOJpaImplement implements SchoolDAO{
    EntityManager entityManager;
    @Autowired
    public SchoolDAOJpaImplement(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<School> findAll() {
        TypedQuery<School>  theGetAllSchoolQuery = entityManager.createQuery("from School", School.class);
        return theGetAllSchoolQuery.getResultList();
    }

    @Override
    public School findById(int theId) {
        return entityManager.find(School.class, theId);
    }

    @Override
    public School save(School theSchool) {
        return entityManager.merge(theSchool);
    }

    @Override
    public void deleteById(int theId) {
        School school = entityManager.find(School.class, theId);
        entityManager.remove(school);
    }
}
