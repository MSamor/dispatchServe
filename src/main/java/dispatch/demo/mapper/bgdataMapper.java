package dispatch.demo.mapper;

import dispatch.demo.domain.bgData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface bgdataMapper {
    @Select("select * from bgdata")
    public bgData getBgData();
}