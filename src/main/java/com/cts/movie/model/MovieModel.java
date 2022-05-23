package com.cts.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieid;
    private String moviename;
    private String moviedescription;
    private String moviegenre;
    private double price;

    public MovieModel() {
        super();
    }

    public MovieModel(int movieid, String moviename, String moviedescription, String moviegenre, double price) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.moviedescription = moviedescription;
        this.moviegenre = moviegenre;
        this.price = price;
    }

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedescription() {
        return moviedescription;
    }

    public void setMoviedescription(String moviedescription) {
        this.moviedescription = moviedescription;
    }

    public String getMoviegenre() {
        return moviegenre;
    }

    public void setMoviegenre(String moviegenre) {
        this.moviegenre = moviegenre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MovieModel [moviedescription=" + moviedescription + ", moviegenre=" + moviegenre + ", movieid="
                + movieid + ", moviename=" + moviename + ", price=" + price + "]";
    }

}
