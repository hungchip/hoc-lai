package model;

import java.util.ArrayList;
import java.util.List;

public class News {
    private String title;
    private String content;
    private List<News> news = new ArrayList();

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public News(){
        this.title  = "";
        this.content = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void listOfNew(){
        for (int i =0; i<10; i++) {
            int j = 1;
            News n = new News();
            n.setTitle("tieu de "+ j++);
            news.add(n);
        }
    }
    public void outputList(){
        for (News n : news
             ) {
            System.out.println(n);
        }
    }
}
