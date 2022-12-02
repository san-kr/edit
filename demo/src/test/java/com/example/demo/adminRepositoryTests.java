package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class adminRepositoryTests {
	@Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private adminRepository repo;

    @Test
    public void testCreateadmin() {
       admin user = new admin();
        user.setEmail("vcd@gmail.com");
        user.setPassword("msi2020");
        user.setAdmin_id(null);
        user.setUsername("vamsi");
        user.setFullname("yadav");
        user.setContact(9743510);
        user.setAdmin_group_id(01);
        admin savedadmin=repo.save(user);
         
        admin existadmin = entityManager.find(admin.class, savedadmin.getAdmin_id());
         
        assertThat(user.getEmail()).isEqualTo(existadmin.getEmail());
         
    }
}
