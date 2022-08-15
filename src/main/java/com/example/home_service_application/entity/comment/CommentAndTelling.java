package com.example.home_service_application.entity.comment;

import com.example.home_service_application.entity.core.BaseComment;
import com.example.home_service_application.entity.users.Customer;
import com.example.home_service_application.entity.users.Worker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "CommentAndTelling")
public class CommentAndTelling extends BaseComment {
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer_id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Worker worker_id;
}
