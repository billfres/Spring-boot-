package com.fresnel.cg.models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fresnel.cg.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
