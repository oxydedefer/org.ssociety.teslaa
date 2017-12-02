package ssociety.org.teslaa.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by seb on 2/12/17.
 */

@Entity
public class Car {
    @Id
    private Long id;

    @NotNull
    private String category;
    @NotNull
    private String model;
    @NotNull
    private int battery_capacity;
    @NotNull
    private int maximal_speed;
    @NotNull
    private double time;
    @NotNull
    private int price;
    @Generated(hash = 1024076723)
    public Car(Long id, @NotNull String category, @NotNull String model,
            int battery_capacity, int maximal_speed, double time, int price) {
        this.id = id;
        this.category = category;
        this.model = model;
        this.battery_capacity = battery_capacity;
        this.maximal_speed = maximal_speed;
        this.time = time;
        this.price = price;
    }
    @Generated(hash = 625572433)
    public Car() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getBattery_capacity() {
        return this.battery_capacity;
    }
    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }
    public int getMaximal_speed() {
        return this.maximal_speed;
    }
    public void setMaximal_speed(int maximal_speed) {
        this.maximal_speed = maximal_speed;
    }
    public double getTime() {
        return this.time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }



}
