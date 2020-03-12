package dispatch.demo.domain;

public class bgData {
    private Integer contentNum;
    private Integer personNum;
    private String readPeople;
    private Integer readNum;
    private String noReadPeople;
    private Integer noReadNum;

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getNoReadNum() {
        return noReadNum;
    }

    public void setNoReadNum(Integer noReadNum) {
        this.noReadNum = noReadNum;
    }

    public Integer getContentNum() {
        return contentNum;
    }

    public void setContentNum(Integer contentNum) {
        this.contentNum = contentNum;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getReadPeople() {
        return readPeople;
    }

    public void setReadPeople(String readPeople) {
        this.readPeople = readPeople;
    }

    public String getNoReadPeople() {
        return noReadPeople;
    }

    public void setNoReadPeople(String noReadPeople) {
        this.noReadPeople = noReadPeople;
    }
}
