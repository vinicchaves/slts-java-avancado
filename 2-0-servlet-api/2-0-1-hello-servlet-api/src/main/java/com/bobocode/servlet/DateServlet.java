package com.bobocode.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/date")
public class DateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LocalDate currentDate = LocalDate.now();

        // Defina o tipo de conteúdo como text/plain
        response.setContentType("text/plain");

        // Obtenha o PrintWriter para escrever a resposta
        PrintWriter out = response.getWriter();

        // Escreva a data atual como resposta
        out.println("Data Atual: " + currentDate);
    }
}
