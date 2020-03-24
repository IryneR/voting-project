package org.restaurantvoting.voting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class VotingApplicationTests {

	@Test
	void contextLoads() {
		List list = new ArrayList();
		list.add(1);
		list.add("1");

		List<Object> listObject = new ArrayList<>();
		listObject.add(1);
		listObject.add("1");

		List<? super Object> listSuperObject = new ArrayList<>();
		listSuperObject.add(1);
		listSuperObject.add("1");

	}

}
