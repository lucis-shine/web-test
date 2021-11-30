package service;

import VO.UserVO;
import dao.UserDao;

public class UserLoginService {
    UserDao userDao=new UserDao();
    public UserVO login(String name, String password) {
        return userDao.queryUserByNameAndPassword(name,password);
    }
}
