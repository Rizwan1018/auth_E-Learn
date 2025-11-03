package com.elearning.auth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "instructors")
public class Instructor {

    @Id
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

///  @OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL,orphanRemoval = true)
///    private List<Course> courses;



}
