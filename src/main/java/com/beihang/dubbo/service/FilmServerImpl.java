/**
 * 
 */
package com.beihang.dubbo.service;

import java.util.Date;

import org.springframework.stereotype.Service;


/**
 * 
 * @author Tony
 *
 */
@Service("filmServer")  
public class FilmServerImpl implements FilmServer {

	/**
	 * 返回添加后的语句
	 */
	public String sayHello(String str) {
		str = "Hello " + str + "  2:" + new Date();
		System.err.println("server:" + str);
		return str;
	}

}
