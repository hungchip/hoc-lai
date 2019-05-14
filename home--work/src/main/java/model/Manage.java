package model;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    private List<News> news = new ArrayList();

    public Manage(List<News> news) {
        this.news = news;
    }

    public Manage(){
    }
    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public void intput(){
        News n = new News();
        n.setTitle("tieu de");
        n.setContent("noi dung");
        news.add(n);
    }
}
