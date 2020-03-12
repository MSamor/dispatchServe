package dispatch.demo.mapper;

import dispatch.demo.domain.content;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface contentMapper {
    @Select("select * from content where num=#{num}")
    public content getContent(String num);

    @Select("select * from content")
    public List<content> getAllContent();

    @Update("UPDATE user SET noReadDetail=#{noReadDetail},readDetail=#{readDetail},`read`=`read`+1,`noread`=`noread`-1 where id=#{id}")
    public int updatePerson(String noReadDetail,String readDetail,Integer id);

    @Update("UPDATE content SET `title`=#{title},`content`=#{content},`describe`=#{describe},`sendPerson`=#{sendPerson} where num=#{num}")
    public int updateContent(String title,String content,String describe,String sendPerson,Integer num);
    //插入内容
    @Insert("INSERT INTO content(`title`,`content`,`describe`,`sendPerson`,`receivePersons`,`time`) VALUES(#{title},#{content},#{describe},#{sendPerson},'所有人',#{time})")
    public int insert(String title,String content,String describe,String sendPerson,String time);
}
