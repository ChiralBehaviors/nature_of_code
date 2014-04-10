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
import processing.core.PVector;

/**
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class GaussianRandomWalk extends PApplet {
	
	
	Walker w;
	
	public void setup() {
		size(640, 320);
		background(255);
		w = new Walker();
	}
	
	public void draw() {
		w.display();
		w.step();
	}
	
	class Walker {
		
		int mean = 0;
		int sd = 5;
		PVector location;
		PVector velocity;
		Random generator;
		
		

		public Walker() {
			location = new PVector(width / 2, height / 2);
			velocity = new PVector(1, (float) 3.3);
			generator = new Random();
		}

		public void display() {
			stroke(0);
			point(location.x, location.y);
		}

		public void step() {
			velocity.x = (float) (generator.nextGaussian()*sd + mean);
			velocity.y = (float) (generator.nextGaussian()*sd + mean);
			
			location.add(velocity);
		}
	}

}
