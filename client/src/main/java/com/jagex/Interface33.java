package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kx")
public interface Interface33 {

	@OriginalMember(owner = "client!kx", name = "u", descriptor = "()Z")
	boolean method28459();

	@OriginalMember(owner = "client!kx", name = "m", descriptor = "(I)Z")
	boolean method28460(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kx", name = "e", descriptor = "(I)V")
	void method28461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kx", name = "k", descriptor = "(Z)V")
	void method28462(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kx", name = "f", descriptor = "(Z)V")
	void method28463(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kx", name = "w", descriptor = "()V")
	void method28464();

	@OriginalMember(owner = "client!kx", name = "l", descriptor = "()V")
	void method28465();

	@OriginalMember(owner = "client!kx", name = "n", descriptor = "(ZI)V")
	void method28466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1);
}
