package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentsSubscribed = new LinkedHashSet<>();
    private Set<Content> contentsConcluded = new LinkedHashSet<>();

    public void subscribeContent(Bootcamp bootcamp){}
    public void progress(){}
    public void calcTotalXp(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribed() {
        return contentsSubscribed;
    }

    public void setContentsSubscribed(Set<Content> contentsSubscribed) {
        this.contentsSubscribed = contentsSubscribed;
    }

    public Set<Content> getContentsConcluded() {
        return contentsConcluded;
    }

    public void setContentsConcluded(Set<Content> contentsConcluded) {
        this.contentsConcluded = contentsConcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribed, dev.contentsSubscribed) && Objects.equals(contentsConcluded, dev.contentsConcluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribed, contentsConcluded);
    }
}
