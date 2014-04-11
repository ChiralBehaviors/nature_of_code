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
import processing.core.PVector;

/**
 * @author hparry
 * 
 */
public class PerlinWalker extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Walker w;

	public void setup() {
		size(640, 360);
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
		
		int tx = 0;
		int ty = 100000;

		public Walker() {
			location = new PVector(width / 2, height / 2);
			velocity = new PVector(0, 0);
		}

		public void display() {
			stroke(0);
			ellipse(location.x, location.y, 2, 2);
		}

		public void step() {
			velocity.x = map(noise(tx), 0, 1, -5, 5);
			velocity.y = map(noise(ty), 0, 1, -5, 5);
			System.out.println(String.format("velocity.x: %s, velocity.y: %s", velocity.x, velocity.y));
			location.add(velocity);
			tx+= 1;
			ty+= 1;
		}
	}

}
