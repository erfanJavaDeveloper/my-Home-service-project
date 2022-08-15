package com.example.home_service_application.entity.users;

import com.example.home_service_application.entity.comment.CommentAndTelling;
import com.example.home_service_application.entity.core.BaseUser;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Customer extends BaseUser {
    @OneToMany(mappedBy = "customer_id")
    private List<CommentAndTelling> comment_AndTelling_id;
}
