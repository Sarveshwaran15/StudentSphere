package com.universtiy.Student_portal_api.repository;

import com.universtiy.Student_portal_api.model.Attendance;
import com.universtiy.Student_portal_api.model.Course;
import com.universtiy.Student_portal_api.model.Event;
import com.universtiy.Student_portal_api.model.Marks;
import com.universtiy.Student_portal_api.model.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student getStudentById(int studentId) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT * FROM students WHERE id = ?",
                    new Object[]{studentId},
                    new BeanPropertyRowMapper<>(Student.class)
            );
        } catch (Exception e) {
            return null;
        }
    }

    public Attendance getAttendance(int studentId) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT * FROM attendance WHERE student_id = ?",
                    new Object[]{studentId},
                    (rs, rowNum) -> new Attendance(
                            rs.getInt("student_id"),
                            rs.getDouble("percentage")
                    )
            );
        } catch (Exception e) {
            return null;
        }
    }

    public Marks getMarks(int studentId) {
        try {
            return jdbcTemplate.queryForObject(
                    "SELECT * FROM marks WHERE student_id = ?",
                    new Object[]{studentId},
                    (rs, rowNum) -> new Marks(
                            rs.getInt("student_id"),
                            rs.getInt("internal_marks"),
                            rs.getInt("external_marks")
                    )
            );
        } catch (Exception e) {
            return null;
        }
    }

    public List<Course> getCourses(int studentId) {
        return jdbcTemplate.query(
                "SELECT * FROM courses WHERE student_id = ?",
                new Object[]{studentId},
                (rs, rowNum) -> new Course(
                        rs.getInt("student_id"),
                        rs.getString("course_name"),
                        rs.getString("teacher_name")
                )
        );
    }

    public List<Event> getEvents(String department) {
        return jdbcTemplate.query(
                "SELECT * FROM events WHERE department = ?",
                new Object[]{department},
                (rs, rowNum) -> new Event(
                        rs.getString("department"),
                        rs.getString("event_name"),
                        rs.getDouble("entry_fee"),
                        rs.getString("coordinator"),
                        rs.getString("description")
                )
        );
    }
}