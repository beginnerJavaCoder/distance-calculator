package com.example.domain;

import javax.persistence.*;

@Entity
@Table(name = "distance")
public class Distance extends Model {

    @ManyToOne
    @JoinColumn(name = "from_city_id")
    private City from;
    @ManyToOne
    @JoinColumn(name = "to_city_id")
    private City to;
    private Double distance;

    public Distance() {

    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
