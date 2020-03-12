package dispatch.demo.domain;

public class userDetail {
    private Integer id;
    private Integer passWord;
    private String userName;
    private Integer read;
    private Integer noRead;
    private String readDetail;
    private String noReadDetail;
    private String position;
    private String college;

    public void setRead(Integer read) {
        this.read = read;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRead() {
        return read;
    }

    public void setRed(Integer read) {
        this.read = read;
    }

    public Integer getNoRead() {
        return noRead;
    }

    public void setNoRead(Integer noRead) {
        this.noRead = noRead;
    }

    public String getReadDetail() {
        return readDetail;
    }

    public void setReadDetail(String readDetail) {
        this.readDetail = readDetail;
    }

    public String getNoReadDetail() {
        return noReadDetail;
    }

    public void setNoReadDetail(String noReadDetail) {
        this.noReadDetail = noReadDetail;
    }
}
