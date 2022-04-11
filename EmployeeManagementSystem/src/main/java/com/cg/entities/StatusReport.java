package com.cg.entities;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name ="Status_Report")
public class StatusReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	private String comments;
	private String details;
	private LocalDate createDate;
	
	@OneToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "frkUserId"), 
			referencedColumnName = "userId")
	User user;
	
	@OneToOne(
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name = "compliance_Id",
			referencedColumnName = "complianceId"
			)
	private Compliance complianceId;
	
	@ManyToOne(
			cascade = CascadeType.ALL
			)
	@JoinColumn(
			name = "depart_Id",
			referencedColumnName = "departId"
			)
	private Department department;

}