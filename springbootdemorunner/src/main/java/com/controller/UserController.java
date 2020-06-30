package com.controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Language;
import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/userRegistration")
public class UserController {

	@Autowired
	private UserService userService;

	private Statement stmt;
	private static Connection conn;

	public static final String uname = "root";
	public static final String password = "root";

	// this stores the information to connect to the database
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String dburl = "jdbc:mysql://localhost/test";

	@ModelAttribute("dept")
	public List<Department> populateList() {
		return userService.getDepartment();
	}

	@ModelAttribute("city")
	public List<City> populateList1() {
		return userService.getCity();
	}

	@ModelAttribute("country")
	public List<Country> populateList2() {
		return userService.getCountry();
	}

	@ModelAttribute("language")
	public List<Language> populateList3() {
		return userService.getLanguage();
	}

	@ModelAttribute("hobby")
	public List<Hobbies> populateList4() {
		return userService.getHobbies();
	}

	/*
	 * public static Connection getConn() {
	 * 
	 * try { System.out.println("trying to connect");
	 * Class.forName("com.mysql.jdbc.Driver");
	 * 
	 * conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root",
	 * "root"); System.out.println("connection working"); return conn; } catch
	 * (Exception e) { System.out.println("connection failed"); } finally {
	 * System.out.println(conn); } return conn;
	 * 
	 * }
	 */

	
	public UserController() {

		try { // these must be placed in a try catch block Class.forName(driver);
			conn = DriverManager.getConnection(dburl, uname, password);
			stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	 

	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addUser(@Validated User user, BindingResult result, ModelMap model) {

		PreparedStatement pst = null;
		try {
			//Connection conn = getConn();
			pst = conn.prepareStatement(
					"insert into aop(username,email,pass,department,city,country,language,hobby)values(?,?,?,?,?,?,?,?)");
			pst.setString(1, user.getuName().toString());
			pst.setString(2, user.getPassword().toString());
			pst.setString(3, user.getEmail().toString());
			pst.setString(4, userService.getDepartment().toString());
			pst.setString(5, userService.getCity().toString());
			pst.setString(6, userService.getCountry().toString());
			pst.setString(7, userService.getLanguage().toString());
			pst.setString(8, userService.getHobbies().toString());
			pst.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (result.hasErrors()) {
			return "userForm";
		}

		model.put("user", user);
		return "userSuccess";

	}

	public ArrayList<User> fetchData() {
		ResultSet rs = null;
		ArrayList<User> list = null;

		try {
			rs = stmt.executeQuery("select * from aop");
			list = new ArrayList<User>();
			while (rs.next()) {
				list.add(new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
