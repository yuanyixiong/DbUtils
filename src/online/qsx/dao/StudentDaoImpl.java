package online.qsx.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import online.qsx.model.Student;

public class StudentDaoImpl {
	public static void main(String[] args) throws SQLException {
		new StudentDaoImpl().remove();
	}

	DataSource ds = new ComboPooledDataSource();
	QueryRunner ruanner = new QueryRunner(ds);

	public void findAll() throws SQLException {
		List<Student> list = ruanner.query("select * from student", new BeanListHandler<>(Student.class));
		for (Student student : list) {
			System.out.println(student.toString());
		}
	}

	public void findObjectById() throws SQLException {
		Student stu = ruanner.query("select * from student where studentNo=?", new BeanHandler<>(Student.class), 1000);
		System.out.println(stu.toString());
	}

	public void save() throws SQLException {
		int row=ruanner.update("insert into student(studentno,phone,address,email)values(?,?,?,?)",3000,"11","11","11");
		System.out.println(row>0?"添加成功":"添加失败");
	}

	public void edit() throws SQLException {
		int row=ruanner.update("update student set studentname=?,sex=? where studentNo=?", "arvin",2,1000);
		System.out.println(row>0?"修改成功":"修改失败");
	}

	public void remove() throws SQLException {
		int row=ruanner.update("delete from student where studentno=?", 3000);
		System.out.println(row>0?"删除成功":"删除失败");
	}
}
