package dispatch.demo.controller;

import dispatch.demo.domain.content;
import dispatch.demo.server.contentServe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "内容获取", tags = "内容获取的多个方式")
public class getContent {

    @Autowired
    contentServe contentServe;

    //不分页
    @GetMapping("/content/all")
    @ApiOperation(value = "获取所有内容")
    public List<content> getContent(@RequestParam String detail){
        if (detail == null){
            return null;
        }
        return contentServe.getContentByNums(detail);
    }

    //分页
    @GetMapping("/content/all/page")
    @ApiOperation(value = "获取所有内容分页")
    @ApiImplicitParams({
           @ApiImplicitParam(name = "detail" ,value = "所有的id"),
           @ApiImplicitParam(name = "page" ,value = "页数")
   })
    public List<content> getContentPage(@RequestParam String detail, @RequestParam Integer page){
        List<content> contentsList;
        if(detail == ""){
            return null;
        }
        contentsList = contentServe.getContentByNums(detail);
        contentsList.get(0).setTotal(contentsList.size());
        if(page*5>contentsList.size()){
            if(page*5>contentsList.size()+5){
                contentsList = null;
            }else {
                contentsList = contentsList.subList(5*(page-1),contentsList.size());
            }
        }else {
            contentsList = contentsList.subList(5*(page-1),5*page);
        }
        return contentsList;
    }

    //获取单个
    @GetMapping("/content/one")
    @ApiOperation(value = "获取单个内容")
    @ApiImplicitParam(name = "readDetail",value = "内容编号",dataType = "String")
    public content getContentOne(@RequestParam String readDetail){
        return contentServe.getContentByNum(readDetail);
    }


    //未读变读
    @GetMapping("/content/noReadtoRead")
    @ApiOperation(value = "未读变读")
    public Boolean noReadtoRead(
                                @RequestParam String read,
                                @RequestParam Integer id){
        contentServe.upReadOrNo(read,id);
        return true;
    }

    //插入数据源
    @GetMapping("/content/insert")
    @ApiOperation(value = "添加数据",notes = "添加数据")
    public Boolean insertContent(@RequestParam String title,
                                 @RequestParam String content,
                                 @RequestParam String describe,
                                 @RequestParam String sendPerson){
        return contentServe.insertContent(title,content,describe,sendPerson);
    }
}
