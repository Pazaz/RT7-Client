package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ady")
public final class Class93_Sub1_Sub2 extends Class93_Sub1 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!ady", name = "tt", descriptor = "[Lclient!ar;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!ady", name = "w", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!ady", name = "f", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!ady", name = "k", descriptor = "I")
	public int anInt317 = 0;

	@OriginalMember(owner = "client!ady", name = "l", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!ady", name = "m", descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	public static String method1787(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) String local4 = Class607.method32103(Class685.method33634(arg0, (byte) -1));
		if (local4 == null) {
			local4 = "";
		}
		return local4;
	}

	@OriginalMember(owner = "client!ady", name = "<init>", descriptor = "()V")
	Class93_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!ady", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1784(arg0, local3, 288056871);
		}
	}

	@OriginalMember(owner = "client!ady", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ady", name = "u", descriptor = "(Lclient!alw;II)V")
	void method1784(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 2) {
			this.anInt316 = arg0.method22427(-1434290800) * -21466175;
		} else if (arg1 == 4) {
			this.anInt317 = arg0.method22425((short) 16384) * 1466249681;
			this.anIntArray25 = new int[this.anInt317 * 795395889];
			this.anIntArray24 = new int[this.anInt317 * 795395889];
			for (@Pc(36) int local36 = 0; local36 < this.anInt317 * 795395889; local36++) {
				this.anIntArray25[local36] = arg0.method22427(-1434290800);
				this.anIntArray24[local36] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!ady", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ady", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!ady", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1784(arg0, local3, -62279542);
		}
	}

	@OriginalMember(owner = "client!ady", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1784(arg0, local3, -1022359820);
		}
	}

	@OriginalMember(owner = "client!ady", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1784(arg0, local3, -1839004213);
		}
	}

	@OriginalMember(owner = "client!ady", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!ady", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1784(arg0, local3, 533807705);
		}
	}

	@OriginalMember(owner = "client!ady", name = "p", descriptor = "(Lclient!alw;I)V")
	void method1785(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt316 = arg0.method22427(-1434290800) * -21466175;
		} else if (arg1 == 4) {
			this.anInt317 = arg0.method22425((short) 16384) * 1466249681;
			this.anIntArray25 = new int[this.anInt317 * 795395889];
			this.anIntArray24 = new int[this.anInt317 * 795395889];
			for (@Pc(36) int local36 = 0; local36 < this.anInt317 * 795395889; local36++) {
				this.anIntArray25[local36] = arg0.method22427(-1434290800);
				this.anIntArray24[local36] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!ady", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ady", name = "d", descriptor = "(Lclient!alw;I)V")
	void method1786(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt316 = arg0.method22427(-1434290800) * -21466175;
		} else if (arg1 == 4) {
			this.anInt317 = arg0.method22425((short) 16384) * 1466249681;
			this.anIntArray25 = new int[this.anInt317 * 795395889];
			this.anIntArray24 = new int[this.anInt317 * 795395889];
			for (@Pc(36) int local36 = 0; local36 < this.anInt317 * 795395889; local36++) {
				this.anIntArray25[local36] = arg0.method22427(-1434290800);
				this.anIntArray24[local36] = arg0.method22427(-1434290800);
			}
		}
	}
}
