package com.reestts.hibernate.basic.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "salary")
    private int salary;

    public Employee(String name, String surname, String departmentId, int salary) {
        this.name = name;
        this.surname = surname;
        this.departmentId = departmentId;
        this.salary = salary;
    }
}