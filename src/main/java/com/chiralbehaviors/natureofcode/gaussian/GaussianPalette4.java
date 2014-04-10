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
 * Spatters on a diagonal centerline. Missing most of the blues,
 * but far fewer outliers than v2.
 * @author hparry
 * 
 */
public class GaussianPalette4 extends PApplet {

	private static final long serialVersionUID = 1L;
	private int stdDev = 100;

	int radius = 15;
	private Random generator;
	int dimension = 800;
	private int mean = 255 / 2;

	public void setup() {
		size(dimension, dimension);
		background(255);
		generator = new Random();
	}

	public void draw() {
		float r = ((float) (generator.nextGaussian()) * stdDev) + mean;
		float g = ((float) (generator.nextGaussian()) * stdDev) + mean;
		float b = ((float) (generator.nextGaussian()) * stdDev) + mean;

		int xoffset = width / 2;
		int yoffset = height / 2;

		noStroke();
		fill(r, g, b, 100);
		int x = (int) ((g >= b ? g : b * -1) + xoffset);
		int y = (int) (r + (g >= b ? g : b * -1))/2  + yoffset;
		ellipse(x, y, radius, radius);

	}

}
