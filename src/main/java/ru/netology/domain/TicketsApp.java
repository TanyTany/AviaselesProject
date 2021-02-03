package ru.netology.domain;

public class TicketsApp implements Comparable<TicketsApp> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int timeFly;

    public int compareTo(TicketsApp o) {
        return this.price - o.price;
    }
    public TicketsApp(int id, int price, String from, String to, int timeFly) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.timeFly = timeFly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTimeFly() {
        return timeFly;
    }

    public void setTimeFly(int timeFly) {
        this.timeFly = timeFly;
    }

}
