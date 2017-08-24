package com.zm.gateway.model;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * 
 * ClassName: SecurityUserFactory <br/>
 * Function: 安全用户工厂类. <br/>
 * date: Aug 21, 2017 7:06:26 PM <br/>
 * 
 * @author hebin
 * @version
 * @since JDK 1.7
 */
public class SecurityUserFactory {
	
	private SecurityUserFactory() {
	}

	public static SecurityUserDetail create(UserInfo user) {
		return new SecurityUserDetail(user.getUserId() + "", user.getUserName(), user.getPassword(), user.getEmail(),
				mapToGrantedAuthorities(user.getAuthorities()), user.getLastPasswordResetDate());
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {

		// List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		//
		// for(String authority:authorities){
		// list.add(new SimpleGrantedAuthority(authority));
		// }
		//
		// return list;

		return authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());// java8代替了以上代码
	}

}