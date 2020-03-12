package dispatch.demo.mapper;

import dispatch.demo.domain.admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface adminMapper {
    @Select("select * from admin where adminId=#{adminID}")
    public admin getAdmin(Integer adminId);

    //读的加1，未读减一
    @Update("UPDATE bgdata SET `readNum`=`readNum`+1,`noReadNum`=`noReadNum`-1")
    public int updateAdmin();

    //读的-1，未读+1
    @Update("UPDATE bgdata SET `personNum`=#{noReadNum}, `noReadNum`=`noReadNum`+ #{noReadNum}")
    public int updateAdmin2(int noReadNum);//传一个人数进来就行了
}
