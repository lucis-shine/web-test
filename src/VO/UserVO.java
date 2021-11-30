package VO;

import PO.UserPO;

public class UserVO extends UserPO {
    public UserVO() {
    }

    public UserVO(Integer ID, String USERNAME, String PASSWORD, Integer AGE, String SEX, String HOBBY, String REMARK) {
        super(ID, USERNAME, PASSWORD, AGE, SEX, HOBBY, REMARK);
    }

    public UserVO(String USERNAME, String PASSWORD, Integer AGE, String SEX, String HOBBY, String REMARK) {
        super(USERNAME, PASSWORD, AGE, SEX, HOBBY, REMARK);
    }
}
