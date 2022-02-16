package com.liberbliss.prototype.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
@Getter
public class Managers {
    @Id @GeneratedValue
    @JoinColumn(name = "manager_id")
    private Long id;
}
