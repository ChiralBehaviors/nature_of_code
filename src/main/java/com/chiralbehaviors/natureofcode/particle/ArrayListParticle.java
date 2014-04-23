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

import java.util.ArrayList;
import java.util.Iterator;

import com.chiralbehaviors.particulate.DyingParticle;

import processing.core.PApplet;
import processing.core.PVector;

/**
 * @author hparry
 *
 */
@SuppressWarnings("serial")
public class ArrayListParticle extends PApplet {
    
    private ArrayList<DyingParticle> particles;
    
    public void setup() {
        size(640, 360);
        particles = new ArrayList<DyingParticle>();
    }
    
    public void draw() {
        background(100);
        DyingParticle p = new DyingParticle();
        p.setLifespan(255);
        p.setAcceleration(new PVector(0, (float) .25));
        p.setVelocity(new PVector(random(-2, 2), random(-2, 0)));
        p.setLocation(new PVector(width/2, 50));
        particles.add(p);
        
        Iterator<DyingParticle> i = particles.iterator();
        
        while (i.hasNext()) {
            DyingParticle dp = i.next();
            dp.decrementLifeSpan();
            if (dp.isDead()) {
                i.remove();
            }
            dp.step();
            noStroke();
            fill(255, 255, 255, 100);
            ellipse(dp.getLocation().x, dp.getLocation().y, 16, 16);
        }
    }

}
