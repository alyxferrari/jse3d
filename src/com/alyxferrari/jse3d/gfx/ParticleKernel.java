package com.alyxferrari.jse3d.gfx;
import com.aparapi.*;
class ParticleKernel extends Kernel { // calculates particle positions on an OpenCL device : unfinished
	protected Display display;
	public ParticleKernel(Display display) {
		this.display = display;
	}
	@Override
	public void run() {
		
	}
}