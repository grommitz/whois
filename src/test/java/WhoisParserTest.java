import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by martin on 30/07/17.
 */
public class WhoisParserTest {

	@Test
	public void test() throws IOException {
		String whois = readResourceTextFile("/whois/martincharlesworth.com");
		System.out.println("RAW = " + whois);
		String parsed = new WhoisParser().parseOne(whois);
		System.out.println(parsed);
	}

	private String readResourceTextFile(String resourcePath) throws IOException {
		try (InputStream is = this.getClass().getResourceAsStream(resourcePath)) {
			if (is == null) {
				throw new IOException("No such resource: " + resourcePath);
			}
			return IOUtils.toString(is);
		}

	}

}
