package de.telran.grigoryev.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kmAsString = request.getParameter("km");
        String kgAsString = request.getParameter(("kg"));

        int km = Integer.parseInt(kmAsString);
        double kg = Double.parseDouble(kgAsString);

        CostCalculator calculator = new CostCalculator(500, 20);
        double cost = calculator.calcCost(kg, km);

        PrintWriter printWriter = response.getWriter();
        printWriter.write("<h1>Cost:<h2>");
        printWriter.write("<h2>" + cost + "<h2>");

    }
}

