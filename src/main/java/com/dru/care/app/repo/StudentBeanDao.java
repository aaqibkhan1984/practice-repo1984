package com.dru.care.app.repo;

import com.dru.care.app.bean.DeleteStudent;
import com.dru.care.app.bean.InsertStudent;
import com.dru.care.app.bean.UpdateStudent;

public interface StudentBeanDao {


    Boolean insertStudentBeanUsingMap(InsertStudent insertStudent);

    Boolean insertStudentBeanUsingMapSqlParameter(InsertStudent insertStudent);

    Boolean insertStudentBeanUsingBeanProperty(InsertStudent insertStudent);

    Boolean updateStudentBeanUsingMap(UpdateStudent updateStudent);

    Boolean updateStudentBeanUsingMapSqlParameter(UpdateStudent updateStudent);

    Boolean updateStudentBeanUsingBeanProperty(UpdateStudent updateStudent);

    Boolean softDeleteStudentBeanUsingMap(DeleteStudent deleteStudent);

    Boolean softDeleteStudentBeanUsingMapSqlParameter(DeleteStudent deleteStudent);

    Boolean softDeleteEmployeeBeanUsingBeanParameter(DeleteStudent deleteStudent);


}
