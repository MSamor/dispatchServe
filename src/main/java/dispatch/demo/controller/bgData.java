package dispatch.demo.controller;

import dispatch.demo.domain.content;
import dispatch.demo.server.adminServe;
import dispatch.demo.server.bgdataServe;
import dispatch.demo.server.contentServe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "后台资源获取",tags = "获取后台相关数据")
public class bgData {
    @Resource
    adminServe adminServe;
    @Autowired
    contentServe contentServe;
    @Autowired
    bgdataServe bgdataServe;
    //获取登陆账号
    @GetMapping("admin/login")
    @ApiOperation(value = "获取登陆状态",notes = "参数是账号和密码")
    public Boolean getLogin(@RequestParam Integer adminId, @RequestParam Integer adminPwd) {
        return adminServe.getAdmin(adminId,adminPwd);
    }

    //获取所有内容
    @GetMapping("admin/contents")
    @ApiOperation(value = "获取所有发布的内容",notes = "没有参数，获取的是一个列表")
    public List<content> getAllContent(){
        return contentServe.getAllContent();
    }
    //获取阅读参数
    @GetMapping("admin/bgdata")
    @ApiOperation(value = "获取阅读参数",notes = "获取阅读参数")
    public dispatch.demo.domain.bgData getbgData(){
        return bgdataServe.getBgData();
    }

    //根据id修改内容
    @GetMapping("admin/updateContent")
    @ApiOperation(value = "修改数据", notes = "根据num修改数据")
    public Boolean updateContent(@RequestParam String title,
                                 @RequestParam String content,
                                 @RequestParam String describe,
                                 @RequestParam String sendPerson,
                                 @RequestParam Integer num){
        return contentServe.updateContent(title,content,describe,sendPerson,num);
    }
}
