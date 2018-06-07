package com.zhang.myspringboot.test;
import org.apache.commons.lang.StringEscapeUtils;
public class Test {
	public static void main(String[] args) {
		String userName = "1' or '1'='1";
		String password = "123456";
		userName = StringEscapeUtils.escapeSql(userName);
		password = StringEscapeUtils.escapeSql(password);
		String sql = "SELECT COUNT(userId) FROM t_user WHERE userName='" + userName + "' AND password ='" + password + "'";
		System.out.println(sql);
	}
}
