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
public class GaussianPaintSpatter extends PApplet {

	
	Random generator;
	
	public void setup() {
		size(640, 640);
		generator = new Random();
	}
	
	public void draw() {
		float num = (float)generator.nextGaussian();
		float distanceSd = 10;
		float sizeSd = 5;
		float distanceMean = 30;
		float sizeMean = 30;
		float mean = 320;
		float xvector = (float) ((Math.floor(Math.random() * 10) % 2 == 0 ? 1 : -1) * Math.random());
		float yvector = (float) ((Math.floor(Math.random() * 10) % 2 == 0 ? 1 : -1) * Math.random());
		float x = (distanceSd * num + distanceMean) * xvector + mean;
		float y = (distanceSd * num + distanceMean) * yvector + mean;
		float radius = (sizeMean - (sizeSd * num));
		noStroke();
		fill(255, 10);
		ellipse(x, y, radius, radius);
	}
}
