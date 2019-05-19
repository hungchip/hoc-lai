package dao.daoimpl;

import dao.INewsDAO;
import model.News;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewsDaoImpl implements INewsDAO {

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/news";
            String userName = "root";
            String password = "1234";
            try {
                return DriverManager.getConnection(url,userName,password);
            } catch (SQLException e) {
                return null;
            }
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public void insert(News news) {

        try {
            String insert = "INSERT INTO news(content, modifiedDate, Tilte, ShortDecription, CreatedBy, Censor) VALUES(?,?,?,?,?,?)";
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setString(1,news.getContent());
            ps.setTimestamp(2,new Timestamp(news.getModifiedDate().getTime()));
            ps.setString(3,news.getTitle());
            ps.setString(4,news.getShortDecription());
            ps.setString(5,news.getCreatedBy());
            ps.setString(6,news.getCensor());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        News news = new News();
        Date date = new Date();
        news.setModifiedDate(date);
        news.setContent("noi dung");
        news.setShortDecription(" mo ta ngắn");
        news.setCreatedBy(" tác giả");
        news.setCensor("người kiểm duyệt");
        news.setTitle("đây là tiêu đề");



        INewsDAO iNewsDAO = new NewsDaoImpl();
        iNewsDAO.insert(news);

    }
}
