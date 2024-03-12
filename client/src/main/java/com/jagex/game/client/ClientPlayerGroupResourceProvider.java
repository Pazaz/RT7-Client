package com.jagex.game.client;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import com.jagex.game.group.PlayerGroupResourceProvider;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("d")
public final class ClientPlayerGroupResourceProvider implements PlayerGroupResourceProvider {

	@ObfuscatedName("d.e(B)Ladd;")
	public VarTypeList method293() {
		return Statics.field8485;
	}

	@ObfuscatedName("d.n(B)Ladd;")
	public VarTypeList method291() {
		return Statics.field3415;
	}

	@ObfuscatedName("d.m(I)Laor;")
	public VarBitTypeList method294() {
		return Statics.field8736;
	}

	@ObfuscatedName("d.k(B)Lwq;")
	public SkillDefaults method295() {
		return Statics.skillDefaults;
	}
}
