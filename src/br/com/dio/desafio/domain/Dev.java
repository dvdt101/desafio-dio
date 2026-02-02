package br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentsSubscribed = new LinkedHashSet<>();
    private Set<Content> contentsConcluded = new LinkedHashSet<>();

    public void subscribeContent(Bootcamp bootcamp){
        this.contentsSubscribed.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.contentsSubscribed.stream().findFirst();

        if(content.isPresent()){
            this.contentsConcluded.add(content.get());
            this.contentsSubscribed.remove(content.get());
        }else{
            System.out.println("Erro ao progredir dev.");
        }

    }

    public double calcTotalXp(){
        return this.contentsSubscribed
                .stream()
                .mapToDouble(content -> content.calcXp())
                .sum();
    }

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
