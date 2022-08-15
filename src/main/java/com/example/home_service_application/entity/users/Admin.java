package com.example.home_service_application.entity.users;

import com.example.home_service_application.entity.core.BaseUser;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Admin extends BaseUser {

}
