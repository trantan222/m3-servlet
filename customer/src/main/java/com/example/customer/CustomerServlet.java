package com.example.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer",""})
public class CustomerServlet extends HttpServlet {
    static List<customer> customerList = new ArrayList<>();
    static {
        customerList.add(new customer("Mai Văn Hoàn","1983-08-20","Hà Nôị","mai_van_hoan.png"));
        customerList.add(new customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","nguyen_van_nam.png"));
        customerList.add(new customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","nguyen_thai_hoa.png"));
        customerList.add(new customer("Trần Đăng Khoa","1983-08-17","Đà Nẵng","tran_dang_khoa.png"));
        customerList.add(new customer("Nguyễn Đình Thi","1983-08-19","Huế","nguyen_dinh_thi.png"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",customerList);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
