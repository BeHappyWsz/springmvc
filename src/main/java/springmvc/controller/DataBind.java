package springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.entity.Admin;
import springmvc.entity.User;
import springmvc.entity.UserListForm;
import springmvc.entity.UserMapForm;
import springmvc.entity.UserSetForm;

@Controller
public class DataBind {

	/**
	 * http://localhost:8080/springmvc/baseType?age=10&name=111
	 * 接收基本数据类型
	 * @param age
	 * @param name
	 * @return
	 */
	@RequestMapping(value="baseType")
	@ResponseBody
	public String baseTyepe(@RequestParam("age") int age,String name) {
		return "age:"+age+" name:"+name;
	}
	
	/**
	 * http://localhost:8080/springmvc/objectType?i=20
	 * 接收包装类型-默认为null
	 * @param i
	 * @return
	 */
	@RequestMapping(value="objectType")
	@ResponseBody
	public String objectType(Integer i) {
		return "Integer:"+i;
	}
	
	/**
	 * http://localhost:8080/springmvc/array?name=aa&name=bb&name=cc
	 * 接收数组
	 * @param name
	 * @return
	 */
	@RequestMapping(value="array")
	@ResponseBody
	public String array(String[] name) {
		StringBuilder sb = new StringBuilder();
		for (String str : name) {
			sb.append(str).append(" ");
		}
		return sb.toString();
	}
	
	/**
	 * http://localhost:8080/springmvc/object?name=wsz&age=24
	 * 绑定对象之单对象
	 * @param user
	 * @return
	 */
	@RequestMapping(value="object")
	@ResponseBody
	public String object(User user) {
		return user.toString();
	}
	
	/**
	 * http://localhost:8080/springmvc/object2?name=wsz&age=24&userInfo.phone=45646
	 * 绑定对象之包含对象
	 * @param user
	 * @return
	 */
	@RequestMapping(value="object2")
	@ResponseBody
	public String object2(User user) {
		return user.toString();
	}
	
	/**
	 * 绑定多个对象
	 * http://localhost:8080/springmvc/object3?user.name=wsz&user.age=24&admin.name=aaa&admin.age=222
	 * @param user
	 * @param admin
	 * @return
	 */
	@RequestMapping(value="object3")
	@ResponseBody
	public String object3(User user,Admin admin) {
		return user.toString()+" "+admin.toString();
	}
	
	@InitBinder("user")
	public void initUser(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("user.");
	}
	
	@InitBinder("admin")
	public void initAdmin(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("admin.");
	}
	
	/**
	 * 绑定List数据
	 * http://localhost:8080/springmvc/list?users[0].age=1&users[0].name=a&users[1].age=2&users[1].name=b&users[10].age=20
	 * 间隔数字下标时，中间默认为null/'null'
	 * @param userList
	 * @return
	 */
	@RequestMapping(value="list")
	@ResponseBody
	public String list(UserListForm userListForm) {
		return userListForm.getUsers().size()+" "+userListForm.toString();
	}
	
	/**
	 * 绑定Set数据
	 * http://localhost:8080/springmvc/set?users[0].age=1&users[0].name=a&users[2].age=1&users[2].name=a
	 * 传输数据组数必须小于等于构造初始化的数量
	 * @param userSetForm
	 * @return
	 */
	@RequestMapping(value="set")
	@ResponseBody
	public String set(UserSetForm userSetForm) {
		return 	userSetForm.toString();
	}
	
	/**
	 * 绑定Map对象数据
	 * http://localhost:8080/springmvc/mapObj?users['A'].age=123&users['A'].name=321&users['B'].age=1111
	 * @param userMapForm
	 * @return
	 */
	@RequestMapping("mapObj")
	@ResponseBody
	public String mapObj(UserMapForm userMapForm) {
		return userMapForm.toString();
	}
	
	/**
	 * 绑定简单Map数据-必须添加@RequestParam,否则无法绑定进去
	 * http://localhost:8080/springmvc/map?"aa"=aa&"bb"=bb&cc=cc
	 * @param map
	 * @return
	 */
	@RequestMapping("map")
	@ResponseBody
	public String map(@RequestParam Map<String,Object> map) {
		return map.toString();
	}
	
	/**
	 * 绑定json数据
	 * @param user
	 * @return
	 */
	@RequestMapping("json")
	@ResponseBody
	public String json(@RequestBody User user) {
		return user.toString();
	}
	
	/**
	 * 绑定xml数据
	 * 需要使用spring-oxm包
	 * @param admin
	 * @return
	 */
	@RequestMapping("xml")
	@ResponseBody
	public String xml(@RequestBody Admin admin) {
		return admin.toString();
	}
}
