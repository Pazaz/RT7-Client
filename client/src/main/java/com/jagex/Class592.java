package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class592 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFF)V")
	public static void method31884(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29715(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29710(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29711(Class472.method29755(arg3, arg1));
		local14.method29753(arg2);
		@Pc(21) Class472 local21 = Class472.method29755(local14, local9);
		@Pc(24) float local24 = local21.method29746();
		if (arg5.aFloat325 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat325) || local24 > arg7 || local24 < arg8) {
			arg1.method29719(arg3);
			arg4.method29720();
			return;
		}
		arg2.method29651();
		@Pc(54) Class472 local54 = Class472.method29710(1.0F, 0.0F, 0.0F);
		@Pc(59) Class472 local59 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(64) Class472 local64 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local54.method29753(arg2);
		local59.method29753(arg2);
		local64.method29753(arg2);
		@Pc(84) Class472 local84 = Class472.method29710(Class472.method29730(local54, arg4), Class472.method29730(local59, arg4), Class472.method29730(local64, arg4));
		@Pc(87) Class472 local87 = Class472.method29711(local84);
		@Pc(104) Class472 local104 = Class472.method29710(local21.aFloat325 * arg5.aFloat325, arg5.aFloat326 * local21.aFloat326, arg5.aFloat327 * local21.aFloat327);
		local87.method29797(local104, arg0);
		local87.method29738(arg6);
		@Pc(116) Class472 local116 = Class472.method29739(local54, local87.aFloat325);
		local116.method29797(local59, local87.aFloat326);
		local116.method29797(local64, local87.aFloat327);
		arg4.method29719(local116);
		arg1.method29724(Class472.method29739(arg4, arg0));
	}

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "(FLclient!ox;Lclient!ov;Lclient!ox;Lclient!ox;Lclient!ox;FFF)V")
	public static void method31885(@OriginalArg(0) float arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) Class472 arg3, @OriginalArg(4) Class472 arg4, @OriginalArg(5) Class472 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method29715(arg1)) {
			return;
		}
		@Pc(9) Class472 local9 = Class472.method29710(0.0F, 0.0F, 0.0F);
		@Pc(14) Class472 local14 = Class472.method29711(Class472.method29755(arg3, arg1));
		local14.method29753(arg2);
		@Pc(21) Class472 local21 = Class472.method29755(local14, local9);
		@Pc(24) float local24 = local21.method29746();
		if (arg5.aFloat325 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat325) || local24 > arg7 || local24 < arg8) {
			arg1.method29719(arg3);
			arg4.method29720();
			return;
		}
		arg2.method29651();
		@Pc(54) Class472 local54 = Class472.method29710(1.0F, 0.0F, 0.0F);
		@Pc(59) Class472 local59 = Class472.method29710(0.0F, 1.0F, 0.0F);
		@Pc(64) Class472 local64 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local54.method29753(arg2);
		local59.method29753(arg2);
		local64.method29753(arg2);
		@Pc(84) Class472 local84 = Class472.method29710(Class472.method29730(local54, arg4), Class472.method29730(local59, arg4), Class472.method29730(local64, arg4));
		@Pc(87) Class472 local87 = Class472.method29711(local84);
		@Pc(104) Class472 local104 = Class472.method29710(local21.aFloat325 * arg5.aFloat325, arg5.aFloat326 * local21.aFloat326, arg5.aFloat327 * local21.aFloat327);
		local87.method29797(local104, arg0);
		local87.method29738(arg6);
		@Pc(116) Class472 local116 = Class472.method29739(local54, local87.aFloat325);
		local116.method29797(local59, local87.aFloat326);
		local116.method29797(local64, local87.aFloat327);
		arg4.method29719(local116);
		arg1.method29724(Class472.method29739(arg4, arg0));
	}

	@OriginalMember(owner = "client!ue", name = "bh", descriptor = "(Lclient!yf;B)V")
	static void method31886(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6055 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt6055 * -2000995827] <= arg0.aLongArray27[arg0.anInt6055 * -2000995827 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	Class592() throws Throwable {
		throw new Error();
	}
}
