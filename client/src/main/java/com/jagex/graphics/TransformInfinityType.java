package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import deob.ObfuscatedName;

@ObfuscatedName("db")
public class TransformInfinityType implements SerializableEnum {

	@ObfuscatedName("db.e")
	public static final TransformInfinityType CONSTANT = new TransformInfinityType(0, 0);

	@ObfuscatedName("db.n")
	public static final TransformInfinityType LINEAR = new TransformInfinityType(1, 1);

	@ObfuscatedName("db.m")
	public static final TransformInfinityType CYCLE = new TransformInfinityType(2, 2);

	@ObfuscatedName("db.k")
	public static final TransformInfinityType CYCLE_RELATIVE = new TransformInfinityType(3, 3);

	@ObfuscatedName("db.f")
	public static final TransformInfinityType OSCILLATE = new TransformInfinityType(4, 4);

	@ObfuscatedName("db.w")
	public final int field1584;

	@ObfuscatedName("db.l")
	public final int field1586;

	@ObfuscatedName("uk.e(B)[Ldb;")
	public static TransformInfinityType[] method9164() {
		return new TransformInfinityType[] {CONSTANT, LINEAR, CYCLE, CYCLE_RELATIVE, OSCILLATE};
	}

	public TransformInfinityType(int arg0, int arg1) {
		this.field1584 = arg0;
		this.field1586 = arg1;
	}

	@ObfuscatedName("db.n()I")
	public int getId() {
		return this.field1586;
	}

	@ObfuscatedName("al.m(IB)Ldb;")
	public static TransformInfinityType getByValue(int value) {
		TransformInfinityType type = (TransformInfinityType) SerializableEnums.decode((SerializableEnum[]) method9164(), value);
		if (type == null) {
			type = CONSTANT;
		}
		return type;
	}
}
