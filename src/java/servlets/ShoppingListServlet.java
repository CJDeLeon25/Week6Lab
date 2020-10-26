/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 798676
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        if(action != null && action.equals("logout")){
            session.invalidate();
            session = request.getSession();
            response.sendRedirect("ShoppingList");

        }
        else{
            if(session.getAttribute("username") == null ){
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

        }
        }
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session = request.getSession();
       ArrayList<String> itemList = new ArrayList<String>();
       String action = request.getParameter("action");
       String username = request.getParameter("username");
       if((action.contains("register"))){
           session.setAttribute("username",username);
           session.setAttribute("itemList",itemList);
           System.out.println(action);
        
       }
       else if (action.contains("add")){
           String item = request.getParameter("item");

           itemList = (ArrayList<String>)session.getAttribute("itemList");
           itemList.add(item);
           System.out.println(action);

       }
       else if(action.contains("delete")){
           String listItem = request.getParameter("itemRadio");
           itemList = (ArrayList<String>)session.getAttribute("itemList");
           itemList.remove(listItem);
           System.out.println("deleted??");
           session.setAttribute("itemList",itemList);
       }
       else{
           System.out.println(action);
       }
        
       
       getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

}
