package com.liberbliss.prototype.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Categories {
    @Id @GeneratedValue
    @JoinColumn(name = "category_id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Categories parentId;
}
