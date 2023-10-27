package com.dru.care.app.controller;

import com.dru.care.app.bean.InsertStudent;
import com.dru.care.app.service.StudentBeanService;
import com.dru.care.app.bean.DeleteStudent;
import com.dru.care.app.bean.UpdateStudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class StudentController {

		@Autowired
		private StudentBeanService studentServices1;



		/*
		 * Inserting Students Using Map With Help NamedParameterJdbcTemplate
		 */

		@PostMapping(value ="/insertStudent")
		public Boolean insertStudentBeanUsingMap(@RequestBody InsertStudent insertStudent) {
		return 	studentServices1.insertStudentBeanUsingMap(insertStudent);

		}

		/*
		 * Inserting Students Using MapSqlParameterSource With NamedParameterJdbcTemplate
		 */
		@PostMapping(value ="/insertStudentBeanUsingMapSqlParameter")
		public Boolean insertStudentBeanUsingMapSqlParameter(@RequestBody InsertStudent insertStudent) {
			return studentServices1.insertStudentBeanUsingMapSqlParameter(insertStudent);
		}

		/*
		 * Inserting Students using BeanPropertySqlParameterSource with
		 * NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/insertStudentBeanUsingBeanProperty")
		public Boolean insertStudentBeanUsingBeanProperty(@RequestBody InsertStudent insertStudent) {
			return studentServices1.insertStudentBeanUsingBeanProperty(insertStudent);
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////



		/*
		 * Updating student Using Map With Help  NamedParameterJdbcTemplate
		 */
		@PostMapping(value ="/updateStudentBeanUsingMap")
		public Boolean updateStudentBeanUsingMap(@RequestBody UpdateStudent updateStudent) {
			return studentServices1.updateStudentBeanUsingMap(updateStudent);
		}

		/*
		 * update student using MapSqlParameterSource with NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/updateStudentBeanUsingMapSqlParameter")
		public Boolean updateStudentBeanUsingMapSqlParameter(@RequestBody UpdateStudent updateStudent) {
			return studentServices1.updateStudentBeanUsingMapSqlParameter(updateStudent);
		}

		/*
		 * update student using BeanPropertySqlParameterSource with
		 * NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/updateStudentBeanUsingBeanProperty")
		public Boolean updateStudentBeanUsingBeanProperty(@RequestBody UpdateStudent updateStudent) {
			return studentServices1.updateStudentBeanUsingBeanProperty(updateStudent);
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



		/*
		 * soft delete employee using Map with NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/softDeleteStudentBeanUsingMap")
		public Boolean softDeleteStudentBeanUsingMap(@RequestBody DeleteStudent deleteStudent) {
			return studentServices1.softDeleteStudentBeanUsingMap(deleteStudent);
		}

		/*
		 * soft delete employee using MapSqlParameterSource with
		 * NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/softDeleteStudentBeanUsingMapSqlParameter")
		public Boolean softDeleteStudentBeanUsingMapSqlParameter(@RequestBody DeleteStudent deleteStudent) {
			return studentServices1.softDeleteStudentBeanUsingMapSqlParameter(deleteStudent);
		}

		/*
		 * soft delete employee using BeanPropertySqlParameter with
		 * NamedParameterJdbcTemplate
		 */
		@PostMapping(value = "/softDeleteStudentBeanUsingBeanParameter")
		public Boolean softDeleteEmployeeBeanUsingBeanParameter(@RequestBody DeleteStudent deleteStudent) {
			return studentServices1.softDeleteEmployeeBeanUsingBeanParameter(deleteStudent);
		}






	}

	
	
	
	
	

