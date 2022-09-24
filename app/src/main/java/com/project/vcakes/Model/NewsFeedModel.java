package com.project.vcakes.Model;

public class NewsFeedModel {

    int image;
    String amount;
    String header;

    public NewsFeedModel(int image, String amount, String header) {
        this.image = image;
        this.amount = amount;
        this.header = header;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
