package com.proximie.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	private static Properties prop;


	public static void readPorperties(String filePath) {

		FileInputStream fis;

		try {

			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getproperty(String key) {

		return prop.getProperty(key);
	}

}
