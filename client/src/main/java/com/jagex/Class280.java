package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fz")
public final class Class280 {

	@OriginalMember(owner = "client!fz", name = "y", descriptor = "Lclient!py;")
	static Class497 aClass497_100;

	@OriginalMember(owner = "client!fz", name = "bz", descriptor = "Lclient!yu;")
	public static Class693 aClass693_1;

	@OriginalMember(owner = "client!fz", name = "e", descriptor = "Lclient!fz;")
	public static final Class280 aClass280_7 = new Class280(8);

	@OriginalMember(owner = "client!fz", name = "n", descriptor = "Lclient!fz;")
	static final Class280 aClass280_2 = new Class280(0);

	@OriginalMember(owner = "client!fz", name = "m", descriptor = "Lclient!fz;")
	public static final Class280 aClass280_3 = new Class280(1);

	@OriginalMember(owner = "client!fz", name = "k", descriptor = "Lclient!fz;")
	static final Class280 aClass280_4 = new Class280(4);

	@OriginalMember(owner = "client!fz", name = "f", descriptor = "Lclient!fz;")
	static final Class280 aClass280_5 = new Class280(7);

	@OriginalMember(owner = "client!fz", name = "w", descriptor = "Lclient!fz;")
	static final Class280 aClass280_6 = new Class280(6);

	@OriginalMember(owner = "client!fz", name = "l", descriptor = "Lclient!fz;")
	static final Class280 aClass280_10 = new Class280(9);

	@OriginalMember(owner = "client!fz", name = "u", descriptor = "Lclient!fz;")
	static final Class280 aClass280_8 = new Class280(2);

	@OriginalMember(owner = "client!fz", name = "z", descriptor = "Lclient!fz;")
	static final Class280 aClass280_1 = new Class280(5);

	@OriginalMember(owner = "client!fz", name = "p", descriptor = "Lclient!fz;")
	static final Class280 aClass280_9 = new Class280(3);

	@OriginalMember(owner = "client!fz", name = "d", descriptor = "I")
	final int anInt3934;

	@OriginalMember(owner = "client!fz", name = "k", descriptor = "(Lclient!alw;B)Lclient!va;")
	static Class607 method26547(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(7) int local7 = arg0.method22425((short) 16384);
		return new Class607(local3, local7);
	}

	@OriginalMember(owner = "client!fz", name = "bbw", descriptor = "(Lclient!yf;I)V")
	static void method26548(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!fz", name = "lb", descriptor = "(Lclient!hf;Lclient!yf;I)V")
	static void method26549(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		@Pc(27) int local27 = arg1.anIntArray521[(arg1.anInt6052 -= 1189701933) * -1497248091];
		Class513.method30444(arg0, local1, local14, local27, arg1, (short) -18290);
	}

	@OriginalMember(owner = "client!fz", name = "bbm", descriptor = "(Lclient!yf;B)V")
	static void method26550(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class132_Sub1_Sub1_Sub1_Sub1 local3 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		@Pc(5) boolean local5 = false;
		@Pc(8) Class336 local8 = local3.aClass336_1;
		if (local8.anIntArray414 != null) {
			local8 = local8.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 13450);
		}
		if (local8 != null) {
			local5 = local8.aBoolean722;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fz", name = "o", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZB)V")
	static void method26551(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) byte arg12) {
		if (!Class454.aBoolean782 && Class454.anInt5203 * -1838307953 < 505) {
			@Pc(16) int local16 = arg2 == -1 ? client.anInt3520 * 895420077 : arg2;
			@Pc(32) Class93_Sub1_Sub7 local32 = new Class93_Sub1_Sub7(arg0, arg1, local16, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			Class246.method25999(local32, (byte) -78);
		}
	}

	@OriginalMember(owner = "client!fz", name = "ara", descriptor = "(Lclient!yf;I)V")
	static void method26552(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 55);
		Class106_Sub1.method5148(-996412657);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!fz", name = "<init>", descriptor = "(I)V")
	Class280(@OriginalArg(0) int arg0) {
		this.anInt3934 = arg0 * -1619010215;
	}

	@OriginalMember(owner = "client!fz", name = "e", descriptor = "(I)I")
	public int method26543(@OriginalArg(0) int arg0) {
		return this.anInt3934 * -1372022039 | 0x2000000;
	}

	@OriginalMember(owner = "client!fz", name = "k", descriptor = "()I")
	public int method26544() {
		return this.anInt3934 * -1372022039 | 0x2000000;
	}

	@OriginalMember(owner = "client!fz", name = "n", descriptor = "()I")
	public int method26545() {
		return this.anInt3934 * -1372022039 | 0x2000000;
	}

	@OriginalMember(owner = "client!fz", name = "m", descriptor = "()I")
	public int method26546() {
		return this.anInt3934 * -1372022039 | 0x2000000;
	}
}
