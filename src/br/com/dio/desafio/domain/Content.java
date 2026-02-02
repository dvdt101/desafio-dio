package br.com.dio.desafio.domain;

public abstract class Content {
    protected static final double XP_DEFAULT = 10;

    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Content(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calcXp();
}
