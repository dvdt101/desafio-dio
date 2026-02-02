package br.com.dio.desafio.domain;

public class Course extends Content {

    private int workload;

    public Course() {}

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double calcXp() {
        return XP_DEFAULT * this.workload;
    }
}
