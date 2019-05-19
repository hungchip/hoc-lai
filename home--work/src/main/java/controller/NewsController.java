package controller;

import model.News;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/news")
public class NewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        News news1 = new News();
        news1.setTitle(" day la tieu de");
        news1.setContent("noi dung 1");

        News news2 = new News();
        news2.setTitle(" day la tieu de 2");
        news2.setContent("noi dung 2");

        News news3 = new News();
        news3.setTitle(" tieu de 3");
        news3.setContent("noi dung 3");

        List<News> newsList = new ArrayList<News>();
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);

        req.setAttribute("models",newsList );
        RequestDispatcher rd = req.getRequestDispatcher("/views/news.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
