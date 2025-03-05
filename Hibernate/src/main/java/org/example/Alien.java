package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Alien {

    @Id
    private int Aid;
    private String aname;
    private String tech;
//    @OneToOne
//    private Laptop laptop;
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptops;

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }

    @Override
    public String toString() {
        return "Alien{" +
                "Aid=" + Aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
}
