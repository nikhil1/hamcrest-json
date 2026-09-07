package uk.co.datumedge.hamcrest.json;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

public class StringDescriptionAssert {
	public static void assertThat(StringDescription description, Matcher<String> matcher) {
		assertThat(description.toString(), matcher);
	}
}
