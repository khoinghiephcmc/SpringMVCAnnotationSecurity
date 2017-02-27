package org.nxtoanit.springmvcsecurity.dao;
 
import java.util.List;

import org.nxtoanit.springmvcsecurity.model.UserInfo;
 
public interface UserInfoDAO {
     
    public UserInfo findUserInfo(String userName);
     
    // [USER,AMIN,..]
    public List<String> getUserRoles(String userName);
     
}