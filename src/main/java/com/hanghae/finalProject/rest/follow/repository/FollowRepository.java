package com.hanghae.finalProject.rest.follow.repository;

import com.hanghae.finalProject.rest.follow.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {
     
     Optional<Follow> findByUserIdAndFollowId(Long id, Long followId);
     
}