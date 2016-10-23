package entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by MBalicky on 23/10/2016.
 */

@Entity
@TypeDef(name="interval", typeClass = Interval.Class)
public class InspectionInterval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Type(type = "interval")
    private int interval;

    public InspectionInterval(){}

    public InspectionInterval(String name, int interval){
        this.name = name;
        this.interval = interval;
    }

    public int getId(){
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
