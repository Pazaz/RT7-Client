package com.jagex;

import deob.ObfuscatedName;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("yu")
public class class682 implements class685 {

	@ObfuscatedName("yu.e")
	public static final class682 field8273 = new class682("", 0, new class684[] { class684.field8284 });

	@ObfuscatedName("yu.n")
	public static final class682 field8270 = new class682("", 1, new class684[] { class684.field8283, class684.field8284 });

	@ObfuscatedName("yu.m")
	public static final class682 field8269 = new class682("", 2, new class684[] { class684.field8283, class684.field8282, class684.field8284 });

	@ObfuscatedName("yu.k")
	public static final class682 field8268 = new class682("", 3, new class684[] { class684.field8283 });

	@ObfuscatedName("yu.f")
	public static final class682 field8277 = new class682("", 4);

	@ObfuscatedName("yu.w")
	public static final class682 field8272 = new class682("", 5, new class684[] { class684.field8283, class684.field8284 });

	@ObfuscatedName("yu.l")
	public static final class682 field8279 = new class682("", 6, new class684[] { class684.field8284 });

	@ObfuscatedName("yu.u")
	public static final class682 field8274 = new class682("", 8, new class684[] { class684.field8283, class684.field8284 });

	@ObfuscatedName("yu.z")
	public static final class682 field8275 = new class682("", 9, new class684[] { class684.field8283, class684.field8282 });

	@ObfuscatedName("yu.p")
	public static final class682 field8276 = new class682("", 10, new class684[] { class684.field8283 });

	@ObfuscatedName("yu.d")
	public static final class682 field8267 = new class682("", 11, new class684[] { class684.field8283 });

	@ObfuscatedName("yu.c")
	public static final class682 field8278 = new class682("", 12, new class684[] { class684.field8283, class684.field8284 });

	@ObfuscatedName("yu.r")
	public static final class682 field8271 = new class682("", 13, new class684[] { class684.field8283 });

	@ObfuscatedName("yu.v")
	public final int field8280;

	@ObfuscatedName("yu.o")
	public final Set field8281 = new HashSet();

	static {
		method13843();
	}

	@ObfuscatedName("yu.e(B)[Lyu;")
	public static class682[] method13843() {
		return new class682[] { field8270, field8271, field8275, field8277, field8279, field8269, field8276, field8273, field8267, field8272, field8278, field8268, field8274 };
	}

	public class682(String arg0, int arg1) {
		this.field8280 = arg1;
	}

	public class682(String arg0, int arg1, class684[] arg2) {
		this.field8280 = arg1;
		class684[] var4 = arg2;
		for (int var5 = 0; var5 < var4.length; var5++) {
			class684 var6 = var4[var5];
			this.field8281.add(var6);
		}
	}

	@ObfuscatedName("yu.n()I")
	public int method1303() {
		return this.field8280;
	}

	@ObfuscatedName("yu.m(Lzh;I)Z")
	public boolean method13838(class684 arg0) {
		return this.field8281.contains(arg0);
	}
}
