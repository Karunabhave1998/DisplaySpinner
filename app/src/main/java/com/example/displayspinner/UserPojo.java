package com.example.displayspinner;

public class UserPojo {

    int image;
    String countryname;
    String capital;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public UserPojo(int image, String countryname, String capital) {
        this.image = image;
        this.countryname = countryname;
        this.capital = capital;
    }

    public UserPojo(int image, String countryname) {
        this.image = image;
        this.countryname = countryname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
