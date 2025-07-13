package com.andrey_nicollas.mongodb_demo.config;

import com.andrey_nicollas.mongodb_demo.domain.Post;
import com.andrey_nicollas.mongodb_demo.domain.User;
import com.andrey_nicollas.mongodb_demo.dto.AuthorDTO;
import com.andrey_nicollas.mongodb_demo.dto.CommentDTO;
import com.andrey_nicollas.mongodb_demo.repository.PostRepository;
import com.andrey_nicollas.mongodb_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        User andrey = new User(null, "Andrey Nicollas Costa de Sousa", "andrey974@gmail.com");

        // salvando primeiro os usuários no banco de dados,
        // depois fazer a cópia para o AuthorDTO com os comentários aparecendo com a interação no id;
        userRepository.saveAll(Arrays.asList(maria, alex, bob, andrey));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem.", "Vou viajar para São Luís. Abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje!", new AuthorDTO(maria));
        Post post3 = new Post(null, sdf.parse("13/07/2025"), "Bom tarde!", "Nesse momento estou estudando SpringBoot com Java.", new AuthorDTO(andrey));

        CommentDTO c1 = new CommentDTO("Boa viagem mano!", sdf.parse("21/03/2018"), new AuthorDTO(alex));
        CommentDTO c2 = new CommentDTO("Aproveiteee!", sdf.parse("22/03/2018"), new AuthorDTO(bob));
        CommentDTO c3 = new CommentDTO("Tenha um ótimo dia!", sdf.parse("23/03/2018"), new AuthorDTO(alex));

        // associando os posts com os comentários
        post1.getComments().addAll(Arrays.asList(c1, c2));
        post2.getComments().addAll(Arrays.asList(c3));

        postRepository.saveAll(Arrays.asList(post1, post2, post3));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        andrey.getPosts().addAll(Arrays.asList(post3));
        userRepository.save(maria);
        userRepository.save(andrey);
    }
}
