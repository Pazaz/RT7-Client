package com.jagex.js5.worker;

import com.jagex.game.client.DiskStore;
import com.jagex.js5.Js5Request;
import deob.ObfuscatedName;

@ObfuscatedName("atf")
public class Js5WorkerRequest extends Js5Request {

	@ObfuscatedName("atf.r")
	public int field12559;

	@ObfuscatedName("atf.v")
	public DiskStore diskStore;

	@ObfuscatedName("atf.o")
	public byte[] bytes;

	@ObfuscatedName("atf.e(I)[B")
	public byte[] getBytes() {
		if (this.awaitingResponse) {
			throw new RuntimeException("Not ready!");
		}

		return this.bytes;
	}

	@ObfuscatedName("atf.n(I)I")
	public int getPercentageComplete() {
		return this.awaitingResponse ? 0 : 100;
	}
}
