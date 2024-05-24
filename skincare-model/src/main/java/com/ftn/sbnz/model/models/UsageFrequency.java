package com.ftn.sbnz.model.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class UsageFrequency {
	
	@Id
    @GeneratedValue()
    @Column(name="id")
    private Long id;

	@Column(name="frequency", nullable=false)
	@Enumerated(EnumType.STRING)
	private UsageFrequencyEnum usageFrequencyEnum;

	@Column(name="period", nullable=false)
	@Enumerated(EnumType.STRING)
	private UsagePeriod usagePeriod;

	public UsageFrequencyEnum getUsageFrequencyEnum() {
		return usageFrequencyEnum;
	}

	public void setUsageFrequencyEnum(UsageFrequencyEnum usageFrequencyEnum) {
		this.usageFrequencyEnum = usageFrequencyEnum;
	}

	public UsagePeriod getUsagePeriod() {
		return usagePeriod;
	}

	public void setUsagePeriod(UsagePeriod usagePeriod) {
		this.usagePeriod = usagePeriod;
	}

	public UsageFrequency() {
	}

	public UsageFrequency(Long id, UsageFrequencyEnum usageFrequencyEnum, UsagePeriod usagePeriod, List<Usage> usage) {
		this.id = id;
		this.usageFrequencyEnum = usageFrequencyEnum;
		this.usagePeriod = usagePeriod;
		this.usage = usage;
	}

	@OneToMany(mappedBy = "usageFrequency",
			cascade = CascadeType.ALL,
			orphanRemoval = false)
	private List<Usage> usage;

	public List<Usage> getUsage() {
		return usage;
	}

	public void setUsage(List<Usage> usage) {
		this.usage = usage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
