package com.mrmk.learnjpahibernatelearning.course.jdbc;

import com.mrmk.learnjpahibernatelearning.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final RowMapper<Course> EMPLOYEE_ROW_MAPPER = (rs, rowNum) -> {
        Course emp1 = new Course();
        emp1.setId(rs.getInt("Id"));
        emp1.setName(rs.getString("Name"));
        emp1.setAuthor(rs.getString("Author"));
        System.out.println(emp1);
        return emp1;
    };
    @Autowired
    private JdbcTemplate template;

    public static String query = "insert into course (Id, Name, Author) values (?, ?, ?);";
    public static  String deleteQuery = "delete from course where id = ?";
    public  static  String selectQuery = "select * from course where id = ?";
    public void insert(Course course) {
        System.out.println("Krushna -------------->");
        template.update(query, course.getId(), course.getName(), course.getAuthor()) ;
    }
    public void deleteById(long Id) {
        System.out.println("Krushna -------------->");
        template.update(deleteQuery, Id) ;
    }
    public Course findById(long Id){
        return template.queryForObject(selectQuery,EMPLOYEE_ROW_MAPPER, Id);
    }
}
