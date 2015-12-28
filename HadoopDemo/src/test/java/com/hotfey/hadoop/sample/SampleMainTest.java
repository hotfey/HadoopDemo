package com.hotfey.hadoop.sample;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class SampleMainTest {
	@Ignore
	@Test
	public void testSampleMain() throws IOException, InterruptedException, ClassNotFoundException {
		String home = System.getenv("HOME");
		String inputPath = home + "/Documents/input";
		String ouputPath = home + "/Documents/output/" + System.currentTimeMillis();
		String[] args = { inputPath, ouputPath };
		SampleMain.main(args);
	}
}
