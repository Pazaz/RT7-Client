package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiv")
final class Class138_Sub5 extends Class138 {

	@OriginalMember(owner = "client!aiv", name = "bh", descriptor = "(Lclient!arn;Lclient!aac;B)I")
	static int method11540(@OriginalArg(0) Class93_Sub1_Sub8 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) String local3 = Class80.method1365(arg0, (byte) 0);
		return arg1.method37(local3, Class110_Sub14.aClass100Array4, (byte) -32);
	}

	@OriginalMember(owner = "client!aiv", name = "bd", descriptor = "(Lclient!yf;I)V")
	static void method11541(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!aiv", name = "<init>", descriptor = "(Lclient!xq;IZZ)V")
	Class138_Sub5(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aiv", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}

	@OriginalMember(owner = "client!aiv", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}

	@OriginalMember(owner = "client!aiv", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30498(657683700);
	}
}
