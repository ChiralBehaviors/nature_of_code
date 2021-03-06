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
package com.chiralbehaviors.natureofcode.vectors;

import processing.core.PApplet;
import processing.core.PVector;

/**
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class BouncingBall3D extends PApplet {
	
	PVector location = new PVector(100, 100, 100);
	PVector velocity = new PVector(1, (float) 3.3, (float) 2.5);
	private int depth = 200;
	
	public void setup() {
		size(640, 360, P3D);
		background(255);
	}
	
	public void draw() {
		background(255);
		
		location.add(velocity);
		
		if ( (location.x > width) || (location.x < 0)) {
			velocity.x *= -1;
		}
		
		if ( (location.y > height) || (location.y < 0)) {
			velocity.y *= -1;
		}
		
		if ( (location.z > depth) || (location.z < 0)) {
			velocity.z *= -1;
		}
		
		stroke(0);
		fill(175);
		translate(location.x, location.y, location.z);
		ellipse(0,0, 16, 16);
	}

}
