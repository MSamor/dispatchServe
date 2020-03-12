package dispatch.demo.server;

import dispatch.demo.domain.user;
import dispatch.demo.domain.userDetail;
import dispatch.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServe {
    @Autowired
    UserMapper UserMapper;
    //登陆用
    public user getUserByIdPassword(Integer id,Integer password){
        user users = UserMapper.getUser(id,password);
        System.out.println(users);
        if(users == null){
            user noUser = new user();
            noUser.setMsg(false);
            return noUser;
        }else {
            users.setMsg(true);
            return users;
        }
    }
    //登陆后获取数据用
    public userDetail getUserDetailById(Integer id){
        return UserMapper.getUserDetail(id);
    }
}
