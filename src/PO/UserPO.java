package PO;

public class UserPO {
   private Integer ID;
   private String  USERNAME;
   private String PASSWORD;
   private Integer AGE;
   private String SEX;
   private String HOBBY;
   private String REMARK;

    public UserPO() {
    }

    public UserPO(Integer ID, String USERNAME, String PASSWORD, Integer AGE, String SEX, String HOBBY, String REMARK) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.AGE = AGE;
        this.SEX = SEX;
        this.HOBBY = HOBBY;
        this.REMARK = REMARK;
    }

    public UserPO(String USERNAME, String PASSWORD, Integer AGE, String SEX, String HOBBY, String REMARK) {
        this.USERNAME =USERNAME;
        this.PASSWORD =PASSWORD;
        this.AGE = AGE;
        this.SEX =SEX;
        this.HOBBY = HOBBY;
        this.REMARK = REMARK;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getHOBBY() {
        return HOBBY;
    }

    public void setHOBBY(String HOBBY) {
        this.HOBBY = HOBBY;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    @Override
    public String toString() {
        return "UserPO{" +
                "ID=" + ID +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", AGE=" + AGE +
                ", SEX='" + SEX + '\'' +
                ", HOBBY='" + HOBBY + '\'' +
                ", REMARK='" + REMARK + '\'' +
                '}';
    }
}
