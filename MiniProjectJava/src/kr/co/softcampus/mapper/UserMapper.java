package kr.co.softcampus.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.softcampus.beans.UserBean;

public interface UserMapper {
	
	@Select("SELECT USER_NAME FROM USER_TABLE WHERE USER_ID = #{user_id}")
	String checkUserIdExist(String user_id);
	
	@Insert("INSERT INTO USER_TABLE(USER_IDX, USER_NAME, USER_ID, USER_PW)"+
			"VALUES (USER_SEQ.NEXTVAL, #{user_name}, #{user_id}, #{user_pw})")
	void addUserInfo(UserBean joinUserBean);
	
	@Select("select user_idx, user_name from user_table where user_id=#{user_id} and user_pw=#{user_pw}")
	UserBean getLoginUserInfo(UserBean tempLoginUserBean);
	
	
	

}