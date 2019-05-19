package model;

import java.sql.Timestamp;
import java.util.Date;

public class News {
    private String title;
    private String content;
    private static int ID=0;
    private int id;
    private String shortDecription;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
    private String censor;
    private String thumbnail;
    private String status;
    private int categoryID;

    public News(String title, String content, int id, String shortDecription, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate, String censor, String thumbnail, String status, int categoryID) {
        this.title = title;
        this.content = content;
        this.id = ID++;
        this.shortDecription = shortDecription;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.censor = censor;
        this.thumbnail = thumbnail;
        this.status = status;
        this.categoryID = categoryID;
    }

    public static int getID() {
        return ID;
    }


    public int getId() {
        return id;
    }


    public String getShortDecription() {
        return shortDecription;
    }

    public void setShortDecription(String shortDecription) {
        this.shortDecription = shortDecription;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCensor() {
        return censor;
    }

    public void setCensor(String censor) {
        this.censor = censor;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }


    public News(){
        this.title = "";
        this.content = "";
        this.id = ID++;
        this.shortDecription = "";
        this.createdBy = "";
        this.createdDate = new Date();
        this.modifiedBy = "";
        this.modifiedDate = new Date();
        this.censor = "";
        this.thumbnail = "";
        this.status = "";
        this.categoryID = 0;
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

}
