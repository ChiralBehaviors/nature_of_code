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
package com.chiralbehaviors.natureofcode.walker;

import processing.core.PApplet;

/**
 * @author hparry
 * 
 */
@SuppressWarnings("serial")
public class WalkerApplet extends PApplet {

	Walker w;
	
	
	
	public void setup() {
		size(640, 360);
		w = new Walker();
		background(255);
	}
	
	public void draw() {
		w.step();
		w.display();
	}
	
	class Walker {
		int x;
		int y;
		
		

		public Walker() {
			x = width / 2;
			y = height / 2;
		}

		public void display() {
			stroke(0);
			point(x, y);
		}

		public void step() {
			int choice = (int) (random(4));

			switch (choice) {
			case 0:
				x++;
				break;
			case 1:
				x--;
				break;
			case 2:
				y++;
				break;
			case 3:
				y--;
				break;
			}
		}
	}

}
