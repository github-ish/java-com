package com.java.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.dao.Userdao;
import com.java.model.User;
import com.java.service.LoginClass;
 
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/user.jsp";
    private static String LIST_USER = "/listuser.jsp";
    //private Userdao dao;
    private LoginClass login;
    public UserController() {
        super();
        login = new LoginClass();
        //dao = new Userdao();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user;
        
        //user.setUsername(request.getParameter("uname"));
        //user.setPassword(request.getParameter("pass"));
        System.out.println(request.getParameter("uname"));
        System.out.println(request.getParameter("pass"));
        user =login.authenticate(request.getParameter("uname"),request.getParameter("pass"));
        System.out.println("hey"+user.getPassword());
        HttpSession session = request.getSession(true);
        session.setAttribute("uname", user.getUsername());
        session.setAttribute("type", user.getType());
        RequestDispatcher view = request.getRequestDispatcher("reviewer.jsp");
        request.setAttribute("name", user.getUsername());
        view.forward(request, response);
    }}