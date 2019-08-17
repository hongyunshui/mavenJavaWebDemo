package com.servlet.helloworld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("***helloWorld*****com.servlet.helloworld.HelloWorld.doGet(HttpServletRequest, HttpServletResponse)********");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 跳转到/welcome/welcome.html页面
		response.sendRedirect("/welcome/welcome.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("*********com.servlet.helloworld.HelloWorld.doPost(HttpServletRequest, HttpServletResponse)*********");
		doGet(request, response);
	}


}
