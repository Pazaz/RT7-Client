package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class397 {

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[[Lclient!ly;")
	Class410[][] aClass410ArrayArray1;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_35;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!aem;")
	final Class99_Sub3 aClass99_Sub3_3;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	final int anInt4830;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	final int anInt4828;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "[B")
	final byte[] aByteArray91;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
	final int anInt4832;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
	final int anInt4829;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	final int anInt4831;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([B[BIIIIII)V")
	static void method28644(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "([B[BIIIIII)V")
	static void method28650(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "([B[BIIIIII)V")
	static void method28651(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "([BIIIII)Z")
	static boolean method28652(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "([B[BIIIIII)V")
	static void method28664(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "([B[BIIIIII)V")
	static void method28666(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "([B[BIIIIII)V")
	static void method28667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "([BIIIII)Z")
	static boolean method28668(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "([BIIIII)Z")
	static boolean method28669(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!afc;Lclient!aem;)V")
	Class397(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class99_Sub3 arg1) {
		this.aClass104_Sub2_35 = arg0;
		this.aClass99_Sub3_3 = arg1;
		this.anInt4830 = (this.aClass99_Sub3_3.anInt414 * -1667858293 * this.aClass99_Sub3_3.anInt412 * -1678286317 >> this.aClass104_Sub2_35.anInt2936) + 2;
		this.anInt4828 = (this.aClass99_Sub3_3.anInt413 * -143202029 * this.aClass99_Sub3_3.anInt412 * -1678286317 >> this.aClass104_Sub2_35.anInt2936) + 2;
		this.aByteArray91 = new byte[this.anInt4830 * this.anInt4828];
		this.anInt4832 = this.aClass104_Sub2_35.anInt2936 + 7 - this.aClass99_Sub3_3.anInt415 * -373302705;
		this.anInt4829 = this.aClass99_Sub3_3.anInt414 * -1667858293 >> this.anInt4832;
		this.anInt4831 = this.aClass99_Sub3_3.anInt413 * -143202029 >> this.anInt4832;
	}

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "(Lclient!ara;II)Z")
	boolean method28645(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(26) int local26 = local2.anInt3205;
		@Pc(29) int local29 = local2.anInt3203;
		@Pc(34) int local34 = this.anInt4830 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4828) {
			local40 = arg2 + local26 + 1 - this.anInt4828;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4830) {
			local40 = arg1 + local29 + 1 - this.anInt4830;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4830;
			return method28652(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "(Lclient!ara;II)V")
	void method28646(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3205;
		@Pc(31) int local31 = local2.anInt3203;
		@Pc(36) int local36 = this.anInt4830 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4828) {
			local44 = arg2 + local28 + 1 - this.anInt4828;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4830) {
			local44 = arg1 + local31 + 1 - this.anInt4830;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28650(this.aByteArray91, local2.aByteArray61, local25, local23, local31, local28, local36, local38);
			this.method28649(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "(IIII)V")
	void method28647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass410ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class410[] local45 = this.aClass410ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean757 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "(Lclient!ara;II)Z")
	boolean method28648(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(26) int local26 = local2.anInt3205;
		@Pc(29) int local29 = local2.anInt3203;
		@Pc(34) int local34 = this.anInt4830 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4828) {
			local40 = arg2 + local26 + 1 - this.anInt4828;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4830) {
			local40 = arg1 + local29 + 1 - this.anInt4830;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4830;
			return method28652(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "(IIII)V")
	void method28649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass410ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class410[] local45 = this.aClass410ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean757 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "(Lclient!jj;III[[ZZ)V")
	void method28653(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) boolean arg5) {
		this.aClass104_Sub2_35.method20530(false);
		@Pc(12) float local12 = 1.0F / (float) (this.aClass104_Sub2_35.anInt2935 * 128);
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(76) int local76;
		if (arg5) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4831; local16++) {
				@Pc(25) int local25 = local16 << this.anInt4832;
				local32 = local16 + 1 << this.anInt4832;
				label144: for (local34 = 0; local34 < this.anInt4829; local34++) {
					if (this.aClass410ArrayArray1[local34][local16] != null) {
						local51 = local34 << this.anInt4832;
						local58 = local34 + 1 << this.anInt4832;
						for (local60 = local51; local60 < local58; local60++) {
							if (local60 - arg1 >= -arg3 && local60 - arg1 <= arg3) {
								for (local76 = local25; local76 < local32; local76++) {
									if (local76 - arg2 >= -arg3 && local76 - arg2 <= arg3 && arg4[local60 - arg1 + arg3][local76 - arg2 + arg3]) {
										arg0.aClass489_46.method30026(local12, local12, 1.0F, 1.0F);
										arg0.aClass489_46.aFloatArray116[12] = -local34;
										arg0.aClass489_46.aFloatArray116[13] = -local16;
										this.aClass410ArrayArray1[local34][local16].method28773(arg0);
										continue label144;
									}
								}
							}
						}
					}
				}
			}
		} else {
			@Pc(152) int[] local152 = new int[this.anInt4831 * this.anInt4829];
			@Pc(156) ByteBuffer local156 = this.aClass104_Sub2_35.aByteBuffer7;
			local156.clear();
			local32 = 0;
			for (local34 = 0; local34 < this.anInt4831; local34++) {
				local51 = local34 << this.anInt4832;
				local58 = local34 + 1 << this.anInt4832;
				for (local60 = 0; local60 < this.anInt4829; local60++) {
					@Pc(192) Class410 local192 = this.aClass410ArrayArray1[local60][local34];
					@Pc(194) int local194 = 0;
					if (local192 != null) {
						@Pc(201) int local201 = local60 << this.anInt4832;
						@Pc(208) int local208 = local60 + 1 << this.anInt4832;
						for (@Pc(210) int local210 = local51; local210 < local58; local210++) {
							if (local210 - arg2 >= -arg3 && local210 - arg2 <= arg3) {
								@Pc(234) int local234 = local210 * this.aClass99_Sub3_3.anInt414 * -1667858293 + local201;
								for (@Pc(236) int local236 = local201; local236 < local208; local236++) {
									if (local236 - arg1 >= -arg3 && local236 - arg1 <= arg3 && arg4[local236 - arg1 + arg3][local210 - arg2 + arg3]) {
										@Pc(270) short[] local270 = this.aClass99_Sub3_3.aShortArrayArray3[local234];
										if (local270 != null) {
											for (@Pc(274) int local274 = 0; local274 < local270.length; local274++) {
												local156.putShort(local270[local274]);
												local194++;
											}
										}
									}
									local234++;
								}
							}
						}
					}
					local152[local32] = local194;
					local32++;
				}
			}
			if (local156.position() != 0) {
				local34 = local156.position();
				@Pc(314) Interface40 local314 = this.aClass104_Sub2_35.method20928(local34 / 2);
				local314.method29514(0, local34, this.aClass104_Sub2_35.aLong132);
				local58 = 0;
				local32 = 0;
				for (local60 = 0; local60 < this.anInt4831; local60++) {
					for (local76 = 0; local76 < this.anInt4829; local76++) {
						if (local152[local32] != 0) {
							arg0.aClass489_46.method30026(local12, local12, 1.0F, 1.0F);
							arg0.aClass489_46.aFloatArray116[12] = -local76;
							arg0.aClass489_46.aFloatArray116[13] = -local60;
							this.aClass410ArrayArray1[local76][local60].method28772(arg0, local314, local58, local152[local32] / 3);
							local58 += local152[local32];
						}
						local32++;
					}
				}
			}
		}
		this.aClass104_Sub2_35.method20530(true);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(Lclient!ara;II)V")
	void method28654(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3205;
		@Pc(31) int local31 = local2.anInt3203;
		@Pc(36) int local36 = this.anInt4830 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4828) {
			local44 = arg2 + local28 + 1 - this.anInt4828;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4830) {
			local44 = arg1 + local31 + 1 - this.anInt4830;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28650(this.aByteArray91, local2.aByteArray61, local25, local23, local31, local28, local36, local38);
			this.method28649(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lclient!ara;II)V")
	void method28655(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3205;
		@Pc(31) int local31 = local2.anInt3203;
		@Pc(36) int local36 = this.anInt4830 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4828) {
			local44 = arg2 + local28 + 1 - this.anInt4828;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4830) {
			local44 = arg1 + local31 + 1 - this.anInt4830;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28651(this.aByteArray91, local2.aByteArray61, local25, local23, local31, local28, local36, local38);
			this.method28649(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "(Lclient!ara;II)Z")
	boolean method28656(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(26) int local26 = local2.anInt3205;
		@Pc(29) int local29 = local2.anInt3203;
		@Pc(34) int local34 = this.anInt4830 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4828) {
			local40 = arg2 + local26 + 1 - this.anInt4828;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4830) {
			local40 = arg1 + local29 + 1 - this.anInt4830;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4830;
			return method28652(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "()V")
	void method28657() {
		this.aClass410ArrayArray1 = new Class410[this.anInt4829][this.anInt4831];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4831; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4829; local14++) {
				this.aClass410ArrayArray1[local14][local8] = new Class410(this.aClass104_Sub2_35, this, this.aClass99_Sub3_3, local14, local8, this.anInt4832, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass410ArrayArray1[local14][local8].anInt4871 == 0) {
					this.aClass410ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "(Lclient!ara;II)Z")
	boolean method28658(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(26) int local26 = local2.anInt3205;
		@Pc(29) int local29 = local2.anInt3203;
		@Pc(34) int local34 = this.anInt4830 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4828) {
			local40 = arg2 + local26 + 1 - this.anInt4828;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4830) {
			local40 = arg1 + local29 + 1 - this.anInt4830;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4830;
			return method28652(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "(Lclient!ara;II)V")
	void method28659(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3205;
		@Pc(31) int local31 = local2.anInt3203;
		@Pc(36) int local36 = this.anInt4830 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt4828) {
			local44 = arg2 + local28 + 1 - this.anInt4828;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt4830) {
			local44 = arg1 + local31 + 1 - this.anInt4830;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method28651(this.aByteArray91, local2.aByteArray61, local25, local23, local31, local28, local36, local38);
			this.method28649(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "(IIII)V")
	void method28660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass410ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class410[] local45 = this.aClass410ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean757 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIII)V")
	void method28661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass410ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class410[] local45 = this.aClass410ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean757 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "(IIII)V")
	void method28662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass410ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class410[] local45 = this.aClass410ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				if (local45[local47] != null) {
					local45[local47].aBoolean757 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "()V")
	void method28663() {
		this.aClass410ArrayArray1 = new Class410[this.anInt4829][this.anInt4831];
		for (@Pc(8) int local8 = 0; local8 < this.anInt4831; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4829; local14++) {
				this.aClass410ArrayArray1[local14][local8] = new Class410(this.aClass104_Sub2_35, this, this.aClass99_Sub3_3, local14, local8, this.anInt4832, local14 * 128 + 1, local8 * 128 + 1);
				if (this.aClass410ArrayArray1[local14][local8].anInt4871 == 0) {
					this.aClass410ArrayArray1[local14][local8] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "(Lclient!ara;II)Z")
	boolean method28665(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub1 local2 = (Class93_Sub1_Sub4_Sub1) arg0;
		arg1 += local2.anInt3206 + 1;
		arg2 += local2.anInt3204 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt4830;
		@Pc(26) int local26 = local2.anInt3205;
		@Pc(29) int local29 = local2.anInt3203;
		@Pc(34) int local34 = this.anInt4830 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt4830;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt4828) {
			local40 = arg2 + local26 + 1 - this.anInt4828;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt4830) {
			local40 = arg1 + local29 + 1 - this.anInt4830;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt4830;
			return method28652(this.aByteArray91, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}
}
