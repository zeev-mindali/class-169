package JDBC_17_01_2024.cls;

import java.util.Objects;

public class Students {
    private int id;
    private String name;
    private String tel;
    private int avgGrade;
    private String city;
    private boolean isMarried;

    public Students(int id, String name, String tel, int avgGrade, String city, boolean isMarried) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.avgGrade = avgGrade;
        this.city = city;
        this.isMarried = isMarried;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && avgGrade == students.avgGrade && isMarried == students.isMarried && Objects.equals(name, students.name) && Objects.equals(tel, students.tel) && Objects.equals(city, students.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tel, avgGrade, city, isMarried);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", avgGrade=" + avgGrade +
                ", city='" + city + '\'' +
                ", isMarried=" + isMarried +
                "}\n";
    }
}
