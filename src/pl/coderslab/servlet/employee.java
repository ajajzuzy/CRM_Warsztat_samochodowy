package pl.coderslab.servlet;

import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employee")
public class employee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String dane_ad = request.getParameter("dane_adres");
        String tel = request.getParameter("tel");
        String note = request.getParameter("note");
        String rg = request.getParameter("rg");

        int telInt = Integer.parseInt(tel);
        int rgInt = Integer.parseInt(rg);

        Employee employee = new Employee(imie, nazwisko, dane_ad, telInt,note,rgInt);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("employee.jsp").forward(request,response);


    }
}
