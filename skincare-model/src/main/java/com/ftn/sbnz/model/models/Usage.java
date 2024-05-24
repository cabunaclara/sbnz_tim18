package com.ftn.sbnz.model.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Usage {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private UsageTime usageTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonIgnore
    public UsageFrequency usageFrequency;

    @Column
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsageTime getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(UsageTime usageTime) {
        this.usageTime = usageTime;
    }

    public UsageFrequency getUsageFrequency() {
        return usageFrequency;
    }

    public void setUsageFrequency(UsageFrequency usageFrequency) {
        this.usageFrequency = usageFrequency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Usage() {

    }

    public Usage(UsageTime usageTime, UsageFrequency usageFrequency, String description) {
        this.usageTime = usageTime;
        this.usageFrequency = usageFrequency;
        this.description = description;
    }
}
