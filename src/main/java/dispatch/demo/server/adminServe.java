package dispatch.demo.server;

import dispatch.demo.domain.admin;
import dispatch.demo.mapper.adminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminServe {
    @Autowired
    adminMapper adminMapper;
    public Boolean getAdmin(Integer adminId,Integer pwd){
        if (adminId == null || pwd == null){
            return false;
        }
        admin admin = adminMapper.getAdmin(adminId);
        if(admin != null && admin.getAdminPwd() == pwd){
            return true;
        }else {
            return false;
        }
    }
}
