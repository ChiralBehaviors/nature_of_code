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
package com.chiralbehaviors.natureofcode.particle;

import processing.core.PApplet;
import processing.core.PVector;

import com.chiralbehaviors.particulate.Particle;

/**
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class ParticleWithGravity extends PApplet {
    
    Particle p;
    private int radius = 16;
    private int fill = 125;
            
    public void setup() {
        size(640, 360);
        p = new Particle();
        background(100);
        p.setLocation(new PVector(0, 0));
        p.setVelocity(new PVector(1, 0));
        p.setAcceleration(new PVector(0, (float) 0.05));
    }
    
    public void draw() {
        p.step();
        noStroke();
        fill(fill);
        ellipse(p.getLocation().x, p.getLocation().y, radius, radius);
    }

}
