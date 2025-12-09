package io.udlbu._4_stream;

import java.util.Objects;

class Vehicle {
    private String type;
    private String plate;

    Vehicle(String type, String plate) {
        this.type = type;
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(type, vehicle.type) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, plate);
    }

    @Override
    public String toString() {
        return type + " [" + plate + "]";
    }


}