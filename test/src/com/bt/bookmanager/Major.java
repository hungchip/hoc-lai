package com.bt.bookmanager;

public enum Major {
    Khoa_Hoc_Tu_Nhien("Khoa Học Tự Nhiên", 1), Van_Hoc_Nghe_Thuat("Văn Học Nghệ Thuật", 2),
    Dien_Tu_Vien_Thong("Điện Tử Viễn Thông", 3), Cong_Nghe_Thong_Tin("Công Nghệ Thông tin", 4);

    private String name;
    private int label;

    public int getLabel() {
        return label;
    }

    Major(String name, int label) {
        this.name = name;
        this.label = label;
    }

    public String getName() {
        return name;
    }
}
