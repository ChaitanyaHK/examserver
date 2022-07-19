//package com.exam.examserver.configuration;
//
//import com.exam.examserver.model.Role;
//import com.exam.examserver.model.User;
//import com.exam.examserver.model.UserRole;
//import com.exam.examserver.repository.UserRepository;
//import com.exam.examserver.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Configuration
//public class AppConfiguration {
//
//    @Autowired
//    private UserService userService;
//
//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
//            User user = User.builder()
//                    .username("XYZ")
//                    .password("XYZ123")
//                    .firstName("XYZ")
//                    .lastName("DEF")
//                    .phone("9999999999")
//                    .email("example@gmail.com")
//                    .profile("default.png")
//                    .build();
//
//            Role admin_role = Role.builder()
//                    .roleId(44L)
//                    .roleName("ADMIN")
//                    .build();
//
//            Role client_role = Role.builder()
//                    .roleId(45L)
//                    .roleName("CLIENT")
//                    .build();
//
//
//            UserRole admin_userRole = UserRole.builder()
//                    .role(admin_role)
//                    .user(user)
//                    .build();
//
//            UserRole client_userRole = UserRole.builder()
//                    .role(client_role)
//                    .user(user)
//                    .build();
//
//            Set<UserRole> userRoleSet = new HashSet<>();
//            userRoleSet.add(admin_userRole);
//            userRoleSet.add(client_userRole);
//            User user1 = this.userService.createUser(user, userRoleSet);
////            System.out.println(user1.getUsername());
//        };
//    }
//}
