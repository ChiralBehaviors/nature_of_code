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

/**
 * @author hparry
 *
 */
public class BouncingBall extends PApplet{
	
	
	private static final long serialVersionUID = 7896829425986605795L;
	float x = 100;
	float y = 100;
	
	float xspeed = 1;
	float yspeed = (float) 3.3;
	
	public void setup() {
		size(640, 360);
		background(255);
	}
	
	public void draw() {
		background(255);
		
		x += xspeed;
		y += yspeed;
		
		if ( (x > width) || (x < 0)) {
			xspeed *= -1;
		}
		
		if ( (y > height) || (y < 0)) {
			yspeed *= -1;
		}
		
		stroke(0);
		fill(175);
		
		ellipse(x, y, 16, 16);
	}
	
	

}
