package com.example.home_service_application.repository.comment;

import com.example.home_service_application.entity.comment.CommentAndTelling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentAndTellingRepo extends JpaRepository<CommentAndTelling,Long> {
}
