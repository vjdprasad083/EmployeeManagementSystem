package com.cg.entities;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Compliance")

public class Compliance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complianceId;
	private String rllType;
	private String details;
	private LocalDate createDate;
	private int empCount;
	private int stsCount;
	private String status;
	@ManyToOne(
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name = "depart_Id",
			referencedColumnName = "departId"
			)
	
	private Department department;

}