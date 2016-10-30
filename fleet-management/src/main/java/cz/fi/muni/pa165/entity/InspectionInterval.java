package cz.fi.muni.pa165.entity;

import javax.persistence.*;

/**
 * @author Michal Balický
 */

@Entity
public class InspectionInterval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int interval;

    public InspectionInterval(String name, int interval){
        this.name = name;
        this.interval = interval;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getInterval(){
        return this.interval;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setInterval(int interval){
        this.interval = interval;
    }

}
