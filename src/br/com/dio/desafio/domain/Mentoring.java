package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public double calcXp() {
        return XP_DEFAULT + 10;
    }
}
