package com.jagex.core.constants;

import deob.ObfuscatedName;

@ObfuscatedName("zd")
public class ModeGame {

	@ObfuscatedName("zd.e")
	public static final ModeGame RUNESCAPE = new ModeGame("runescape", "RuneScape", 0, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.n")
	public static final ModeGame STELLARDAWN = new ModeGame("stellardawn", "Stellar Dawn", 1, Namespace.STELLAR_DAWN);

	@ObfuscatedName("zd.m")
	public static final ModeGame ALTERNATEREALITY = new ModeGame("game3", "Game 3", 2, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.k")
	public static final ModeGame TRANSFORMERS = new ModeGame("game4", "Game 4", 3, Namespace.TRANSFORMERS);

	@ObfuscatedName("zd.f")
	public static final ModeGame SCRATCH = new ModeGame("game5", "Game 5", 4, Namespace.SCRATCH);

	@ObfuscatedName("zd.w")
	public static final ModeGame OLDSCAPE = new ModeGame("oldscape", "RuneScape 2007", 5, Namespace.RUNESCAPE);

	@ObfuscatedName("zd.l")
	public final String field8333;

	@ObfuscatedName("zd.u")
	public final String title;

	@ObfuscatedName("zd.z")
	public final int field8339;

	public ModeGame(String arg0, String arg1, int arg2, Namespace arg3) {
		this.field8333 = arg0;
		this.title = arg1;
		this.field8339 = arg2;
	}

	@ObfuscatedName("qx.e(B)[Lzd;")
	public static ModeGame[] method7118() {
		return new ModeGame[] {RUNESCAPE, ALTERNATEREALITY, OLDSCAPE, TRANSFORMERS, SCRATCH, STELLARDAWN};
	}

	@ObfuscatedName("rg.n(II)Lzd;")
	public static ModeGame method7704(int arg0) {
		ModeGame[] var1 = method7118();
		for (int var2 = 0; var2 < var1.length; var2++) {
			ModeGame var3 = var1[var2];
			if (var3.field8339 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
