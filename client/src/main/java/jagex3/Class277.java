package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
final class Class277 implements Interface58 {

	@OriginalMember(owner = "client!fw", name = "hy", descriptor = "Lclient!aon;")
	public static Class32_Sub12 aClass32_Sub12_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fw", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_13;

	@OriginalMember(owner = "client!fw", name = "aha", descriptor = "(Lclient!yf;B)V")
	static void method26446(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class263) Class32.aClass32_Sub17_23.method18273(local12, -1829388866)).anInt3912 * -1681798739;
	}

	@OriginalMember(owner = "client!fw", name = "bbx", descriptor = "(Lclient!yf;I)V")
	static void method26447(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class132_Sub1_Sub1_Sub1_Sub1 local3 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0.aClass132_Sub1_Sub1_Sub1_4;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local3.anInt2647 * 1464472043;
	}

	@OriginalMember(owner = "client!fw", name = "agh", descriptor = "(Lclient!yf;I)V")
	static void method26448(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class47) aClass32_Sub12_1.method18273(local12, 713374606)).anInt152 * -945892479;
	}

	@OriginalMember(owner = "client!fw", name = "gy", descriptor = "(J)V")
	static void method26449(@OriginalArg(0) long arg0) {
		@Pc(3) int local3 = client.anInt3481 * -1195894597;
		@Pc(7) int local7 = client.anInt3482 * 1196621895;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (local3 != Class72.anInt241 * -1022856553) {
			local18 = local3 - Class72.anInt241 * -1022856553;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			Class72.anInt241 += local26 * -79811289;
		}
		if (SortedQueueEntry.anInt5047 * -953396699 != local7) {
			local18 = local7 - SortedQueueEntry.anInt5047 * -953396699;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 > 0) {
				if (local26 == 0) {
					local26 = 1;
				} else if (local26 > local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = -1;
			} else if (local26 < local18) {
				local26 = local18;
			}
			SortedQueueEntry.anInt5047 += local26 * 2072345005;
		}
		client.aFloat253 += (float) arg0 * client.aFloat254 / 40.0F * 8.0F;
		client.aFloat256 += (float) arg0 * client.aFloat255 / 40.0F * 8.0F;
		Class49.method16619((byte) -67);
	}

	@OriginalMember(owner = "client!fw", name = "me", descriptor = "(B)V")
	public static void method26450(@OriginalArg(0) byte arg0) {
		if (Class343.method27611((byte) 66) == Class555.aClass555_3) {
			return;
		}
		try {
			@Pc(9) String local9 = Class32_Sub10.anApplet2.getParameter(Class461.aClass461_26.aString220);
			@Pc(17) int local17 = (int) (Class305.method26889(1236000300) / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local17 + "; version=1; path=/; domain=" + local9;
			Class70.method1231(Class32_Sub10.anApplet2, "document.cookie=\"" + local30 + "\"", (byte) -68);
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!fw", name = "mq", descriptor = "(I)V")
	static void method26451(@OriginalArg(0) int arg0) {
		if (Class280.aClass693_1 != Class693.aClass693_12) {
			Class447.aClass447_13.method29085(-2042335748);
		}
	}

	@OriginalMember(owner = "client!fw", name = "awo", descriptor = "(Lclient!yf;B)V")
	static void method26452(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class154_Sub1 local2 = Class687.method36682(1986137124);
		if (local2 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1654 * 2079113925;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1650 * 803722663;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.aString47;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.method14148(-2125525230);
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.method14154((byte) -75);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1652 * 1625257571;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1655 * 1280583823;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.aString46;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "([[[Lclient!tk;I)V")
	static void method26453(@OriginalArg(0) Class572[][][] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class572[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class572 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass132_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub4_1).method13405(-224107033);
						}
						if (local29.aClass132_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_1).method13405(130009464);
						}
						if (local29.aClass132_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub3_2).method13405(-1561938972);
						}
						if (local29.aClass132_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_1).method13405(-1151779838);
						}
						if (local29.aClass132_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass132_Sub1_Sub2_2).method13405(-2042319062);
						}
						for (@Pc(80) Class590 local80 = local29.aClass590_1; local80 != null; local80 = local80.aClass590_2) {
							@Pc(86) Class132_Sub1_Sub1 local86 = local80.aClass132_Sub1_Sub1_1;
							if (local86 instanceof Interface61) {
								((Interface61) local86).method13405(163441999);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "ahn", descriptor = "(Lclient!yf;I)V")
	static void method26454(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class166_Sub24.method15883(1434635284);
	}

	@OriginalMember(owner = "client!fw", name = "sf", descriptor = "(Lclient!yf;B)V")
	static void method26455(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4011 * 532402067;
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class277(@OriginalArg(0) Class258 arg0) {
		this.aClass258_13 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26444(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) -5662);
		@Pc(10) float local10 = local2.method31028(585376764);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29755(local6, this.aClass258_13.method26123(-819325062));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29746();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	@Override
	public void method26443(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) 119);
		@Pc(10) float local10 = local2.method31028(273033167);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29755(local6, this.aClass258_13.method26123(-1870758685));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29746();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26445(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) -21690);
		@Pc(10) float local10 = local2.method31028(-587425773);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(21) Class472 local21 = Class472.method29755(local6, this.aClass258_13.method26123(-1585771865));
		@Pc(23) float local23 = 0.0F;
		@Pc(26) float local26 = local21.method29746();
		if (local26 >= local14) {
			local23 = 0.0F;
		}
		if (local26 <= local10) {
			local23 = 1.0F;
		} else {
			@Pc(51) float local51 = 1.0F - (local26 - local10) * (1.0F / (local14 - local10));
			if ((double) local51 < 0.0D || (double) local51 > 1.0D) {
				local51 = Math.min(Math.max(local51, 0.0F), 1.0F);
			}
			local23 = local51;
		}
		arg1[0] = local23;
		arg1[1] = local23;
	}
}
