package com.raoliveira.imechanicapi;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * raOliveira.pt | 16/10/2021
 * Computer Science Engineering
 **/

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cars {

    @Id
    // @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Exclude
    private int id;

    // @Column(name = "BRAND")
    private String brand;

    // @Column(name = "MODEL")
    private String model;

    // @Column(name = "YEAR")
    private String year;

    // @Column(name = "OPTION")
    private String option;

    // @Column(name = "ENGINE_CYLINDERS")
    private String engine_cylinders;

    // @Column(name = "ENGINE_DISPLACEMENT")
    private String engineDisplacement;

    // @Column(name = "ENGINE_POWER")
    private String enginePower;

    // @Column(name = "ENGINE_TORQUE")
    private String engineTorque;

    // @Column(name = "ENGINE_FUEL_SYSTEM")
    private String engineFuelSystem;

    //@Column(name = "ENGINE_FUEL")
    private String engineFuel;

    //@Column(name = "engine_c2o")
    private String engine_c2o;

    //@Column(name = "performance_top_speed")
    private String performance_top_speed;

    //@Column(name = "performance_acceleration")
    private String performance_acceleration;

    //@Column(name = "fuel_economy_city")
    private String fuel_economy_city;

    //@Column(name = "fuel_economy_highway")
    private String fuel_economy_highway;

    //@Column(name = "fuel_economy_combined")
    private String fuel_economy_combined;

    //@Column(name = "transmission_drive_type")
    private String transmission_drive_type;

    //@Column(name = "transmission_gearbox")
    private String transmission_gearbox;

    //@Column(name = "brakes_front")
    private String brakes_front;

    //@Column(name = "brakes_rear")
    private String brakes_rear;

    //@Column(name = "tires_size")
    private String tires_size;

    //@Column(name = "dimensions_length")
    private String dimensions_length;

    //@Column(name = "dimensions_width")
    private String dimensions_width;

    //@Column(name = "dimensions_height")
    private String dimensions_height;

    //@Column(name = "dimensions_front_rear_track")
    private String dimensions_front_rear_track;

    //@Column(name = "dimensions_wheelbase")
    private String dimensions_wheelbase;

    //@Column(name = "dimensions_ground_clearance")
    private String dimensions_ground_clearance;

    //@Column(name = "dimensions_cargo_volume")
    private String dimensions_cargo_volume;

    //@Column(name = "dimensions_cd")
    private String dimensions_cd;

    //@Column(name = "weight_unladen")
    private String weight_unladen;

    //@Column(name = "weight_limit")
    private String weight_limit;


    /*
    public CarEntity() {
    }

    public CarEntity(String brand, String model, String year, String option, String engine_cylinders,
                     String engineDisplacement, String enginePower, String engineTorque, String engineFuelSystem,
                     String engineFuel, String engine_c2o, String performance_top_speed,
                     String performance_acceleration, String fuel_economy_city, String fuel_economy_highway,
                     String fuel_economy_combined, String transmission_drive_type, String transmission_gearbox,
                     String brakes_front, String brakes_rear, String tires_size, String dimensions_length,
                     String dimensions_width, String dimensions_height, String dimensions_front_rear_track,
                     String dimensions_wheelbase, String dimensions_ground_clearance, String dimensions_cargo_volume,
                     String dimensions_cd, String weight_unladen, String weight_limit) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.option = option;
        this.engine_cylinders = engine_cylinders;
        this.engineDisplacement = engineDisplacement;
        this.enginePower = enginePower;
        this.engineTorque = engineTorque;
        this.engineFuelSystem = engineFuelSystem;
        this.engineFuel = engineFuel;
        this.engine_c2o = engine_c2o;
        this.performance_top_speed = performance_top_speed;
        this.performance_acceleration = performance_acceleration;
        this.fuel_economy_city = fuel_economy_city;
        this.fuel_economy_highway = fuel_economy_highway;
        this.fuel_economy_combined = fuel_economy_combined;
        this.transmission_drive_type = transmission_drive_type;
        this.transmission_gearbox = transmission_gearbox;
        this.brakes_front = brakes_front;
        this.brakes_rear = brakes_rear;
        this.tires_size = tires_size;
        this.dimensions_length = dimensions_length;
        this.dimensions_width = dimensions_width;
        this.dimensions_height = dimensions_height;
        this.dimensions_front_rear_track = dimensions_front_rear_track;
        this.dimensions_wheelbase = dimensions_wheelbase;
        this.dimensions_ground_clearance = dimensions_ground_clearance;
        this.dimensions_cargo_volume = dimensions_cargo_volume;
        this.dimensions_cd = dimensions_cd;
        this.weight_unladen = weight_unladen;
        this.weight_limit = weight_limit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getEngine_cylinders() {
        return engine_cylinders;
    }

    public void setEngine_cylinders(String engine_cylinders) {
        this.engine_cylinders = engine_cylinders;
    }

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(String engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineTorque() {
        return engineTorque;
    }

    public void setEngineTorque(String engineTorque) {
        this.engineTorque = engineTorque;
    }

    public String getEngineFuelSystem() {
        return engineFuelSystem;
    }

    public void setEngineFuelSystem(String engineFuelSystem) {
        this.engineFuelSystem = engineFuelSystem;
    }

    public String getEngineFuel() {
        return engineFuel;
    }

    public void setEngineFuel(String engineFuel) {
        this.engineFuel = engineFuel;
    }

    public String getEngine_c2o() {
        return engine_c2o;
    }

    public void setEngine_c2o(String engine_c2o) {
        this.engine_c2o = engine_c2o;
    }

    public String getPerformance_top_speed() {
        return performance_top_speed;
    }

    public void setPerformance_top_speed(String performance_top_speed) {
        this.performance_top_speed = performance_top_speed;
    }

    public String getPerformance_acceleration() {
        return performance_acceleration;
    }

    public void setPerformance_acceleration(String performance_acceleration) {
        this.performance_acceleration = performance_acceleration;
    }

    public String getFuel_economy_city() {
        return fuel_economy_city;
    }

    public void setFuel_economy_city(String fuel_economy_city) {
        this.fuel_economy_city = fuel_economy_city;
    }

    public String getFuel_economy_highway() {
        return fuel_economy_highway;
    }

    public void setFuel_economy_highway(String fuel_economy_highway) {
        this.fuel_economy_highway = fuel_economy_highway;
    }

    public String getFuel_economy_combined() {
        return fuel_economy_combined;
    }

    public void setFuel_economy_combined(String fuel_economy_combined) {
        this.fuel_economy_combined = fuel_economy_combined;
    }

    public String getTransmission_drive_type() {
        return transmission_drive_type;
    }

    public void setTransmission_drive_type(String transmission_drive_type) {
        this.transmission_drive_type = transmission_drive_type;
    }

    public String getTransmission_gearbox() {
        return transmission_gearbox;
    }

    public void setTransmission_gearbox(String transmission_gearbox) {
        this.transmission_gearbox = transmission_gearbox;
    }

    public String getBrakes_front() {
        return brakes_front;
    }

    public void setBrakes_front(String brakes_front) {
        this.brakes_front = brakes_front;
    }

    public String getBrakes_rear() {
        return brakes_rear;
    }

    public void setBrakes_rear(String brakes_rear) {
        this.brakes_rear = brakes_rear;
    }

    public String getTires_size() {
        return tires_size;
    }

    public void setTires_size(String tires_size) {
        this.tires_size = tires_size;
    }

    public String getDimensions_length() {
        return dimensions_length;
    }

    public void setDimensions_length(String dimensions_length) {
        this.dimensions_length = dimensions_length;
    }

    public String getDimensions_width() {
        return dimensions_width;
    }

    public void setDimensions_width(String dimensions_width) {
        this.dimensions_width = dimensions_width;
    }

    public String getDimensions_height() {
        return dimensions_height;
    }

    public void setDimensions_height(String dimensions_height) {
        this.dimensions_height = dimensions_height;
    }

    public String getDimensions_front_rear_track() {
        return dimensions_front_rear_track;
    }

    public void setDimensions_front_rear_track(String dimensions_front_rear_track) {
        this.dimensions_front_rear_track = dimensions_front_rear_track;
    }

    public String getDimensions_wheelbase() {
        return dimensions_wheelbase;
    }

    public void setDimensions_wheelbase(String dimensions_wheelbase) {
        this.dimensions_wheelbase = dimensions_wheelbase;
    }

    public String getDimensions_ground_clearance() {
        return dimensions_ground_clearance;
    }

    public void setDimensions_ground_clearance(String dimensions_ground_clearance) {
        this.dimensions_ground_clearance = dimensions_ground_clearance;
    }

    public String getDimensions_cargo_volume() {
        return dimensions_cargo_volume;
    }

    public void setDimensions_cargo_volume(String dimensions_cargo_volume) {
        this.dimensions_cargo_volume = dimensions_cargo_volume;
    }

    public String getDimensions_cd() {
        return dimensions_cd;
    }

    public void setDimensions_cd(String dimensions_cd) {
        this.dimensions_cd = dimensions_cd;
    }

    public String getWeight_unladen() {
        return weight_unladen;
    }

    public void setWeight_unladen(String weight_unladen) {
        this.weight_unladen = weight_unladen;
    }

    public String getWeight_limit() {
        return weight_limit;
    }

    public void setWeight_limit(String weight_limit) {
        this.weight_limit = weight_limit;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", option='" + option + '\'' +
                ", engine_cylinders='" + engine_cylinders + '\'' +
                ", engineDisplacement='" + engineDisplacement + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", engineTorque='" + engineTorque + '\'' +
                ", engineFuelSystem='" + engineFuelSystem + '\'' +
                ", engineFuel='" + engineFuel + '\'' +
                ", engine_c2o='" + engine_c2o + '\'' +
                ", performance_top_speed='" + performance_top_speed + '\'' +
                ", performance_acceleration='" + performance_acceleration + '\'' +
                ", fuel_economy_city='" + fuel_economy_city + '\'' +
                ", fuel_economy_highway='" + fuel_economy_highway + '\'' +
                ", fuel_economy_combined='" + fuel_economy_combined + '\'' +
                ", transmission_drive_type='" + transmission_drive_type + '\'' +
                ", transmission_gearbox='" + transmission_gearbox + '\'' +
                ", brakes_front='" + brakes_front + '\'' +
                ", brakes_rear='" + brakes_rear + '\'' +
                ", tires_size='" + tires_size + '\'' +
                ", dimensions_length='" + dimensions_length + '\'' +
                ", dimensions_width='" + dimensions_width + '\'' +
                ", dimensions_height='" + dimensions_height + '\'' +
                ", dimensions_front_rear_track='" + dimensions_front_rear_track + '\'' +
                ", dimensions_wheelbase='" + dimensions_wheelbase + '\'' +
                ", dimensions_ground_clearance='" + dimensions_ground_clearance + '\'' +
                ", dimensions_cargo_volume='" + dimensions_cargo_volume + '\'' +
                ", dimensions_cd='" + dimensions_cd + '\'' +
                ", weight_unladen='" + weight_unladen + '\'' +
                ", weight_limit='" + weight_limit + '\'' +
                '}';
    }
*/
}