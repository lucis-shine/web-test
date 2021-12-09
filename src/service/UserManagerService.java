package service;

import PO.UserPO;
import VO.UserVO;
import dao.UserDao;

import java.util.List;

public class UserManagerService {
    UserDao userDao=new UserDao();
    public Boolean register(String username, String password, String sex, String age, String[] hobby, String remark) {
        int int_age=Integer.parseInt(age);
        StringBuffer hobbys=new StringBuffer();
        if(hobby==null){
            hobbys.append("");
        }
        else {
            for (String h : hobby) {
                hobbys.append(h);
                hobbys.append(",");
            }
        }
        UserPO po=new UserPO(username,password,int_age,sex,hobbys.toString(),remark);
        return userDao.insert(po);
    }

    public List<UserVO> queryUserList() {
        return  userDao.selectUserList();
    }

    public UserVO getUserInfoById(String id) {
        Integer int_id=Integer.parseInt(id);
        return  userDao.selectUserInfoById(int_id);
    }

    public Boolean update(String id, String username, String password, String sex, String age, String[] hobby, String remark) {
       int int_id=Integer.parseInt(id);
        int int_age=Integer.parseInt(age);
        StringBuffer hobbys=new StringBuffer();
        for (String h:hobby){
            hobbys.append(h);
            hobbys.append(",");
        }
        UserPO po=new UserPO(int_id,username,password,int_age,sex,hobbys.toString(),remark);

        return userDao.update(po);
    }

    public Boolean delete(String id) {
        int int_id=Integer.parseInt(id);
       return userDao.delete(int_id);
    }

    public Boolean check(String username) {
        return userDao. check(username);
    }
}
