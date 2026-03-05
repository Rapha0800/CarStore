package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Create-Car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Ira pegar o nome do carro pelo formulario*/
        String carName = req.getParameter("car-name");

        /*Ira printar o nome do carro no terminal*/
        System.out.println(carName);

        /*Ira dizer que a resposta sera em json*/
        resp.setContentType("application/json");

        /*criando o json que ira receber o valor digitado*/
        String json = "{ \"carName\": \"" + carName + "\"}";

        /*Ira enviar o json*/
        resp.getWriter().write(json);





    }
}
