package com.fresnel.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fresnel.cg.models.Post;
import com.fresnel.cg.models.Tag;
import com.fresnel.cg.models.Repository.PostRepository;

@SpringBootApplication
public class SpringBootManyToManyMappingJpaHibernateApplication implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootManyToManyMappingJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot");
		
		Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot", 
				"Hibernate One to Many Mapping Example with Spring Boot", 
				"Hibernate One to Many Mapping Example with Spring Boot");
		
		Tag springBoot = new Tag("Spring Boot");
		Tag hibernate = new Tag("Hibernate");
		
		// add tag references post
		post.getTags().add(springBoot);
		post.getTags().add(hibernate);
		
		// add post references tag
		
		springBoot.getPosts().add(post);
		hibernate.getPosts().add(post);
		
		springBoot.getPosts().add(post1);
		post1.getTags().add(springBoot);
		
		
		this.postRepository.save(post);
		this.postRepository.save(post1);
		
	}

}
