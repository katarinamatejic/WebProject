package rs.raf.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import rs.raf.demo.model.*;
import rs.raf.demo.repositories.*;
import rs.raf.demo.services.UserService;
import rs.raf.demo.services.VacuumControlService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class BootstrapData implements CommandLineRunner {

    private final UserService userService;

    private final VacuumControlService vacuumControlService;
    //private final PasswordEncoder passwordEncoder;

    @Autowired
    public BootstrapData(UserService userService, VacuumControlService vacuumControlService) {
        this.userService = userService;
        this.vacuumControlService = vacuumControlService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Data...");
//
//       userService.saveRole(new Role(null, "can_read_users"));
//       userService.saveRole(new Role(null, "can_create_users"));
//      userService.saveRole(new Role(null, "can_update_users"));
//       userService.saveRole(new Role(null, "can_delete_users"));
//      userService.saveRole(new Role(null, "can_search_vacuums"));
//        userService.saveRole(new Role(null, "can_start_vacuums"));
//        userService.saveRole(new Role(null, "can_stop_vacuums"));
//        userService.saveRole(new Role(null, "can_discharge_vacuums"));
//        userService.saveRole(new Role(null, "can_add_vacuums"));
//        userService.saveRole(new Role(null, "can_remove_vacuums"));
//        userService.saveRole(new Role(null, "can_schedule_vacuums"));
//        userService.addUser(new User(null, "Katarina", "Matejic", "kmatejic@raf.rs", "9999"));
//       userService.addUser(new User(null, "Marko", "Markovic", "mmarkovic@raf.rs", "1234"));
////
//        userService.addRoleToUser("kmatejic@raf.rs", "can_read_users");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_create_users");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_update_users");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_delete_users");
////        //machine roles
//        userService.addRoleToUser("kmatejic@raf.rs", "can_search_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_start_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_stop_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_discharge_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_add_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_remove_vacuums");
//        userService.addRoleToUser("kmatejic@raf.rs", "can_schedule_vacuums");
////
//        userService.addRoleToUser("mmarkovic@raf.rs", "can_read_users");
//        userService.addRoleToUser("mmarkovic@raf.rs", "can_update_users");
//        userService.addRoleToUser("mmarkovic@raf.rs", "can_search_vacuums");
////
//        vacuumControlService.addVacuumControl("Vacuum1","kmatejic@raf.rs");
//        vacuumControlService.addVacuumControl("Vacuum2","mmarkovic@raf.rs");
//      vacuumControlService.addVacuumControl("Vacuum3","kmatejic@raf.rs");

        System.out.println("Data loaded!");
    }
}
