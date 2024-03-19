package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("ahq")
public class ProgrammableBatchedSpriteShader extends BatchedSpriteShader {

	@ObfuscatedName("ahq.m")
	public Shader field10515;

	@ObfuscatedName("ahq.k")
	public ProgramUniform field10516;

	@ObfuscatedName("ahq.f")
	public Program field10517;

	public ProgrammableBatchedSpriteShader(GpuRenderer arg0) throws ShaderException {
		super(arg0);
		this.method16642();
	}

	@ObfuscatedName("ahq.f(I)Z")
	public boolean method16642() throws ShaderException {
		this.field10515 = this.field2993.method15964("BatchedSprite");
		this.field10516 = this.field10515.getUniform("SpriteSampler");
		this.field10517 = this.field10515.getProgram("Normal");
		this.field10515.setCurrentProgram(this.field10517);
		return true;
	}

	@ObfuscatedName("ahq.e()V")
	public void method5047() {
		this.field10515.enable();
		this.field10515.setUniform(this.field10516, 0, this.field2992);
	}
}
