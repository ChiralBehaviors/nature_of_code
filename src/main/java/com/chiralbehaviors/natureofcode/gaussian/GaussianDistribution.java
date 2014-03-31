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
 * This thing is so pretty. A row of vaguely transparent circles. I LOVE THIS.
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class GaussianDistribution extends PApplet {

	
	Random generator;
	
	public void setup() {
		size(640, 360);
		generator = new Random();
	}
	
	public void draw() {
		float num = (float)generator.nextGaussian();
		float sd = 60;
		float mean = 320;
		float x = sd * num + mean;
		noStroke();
		fill(255, 10);
		ellipse(x, 180, 16, 16);
	}
}
