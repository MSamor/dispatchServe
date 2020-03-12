package dispatch.demo.server;

import dispatch.demo.domain.bgData;
import dispatch.demo.mapper.bgdataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bgdataServe {
    @Autowired
    bgdataMapper bgdataMapper;

    public bgData getBgData(){
        return bgdataMapper.getBgData();
    }
}
