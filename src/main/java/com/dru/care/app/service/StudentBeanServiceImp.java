package com.dru.care.app.service;

import com.dru.care.app.bean.DeleteStudent;
import com.dru.care.app.bean.InsertStudent;
import com.dru.care.app.bean.UpdateStudent;
import com.dru.care.app.repo.StudentBeanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentBeanServiceImp  implements  StudentBeanService{

@Autowired
private StudentBeanDao studentDao;

    @Override
    public Boolean insertStudentBeanUsingMap(InsertStudent insertStudent) {
        return studentDao.insertStudentBeanUsingMap(insertStudent);
    }

    @Override
    public Boolean insertStudentBeanUsingMapSqlParameter(InsertStudent insertStudent) {
        return studentDao.insertStudentBeanUsingMapSqlParameter(insertStudent);
    }



    @Override
    public Boolean insertStudentBeanUsingBeanProperty(InsertStudent insertStudent) {
        return studentDao.insertStudentBeanUsingBeanProperty(insertStudent);
    }

    @Override
    public Boolean updateStudentBeanUsingMap(UpdateStudent updateStudent) {
        return studentDao.updateStudentBeanUsingMap(updateStudent);
    }

    @Override
    public Boolean updateStudentBeanUsingMapSqlParameter(UpdateStudent updateStudent) {
        return studentDao.updateStudentBeanUsingMapSqlParameter(updateStudent);
    }

    @Override
    public Boolean updateStudentBeanUsingBeanProperty(UpdateStudent updateStudent) {
        return studentDao.updateStudentBeanUsingBeanProperty(updateStudent);
    }

    @Override
    public Boolean softDeleteStudentBeanUsingMap(DeleteStudent deleteStudent) {
        return studentDao.softDeleteStudentBeanUsingMap(deleteStudent);
    }

    @Override
    public Boolean softDeleteStudentBeanUsingMapSqlParameter(DeleteStudent deleteStudent) {
        return studentDao.softDeleteStudentBeanUsingMapSqlParameter(deleteStudent);
    }

    @Override
    public Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteStudent deleteStudent) {
        return studentDao.softDeleteEmployeeBeanUsingBeanParameter(deleteStudent);
    }
}
