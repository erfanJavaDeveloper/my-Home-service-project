package com.example.home_service_application.entity.users;

import com.example.home_service_application.entity.comment.CommentAndTelling;
import com.example.home_service_application.entity.core.BaseUser;
import com.example.home_service_application.entity.products_and_services.SubServiceAndProduct;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Worker extends BaseUser {
    @ManyToMany
    @JoinTable(name = "Worker_SubServiceAndProduct",
                joinColumns = {@JoinColumn(name = "WORKER_ID")}, inverseJoinColumns = {@JoinColumn(name = "COURSE_ID")})
    private List<SubServiceAndProduct> subServiceAndProduct= new ArrayList<>();

    @OneToMany(mappedBy = "worker_id")
    private List<CommentAndTelling> commentAndTelling = new ArrayList<>();
}
