package com.zd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zd.entity.studentinfo;

public interface IStudentDao {

	//��ѯ����
	@Select("SELECT * FROM student")
	@ResultMap("stuMapper")
	public List<studentinfo> selall();
	
	//���
	@Insert("INSERT INTO student VALUES(NULL,#{sname},#{ssex},#{sage})")
	public void add(studentinfo studentinfo);
	
	//ɾ��
	@Delete("DELETE from student WHERE s_id = #{sid}")
	public void del(int sid);
	
	//������ѯ
	@Select("SELECT * FROM student where s_id = #{s_id}")
	@ResultMap("stuMapper")
	public studentinfo selone(int sid);
	
	//�޸�
	@Update("UPDATE  student SET s_name=#{sname},s_sex=#{ssex},s_age=#{sage} WHERE s_id =#{sid}")
	public void update(studentinfo studentinfo);
}
