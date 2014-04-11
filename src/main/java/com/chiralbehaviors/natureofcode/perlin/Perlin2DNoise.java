/** 
 * (C) Copyright 2014 Chiral Behaviors, LLC. All Rights Reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package com.chiralbehaviors.natureofcode.perlin;

import processing.core.PApplet;

/**
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class Perlin2DNoise extends PApplet {
	
	int animate = 0;
	
	public void setup() {
		size(640, 360);
		
	}
	
	public void draw() {
		loadPixels();
		float xoff = 0;
		for (int x = 0; x < width; x++) {
			float yoff = 0;
			for (int y = 0; y < height; y++) {
				float shade = map(noise(xoff,yoff, animate), 0, 1, 0, 255);
				pixels[x + y*width] = color(shade);
				yoff += 0.01;
			}
			xoff += 0.01;
		}
		updatePixels();
		
		animate++;
	}

}
