package com.bt.bookmanager;

import java.util.Date;
import java.util.Scanner;

public class Book {
    private static int id = 10000;
    private int bookID;
    private String bookName;
    private String author;
    private Major major;
    private int date;
    private int amount;

    public Book(String bookName, String author, Major major, int date, int amount) {
        this.bookID = id++;
        this.bookName = bookName;
        this.author = author;
        this.major = major;
        this.date = date;
        this.amount = amount;
    }

    public Book() {
        this.bookName = "";
        this.bookID = id++;
        this.author = "";
        this.amount = 0;

    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void input() {
        System.out.println("Nhập tên sách: ");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();

        int cn;
        do {
            System.out.println("Nhập chuyên ngành");
            cn = new Scanner(System.in).nextInt();
        } while (cn != 1 && cn != 2 && cn != 3 && cn != 4);
        if (cn == 1) {
            this.major = Major.Khoa_Hoc_Tu_Nhien;
        }
        if (cn == 2) {
            this.major = Major.Van_Hoc_Nghe_Thuat;
        }
        if (cn == 3) {
            this.major = Major.Dien_Tu_Vien_Thong;
        }
        if (cn == 4){
            this.major = Major.Cong_Nghe_Thong_Tin;
        }
        System.out.println("Nhập năm xuất bản: ");
        this.date = new Scanner(System.in).nextInt();
        System.out.println("Nhập số lượng: ");
        this.amount = new Scanner(System.in).nextInt();
    }

    public void output() {
        System.out.println("Mã Sách: " + this.bookID + "   " +
                "Tên sách: " + this.bookName + "   " +
                "Tác giả: " + this.author + "   " +
                "Chuyên ngành: " + this.major.getName() + "   " +
                "Năm xuất bản: " + this.date + "   " +
                "số lượng: " + this.amount);
    }
}
