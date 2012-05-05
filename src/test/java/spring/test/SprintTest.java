package spring.test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class SprintTest {
	
	@Test
	public void shouldTest() {
		assertThat(true, is(true));
	}

}
