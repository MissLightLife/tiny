package cn.tiny.mapper;

import cn.tiny.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tiny
 * @date 2018/12/20 15:30
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
