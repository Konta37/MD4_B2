package konta.session02.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "category_id")
    private String cateId;

    @Column(name = "category_name", length = 100)
    private String cateName;
    @Column(name = "status")
    private Boolean status;

    @OneToMany(mappedBy = "cate")
    private List<Product> products;
}
