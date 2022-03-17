package com.abdiev.springweb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Get The Fuck Up! :0")
    private String departmentName;
    @NotBlank(message = "Get The Fuck Up! :0")
    private String departmentAddress;
    @NotBlank(message = "Get The Fuck Up! :0")
    private String departmentCode;
}
