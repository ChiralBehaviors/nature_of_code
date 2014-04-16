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
public class BouncingBallWithBoundaries extends PApplet{
	
	//TODO make this look pretty, damn it
	
	PVector location = new PVector(100, 100);
	PVector velocity = new PVector(1, (float) 3.3);
	private int border = 10;
	private int innerWidth;
	private int innerHeight;
	private int diameter = 16;
	
	public void setup() {
		size(640, 480);
		innerWidth = width - border;
		innerHeight = height - border;
		background(255);
	}
	
	public void draw() {
		background(255);
		fill(255);
		strokeWeight(1);
		stroke(0);
		rect(border, border, width - 2*border, height - 2*border);
		location.add(velocity);
		
		if ((location.x + diameter/2  >= innerWidth) || (location.x - diameter/2 <= border)) {
			velocity.x *= -1;
			if (location.x + diameter/2  >= innerWidth) {
				strokeWeight(10);
				stroke(255, 0, 0);
				line(innerWidth, border, innerWidth, innerHeight);
			} else {
				strokeWeight(10);
				stroke(255, 0, 0);
				line(border, border, border, innerHeight);
			}
		}
		
		if ( (location.y + diameter/2 >= innerHeight) || (location.y - diameter/2 <= border)) {
			velocity.y *= -1;
			if (location.y + diameter/2 >= innerHeight) {
				strokeWeight(10);
				stroke(255, 0, 0);
				line(border, innerHeight, innerWidth, innerHeight);
			} else {
				strokeWeight(10);
				stroke(255, 0, 0);
				line(border, border, innerWidth, border);
			}
		}
		
		stroke(0);
		strokeWeight(1);
		fill(175);
		
		ellipse(location.x, location.y, diameter, diameter);
	}
	
	

}
