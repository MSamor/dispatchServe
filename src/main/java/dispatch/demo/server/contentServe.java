package dispatch.demo.server;

import dispatch.demo.domain.content;
import dispatch.demo.domain.user;
import dispatch.demo.domain.userDetail;
import dispatch.demo.mapper.UserMapper;
import dispatch.demo.mapper.adminMapper;
import dispatch.demo.mapper.contentMapper;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class contentServe {
    @Autowired
    contentMapper contentMapper;
    @Autowired
    UserMapper UserMapper;
    @Autowired
    adminMapper adminMapper;
    //获取所有内容
    public List<content> getAllContent(){
        return contentMapper.getAllContent();
    }
    //获取单个
    public content getContentByNum(String num){
        return contentMapper.getContent(num);
    }
    //获取列表
    public List<content> getContentByNums(String data){
        List<content> contents = new ArrayList<>();
        String[] arr = data.split(",");
        //转化为数组了
        for (String e:arr){
            contents.add(contentMapper.getContent(e));
        }
        return contents;
    }
    //未读变读
    public String upReadOrNo(String readOne,Integer id){
        userDetail userOne = UserMapper.getUserDetail(id);
        String userString = userOne.getNoReadDetail();//拿到未读的数组
        String userString2 = userOne.getReadDetail();//拿到读了的数组
        String[] arr = userString.split(",");//转化为数组
        String[] arr2 = userString2.split(",");//转化为数组
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(arr2));

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (readOne.equals(s)){
               arrayList.remove(s);
               arrayList2.add(s);
            }
        }
        String str = StringUtils.join(arrayList);
        String str2 = StringUtils.join(arrayList2);
        System.out.println(str);
        System.out.println(str2);
        contentMapper.updatePerson(str,str2,id);//更新数据
        adminMapper.updateAdmin();
        return "ok";
    }
    //修改内容
    public Boolean updateContent(String title,String content,String describe,String sendPerson,Integer num){
        int a = contentMapper.updateContent(title,content,describe,sendPerson,num);
        if (a == 1){
            return true;
        }else {
            return false;
        }
    }
    //添加内容
    public Boolean insertContent(String title,String content,String describe,String sendPerson){
        String string = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
        Integer num = contentMapper.insert(title,content,describe,sendPerson,string);
        int max = 0;
        List<content> contentMax = contentMapper.getAllContent();
        for (int i = 0; i < contentMax.size(); i++) {
            max = contentMax.get(i).getNum();
        }
        List<user> users= UserMapper.getUserAll();
        int userSize = users.size();
        System.out.println(userSize);
        //后台表添加
        adminMapper.updateAdmin2(userSize);
        //用户表
        UserMapper.updateUser(max);
        return true;
    }
}
