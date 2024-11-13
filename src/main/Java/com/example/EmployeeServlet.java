package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class EmployeeServlet extends HttpServlet {
    
    private List<Map<String, String>> employees = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        // Initialize employee data
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("name", "John Doe");
        employee1.put("doj", "2020-06-01");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("name", "Jane Smith");
        employee2.put("doj", "2021-01-15");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("name", "Sam Wilson");
        employee3.put("doj", "2022-03-10");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Employee Details</h1>");
        out.println("<table border='1' cellpadding='5' cellspacing='0'>");
        out.println("<tr><th>Employee Name</th><th>Date of Joining</th></tr>");

        // Loop through employee data and display in table
        for (Map<String, String> employee : employees) {
            out.println("<tr>");
            out.println("<td>" + employee.get("name") + "</td>");
            out.println("<td>" + employee.get("doj") + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
