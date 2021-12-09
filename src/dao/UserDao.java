package dao;

import PO.UserPO;
import VO.UserVO;
import utils.DataSourceUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static UserVO queryUserByNameAndPassword(String name, String password) {
        UserVO userVO=null;
        Connection conn = DataSourceUtil.getConnection();
        try {
        String sql ="select id,username,password,age,sex,hobby,remark from user where USERNAME=? and PASSWORD=?";
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,password);
        ResultSet set=ps.executeQuery();
        while (set.next()){
            userVO= new UserVO(set.getInt("id"),set.getString("username"),
                    set.getString("password"),
                    set.getInt("age"),set.getString("sex"),set.getString("hobby"),
                    set.getString("remark"));
            return userVO;
        }

        }catch (Exception e){
            e.printStackTrace();
        }
        return userVO;
    }

    public Boolean insert(UserPO po) {
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="insert into user (USERNAME,PASSWORD,AGE,SEX,HOBBY,REMARK)values(?,?,?,?,?,?)";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, po.getUSERNAME());
            ps.setString(2,po.getPASSWORD());
            ps.setInt(3, po.getAGE());
            ps.setString(4, po.getSEX());
            ps.setString(5, po.getHOBBY());
            ps.setString(6, po.getREMARK());

           int row= ps.executeUpdate();
            if (row>0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public List<UserVO> selectUserList() {
        List<UserVO> list =new ArrayList<UserVO>();
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="select ID,USERNAME,PASSWORD,AGE,SEX,HOBBY,REMARK from user";
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet  set = ps.executeQuery();
            while (set.next()){
                UserVO vo=new UserVO(set.getInt("ID"),set.getString("USERNAME"),
                        set.getString("PASSWORD"), set.getInt("AGE"),set.getString("SEX"),
                        set.getString("HOBBY"),set.getString("REMARK"));
                list.add(vo);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public UserVO selectUserInfoById(int int_id) {
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="select ID,USERNAME,PASSWORD,AGE,SEX,HOBBY,REMARK from user where id=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,int_id);
            ResultSet  set = ps.executeQuery();
            while (set.next()){
                UserVO vo=new UserVO(set.getInt("ID"),set.getString("USERNAME"),
                        set.getString("PASSWORD"), set.getInt("AGE"),set.getString("SEX"),
                        set.getString("HOBBY"),set.getString("REMARK"));
               return vo;
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Boolean update(UserPO po) {
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="update  user set USERNAME=?,PASSWORD=?,AGE=?,SEX=?,HOBBY=?,REMARK=? where id=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1, po.getUSERNAME());
            ps.setString(2,po.getPASSWORD());
            ps.setInt(3, po.getAGE());
            ps.setString(4, po.getSEX());
            ps.setString(5, po.getHOBBY());
            ps.setString(6, po.getREMARK());
            ps.setInt(7,po.getID());
            int row= ps.executeUpdate();
            if (row>0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    public Boolean delete(int int_id) {
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="delete from user  where id=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,int_id);
            int row= ps.executeUpdate();
            if (row>0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public Boolean check(String username) {
        Connection conn = DataSourceUtil.getConnection();
        try {
            String sql ="select USERNAME from user where USERNAME=?";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet  set = ps.executeQuery();
            while (set.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
