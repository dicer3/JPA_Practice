package com.example.jpaprac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.jpaprac.dao.UserRepository;
import com.example.jpaprac.entities.User;

@SpringBootApplication
public class JpapracApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =  SpringApplication.run(JpapracApplication.class, args);

		//UserRepository userRepository = run.getBean(UserRepository.class);

		// User user1 = new User();
		// user1.setName("Durgesh Kumar Tiwari");
		// user1.setCity("Delhi");
		// user1.setStatus("I am java dev");

		// User user = userRepository.save(user1);
		// saving single user
		//System.out.println("user "+user);

        // User user1 = new User();
		// user1.setName("Nischay mittal");
		// user1.setCity("jammu");
		// user1.setStatus("I am MERN dev");

		// User user2 = new User();
		// user2.setName("Nridhi goyal");
		// user2.setCity("ahembabad");
		// user2.setStatus("I am Dev ops");

		// List<User> userList = new ArrayList<>();
		// userList.add(user1);
		// userList.add(user2);
		// List<User> ans = (List<User>) userRepository.saveAll(userList);

		// System.out.println("all users");
		// ans.forEach(user-> System.out.println("user "+user));

		// Optional<User> optional = userRepository.findById(3);
        // User user = optional.orElse(null);

		// if(user != null){
		// 	user.setName("deepu singh");
		// 	userRepository.save(user);
		// 	System.out.println("user "+user);
		// }

		// List<User> allUsers = (List<User>) userRepository.findAll();
		// for(User user1: allUsers){
		// 	System.out.println("user "+user1.toString());
		// }

		// Iterable<User> itr = userRepository.findAll();
		// Iterator<User> iterator = itr.iterator();

		// while(iterator.hasNext()){
		// 	User user2 = iterator.next();
		// 	System.out.println(user2);
		// }

		// userRepository.deleteById(2);

		// List<User> allUsers = userRepository.findByName("Nischay mittal");
		// allUsers.forEach(user3-> System.out.println("user "+user3));

		// List<User> allUsers2 = userRepository.getAllUser();
		// allUsers2.forEach(user4-> System.out.println("user4 "+user4));

		// List<User> allUsers3 = userRepository.getAllUserByName("Nischay mittal","jammu");
		// allUsers3.forEach(user4-> System.out.println("user4 "+user4));
	}

}
