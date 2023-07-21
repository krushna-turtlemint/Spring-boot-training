package com.mrmk.learnjpahibernatelearning.course.jpa;

import com.mrmk.learnjpahibernatelearning.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager manager;
    public void insert(Course course) {
        manager.merge(course);
    }
    public void deleteById(long Id) {
        Course course = manager.find(Course.class, Id);
        manager.remove(course);
    }
    public Course findById(long Id){
        return manager.find(Course.class, Id);
    }

}
