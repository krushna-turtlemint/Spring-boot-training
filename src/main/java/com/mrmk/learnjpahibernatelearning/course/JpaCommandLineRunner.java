package com.mrmk.learnjpahibernatelearning.course;

import com.mrmk.learnjpahibernatelearning.course.Course;
import com.mrmk.learnjpahibernatelearning.course.springDataJpa.CourseDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class JpaCommandLineRunner implements CommandLineRunner
{

//    @Autowired
//    private CourseJpaRepository repo;
    @Autowired
    private CourseDataJpaRepository repo;
    @Override
    public void run(String... arg) throws Exception {
     repo.save(new Course(2, "Java", "mr_mk"));
        repo.save(new Course(3, "Java", "mr_mk"));
        repo.save(new Course(4, "Java", "mr_mk"));
        repo.save(new Course(5, "krushna", "mr_mk"));
        repo.deleteById(2L);
        System.out.println( repo.findById(5L));

    }
}
