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
package com.chiralbehaviors.natureofcode.gaussian;

import java.util.Random;

import processing.core.PApplet;

/**
 * Spatters in 4 rough quandrants.
 * The x axis is the difference between g and b, so if they're both
 * really high they'll plot the same as if they're both really low.
 * @author hparry
 * 
 */
public class GaussianPalette2 extends PApplet {

	private static final long serialVersionUID = 1L;
	private int stdDev = 1;

	int radius = 20;
	private Random generator;
	int dimension = 800;
	private int mean = dimension / 2;

	public void setup() {
		size(dimension, dimension);
		background(255);
		generator = new Random();
	}

	public void draw() {
		float r = ((float) (generator.nextGaussian() + 1)/2 * mean) + stdDev;
		float g = ((float) (generator.nextGaussian() + 1)/2 * mean) + stdDev;
		float b = ((float) (generator.nextGaussian() + 1)/2 * mean) + stdDev;

		int xoffset = width / 2;
		int yoffset = height / 4;

		noStroke();
		fill(r, g, b, 100);
		int x = (int) (g - b + xoffset);
		int y = (int) (r + yoffset);
		ellipse(x, y, radius, radius);

	}

}
