package dispatch.demo.domain;

public class content {
    private Integer num;
    private String content;
    private String img;
    private String title;
    private String sendPerson;
    private String describe;
    private Integer total;
    private String receivePersons;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReceivePersons() {
        return receivePersons;
    }

    public void setReceivePersons(String receivePersons) {
        this.receivePersons = receivePersons;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSendPerson() {
        return sendPerson;
    }

    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
