package com.example.product.controller;

import com.example.product.model.product;
import com.example.product.service.ServiceProduct;
import com.example.product.service.ServiceProductImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product",""})
public class ProductServlet extends HttpServlet {
    ServiceProduct products = new ServiceProductImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreatePage(request,response);
                break;
            case "edit":
                showEditPage(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "descrise" :
                description(request,response);
                break;
            default:
                showList(request,response);
        }
    }
    protected void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("product",products.displayAll());
        request.getRequestDispatcher("/view/list.jsp").forward(request,response);
    }
    protected void showCreatePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/view/create.jsp");
    }
    protected void showEditPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        product product = products.displayDescrise(id-1);
        if(product != null){
            request.setAttribute("product",product);
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        }
    }
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        products.remove(id);
        response.sendRedirect("/product");
    }
    protected void description(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        product product1 = products.displayDescrise(id-1);
        if(product1 != null){
            response.sendRedirect("/view/description.jsp");
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                update(request,response);
                break;
            case "delete":
                break;
            case "descrise" :
                break;
            case "search":
                search(request,response);
                break;
            default:
                showList(request,response);
        }
    }
    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String descrise = request.getParameter("descrise");
        String producer = request.getParameter("producer");
        product product = new product(id,name,price,descrise,producer);
        products.addNew(product);
        response.sendRedirect("/product");
    }
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String descrise = request.getParameter("descrise");
        String producer = request.getParameter("producer");
        product product = products.displayDescrise(id-1);
        if(product != null){
            product.setName(name);
            product.setPrice(price);
            product.setDescrise(descrise);
            product.setNSX(producer);
            products.update(id,product);
        }
        response.sendRedirect("/product");
    }
    protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        List<product> list = products.searchByName(name);
        if(list != null){
            request.setAttribute("product",list);
            request.getRequestDispatcher("/view/list.jsp").forward(request,response);
        }
    }
}
