package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public class Class486 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	static final int anInt5147 = 7;

	@OriginalMember(owner = "client!pl", name = "go", descriptor = "Lclient!py;")
	public static Class497 aClass497_123;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	int anInt5146;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "[I")
	int[] anIntArray453;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "[I")
	int[] anIntArray454;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!is;")
	Class348 aClass348_1;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
	int anInt5148;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "[I")
	int[] anIntArray455;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "[I")
	int[] anIntArray456;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[[B")
	byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	int anInt5149;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "[I")
	int[] anIntArray457;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "[I")
	int[] anIntArray458;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "[I")
	int[] anIntArray459;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "[I")
	int[] anIntArray460;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "[[I")
	int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "[Lclient!is;")
	Class348[] aClass348Array1;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	int[] anIntArray461;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	int anInt5145;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "[B")
	byte[] aByteArray93;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "([BI[B)V", line = 29)
	Class486(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt5145 = Packet.getcrc(arg0, arg0.length, 953582425) * 874050479;
		if (arg1 != this.anInt5145 * 391791439) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray93 = Class53_Sub1.method14954(arg0, 0, arg0.length, 573616195);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray93[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method29804(arg0, 1017306094);
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "([BI)V", line = 49)
	void method29804(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Packet local6 = new Packet(Class506.method30220(arg0, (byte) -64));
		@Pc(10) int local10 = local6.g1((short) 16384);
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt5149 = local6.g4(-118643075) * -905480615;
		} else {
			this.anInt5149 = 0;
		}
		@Pc(38) int local38 = local6.g1((short) 16384);
		@Pc(47) boolean local47 = (local38 & 0x1) != 0;
		@Pc(56) boolean local56 = (local38 & 0x2) != 0;
		@Pc(65) boolean local65 = (local38 & 0x4) != 0;
		@Pc(74) boolean local74 = (local38 & 0x8) != 0;
		if (local10 >= 7) {
			this.anInt5146 = local6.gSmart2or4(1822333537) * -94536123;
		} else {
			this.anInt5146 = local6.g2(-1434290800) * -94536123;
		}
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = -1;
		this.anIntArray456 = new int[this.anInt5146 * -1801657203];
		@Pc(108) int local108;
		if (local10 >= 7) {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray456[local108] = local94 += local6.gSmart2or4(1822333537);
				if (this.anIntArray456[local108] > local96) {
					local96 = this.anIntArray456[local108];
				}
			}
		} else {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray456[local108] = local94 += local6.g2(-1434290800);
				if (this.anIntArray456[local108] > local96) {
					local96 = this.anIntArray456[local108];
				}
			}
		}
		this.anInt5148 = (local96 + 1) * -1970769063;
		this.anIntArray455 = new int[this.anInt5148 * 1408935145];
		if (local74) {
			this.anIntArray460 = new int[this.anInt5148 * 1408935145];
		}
		if (local56) {
			this.aByteArrayArray16 = new byte[this.anInt5148 * 1408935145][];
		}
		this.anIntArray458 = new int[this.anInt5148 * 1408935145];
		this.anIntArray459 = new int[this.anInt5148 * 1408935145];
		this.anIntArrayArray58 = new int[this.anInt5148 * 1408935145][];
		this.anIntArray461 = new int[this.anInt5148 * 1408935145];
		if (local47) {
			this.anIntArray454 = new int[this.anInt5148 * 1408935145];
			for (local108 = 0; local108 < this.anInt5148 * 1408935145; local108++) {
				this.anIntArray454[local108] = -1;
			}
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray454[this.anIntArray456[local108]] = local6.g4(-118643075);
			}
			this.aClass348_1 = new Class348(this.anIntArray454);
		}
		for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
			this.anIntArray455[this.anIntArray456[local108]] = local6.g4(-118643075);
		}
		if (local74) {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray460[local108] = local6.g4(-118643075);
			}
		}
		if (local56) {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				@Pc(334) byte[] local334 = new byte[64];
				local6.gdata(local334, 0, 64, (short) 27368);
				this.aByteArrayArray16[this.anIntArray456[local108]] = local334;
			}
		}
		if (local65) {
			this.anIntArray457 = new int[this.anInt5148 * 1408935145];
			this.anIntArray453 = new int[this.anInt5148 * 1408935145];
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray457[this.anIntArray456[local108]] = local6.g4(-118643075);
				this.anIntArray453[this.anIntArray456[local108]] = local6.g4(-118643075);
			}
		}
		for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
			this.anIntArray458[this.anIntArray456[local108]] = local6.g4(-118643075);
		}
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(469) int local469;
		@Pc(487) int local487;
		@Pc(452) int local452;
		if (local10 >= 7) {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray459[this.anIntArray456[local108]] = local6.gSmart2or4(1822333537);
			}
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				local452 = this.anIntArray456[local108];
				local457 = this.anIntArray459[local452];
				local94 = 0;
				local461 = -1;
				this.anIntArrayArray58[local452] = new int[local457];
				for (local469 = 0; local469 < local457; local469++) {
					local487 = this.anIntArrayArray58[local452][local469] = local94 += local6.gSmart2or4(1822333537);
					if (local487 > local461) {
						local461 = local487;
					}
				}
				this.anIntArray461[local452] = local461 + 1;
				if (local461 + 1 == local457) {
					this.anIntArrayArray58[local452] = null;
				}
			}
		} else {
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				this.anIntArray459[this.anIntArray456[local108]] = local6.g2(-1434290800);
			}
			for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
				local452 = this.anIntArray456[local108];
				local457 = this.anIntArray459[local452];
				local94 = 0;
				local461 = -1;
				this.anIntArrayArray58[local452] = new int[local457];
				for (local469 = 0; local469 < local457; local469++) {
					local487 = this.anIntArrayArray58[local452][local469] = local94 += local6.g2(-1434290800);
					if (local487 > local461) {
						local461 = local487;
					}
				}
				this.anIntArray461[local452] = local461 + 1;
				if (local461 + 1 == local457) {
					this.anIntArrayArray58[local452] = null;
				}
			}
		}
		if (!local47) {
			return;
		}
		this.anIntArrayArray59 = new int[local96 + 1][];
		this.aClass348Array1 = new Class348[local96 + 1];
		for (local108 = 0; local108 < this.anInt5146 * -1801657203; local108++) {
			local452 = this.anIntArray456[local108];
			local457 = this.anIntArray459[local452];
			this.anIntArrayArray59[local452] = new int[this.anIntArray461[local452]];
			for (local461 = 0; local461 < this.anIntArray461[local452]; local461++) {
				this.anIntArrayArray59[local452][local461] = -1;
			}
			for (local461 = 0; local461 < local457; local461++) {
				if (this.anIntArrayArray58[local452] == null) {
					local469 = local461;
				} else {
					local469 = this.anIntArrayArray58[local452][local461];
				}
				this.anIntArrayArray59[local452][local469] = local6.g4(-118643075);
			}
			this.aClass348Array1[local452] = new Class348(this.anIntArrayArray59[local452]);
		}
	}

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "(Lclient!zb;I)V", line = 151)
	static void method29805(@OriginalArg(0) Class700 arg0, @OriginalArg(1) int arg1) {
		Class490.aClass700_1 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "aho", descriptor = "(Lclient!yf;S)V", line = 10906)
	static final void method29806(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -725861497;
		client.anInt3561 = arg0.anIntArray519[-1497248091 * arg0.anInt5891] * -2128488861;
		Class118_Sub1.aClass12_4 = Class266.method26226(arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1], (byte) 46);
		if (Class118_Sub1.aClass12_4 == null) {
			Class118_Sub1.aClass12_4 = Class12.aClass12_1;
		}
		client.anInt3552 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2] * 630676823;
		@Pc(46) Class175 local46 = Class330.method27371(-1730720637);
		@Pc(52) Class93_Sub22 local52 = Class102.method2588(Class446.aClass446_75, local46.aClass24_2, (byte) 78);
		local52.aPacketBit_1.p1(client.anInt3561 * 2112576331, (byte) -110);
		local52.aPacketBit_1.p1(Class118_Sub1.aClass12_4.anInt25 * -1955231941, (byte) -12);
		local52.aPacketBit_1.p1(client.anInt3552 * -350691737, (byte) -93);
		local46.method24356(local52, -1738439709);
	}
}
