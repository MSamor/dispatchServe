package dispatch.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class user {
    private Boolean msg;
    private String userName;
    private Integer id;
    private Integer passWord;

    public Boolean getMsg() {
        return msg;
    }

    public void setMsg(Boolean msg) {
        this.msg = msg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }
}
