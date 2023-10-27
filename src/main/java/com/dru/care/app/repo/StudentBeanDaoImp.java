package com.dru.care.app.repo;

import com.dru.care.app.bean.InsertStudent;
import com.dru.care.app.bean.DeleteStudent;
import com.dru.care.app.bean.UpdateStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentBeanDaoImp implements  StudentBeanDao{

private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public StudentBeanDaoImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Value("${queries.queryForInsertStudent}")
    private String queryForInsertStudent;

    @Value("${queries.queryForUpdateStudent}")
    private String queryForUpdateStudent;

    @Value("${queries.queryForSoftDeleteStudent}")
    private String queryForSoftDeleteStudent;


    @Override
    public Boolean insertStudentBeanUsingMap(InsertStudent insertStudent) {


        int update = 0;
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("firstName",insertStudent.getFirstName());
            map.put("lastNm",insertStudent.getLastName());
            map.put("gender",insertStudent.getGender());
            map.put("address",insertStudent.getAddress());
            map.put("email",insertStudent.getEmail());
            map.put("phone",insertStudent.getPhone());
            map.put("major",insertStudent.getMajor());
            map.put("enrollmentStatus",insertStudent.getEnrollmentStatus());
            map.put("gpa",insertStudent.getGpa());
            map.put("totalMArks",insertStudent.getTotalMArks());

            update = namedParameterJdbcTemplate.update(queryForInsertStudent, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update > 0;

    }

    @Override
    public Boolean insertStudentBeanUsingMapSqlParameter(InsertStudent insertStudent) {
        int update =0;

        try {
            MapSqlParameterSource parameter = new MapSqlParameterSource();
            parameter.addValue("firstName",insertStudent.getFirstName());
            parameter.addValue("lastNm",insertStudent.getLastName());
            parameter.addValue("gender",insertStudent.getGender());
            parameter.addValue("address",insertStudent.getAddress());
            parameter.addValue("email",insertStudent.getEmail());
            parameter.addValue("phone",insertStudent.getPhone());
            parameter.addValue("major",insertStudent.getMajor());
            parameter.addValue("enrollmentStatus",insertStudent.getEnrollmentStatus());
            parameter.addValue("gpa",insertStudent.getGpa());
            parameter.addValue("totalMArks",insertStudent.getTotalMArks());

            update = namedParameterJdbcTemplate.update(queryForInsertStudent, parameter);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        return  update > 0;

    }


    @Override
    public Boolean insertStudentBeanUsingBeanProperty(InsertStudent insertStudent) {
        int update = 0;
        try {
            update = namedParameterJdbcTemplate.update(queryForInsertStudent,
                    new BeanPropertySqlParameterSource(insertStudent));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return update > 0;
    }

    @Override
    public Boolean updateStudentBeanUsingMap(UpdateStudent updateStudent) {

        int update =0;

        try {
            MapSqlParameterSource parameter = new MapSqlParameterSource();
            parameter.addValue("firstName",updateStudent.getFirstName());
            parameter.addValue("lastNm",updateStudent.getLastName());
            parameter.addValue("dateOfBirth",updateStudent.getDateOfBirth());
            parameter.addValue("gender",updateStudent.getGender());
            parameter.addValue("address",updateStudent.getAddress());
            parameter.addValue("email",updateStudent.getEmail());
            parameter.addValue("phone",updateStudent.getPhone());
            parameter.addValue("major",updateStudent.getMajor());
            parameter.addValue("enrollmentStatus",updateStudent.getEnrollmentStatus());
            parameter.addValue("enrollmentDate",updateStudent.getEnrollmentDate());
            parameter.addValue("gpa",updateStudent.getGpa());
            parameter.addValue("totalMArks",updateStudent.getTotalMArks());


            update = namedParameterJdbcTemplate.update(queryForInsertStudent, parameter);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        return  update > 0;


    }

    @Override
    public Boolean updateStudentBeanUsingMapSqlParameter(UpdateStudent updateStudent) {
        int update =0;

        try {
            MapSqlParameterSource parameter = new MapSqlParameterSource();
            parameter.addValue("firstName",updateStudent.getFirstName());
            parameter.addValue("lastNm",updateStudent.getLastName());
            parameter.addValue("dateOfBirth",updateStudent.getDateOfBirth());
            parameter.addValue("gender",updateStudent.getGender());
            parameter.addValue("address",updateStudent.getAddress());
            parameter.addValue("email",updateStudent.getEmail());
            parameter.addValue("phone",updateStudent.getPhone());
            parameter.addValue("major",updateStudent.getMajor());
            parameter.addValue("enrollmentStatus",updateStudent.getEnrollmentStatus());
            parameter.addValue("enrollmentDate",updateStudent.getEnrollmentDate());
            parameter.addValue("gpa",updateStudent.getGpa());
            parameter.addValue("totalMArks",updateStudent.getTotalMArks());
            parameter.addValue("studentId",updateStudent.getStudentId());

            update = namedParameterJdbcTemplate.update(queryForUpdateStudent, parameter);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
        return  update > 0;
    }

    @Override
    public Boolean updateStudentBeanUsingBeanProperty(UpdateStudent updateStudent) {
        int update = 0;
        try {
            update = namedParameterJdbcTemplate.update(queryForUpdateStudent,
                    new BeanPropertySqlParameterSource(updateStudent));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return update > 0;
    }

    @Override
    public Boolean softDeleteStudentBeanUsingMap(DeleteStudent deleteStudent) {
        int update = 0;
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("studentId", deleteStudent.getStudentId());
            update = namedParameterJdbcTemplate.update(queryForSoftDeleteStudent, map);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return update > 0;
    }

    @Override
    public Boolean softDeleteStudentBeanUsingMapSqlParameter(DeleteStudent deleteStudent) {
        int update = 0;
        try {
            MapSqlParameterSource parameters = new MapSqlParameterSource();
            parameters.addValue("empId", deleteStudent.getStudentId());
            update = namedParameterJdbcTemplate.update(queryForSoftDeleteStudent, parameters);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return update > 0;
    }

    @Override
    public Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteStudent deleteStudent) {
        int update = 0;
        try {
            update = namedParameterJdbcTemplate.update(queryForSoftDeleteStudent,
                    new BeanPropertySqlParameterSource(deleteStudent));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return update > 0;
    }
}
