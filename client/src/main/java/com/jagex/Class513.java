package com.jagex;

import java.math.BigInteger;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class513 {

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lclient!ps;")
	Class491[] aClass491Array1;

	@OriginalMember(owner = "client!qp", name = "lc", descriptor = "(Lclient!hf;IIILclient!yf;S)V")
	static void method30444(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class681 arg4, @OriginalArg(5) short arg5) {
		if (arg0.anIntArray375 == null) {
			throw new RuntimeException();
		}
		arg0.anIntArray375[arg1] = arg2;
		arg0.anIntArray377[arg1] = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "ado", descriptor = "(Lclient!yf;B)V")
	static void method30445(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class637.aClass113_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!qp", name = "ik", descriptor = "(II)V")
	static void method30446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		client.anInt3458 = 0;
		client.anInt3472 = 0;
		client.anInt3445 += 538413373;
		Class579.method31552(-585921143);
		Class279.method26540(arg0, (byte) 49);
		Class466.method29509(-165946142);
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < client.anInt3458 * 1235627729; local18++) {
			local27 = client.anIntArray307[local18];
			@Pc(33) Class93_Sub15 local33 = (Class93_Sub15) client.aClass16_18.method215((long) local27);
			@Pc(37) Class132_Sub1_Sub1_Sub1_Sub1 local37 = (Class132_Sub1_Sub1_Sub1_Sub1) local33.anObject5;
			if (local37.anInt2786 * -1429700591 != client.anInt3445 * -1933011435) {
				if (Class454.aBoolean782 && Class568.method31479(local27, (byte) 16)) {
					Class436.method28992(-916881791);
				}
				if (local37.aClass336_1.method27525((short) 2402)) {
					Class665.method33076(local37, -222919382);
				}
				local37.method18601(null, -1526757401);
				local33.method23981(-1781443774);
				local16 = true;
			}
		}
		if (local16) {
			local18 = client.anInt3488 * -1814159537;
			client.anInt3488 = client.aClass16_18.method218(-594782045) * 436180911;
			local27 = 0;
			@Pc(89) Iterator local89 = client.aClass16_18.iterator();
			while (local89.hasNext()) {
				@Pc(96) Class93_Sub15 local96 = (Class93_Sub15) local89.next();
				client.aClass93_Sub15Array1[local27++] = local96;
			}
			for (@Pc(106) int local106 = client.anInt3488 * -1814159537; local106 < local18; local106++) {
				client.aClass93_Sub15Array1[local106] = null;
			}
			@Pc(119) Class342 local119 = Class65.aClass123_Sub1_2.method9023(-1662199153);
			if (Class342.aClass342_3 == local119) {
				@Pc(127) Class124_Sub1 local127 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -48);
				local127.method9159((byte) 3);
			}
			@Pc(134) Class338 local134 = Class65.aClass123_Sub1_2.method8986((byte) -12);
			if (local134 == Class338.aClass338_4) {
				@Pc(142) Class25_Sub5 local142 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9040(-327134873);
				local142.method16484(-2005412477);
			}
		}
		if (client.aClass175_2.anInt3301 * 2010044839 != client.aClass175_2.aClass93_Sub41_Sub2_2.anInt3070 * 212851357) {
			throw new RuntimeException(client.aClass175_2.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 + " " + client.aClass175_2.anInt3301 * 2010044839);
		}
		for (local18 = 0; local18 < client.anInt3540 * 568731113; local18++) {
			if (client.aClass16_18.method215((long) client.anIntArray323[local18]) == null) {
				throw new RuntimeException(local18 + " " + client.anInt3540 * 568731113);
			}
		}
		if (client.anInt3488 * -1814159537 - client.anInt3540 * 568731113 != 0) {
			throw new RuntimeException("" + (client.anInt3488 * -1814159537 - client.anInt3540 * 568731113));
		}
		for (local18 = 0; local18 < client.anInt3488 * -1814159537; local18++) {
			if (((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local18].anObject5).anInt2786 * -1429700591 != client.anInt3445 * -1933011435) {
				throw new RuntimeException("" + ((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local18].anObject5).anInt2768 * -1688488127);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!alw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	Class513(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		arg0.anInt3070 = 1361799817;
		@Pc(8) int local8 = arg0.method22425((short) 16384);
		arg0.anInt3070 += local8 * 313960592;
		@Pc(26) byte[] local26 = new byte[arg0.aByteArray58.length - arg0.anInt3070 * 212851357];
		arg0.method22442(local26, 0, local26.length, (short) 4299);
		@Pc(40) byte[] local40;
		if (arg1 == null || arg2 == null || true) {
			local40 = local26;
		} else {
			@Pc(46) BigInteger local46 = new BigInteger(local26);
			@Pc(51) BigInteger local51 = local46.modPow(arg1, arg2);
			local40 = local51.toByteArray();
		}
		if (local40.length != 65) {
			throw new RuntimeException();
		}
		@Pc(77) byte[] local77 = Class53_Sub1.method14965(arg0.aByteArray58, 5, arg0.anInt3070 * 212851357 - local26.length - 5, 573616195);
		@Pc(79) int local79;
		for (local79 = 0; local79 < 64; local79++) {
			if (local77[local79] != local40[local79 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass491Array1 = new Class491[local8];
		for (local79 = 0; local79 < local8; local79++) {
			arg0.anInt3070 = local79 * 313960592 + -83827138;
			@Pc(117) int local117 = arg0.method22431(-118643075);
			@Pc(121) int local121 = arg0.method22431(-118643075);
			@Pc(125) int local125 = arg0.method22431(-118643075);
			@Pc(129) int local129 = arg0.method22431(-118643075);
			@Pc(132) byte[] local132 = new byte[64];
			arg0.method22442(local132, 0, 64, (short) 4470);
			this.aClass491Array1[local79] = new Class491(local117, local125, local121, local129, local132);
		}
	}
}
