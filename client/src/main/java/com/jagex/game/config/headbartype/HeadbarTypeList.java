package com.jagex.game.config.headbartype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aol")
public class HeadbarTypeList extends CachingConfigTypeList {

	public HeadbarTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.HEADBARTYPE, 64, new BasicHeadbarTypeFactory(arg3));
	}

	@ObfuscatedName("aol.r(I)V")
	public void method14895() {
		super.method14895();
		((HeadbarTypeFactory) this.factory).method9166();
	}

	@ObfuscatedName("aol.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((HeadbarTypeFactory) this.factory).method9172(arg0);
	}

	@ObfuscatedName("aol.o(I)V")
	public void method14899() {
		super.method14899();
		((HeadbarTypeFactory) this.factory).method9168();
	}
}
