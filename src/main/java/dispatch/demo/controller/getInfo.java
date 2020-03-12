package dispatch.demo.controller;

import com.alibaba.fastjson.JSONObject;
import dispatch.demo.domain.user;
import dispatch.demo.domain.userDetail;
import dispatch.demo.server.userServe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value = "获取用户信息/登陆",tags = "获取用户信息/登陆")
@RestController
@ResponseBody
public class getInfo {

    @Autowired
    userServe userServe;

    @PostMapping("/user/get")
    @ApiOperation(value = "获取单个用户登陆状态",notes = "参数是账号和密码")
    public user getInfo(@RequestBody JSONObject jsonObject){
        return userServe.getUserByIdPassword(jsonObject.getInteger("id"),jsonObject.getInteger("passWord"));
    }

    @GetMapping("/user/get/one")
    @ApiOperation(value = "获取单个用户详细信息",notes = "参数是id账号")
    public userDetail getInfoDetail(@RequestParam Integer id){
        return userServe.getUserDetailById(id);
    }
}
