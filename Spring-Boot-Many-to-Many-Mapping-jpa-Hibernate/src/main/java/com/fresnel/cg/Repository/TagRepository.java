package com.fresnel.cg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fresnel.cg.models.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
