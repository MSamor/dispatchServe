package dispatch.demo.mapper;

import dispatch.demo.domain.user;
import dispatch.demo.domain.userDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface UserMapper {
    @Select("select * from user where id=#{id} and password=#{password}")
    public user getUser(Integer id, Integer password);

    @Select("select * from user where id=#{id}")
    public userDetail getUserDetail(Integer id);

    @Select("select * from user")
    public List<user> getUserAll();

    //给用户更新新的内容
    @Update("UPDATE user SET `noReadDetail`=concat(#{addStr},',',`noReadDetail`),`noread`=`noread`+1")
    public int updateUser(int addStr);
}

