package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class533 {

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	public static final int anInt5411 = 5;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public static final int anInt5412 = 3;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static final int anInt5413 = 2;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public static final int anInt5414 = 1;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public static final int anInt5415 = 0;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public static final int anInt5416 = 8;

	@OriginalMember(owner = "client!rm", name = "fi", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method30783(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean691 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!rm", name = "oy", descriptor = "(Lclient!yf;I)V")
	static void method30784(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -393699056);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class642.method32699(local16, local22, arg0, -151574986);
	}

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "(I)I")
	static int method30785(@OriginalArg(0) int arg0) {
		@Pc(6) int local6;
		if (Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16517((byte) 7) == 0) {
			for (local6 = 0; local6 < client.anInt3448 * -1523148821; local6++) {
				if (client.anInterface66Array2[local6].method13686((byte) 2) == 's' || client.anInterface66Array2[local6].method13686((byte) -87) == 'S') {
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1, (byte) 40);
					client.aBoolean608 = true;
					Class481.method29936(Class73.aClass73_9, -2034149874);
					break;
				}
			}
		}
		if (Class370.aClass370_15 == Class146.aClass370_3) {
			if (Class275.aClass496_1 == null) {
				Class275.aClass496_1 = new Class496(Class520.aClass144_3, Class484.aClass493_2, Class477.aClass480_2, Class95.aBigInteger1, Class95.aBigInteger3);
			}
			if (!Class275.aClass496_1.method30213((byte) 60)) {
				return 0;
			}
			Class293.method26681(0, null, true, -1146734287);
			Class362.aBoolean738 = !Class319.method27315((byte) 98);
			Class17.aClass497_2 = Class384.method28337(Class362.aBoolean738 ? Class31.aClass31_29 : Class31.aClass31_7, false, 1, true, true, 1340967007);
			Class7.aClass497_1 = Class384.method28337(Class31.aClass31_28, false, 1, true, true, 2030493889);
			Class633.aClass497_137 = Class384.method28337(Class31.aClass31_9, false, 1, true, true, 1300263805);
			Class222.aClass497_97 = Class384.method28337(Class31.aClass31_25, true, 1, true, true, 1666312068);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class370.aClass370_13 == Class146.aClass370_3) {
			local115 = Class7.aClass497_1.method30242(-1301296082);
			@Pc(119) boolean local119 = Class222.aClass497_97.method30242(-1290670465);
			local127 = Class569.aClass143_Sub1Array2[Class31.aClass31_28.method629(2105884450)].method11071(1189701933);
			@Pc(143) int local143 = local127 + Class569.aClass143_Sub1Array2[Class362.aBoolean738 ? Class31.aClass31_29.method629(2020447972) : Class31.aClass31_7.method629(2062788316)].method11071(1189701933);
			@Pc(153) int local153 = local143 + Class569.aClass143_Sub1Array2[Class31.aClass31_9.method629(2144399028)].method11071(1189701933);
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class222.aClass497_97.method30239(-1774909861));
			@Pc(173) int local173 = local163 + (local115 ? 100 : Class7.aClass497_1.method30239(-1774909861));
			if (local173 != 500) {
				return local173 / 5;
			}
			Class93_Sub26.aClass645_15 = new Class645(Class222.aClass497_97);
			Class659.aClass633_1 = new Class633(Class222.aClass497_97);
			Class292.method26673(Class93_Sub26.aClass645_15, (byte) 46);
			@Pc(198) int local198 = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16333(2094562327);
			Class363.aClass81_1 = new Class81(client.aClass702_4, Class106.aClass717_8, Class7.aClass497_1);
			@Pc(210) Class84[] local210 = Class363.aClass81_1.method1369(local198, -2080202294);
			if (local210.length == 0) {
				local210 = Class363.aClass81_1.method1369(0, -2058820135);
			}
			@Pc(224) Class385 local224 = new Class385(Class17.aClass497_2, Class633.aClass497_137);
			if (local210.length > 0) {
				Class362.anInterface30Array1 = new Interface30[local210.length];
				for (@Pc(233) int local233 = 0; local233 < Class362.anInterface30Array1.length; local233++) {
					Class362.anInterface30Array1[local233] = new Class366(Class363.aClass81_1.method1368(local210[local233].anInt258 * 1709991339, -2020706961), local210[local233].anInt256 * 1396449397, local210[local233].anInt257 * 1604660509, local224);
				}
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_7) {
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class17.aClass497_2, Class633.aClass497_137, Class173.method23812(938462168));
		}
		@Pc(290) int local290;
		if (Class370.aClass370_8 == Class146.aClass370_3) {
			local6 = Class157.aClass462_2.method29437(-498325468);
			local290 = Class157.aClass462_2.method29420((byte) 16);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class370.aClass370_9 == Class146.aClass370_3) {
			if (Class362.anInterface30Array1 != null && Class362.anInterface30Array1.length > 0) {
				if (Class362.anInterface30Array1[0].method28113(606154917) < 100) {
					return 0;
				}
				if (Class362.anInterface30Array1.length > 1 && Class363.aClass81_1.method1374(-1322801466) && Class362.anInterface30Array1[1].method28113(2016276724) < 100) {
					return 0;
				}
			}
			Class157.aClass462_2.method29417(client.anInterface50_1, 1664109974);
			Class520.method30520(Class694.aClass104_14, 1369139080);
			Class481.method29937(11, 1823202236);
		}
		if (Class146.aClass370_3 == Class370.aClass370_10) {
			Class110_Sub7.aClass497_22 = Class384.method28337(Class31.aClass31_6, false, 1, false, true, 1453188642);
			Class623.aClass497_136 = Class384.method28337(Class31.aClass31_17, false, 1, false, true, 2081559358);
			Class110_Sub10.aClass497_23 = Class384.method28337(Class31.aClass31_8, false, 1, false, true, 2030547407);
			Class93_Sub3.aClass497_43 = Class384.method28337(Class31.aClass31_2, false, 1, false, true, 1474121865);
			Class166_Sub45.aClass497_60 = Class384.method28337(Class31.aClass31_24, false, 1, true, true, 1778232779);
			Class621.aClass497_135 = Class384.method28337(Class31.aClass31_36, false, 1, true, true, 1938542461);
			Class200.aClass497_96 = Class384.method28337(Class31.aClass31_41, false, 1, true, true, 1557636547);
			Class166_Sub15.aClass497_59 = Class384.method28337(Class31.aClass31_18, true, 1, false, true, 1421622487);
			Class86.aClass497_15 = Class384.method28337(Class31.aClass31_10, false, 1, false, true, 1606269514);
			Class230.aClass497_99 = Class384.method28337(Class31.aClass31_38, true, 1, false, true, 1390914204);
			Class40.aClass497_4 = Class384.method28337(Class31.aClass31_5, false, 1, false, true, 1441704969);
			Class542.aClass497_129 = Class384.method28337(Class31.aClass31_3, false, 1, true, true, 1700427336);
			Class337.aClass497_103 = Class384.method28337(Class31.aClass31_22, true, 1, false, false, 1522832117);
			Class124.aClass497_93 = Class384.method28337(Class31.aClass31_31, true, 1, false, false, 2017617012);
			Class493.aClass497_124 = Class384.method28337(Class31.aClass31_11, false, 1, true, true, 1288727661);
			Class47.aClass497_6 = Class384.method28337(Class31.aClass31_42, false, 1, true, true, 1728423450);
			Class514.aClass497_128 = Class384.method28337(Class31.aClass31_20, false, 1, true, true, 1405876705);
			Class157.aClass497_49 = Class384.method28337(Class31.aClass31_14, false, 1, true, true, 1870689373);
			Class705.aClass497_141 = Class384.method28337(Class31.aClass31_15, false, 1, true, true, 1698974389);
			Class327.aClass497_102 = Class384.method28337(Class31.aClass31_16, false, 1, true, true, 1925295655);
			Class443.aClass497_115 = Class384.method28337(Class31.aClass31_27, false, 1, true, true, 1787534774);
			Class144_Sub1.aClass497_42 = Class384.method28337(Class31.aClass31_1, true, 1, false, false, 1630020926);
			Class710.aClass497_143 = Class384.method28337(Class31.aClass31_32, true, 1, false, true, 1590692072);
			Class486.aClass497_123 = Class384.method28337(Class31.aClass31_19, false, 1, true, true, 2093461848);
			Class304.aClass497_101 = Class384.method28337(Class31.aClass31_23, false, 1, true, true, 1597826058);
			Class108_Sub1.aClass497_19 = Class384.method28337(Class31.aClass31_21, true, 1, true, true, 1444643174);
			Class577.aClass497_130 = Class384.method28337(Class31.aClass31_13, false, 1, true, true, 1509261814);
			Class75.aClass497_11 = Class384.method28337(Class31.aClass31_12, false, 1, true, true, 1583032264);
			Class446.aClass497_117 = Class384.method28337(Class31.aClass31_30, true, 1, false, true, 2080896549);
			Class590.aClass497_133 = Class384.method28337(Class31.aClass31_4, true, 1, false, true, 1738313300);
			Class364.aClass497_105 = Class384.method28337(Class31.aClass31_26, true, 1, true, true, 2096169317);
		}
		if (Class370.aClass370_22 == Class146.aClass370_3) {
			local6 = 0;
			local290 = 0;
			for (local127 = 0; local127 < Class569.aClass143_Sub1Array2.length; local127++) {
				if (Class569.aClass143_Sub1Array2[local127] != null) {
					local6 += Class569.aClass143_Sub1Array2[local127].method11071(1189701933);
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (Class362.anInt4733 * -31438815 < 0) {
					Class362.anInt4733 = local6 * -790545439;
				}
				return (local6 - Class362.anInt4733 * -31438815) * 100 / (100 - Class362.anInt4733 * -31438815);
			}
			Class110_Sub4.method7302(Class93_Sub26.aClass645_15, -1978403605);
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23812(-2056513281));
		}
		if (Class146.aClass370_3 == Class370.aClass370_11) {
			@Pc(677) byte[] local677 = Class222.aClass497_97.method30240(Class649.aClass649_5.anInt5956 * -51136173, (byte) 120);
			if (local677 == null) {
				return 0;
			}
			Class274.aClass258_11 = new Class258();
			Class274.aClass258_11.method26124(50, 7340032, 385393012);
			Class151.method13979(local677, (byte) 16);
			Class481.method29937(1, 1823202236);
		}
		if (Class146.aClass370_3 == Class370.aClass370_12 && Class125_Sub1.aClass586_1 == null) {
			Class125_Sub1.aClass586_1 = new Class586(Class590.aClass497_133);
			Class43.method843(Class125_Sub1.aClass586_1, -1759012912);
		}
		if (Class370.aClass370_5 == Class146.aClass370_3) {
			local6 = Class378.method28250(-1234484281);
			if (local6 < 100) {
				return local6;
			}
			Class27.method585(Class222.aClass497_97.method30240(Class649.aClass649_1.anInt5956 * -51136173, (byte) 57), (byte) -25);
			Class618.aShortArrayArray6 = Class93_Sub26.aClass645_15.aShortArrayArray8;
			Class111.aShortArrayArrayArray3 = Class93_Sub26.aClass645_15.aShortArrayArrayArray8;
			Class138_Sub3.aShortArrayArray4 = Class93_Sub26.aClass645_15.aShortArrayArray7;
			Class79_Sub1_Sub2.aShortArrayArrayArray1 = Class93_Sub26.aClass645_15.aShortArrayArrayArray9;
			if (Class93_Sub26.aClass645_15.anInt5935 * 68799883 != -1 && Class93_Sub26.aClass645_15.anInt5936 * 810262785 != -1) {
				client.anInt3511 = Class93_Sub26.aClass645_15.anInt5935 * -1828737035;
				client.anInt3512 = Class93_Sub26.aClass645_15.anInt5936 * 1053772179;
			}
			Class113.aClass651_2 = new Class651(Class222.aClass497_97);
			Class336.aClass644_1 = new Class644(Class222.aClass497_97);
			Class288.aClass636_1 = new Class636(Class222.aClass497_97);
			Class119.aClass650_2 = new Class650(Class222.aClass497_97);
			Class159.aClass637_2 = new Class637(Class222.aClass497_97);
		}
		if (Class370.aClass370_14 == Class146.aClass370_3) {
			if (-742728449 * Class93_Sub26.aClass645_15.anInt5934 != -1 && !Class86.aClass497_15.method30234(Class93_Sub26.aClass645_15.anInt5934 * -742728449, 0, 1088319646)) {
				return 99;
			}
			Class619.aClass225_8 = new Class225(Class108_Sub1.aClass497_19);
			Class636.anInterface24_10 = new Class111_Sub1(Class230.aClass497_99);
			Class124.aClass32_Sub21_7 = new Class32_Sub21(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class166_Sub6.aClass32_Sub5_1 = new Class32_Sub5(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class311.aClass32_Sub6_1 = new Class32_Sub6(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class74.aClass32_2 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_73, 64, new Class52(Class30.class));
			Class276.aClass32_3 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_72, 16, new Class52(Class77.class));
			Class19.aClass32_Sub7_5 = new Class32_Sub7(client.aClass702_4, Class106.aClass717_8, Class47.aClass497_6);
			Class682.aClass32_Sub1_3 = new Class32_Sub1(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class692.aClass32_Sub4_3 = new Class32_Sub4(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class366.aClass32_Sub8_1 = new Class32_Sub8(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class534.aClass32_Sub10_1 = new Class32_Sub10(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class343.aClass32_Sub19_1 = new Class32_Sub19(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class86.aClass497_15);
			Class638.aClass32_Sub22_1 = new Class32_Sub22(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class668.aClass32_Sub15_1 = new Class32_Sub15(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class273.aClass32_Sub14_8 = new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15);
			client.aClass532_1.method30630(Class273.aClass32_Sub14_8, 2087680265);
			Class392.aClass541_1.method31083(new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15), -1963176473);
			Class542.aClass32_Sub2_3 = new Class32_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class466.aClass32_Sub20_3 = new Class32_Sub20(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class162.aClass32_Sub3_2 = new Class32_Sub3(client.aClass702_4, Class106.aClass717_8, true, Class514.aClass497_128, Class86.aClass497_15);
			Class277.aClass32_Sub12_1 = new Class32_Sub12(client.aClass702_4, Class106.aClass717_8, true, Class124.aClass32_Sub21_7, Class157.aClass497_49, Class86.aClass497_15);
			Class288.aClass55_Sub2_1 = new Class55_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, true);
			client.aClass32_Sub13_1 = new Class32_Sub13(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class32.aClass32_Sub17_23 = new Class32_Sub17(client.aClass702_4, Class106.aClass717_8, Class705.aClass497_141, Class623.aClass497_136, Class110_Sub10.aClass497_23, Class93_Sub3.aClass497_43, client.aClass32_Sub13_1);
			Class123.aClass32_Sub11_2 = new Class32_Sub11(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class51.aClass32_Sub9_1 = new Class32_Sub9(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class501.aClass32_Sub18_1 = new Class32_Sub18(client.aClass702_4, Class106.aClass717_8, Class327.aClass497_102, Class86.aClass497_15);
			Class649.aClass55_Sub1_1 = new Class55_Sub1(client.aClass702_4, Class106.aClass717_8, Class443.aClass497_115, true);
			Class72.aClass79_Sub1_Sub2_2 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_63, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class21.aClass79_Sub1_Sub1_1 = new Class79_Sub1_Sub1(client.aClass702_4, Class138.aClass138_65, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class684.aClass79_Sub1_Sub2_7 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_67, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class39.aClass79_Sub1_Sub2_1 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_71, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_68, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class429.aClass79_Sub1_Sub2_5 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_70, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class265.aClass79_Sub1_Sub2_4 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_72, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class96.aMap9 = Class85.method1445(new Class79_Sub1[] { Class72.aClass79_Sub1_Sub2_2, Class21.aClass79_Sub1_Sub1_1, Class684.aClass79_Sub1_Sub2_7, Class39.aClass79_Sub1_Sub2_1, Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3, Class429.aClass79_Sub1_Sub2_5, Class265.aClass79_Sub1_Sub2_4 }, (short) 9211);
			Class30.aClass32_Sub16_1 = new Class32_Sub16(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class96.aMap9);
			Class506.anInterface21_4 = new Class367();
			Class283.method26569(Class200.aClass497_96, Class86.aClass497_15, Class110_Sub7.aClass497_22, Class633.aClass497_137, 130179859);
			Class81.aClass451_1 = new Class451(Class75.aClass497_11);
			Class283.aClass444_1 = new Class444(Class577.aClass497_130);
			Class599.aClass438_1 = new Class438(Class577.aClass497_130);
			Class449.aClass514_1 = new Class514(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101);
			Class372.aClass58_2 = new Class58(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101, new Class452());
			Class624.aClass120_1 = new Class120(Class21.aClass79_Sub1_Sub1_1, Class30.aClass32_Sub16_1, Class336.aClass644_1.method32775(1163018486));
			Class610.method32202(-1420624684);
			Class450.method29119(Class32.aClass32_Sub17_23, -123793155);
			Class120.method8671(Class599.aClass438_1, Class283.aClass444_1, -838547042);
			Class711.method36994(Class86.aClass497_15, Class619.aClass225_8, Class636.anInterface24_10, 1933488510);
			@Pc(1211) Class337 local1211 = new Class337(Class40.aClass497_4.method30252("huffman", "", 1200487767));
			Class339.method27582(local1211, (byte) 7);
			Class553.aClass147_2 = Class450.method29114(-1604389213);
			Class125_Sub3.aClass93_Sub42_1 = new Class93_Sub42(true);
		}
		if (Class370.aClass370_20 == Class146.aClass370_3) {
			local6 = Class96_Sub3.method2329(Class110_Sub7.aClass497_22, 861515753) + Class157.aClass462_2.method29448(true, -2133989147);
			local290 = Class15.method213(1309444066) + Class157.aClass462_2.method29420((byte) 16);
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_16) {
			Class159.method14503(Class144_Sub1.aClass497_42, Class710.aClass497_143, Class682.aClass32_Sub1_3, Class692.aClass32_Sub4_3, client.aClass532_1.method30647(1824153727), Class542.aClass32_Sub2_3, Class466.aClass32_Sub20_3, Class624.aClass120_1, Class624.aClass120_1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_17) {
			Class596.aClass113_Sub1_1 = new Class113_Sub1(Class72.aClass79_Sub1_Sub2_2);
			Class605.method32086(1262698669);
			Class266.aClass306_1 = Class166_Sub29.method16081(1398347037);
			Class166_Sub15.aClass497_59.method30246(false, true, (byte) 45);
			Class110_Sub7.aClass497_22.method30246(true, true, (byte) 81);
			Class633.aClass497_137.method30246(true, true, (byte) 54);
			Class40.aClass497_4.method30246(true, true, (byte) 54);
			client.aBoolean605 = true;
		}
		if (Class146.aClass370_3 == Class370.aClass370_18 && Class93_Sub26.aClass645_15.anInt5927 * -221025663 != -1) {
			if (!Class383.method28326(Class93_Sub26.aClass645_15.anInt5927 * -221025663, null, 18723094)) {
				return 0;
			}
			local115 = true;
			for (local290 = 0; local290 < Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5927 * -221025663].aClass312Array3.length; local290++) {
				@Pc(1343) Class312 local1343 = Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5927 * -221025663].aClass312Array3[local290];
				if (local1343.anInt4012 * -158526639 == 5 && local1343.anInt4036 * -1566573331 != -1 && !Class110_Sub7.aClass497_22.method30234(local1343.anInt4036 * -1566573331, 0, -505791131)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class370.aClass370_19 == Class146.aClass370_3) {
			Class138.method11537(true, 1409187028);
		}
		if (Class146.aClass370_3 == Class370.aClass370_6) {
			Class653.aClass357_1.method27923((byte) -21);
			try {
				Class362.aThread6.join();
			} catch (@Pc(1388) InterruptedException local1388) {
				return 0;
			}
			Class653.aClass357_1 = null;
			Class362.aThread6 = null;
			Class17.aClass497_2 = null;
			Class7.aClass497_1 = null;
			Class363.aClass81_1 = null;
			Class362.anInterface30Array1 = null;
			Class14.aMap1.remove(Class31.aClass31_28);
			Class14.aMap1.remove(Class31.aClass31_7);
			Class14.aMap1.remove(Class31.aClass31_29);
			Class699.method36888((byte) 119);
			client.aBoolean597 = Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16517((byte) 49) == 1;
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1, (byte) 107);
			if (client.aBoolean597) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 122);
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.aBoolean366 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 < 512 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 != 0) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0, (byte) 40);
			}
			Class106_Sub1.method5148(-2037227973);
			if (client.aBoolean597) {
				Class543.method31129(0, false, 1945646779);
				if (!client.aBoolean608) {
					Class481.method29936(Class73.aClass73_10, -1570591056);
				}
			} else {
				Class543.method31129(Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 87), false, 1945646779);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 108) == 0) {
					Class481.method29936(Class73.aClass73_11, -1676256474);
				}
			}
			Class717.method37076(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15856(337890878), -1, -1, false, (byte) 27);
			Class157.aClass462_2.method29417(client.anInterface50_1, 1664109974);
			Class520.method30520(Class694.aClass104_14, -1009845878);
			Class379.method28282(Class694.aClass104_14, Class110_Sub7.aClass497_22, 874768859);
		}
		return Class300.method26810(17188309);
	}

	@OriginalMember(owner = "client!rm", name = "mp", descriptor = "(II)V")
	public static void method30786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = client.aList4.indexOf(arg0);
		if (local4 == -1) {
			client.aList4.add(arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "(Lclient!hf;III)V")
	static void method30787(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (client.aBoolean627) {
			@Pc(16) Class87 local16 = (Class87) (Class650.anInt5958 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.method18273(Class650.anInt5958 * -759562015, 182342251));
			if (client.method25250(arg0).method13637(74025415) && (Class253.anInt3892 * 735260021 & 0x20) != 0 && (local16 == null || arg0.method26951(Class650.anInt5958 * -759562015, local16.anInt265 * 951920133, -719368696) != local16.anInt265 * 951920133)) {
				Class280.method26551(client.aString145, client.aString142 + " " + Class430.aString215 + " " + arg0.aString171, Class271.anInt3926 * -308125347, 58, arg0.anInt4086 * 307668159, 0L, arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -77);
			}
		}
		for (@Pc(96) int local96 = 9; local96 >= 5; local96--) {
			@Pc(104) String local104 = Class255.method26102(arg0, local96, 669482229);
			if (local104 != null) {
				Class280.method26551(local104, arg0.aString171, Class93_Sub32.method13929(arg0, local96, (short) -16387), 1007, arg0.anInt4086 * 307668159, (long) (local96 + 1), arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -36);
			}
		}
		@Pc(154) String local154 = Class629.method32445(arg0, 2123988557);
		if (local154 != null) {
			Class280.method26551(local154, arg0.aString171, arg0.anInt4073 * -91207751, 25, arg0.anInt4086 * 307668159, 0L, arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -14);
		}
		for (@Pc(196) int local196 = 4; local196 >= 0; local196--) {
			@Pc(203) String local203 = Class255.method26102(arg0, local196, -2047715129);
			if (local203 != null) {
				Class280.method26551(local203, arg0.aString171, Class93_Sub32.method13929(arg0, local196, (short) -17140), 57, arg0.anInt4086 * 307668159, (long) (local196 + 1), arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -42);
			}
		}
		if (!client.method25250(arg0).method13618((byte) 14)) {
			return;
		}
		if (arg0.aString169 == null) {
			Class280.method26551(Class74.aClass74_18.method1259(Class106.aClass717_8, (byte) 0), "", -1, 30, arg0.anInt4086 * 307668159, 0L, arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -24);
		} else {
			Class280.method26551(arg0.aString169, "", -1, 30, arg0.anInt4086 * 307668159, 0L, arg0.anInt4011 * 532402067, arg0.anInt3994 * -1549590237, true, false, (long) (arg0.anInt4011 * 532402067 << 0 | arg0.anInt3994 * -1549590237), false, (byte) -27);
		}
	}

	@OriginalMember(owner = "client!rm", name = "sd", descriptor = "(Lclient!yf;S)V")
	static void method30788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4086 * 307668159;
	}

	@OriginalMember(owner = "client!rm", name = "bfs", descriptor = "(Lclient!yf;I)V")
	static void method30789(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	Class533() throws Throwable {
		throw new Error();
	}
}
