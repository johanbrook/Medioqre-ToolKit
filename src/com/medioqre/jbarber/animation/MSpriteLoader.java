package com.medioqre.jbarber.animation;

import java.beans.XMLDecoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MSpriteLoader {

	public MSpriteLoader(String fileURL)
	{
		BufferedReader br;
		try {
			 br = new BufferedReader(new FileReader(fileURL));
			 
			 boolean shouldRun = true;
				String line;
				while (shouldRun) {
					try {
						line = br.readLine();
						
						if (line == null) {
							shouldRun = false;
						} else {
							System.out.println("Line: "+line);
						}
					} catch (IOException e) {
						System.out.println("Error reading the sprite XML-file!");
						e.printStackTrace();
					}
				}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the sprite XML-file!");
			e.printStackTrace();
		}
	}
}
