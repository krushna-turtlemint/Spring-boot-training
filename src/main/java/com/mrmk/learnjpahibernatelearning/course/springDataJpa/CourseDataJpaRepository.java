package com.mrmk.learnjpahibernatelearning.course.springDataJpa;

import com.mrmk.learnjpahibernatelearning.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDataJpaRepository extends JpaRepository<Course, Long> {
}
