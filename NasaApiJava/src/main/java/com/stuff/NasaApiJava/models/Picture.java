package com.stuff.NasaApiJava.models;

public class Picture {
    private String date;
    private String explanation;
    private String title;
    private String image;

    public Picture() {
    }

    public Picture(String date, String explanation, String title, String image) {
        this.date = date;
        this.explanation = explanation;
        this.title = title;
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
