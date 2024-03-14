package com.jagex.game.client;

import com.jagex.core.datastruct.LinkMap;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ColourUtils;
import com.jagex.game.config.flotype.FloorOverlayType;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.flutype.FloorUnderlayType;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.world.entity.Scene;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Material;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.WaterFogData;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

@ObfuscatedName("qg")
public class MapLoader {

	@ObfuscatedName("qg.e")
	public FloorOverlayTypeList overlays;

	@ObfuscatedName("qg.n")
	public FloorUnderlayTypeList underlays;

	@ObfuscatedName("qg.m")
	public LinkMap field4522;

	@ObfuscatedName("qg.k")
	public Scene scene;

	@ObfuscatedName("qg.w")
	public int sceneryShadows = 0;

	@ObfuscatedName("qg.l")
	public boolean isWaterDetail = false;

	@ObfuscatedName("qg.u")
	public boolean isLightingDetail = false;

	@ObfuscatedName("qg.z")
	public boolean isGroundBlending = false;

	@ObfuscatedName("qg.p")
	public boolean isTexturing = false;

	@ObfuscatedName("qg.d")
	public final int levels;

	@ObfuscatedName("qg.c")
	public final int maxTileX;

	@ObfuscatedName("qg.r")
	public int field4575 = 0;

	@ObfuscatedName("qg.v")
	public final int maxTileZ;

	@ObfuscatedName("qg.o")
	public final boolean underwater;

	@ObfuscatedName("qg.s")
	public int field4574;

	@ObfuscatedName("qg.y")
	public int[][][] levelHeightmap;

	@ObfuscatedName("qg.q")
	public byte[][][] field4517;

	@ObfuscatedName("qg.x")
	public boolean field4512;

	@ObfuscatedName("qg.b")
	public byte[][][] levelTileOverlayShape;

	@ObfuscatedName("qg.h")
	public byte[][][] levelTileOverlayRotation;

	@ObfuscatedName("qg.a")
	public short[][][] levelTileUnderlayIds;

	@ObfuscatedName("qg.g")
	public short[][][] levelTileOverlayIds;

	@ObfuscatedName("qg.i")
	public byte[][][] field4518;

	@ObfuscatedName("qg.j")
	public int[] field4504;

	@ObfuscatedName("qg.t")
	public int[] field4525;

	@ObfuscatedName("qg.ae")
	public int[] field4526;

	@ObfuscatedName("qg.ag")
	public int[] field4509;

	@ObfuscatedName("qg.ah")
	public int[] field4528;

	@ObfuscatedName("qg.ao")
	public static final int[] field4524 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@ObfuscatedName("qg.aj")
	public static final int[] field4568 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@ObfuscatedName("qg.ay")
	public static final int[] field4545 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@ObfuscatedName("qg.ab")
	public static final int[] field4546 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@ObfuscatedName("qg.az")
	public static final int[] field4547 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@ObfuscatedName("qg.aa")
	public static final int[] field4566 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@ObfuscatedName("qg.af")
	public static final int[] field4580 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@ObfuscatedName("qg.ak")
	public static final int[] field4550 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@ObfuscatedName("qg.an")
	public static final boolean[][] field4521 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } };

	@ObfuscatedName("qg.bf")
	public static final boolean[][] field4552 = new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@ObfuscatedName("qg.bl")
	public static final int[][] field4553 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@ObfuscatedName("qg.bk")
	public static final int[][] field4554 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@ObfuscatedName("qg.bh")
	public static final int[][] field4532 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@ObfuscatedName("qg.bx")
	public static final boolean[][] field4556 = new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } };

	@ObfuscatedName("qg.bd")
	public static final int[][] field4557 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@ObfuscatedName("qg.bc")
	public static final int[][] field4558 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@ObfuscatedName("qg.bi")
	public static final int[][] field4559 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@ObfuscatedName("qg.bn")
	public static final int[][] field4560 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@ObfuscatedName("qg.bt")
	public static final boolean[][] field4527 = new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } };

	@ObfuscatedName("qg.bq")
	public static final int[][] field4579 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@ObfuscatedName("qg.bm")
	public static final int[][] field4563 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@ObfuscatedName("qg.bb")
	public static final int[][] field4569 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@ObfuscatedName("qg.be")
	public static final int[][] field4565 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@ObfuscatedName("qg.by")
	public final int[] field4541 = new int[6];

	@ObfuscatedName("qg.bu")
	public final int[] field4567 = new int[13];

	@ObfuscatedName("qg.bw")
	public final int[] field4581 = new int[13];

	@ObfuscatedName("qg.bo")
	public final int[] field4543 = new int[13];

	@ObfuscatedName("qg.bz")
	public final int[] field4570 = new int[13];

	@ObfuscatedName("qg.bv")
	public final int[] field4551 = new int[13];

	@ObfuscatedName("qg.br")
	public final int[] field4572 = new int[13];

	@ObfuscatedName("qg.bg")
	public int field4573;

	@ObfuscatedName("qg.ba")
	public int field4576 = 0;

	@ObfuscatedName("qg.bp")
	public int field4508;

	@ObfuscatedName("qg.bj")
	public int field4578;

	@ObfuscatedName("qg.bs")
	public int field4502;

	@ObfuscatedName("qg.cl")
	public boolean field4507;

	@ObfuscatedName("qg.cg")
	public boolean field4519;

	@ObfuscatedName("qg.ce")
	public boolean field4582;

	@ObfuscatedName("qg.cu")
	public boolean field4583;

	@ObfuscatedName("qg.ci")
	public int field4584;

	@ObfuscatedName("qg.cn")
	public int field4585;

	@ObfuscatedName("qg.cv")
	public int[] field4586;

	@ObfuscatedName("qg.cp")
	public int[] field4587;

	@ObfuscatedName("qg.ca")
	public int[] field4588;

	@ObfuscatedName("qg.cx")
	public int[] field4589 = null;

	public MapLoader(Scene scene, int levels, int maxTileX, int maxTileZ, boolean underwater, FloorOverlayTypeList overlays, FloorUnderlayTypeList underlays, LinkMap arg7) {
		this.scene = scene;
		this.levels = levels;
		this.maxTileX = maxTileX;
		this.maxTileZ = maxTileZ;
		this.underwater = underwater;
		this.overlays = overlays;
		this.underlays = underlays;
		this.field4522 = arg7;
		this.levelTileUnderlayIds = new short[this.levels][this.maxTileX][this.maxTileZ];
		this.levelTileOverlayIds = new short[this.levels][this.maxTileX][this.maxTileZ];
		this.levelTileOverlayShape = new byte[this.levels][this.maxTileX][this.maxTileZ];
		this.levelTileOverlayRotation = new byte[this.levels][this.maxTileX][this.maxTileZ];
		this.levelHeightmap = new int[this.levels][this.maxTileX + 1][this.maxTileZ + 1];
		this.field4518 = new byte[this.levels][this.maxTileX + 1][this.maxTileZ + 1];
	}

	@ObfuscatedName("qg.e(I)V")
	public void method7136() {
		this.field4512 = true;
	}

	@ObfuscatedName("qg.n(B)V")
	public void method7137() {
		this.field4504 = null;
		this.field4525 = null;
		this.field4526 = null;
		this.field4509 = null;
		this.field4528 = null;
		this.field4512 = false;
	}

	@ObfuscatedName("qg.m(IIIII)V")
	public final void method7167(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.levels; var5++) {
			this.method7139(var5, arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("qg.k(IIIIII)V")
	public final void method7139(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = arg2; var6 < arg2 + arg4; var6++) {
			for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
				if (var7 >= 0 && var7 < this.maxTileX && var6 >= 0 && var6 < this.maxTileZ) {
					this.levelHeightmap[arg0][var7][var6] = arg0 > 0 ? this.levelHeightmap[arg0 - 1][var7][var6] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.maxTileX) {
			for (int var8 = arg2 + 1; var8 < arg2 + arg4; var8++) {
				if (var8 >= 0 && var8 < this.maxTileZ) {
					this.levelHeightmap[arg0][arg1][var8] = this.levelHeightmap[arg0][arg1 - 1][var8];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.maxTileZ) {
			for (int var9 = arg1 + 1; var9 < arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < this.maxTileX) {
					this.levelHeightmap[arg0][var9][arg2] = this.levelHeightmap[arg0][var9][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || arg1 >= this.maxTileX || arg2 >= this.maxTileZ) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.levelHeightmap[arg0][arg1 - 1][arg2] != 0) {
				this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1 - 1][arg2];
			} else if (arg2 > 0 && this.levelHeightmap[arg0][arg1][arg2 - 1] != 0) {
				this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1][arg2 - 1];
			} else if (arg1 > 0 && arg2 > 0 && this.levelHeightmap[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1 - 1][arg2 - 1];
			}
		} else if (arg1 > 0 && this.levelHeightmap[arg0 - 1][arg1 - 1][arg2] != this.levelHeightmap[arg0][arg1 - 1][arg2]) {
			this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && this.levelHeightmap[arg0 - 1][arg1][arg2 - 1] != this.levelHeightmap[arg0][arg1][arg2 - 1]) {
			this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && this.levelHeightmap[arg0 - 1][arg1 - 1][arg2 - 1] != this.levelHeightmap[arg0][arg1 - 1][arg2 - 1]) {
			this.levelHeightmap[arg0][arg1][arg2] = this.levelHeightmap[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("qg.f(Lalw;IIIIB)V")
	public final void readNormalLandscape(Packet buf, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1 + arg3;
		int var7 = arg2 + arg4;
		for (int l = 0; l < this.levels; l++) {
			for (int x = 0; x < 64; x++) {
				for (int z = 0; z < 64; z++) {
					this.readLandscape(buf, l, arg1 + x, arg2 + z, 0, 0, var6 + x, var7 + z, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("qg.w(Lalw;IIIIIIII)V")
	public final void readRegionLandscape(Packet buf, int level, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = (arg5 & 0x7) * 8;
		int var10 = (arg6 & 0x7) * 8;
		int var11 = (arg5 & 0xFFFFFFF8) << 3;
		int var12 = (arg6 & 0xFFFFFFF8) << 3;
		byte xOffset = 0;
		byte zOffset = 0;
		if (arg7 == 1) {
			zOffset = 1;
		} else if (arg7 == 2) {
			xOffset = 1;
			zOffset = 1;
		} else if (arg7 == 3) {
			xOffset = 1;
		}
		for (int l = 0; l < this.levels; l++) {
			for (int x = 0; x < 64; x++) {
				for (int z = 0; z < 64; z++) {
					if (arg4 == l && x >= var9 && x <= var9 + 8 && z >= var10 && z <= var10 + 8) {
						int originX;
						int originZ;
						if (var9 + 8 == x || var10 + 8 == z) {
							if (arg7 == 0) {
								originX = x - var9 + arg2;
								originZ = z - var10 + arg3;
							} else if (arg7 == 1) {
								originX = z - var10 + arg2;
								originZ = arg3 + 8 - (x - var9);
							} else if (arg7 == 2) {
								originX = arg2 + 8 - (x - var9);
								originZ = arg3 + 8 - (z - var10);
							} else {
								originX = arg2 + 8 - (z - var10);
								originZ = x - var9 + arg3;
							}
							this.readLandscape(buf, level, originX, originZ, 0, 0, var11 + x, var12 + z, 0, true);
						} else {
							originX = arg2 + MapCoordUtil.method14888(x & 0x7, z & 0x7, arg7);
							originZ = arg3 + MapCoordUtil.method14756(x & 0x7, z & 0x7, arg7);
							this.readLandscape(buf, level, originX, originZ, xOffset, zOffset, var11 + x, var12 + z, arg7, false);
						}
						if (x == 63 || z == 63) {
							byte var20 = 1;
							if (x == 63 && z == 63) {
								var20 = 3;
							}
							for (int var21 = 0; var21 < var20; var21++) {
								int var22 = x;
								int var23 = z;
								if (var21 == 0) {
									var22 = x == 63 ? 64 : x;
									var23 = z == 63 ? 64 : z;
								} else if (var21 == 1) {
									var22 = 64;
								} else if (var21 == 2) {
									var23 = 64;
								}
								int var24;
								int var25;
								if (arg7 == 0) {
									var24 = var22 - var9 + arg2;
									var25 = var23 - var10 + arg3;
								} else if (arg7 == 1) {
									var24 = var23 - var10 + arg2;
									var25 = arg3 + 8 - (var22 - var9);
								} else if (arg7 == 2) {
									var24 = arg2 + 8 - (var22 - var9);
									var25 = arg3 + 8 - (var23 - var10);
								} else {
									var24 = arg2 + 8 - (var23 - var10);
									var25 = var22 - var9 + arg3;
								}
								if (var24 >= 0 && var24 < this.maxTileX && var25 >= 0 && var25 < this.maxTileZ) {
									this.levelHeightmap[level][var24][var25] = this.levelHeightmap[level][xOffset + originX][zOffset + originZ];
								}
							}
						}
					} else {
						this.readLandscape(buf, 0, -1, -1, 0, 0, 0, 0, 0, false);
					}
				}
			}
		}
	}

	@ObfuscatedName("qg.l(Lalw;IIIIIIIIZB)V")
	public final void readLandscape(Packet buf, int level, int originX, int originZ, int xOffset, int zOffset, int arg6, int arg7, int arg8, boolean arg9) {
		if (arg8 == 1) {
			zOffset = 1;
		} else if (arg8 == 2) {
			xOffset = 1;
			zOffset = 1;
		} else if (arg8 == 3) {
			xOffset = 1;
		}
		if (originX < 0 || originX >= this.maxTileX || originZ < 0 || originZ >= this.maxTileZ) {
			int opcode = buf.g1();
			if ((opcode & 0x1) != 0) {
				buf.g1();
				buf.gSmart1or2();
			}
			if ((opcode & 0x2) != 0) {
				buf.pos++;
			}
			if ((opcode & 0x4) != 0) {
				buf.gSmart1or2();
			}
			if ((opcode & 0x8) != 0) {
				buf.g1();
			}
			return;
		}
		if (!this.underwater && !arg9) {
			this.field4522.levelTileFlags[level][originX][originZ] = 0;
		}
		int opcode = buf.g1();
		if ((opcode & 0x1) != 0) {
			if (arg9) {
				buf.g1();
				buf.gSmart1or2();
			} else {
				int var12 = buf.g1();
				this.levelTileOverlayIds[level][originX][originZ] = (short) buf.gSmart1or2();
				this.levelTileOverlayShape[level][originX][originZ] = (byte) (var12 >> 2);
				this.levelTileOverlayRotation[level][originX][originZ] = (byte) (arg8 + var12 & 0x3);
			}
		}
		if ((opcode & 0x2) != 0) {
			if (this.underwater || arg9) {
				buf.pos++;
			} else {
				this.field4522.levelTileFlags[level][originX][originZ] = buf.g1b();
			}
		}
		if ((opcode & 0x4) != 0) {
			if (arg9) {
				buf.gSmart1or2();
			} else {
				this.levelTileUnderlayIds[level][originX][originZ] = (short) buf.gSmart1or2();
			}
		}
		if ((opcode & 0x8) != 0) {
			int height = buf.g1();
			if (this.underwater) {
				this.levelHeightmap[0][originX + xOffset][originZ + zOffset] = height * 8 << 2;
			} else {
				if (height == 1) {
					height = 0;
				}
				if (level == 0) {
					this.levelHeightmap[0][originX + xOffset][originZ + zOffset] = -height * 8 << 2;
				} else {
					this.levelHeightmap[level][originX + xOffset][originZ + zOffset] = this.levelHeightmap[level - 1][originX + xOffset][originZ + zOffset] - (height * 8 << 2);
				}
			}
		} else if (this.underwater) {
			this.levelHeightmap[0][originX + xOffset][originZ + zOffset] = 0;
		} else if (level == 0) {
			this.levelHeightmap[0][originX + xOffset][originZ + zOffset] = -method251(arg6 + 932731, arg7 + 556238) * 8 << 2;
		} else {
			this.levelHeightmap[level][originX + xOffset][originZ + zOffset] = this.levelHeightmap[level - 1][originX + xOffset][originZ + zOffset] - 960;
		}
	}

	@ObfuscatedName("qg.u(I[[II)V")
	public final void method7143(int arg0, int[][] arg1) {
		int[][] var3 = this.levelHeightmap[arg0];
		for (int var4 = 0; var4 < this.maxTileX + 1; var4++) {
			for (int var5 = 0; var5 < this.maxTileZ + 1; var5++) {
				var3[var4][var5] += arg1[var4][var5];
			}
		}
	}

	@ObfuscatedName("qg.z(Ldh;[[[II)V")
	public void method7144(Renderer arg0, int[][][] arg1) {
		for (int var3 = 0; var3 < this.levels; var3++) {
			int var4 = 0;
			int var5 = 0;
			if (!this.underwater) {
				if (this.isWaterDetail) {
					var5 |= 0x8;
				}
				if (this.isLightingDetail) {
					var4 |= 0x2;
				}
				if (this.sceneryShadows != 0) {
					var4 |= 0x1;
					var5 |= 0x10;
				}
			}
			if (this.isLightingDetail) {
				var5 |= 0x7;
			}
			if (!this.isTexturing) {
				var5 |= 0x20;
			}
			int[][] var6 = arg1 == null || var3 >= arg1.length ? this.levelHeightmap[var3] : arg1[var3];
			this.scene.method8709(var3, arg0.method2214(this.maxTileX, this.maxTileZ, this.levelHeightmap[var3], var6, 512, var4, var5));
		}
	}

	@ObfuscatedName("qg.p(Ldh;Lcb;Lcb;B)V")
	public final void method7200(Renderer arg0, FloorModel arg1, FloorModel arg2) {
		int[][] var4 = new int[this.maxTileX][this.maxTileZ];
		if (this.field4504 == null || this.maxTileZ != this.field4504.length) {
			this.field4504 = new int[this.maxTileZ];
			this.field4525 = new int[this.maxTileZ];
			this.field4526 = new int[this.maxTileZ];
			this.field4509 = new int[this.maxTileZ];
			this.field4528 = new int[this.maxTileZ];
		}
		for (int var5 = 0; var5 < this.levels; var5++) {
			for (int var6 = 0; var6 < this.maxTileZ; var6++) {
				this.field4504[var6] = 0;
				this.field4525[var6] = 0;
				this.field4526[var6] = 0;
				this.field4509[var6] = 0;
				this.field4528[var6] = 0;
			}
			for (int var7 = -5; var7 < this.maxTileX; var7++) {
				for (int var8 = 0; var8 < this.maxTileZ; var8++) {
					int var9 = var7 + 5;
					int var10002;
					if (var9 < this.maxTileX) {
						int var10 = this.levelTileUnderlayIds[var5][var9][var8] & 0x7FFF;
						if (var10 > 0) {
							FloorUnderlayType var11 = (FloorUnderlayType) this.underlays.list(var10 - 1);
							this.field4504[var8] += var11.field8546;
							this.field4525[var8] += var11.field8541;
							this.field4526[var8] += var11.field8545;
							this.field4509[var8] += var11.field8549;
							var10002 = this.field4528[var8]++;
						}
					}
					int var12 = var7 - 5;
					if (var12 >= 0) {
						int var13 = this.levelTileUnderlayIds[var5][var12][var8] & 0x7FFF;
						if (var13 > 0) {
							FloorUnderlayType var14 = (FloorUnderlayType) this.underlays.list(var13 - 1);
							this.field4504[var8] -= var14.field8546;
							this.field4525[var8] -= var14.field8541;
							this.field4526[var8] -= var14.field8545;
							this.field4509[var8] -= var14.field8549;
							var10002 = this.field4528[var8]--;
						}
					}
				}
				if (var7 >= 0) {
					int var15 = 0;
					int var16 = 0;
					int var17 = 0;
					int var18 = 0;
					int var19 = 0;
					for (int var20 = -5; var20 < this.maxTileZ; var20++) {
						int var21 = var20 + 5;
						if (var21 < this.maxTileZ) {
							var15 += this.field4504[var21];
							var16 += this.field4525[var21];
							var17 += this.field4526[var21];
							var18 += this.field4509[var21];
							var19 += this.field4528[var21];
						}
						int var22 = var20 - 5;
						if (var22 >= 0) {
							var15 -= this.field4504[var22];
							var16 -= this.field4525[var22];
							var17 -= this.field4526[var22];
							var18 -= this.field4509[var22];
							var19 -= this.field4528[var22];
						}
						if (var20 >= 0 && var18 > 0 && var19 > 0) {
							var4[var7][var20] = ColourUtils.method17849(var15 * 256 / var18, var16 / var19, var17 / var19);
						}
					}
				}
			}
			if (this.isGroundBlending) {
				this.method7147(arg0, this.scene.field6913[var5], var5, var4, var5 == 0 ? arg1 : null, var5 == 0 ? arg2 : null);
			} else {
				this.method7199(arg0, this.scene.field6913[var5], var5, var4, var5 == 0 ? arg1 : null, var5 == 0 ? arg2 : null);
			}
			this.levelTileUnderlayIds[var5] = null;
			this.levelTileOverlayIds[var5] = null;
			this.levelTileOverlayShape[var5] = null;
			this.levelTileOverlayRotation[var5] = null;
		}
		if (!this.underwater) {
			if (this.sceneryShadows != 0) {
				this.scene.method8753();
			}
			if (this.isLightingDetail) {
				this.scene.method8755();
			}
		}
		for (int var23 = 0; var23 < this.levels; var23++) {
			this.scene.field6913[var23].method1555();
		}
	}

	@ObfuscatedName("qg.d(Ldh;Lcb;I[[ILcb;Lcb;I)V")
	public void method7199(Renderer arg0, FloorModel arg1, int arg2, int[][] arg3, FloorModel arg4, FloorModel arg5) {
		for (int var7 = 0; var7 < this.maxTileX; var7++) {
			for (int var8 = 0; var8 < this.maxTileZ; var8++) {
				byte var9 = this.levelTileOverlayShape[arg2][var7][var8];
				byte var10 = this.levelTileOverlayRotation[arg2][var7][var8];
				int var11 = this.levelTileOverlayIds[arg2][var7][var8] & 0x7FFF;
				int var12 = this.levelTileUnderlayIds[arg2][var7][var8] & 0x7FFF;
				FloorOverlayType var13 = (FloorOverlayType) (var11 == 0 ? null : this.overlays.list(var11 - 1));
				FloorUnderlayType var14 = (FloorUnderlayType) (var12 == 0 ? null : this.underlays.list(var12 - 1));
				if (var9 == 0 && var13 == null) {
					var9 = 12;
				}
				FloorOverlayType var15 = var13;
				if (var13 != null && var13.rgb == -1 && var13.field8156 == -1) {
					var15 = var13;
					var13 = null;
				}
				if (var13 != null || var14 != null) {
					this.field4584 = field4568[var9];
					this.field4585 = field4524[var9];
					int var16 = (var13 == null ? 0 : this.field4585) + (var14 == null ? 0 : this.field4584);
					int var17 = 0;
					this.field4574 = 0;
					this.field4508 = var13 == null ? -1 : var13.texture;
					int var18 = var14 == null ? -1 : var14.field8542;
					int[] var19 = new int[var16];
					int[] var20 = new int[var16];
					int[] var21 = new int[var16];
					int[] var22 = new int[var16];
					int[] var23 = new int[var16];
					int[] var24 = new int[var16];
					int[] var25 = var13 == null || var13.field8156 == -1 ? null : new int[var16];
					if (var13 == null) {
						this.field4574 += this.field4585;
					} else {
						for (int var26 = 0; var26 < this.field4585; var26++) {
							var19[var17] = field4553[var9][this.field4574];
							var20[var17] = field4554[var9][this.field4574];
							var21[var17] = field4532[var9][this.field4574];
							var23[var17] = this.field4508;
							var24[var17] = var13.field8163;
							var22[var17] = var13.rgb;
							if (var25 != null) {
								var25[var17] = var13.field8156;
							}
							var17++;
							this.field4574++;
						}
						if (!this.underwater && arg2 == 0) {
							this.scene.method8716(var7, var8, var13.field8158, var13.field8159, var13.field8164, var13.field8165, var13.field8166, var13.field8167);
						}
					}
					if (var14 != null) {
						for (int var27 = 0; var27 < this.field4584; var27++) {
							var19[var17] = field4553[var9][this.field4574];
							var20[var17] = field4554[var9][this.field4574];
							var21[var17] = field4532[var9][this.field4574];
							var23[var17] = var18;
							var24[var17] = var14.field8543;
							var22[var17] = arg3[var7][var8];
							if (var25 != null) {
								var25[var17] = var22[var17];
							}
							var17++;
							this.field4574++;
						}
					}
					int var28 = field4580.length;
					int[] var29 = new int[var28];
					int[] var30 = new int[var28];
					int[] var31 = arg5 == null ? null : new int[var28];
					int[] var32 = arg5 == null && arg4 == null ? null : new int[var28];
					for (int var33 = 0; var33 < var28; var33++) {
						int var34 = field4580[var33];
						int var35 = field4550[var33];
						if (var10 == 0) {
							var29[var33] = var34;
							var30[var33] = var35;
						} else if (var10 == 1) {
							var29[var33] = var35;
							var30[var33] = 512 - var34;
						} else if (var10 == 2) {
							var29[var33] = 512 - var34;
							var30[var33] = 512 - var35;
						} else if (var10 == 3) {
							var29[var33] = 512 - var35;
							var30[var33] = var34;
						}
						if (var31 != null && field4521[var9][var33]) {
							int var38 = (var7 << 9) + var29[var33];
							int var39 = (var8 << 9) + var30[var33];
							var31[var33] = arg5.method1527(var38, var39) - arg1.method1527(var38, var39);
						}
						if (var32 != null) {
							if (arg5 != null && !field4521[var9][var33]) {
								int var40 = (var7 << 9) + var29[var33];
								int var41 = (var8 << 9) + var30[var33];
								var32[var33] = arg1.method1527(var40, var41) - arg5.method1527(var40, var41);
							} else if (arg4 != null && !field4552[var9][var33]) {
								int var42 = (var7 << 9) + var29[var33];
								int var43 = (var8 << 9) + var30[var33];
								var32[var33] = arg4.method1527(var42, var43) - arg1.method1527(var42, var43);
							}
						}
					}
					int var44 = arg1.method1529(var7, var8);
					int var45 = arg1.method1529(var7 + 1, var8);
					int var46 = arg1.method1529(var7 + 1, var8 + 1);
					int var47 = arg1.method1529(var7, var8 + 1);
					boolean var48 = this.field4522.method7105(var7, var8);
					if (var48 && arg2 > 1 || !var48 && arg2 > 0) {
						boolean var49 = true;
						if (var14 != null && !var14.field8548) {
							var49 = false;
						} else if (var12 == 0 && var9 != 0) {
							var49 = false;
						} else if (var11 > 0 && var15 != null && !var15.occlude) {
							var49 = false;
						}
						if (var49 && var44 == var45 && var44 == var46 && var44 == var47) {
							this.field4518[arg2][var7][var8] = (byte) (this.field4518[arg2][var7][var8] | 0x4);
						}
					}
					WaterFogData var50 = new WaterFogData();
					if (this.underwater) {
						var50.field1575 = this.scene.method8729(var7, var8);
						var50.field1573 = this.scene.method8710(var7, var8);
						var50.field1577 = this.scene.method8790(var7, var8);
						var50.field1576 = this.scene.method8713(var7, var8);
						var50.field1578 = this.scene.method8760(var7, var8);
						var50.field1579 = this.scene.method8715(var7, var8);
					}
					arg1.method1525(var7, var8, var29, var31, var30, var32, var19, var20, var21, var22, var25, var23, var24, var50, false);
					this.scene.method8851(arg2, var7, var8);
				}
			}
		}
	}

	@ObfuscatedName("qg.c(Ldh;Lcb;I[[ILcb;Lcb;I)V")
	public void method7147(Renderer arg0, FloorModel arg1, int arg2, int[][] arg3, FloorModel arg4, FloorModel arg5) {
		byte[][] var7 = this.levelTileOverlayShape[arg2];
		byte[][] var8 = this.levelTileOverlayRotation[arg2];
		short[][] var9 = this.levelTileUnderlayIds[arg2];
		short[][] var10 = this.levelTileOverlayIds[arg2];
		boolean[] var11 = new boolean[4];
		for (int var12 = 0; var12 < this.maxTileX; var12++) {
			int var13 = var12 < this.maxTileX - 1 ? var12 + 1 : var12;
			for (int var14 = 0; var14 < this.maxTileZ; var14++) {
				int var15 = var14 < this.maxTileZ - 1 ? var14 + 1 : var14;
				this.field4573 = var7[var12][var14];
				this.field4574 = var8[var12][var14];
				int var16 = var10[var12][var14] & 0x7FFF;
				int var17 = var9[var12][var14] & 0x7FFF;
				if (var16 != 0 || var17 != 0) {
					FloorOverlayType var18 = (FloorOverlayType) (var16 == 0 ? null : this.overlays.list(var16 - 1));
					FloorUnderlayType var19 = (FloorUnderlayType) (var17 == 0 ? null : this.underlays.list(var17 - 1));
					if (this.field4573 == 0 && var18 == null) {
						this.field4573 = 12;
					}
					this.field4507 = false;
					this.field4519 = false;
					var11[3] = false;
					var11[2] = false;
					var11[1] = false;
					var11[0] = false;
					FloorOverlayType var23 = var18;
					if (var18 != null) {
						if (var18.rgb == -1 && var18.field8156 == -1) {
							var23 = var18;
							var18 = null;
						} else if (var19 != null && this.field4573 != 0) {
							this.field4519 = var18.field8161;
						}
					}
					this.field4574 = this.method7145(var17, var12, var14, var13, var15, arg1, var9);
					for (int var24 = 0; var24 < 13; var24++) {
						this.field4551[var24] = -1;
						this.field4572[var24] = 1;
					}
					this.method7149(arg0, var18, var19, var12, var14, var7, var8, var10, var11);
					this.field4582 = !this.field4519 && !var11[0] && !var11[2] && !var11[1] && !var11[3];
					this.method7150(var18, var19);
					int var25 = this.field4585 + this.field4584;
					if (var25 <= 0) {
						this.scene.method8851(arg2, var12, var14);
					} else {
						if (var11[0]) {
							var25++;
						}
						if (var11[2]) {
							var25++;
						}
						if (var11[1]) {
							var25++;
						}
						if (var11[3]) {
							var25++;
						}
						this.field4575 = 0;
						this.field4576 = 0;
						int var26 = var25 * 3;
						int[] var27 = this.field4583 ? new int[var26] : null;
						int[] var28 = new int[var26];
						int[] var29 = new int[var26];
						int[] var30 = new int[var26];
						int[] var31 = new int[var26];
						int[] var32 = new int[var26];
						int[] var33 = arg5 == null ? null : new int[var26];
						int[] var34 = arg5 == null && arg4 == null ? null : new int[var26];
						for (int var35 = 0; var35 < var26; var35++) {
							var31[var35] = -1;
						}
						this.method7151(arg0, arg2, var12, var14, var18, var11, var27, var28, var29, var30, var31, var32, var33, var34, arg1, arg5, arg4);
						int var36 = var9[var12][var15] & 0x7FFF;
						int var37 = var9[var13][var15] & 0x7FFF;
						int var38 = var9[var13][var14] & 0x7FFF;
						this.method7152(arg0, arg2, var12, var14, var13, var15, var19, var17, var36, var37, var38, var11, var27, var28, var29, var30, var31, var32, var33, var34, arg3, arg1, arg5, arg4);
						this.method7153(arg1, var19, var23, arg2, var12, var14, var13, var15, var17, var16);
						WaterFogData var39 = new WaterFogData();
						if (this.underwater) {
							var39.field1575 = this.scene.method8729(var12, var14);
							var39.field1573 = this.scene.method8710(var12, var14);
							var39.field1577 = this.scene.method8790(var12, var14);
							var39.field1576 = this.scene.method8713(var12, var14);
							var39.field1578 = this.scene.method8760(var12, var14);
							var39.field1579 = this.scene.method8715(var12, var14);
						}
						arg1.method1557(var12, var14, var28, var33, var29, var34, var30, var27, var31, var32, var39, this.field4507);
						this.scene.method8851(arg2, var12, var14);
					}
				}
			}
		}
	}

	@ObfuscatedName("qg.r(IIIIILcb;[[SB)I")
	public int method7145(int arg0, int arg1, int arg2, int arg3, int arg4, FloorModel arg5, short[][] arg6) {
		if (this.field4573 != 0 && this.field4573 != 12 || arg1 <= 0 || arg2 <= 0 || arg1 >= this.maxTileX || arg2 >= this.maxTileZ) {
			return this.field4574;
		}
		byte var8 = 0;
		byte var9 = 0;
		byte var10 = 0;
		byte var11 = 0;
		int var12 = var8 + (arg6[arg1 - 1][arg2 - 1] == arg0 ? 1 : -1);
		int var13 = var9 + (arg6[arg3][arg2 - 1] == arg0 ? 1 : -1);
		int var14 = var10 + (arg6[arg3][arg4] == arg0 ? 1 : -1);
		int var15 = var11 + (arg6[arg1 - 1][arg4] == arg0 ? 1 : -1);
		if (arg6[arg1][arg2 - 1] == arg0) {
			var12++;
			var13++;
		} else {
			var12--;
			var13--;
		}
		if (arg6[arg3][arg2] == arg0) {
			var13++;
			var14++;
		} else {
			var13--;
			var14--;
		}
		if (arg6[arg1][arg4] == arg0) {
			var14++;
			var15++;
		} else {
			var14--;
			var15--;
		}
		if (arg6[arg1 - 1][arg2] == arg0) {
			var15++;
			var12++;
		} else {
			var15--;
			var12--;
		}
		int var16 = var12 - var14;
		if (var16 < 0) {
			var16 = -var16;
		}
		int var17 = var13 - var15;
		if (var17 < 0) {
			var17 = -var17;
		}
		if (var16 == var17) {
			var16 = arg5.method1529(arg1, arg2) - arg5.method1529(arg3, arg4);
			if (var16 < 0) {
				var16 = -var16;
			}
			var17 = arg5.method1529(arg3, arg2) - arg5.method1529(arg1, arg4);
			if (var17 < 0) {
				var17 = -var17;
			}
		}
		return var16 < var17 ? 1 : 0;
	}

	@ObfuscatedName("qg.v(Ldh;Lyn;Laaz;II[[B[[B[[S[ZI)V")
	public void method7149(Renderer arg0, FloorOverlayType arg1, FloorUnderlayType arg2, int arg3, int arg4, byte[][] arg5, byte[][] arg6, short[][] arg7, boolean[] arg8) {
		boolean[] var10 = arg1 != null && arg1.field8161 ? field4527[this.field4573] : field4556[this.field4573];
		this.method7154(arg0, arg1, arg2, arg3, arg4, this.maxTileX, this.maxTileZ, arg7, arg5, arg6, arg8);
		this.field4583 = arg1 != null && arg1.field8156 != arg1.rgb;
		if (!this.field4583) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (this.field4551[var11] >= 0 && this.field4581[var11] != this.field4567[var11]) {
					this.field4583 = true;
					break;
				}
			}
		}
		if (!var10[this.field4574 + 1 & 0x3]) {
			arg8[1] |= (this.field4572[2] & this.field4572[4]) == 0;
		}
		if (!var10[this.field4574 + 3 & 0x3]) {
			arg8[3] |= (this.field4572[6] & this.field4572[0]) == 0;
		}
		if (!var10[this.field4574 & 0x3]) {
			arg8[0] |= (this.field4572[0] & this.field4572[2]) == 0;
		}
		if (!var10[this.field4574 + 2 & 0x3]) {
			arg8[2] |= (this.field4572[4] & this.field4572[6]) == 0;
		}
		if (this.field4519 || this.field4573 != 0 && this.field4573 != 12) {
			return;
		}
		if (arg8[0] && !arg8[1] && !arg8[2] && arg8[3]) {
			arg8[3] = false;
			arg8[0] = false;
			this.field4573 = this.field4573 == 0 ? 13 : 14;
			this.field4574 = 0;
		} else if (arg8[0] && arg8[1] && !arg8[2] && !arg8[3]) {
			arg8[1] = false;
			arg8[0] = false;
			this.field4573 = this.field4573 == 0 ? 13 : 14;
			this.field4574 = 3;
		} else if (!arg8[0] && arg8[1] && arg8[2] && !arg8[3]) {
			arg8[2] = false;
			arg8[1] = false;
			this.field4573 = this.field4573 == 0 ? 13 : 14;
			this.field4574 = 2;
		} else if (!arg8[0] && !arg8[1] && arg8[2] && arg8[3]) {
			arg8[3] = false;
			arg8[2] = false;
			this.field4573 = this.field4573 == 0 ? 13 : 14;
			this.field4574 = 1;
		}
	}

	@ObfuscatedName("qg.o(Lyn;Laaz;B)V")
	public void method7150(FloorOverlayType arg0, FloorUnderlayType arg1) {
		if (this.field4582) {
			this.field4586 = field4553[this.field4573];
			this.field4587 = field4554[this.field4573];
			this.field4588 = field4532[this.field4573];
			this.field4585 = arg0 == null ? 0 : field4524[this.field4573];
			this.field4584 = arg1 == null ? 0 : field4568[this.field4573];
		} else if (this.field4519) {
			this.field4586 = field4563[this.field4573];
			this.field4587 = field4569[this.field4573];
			this.field4588 = field4565[this.field4573];
			this.field4585 = arg0 == null ? 0 : field4547[this.field4573];
			this.field4584 = arg1 == null ? 0 : field4566[this.field4573];
			this.field4589 = field4579[this.field4573];
		} else {
			this.field4586 = field4558[this.field4573];
			this.field4587 = field4559[this.field4573];
			this.field4588 = field4560[this.field4573];
			this.field4585 = arg0 == null ? 0 : field4545[this.field4573];
			this.field4584 = arg1 == null ? 0 : field4546[this.field4573];
			this.field4589 = field4557[this.field4573];
		}
	}

	@ObfuscatedName("qg.s(Ldh;IIILyn;[Z[I[I[I[I[I[I[I[ILcb;Lcb;Lcb;I)V")
	public void method7151(Renderer arg0, int arg1, int arg2, int arg3, FloorOverlayType arg4, boolean[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, FloorModel arg14, FloorModel arg15, FloorModel arg16) {
		this.field4502 = -1;
		this.field4508 = -1;
		this.field4578 = 256;
		if (arg4 != null) {
			this.field4502 = arg4.rgb;
			this.field4508 = arg4.texture;
			this.field4578 = arg4.field8163;
			int var18 = method6823(arg0, arg4);
			for (int var19 = 0; var19 < this.field4585; var19++) {
				boolean var20 = false;
				byte var21;
				if (arg5[-this.field4574 & 0x3] && this.field4575 == this.field4589[0]) {
					this.field4541[0] = this.field4586[this.field4575];
					this.field4541[1] = 1;
					this.field4541[2] = this.field4588[this.field4575];
					this.field4541[3] = 1;
					this.field4541[4] = this.field4587[this.field4575];
					this.field4541[5] = this.field4588[this.field4575];
					var21 = 6;
				} else if (arg5[2 - this.field4574 & 0x3] && this.field4575 == this.field4589[2]) {
					this.field4541[0] = this.field4586[this.field4575];
					this.field4541[1] = 5;
					this.field4541[2] = this.field4588[this.field4575];
					this.field4541[3] = 5;
					this.field4541[4] = this.field4587[this.field4575];
					this.field4541[5] = this.field4588[this.field4575];
					var21 = 6;
				} else if (arg5[1 - this.field4574 & 0x3] && this.field4575 == this.field4589[1]) {
					this.field4541[0] = this.field4586[this.field4575];
					this.field4541[1] = 3;
					this.field4541[2] = this.field4588[this.field4575];
					this.field4541[3] = 3;
					this.field4541[4] = this.field4587[this.field4575];
					this.field4541[5] = this.field4588[this.field4575];
					var21 = 6;
				} else if (arg5[3 - this.field4574 & 0x3] && this.field4575 == this.field4589[3]) {
					this.field4541[0] = this.field4586[this.field4575];
					this.field4541[1] = 7;
					this.field4541[2] = this.field4588[this.field4575];
					this.field4541[3] = 7;
					this.field4541[4] = this.field4587[this.field4575];
					this.field4541[5] = this.field4588[this.field4575];
					var21 = 6;
				} else {
					this.field4541[0] = this.field4586[this.field4575];
					this.field4541[1] = this.field4587[this.field4575];
					this.field4541[2] = this.field4588[this.field4575];
					var21 = 3;
				}
				for (int var22 = 0; var22 < var21; var22++) {
					int var23 = this.field4541[var22];
					int var24 = var23 - this.field4574 * 2 & 0x7;
					int var25 = field4580[var23];
					int var26 = field4550[var23];
					int var27;
					int var28;
					if (this.field4574 == 1) {
						var27 = var26;
						var28 = 512 - var25;
					} else if (this.field4574 == 2) {
						var27 = 512 - var25;
						var28 = 512 - var26;
					} else if (this.field4574 == 3) {
						var27 = 512 - var26;
						var28 = var25;
					} else {
						var27 = var25;
						var28 = var26;
					}
					arg7[this.field4576] = var27;
					arg8[this.field4576] = var28;
					if (arg12 != null && field4521[this.field4573][var23]) {
						int var29 = (arg2 << 9) + var27;
						int var30 = (arg3 << 9) + var28;
						arg12[this.field4576] = arg15.method1527(var29, var30) - arg14.method1527(var29, var30);
					}
					if (arg13 != null) {
						if (arg15 != null && !field4521[this.field4573][var23]) {
							int var31 = (arg2 << 9) + var27;
							int var32 = (arg3 << 9) + var28;
							arg13[this.field4576] = arg14.method1527(var31, var32) - arg15.method1527(var31, var32);
						} else if (arg16 != null && !field4552[this.field4573][var23]) {
							int var33 = (arg2 << 9) + var27;
							int var34 = (arg3 << 9) + var28;
							arg13[this.field4576] = arg16.method1527(var33, var34) - arg14.method1527(var33, var34);
						}
					}
					if (var23 < 8 && this.field4551[var24] > arg4.field8160) {
						if (arg6 != null) {
							arg6[this.field4576] = this.field4581[var24];
						}
						arg11[this.field4576] = this.field4570[var24];
						arg10[this.field4576] = this.field4543[var24];
						arg9[this.field4576] = this.field4567[var24];
					} else {
						if (arg6 != null) {
							arg6[this.field4576] = var18;
						}
						arg10[this.field4576] = arg4.texture;
						arg11[this.field4576] = arg4.field8163;
						arg9[this.field4576] = this.field4502;
					}
					this.field4576++;
				}
				this.field4575++;
			}
			if (!this.underwater && arg1 == 0) {
				this.scene.method8716(arg2, arg3, arg4.field8158, arg4.field8159, arg4.field8164, arg4.field8165, arg4.field8166, arg4.field8167);
			}
			if (this.field4573 != 12 && arg4.rgb != -1 && arg4.field8162) {
				this.field4507 = true;
			}
		} else if (this.field4582) {
			this.field4575 += field4524[this.field4573];
		} else if (this.field4519) {
			this.field4575 += field4547[this.field4573];
		} else {
			this.field4575 += field4545[this.field4573];
		}
	}

	@ObfuscatedName("qg.y(Ldh;IIIIILaaz;IIII[Z[I[I[I[I[I[I[I[I[[ILcb;Lcb;Lcb;B)V")
	public void method7152(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, FloorUnderlayType arg6, int arg7, int arg8, int arg9, int arg10, boolean[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, int[] arg19, int[][] arg20, FloorModel arg21, FloorModel arg22, FloorModel arg23) {
		if (arg6 == null) {
			return;
		}
		if (arg8 == 0) {
			arg8 = arg7;
		}
		if (arg9 == 0) {
			arg9 = arg7;
		}
		if (arg10 == 0) {
			arg10 = arg7;
		}
		FloorUnderlayType var25 = (FloorUnderlayType) this.underlays.list(arg7 - 1);
		FloorUnderlayType var26 = (FloorUnderlayType) this.underlays.list(arg8 - 1);
		FloorUnderlayType var27 = (FloorUnderlayType) this.underlays.list(arg9 - 1);
		FloorUnderlayType var28 = (FloorUnderlayType) this.underlays.list(arg10 - 1);
		for (int var29 = 0; var29 < this.field4584; var29++) {
			boolean var30 = false;
			byte var31;
			if (arg11[-this.field4574 & 0x3] && this.field4575 == this.field4589[0]) {
				this.field4541[0] = this.field4586[this.field4575];
				this.field4541[1] = 1;
				this.field4541[2] = this.field4588[this.field4575];
				this.field4541[3] = 1;
				this.field4541[4] = this.field4587[this.field4575];
				this.field4541[5] = this.field4588[this.field4575];
				var31 = 6;
			} else if (arg11[2 - this.field4574 & 0x3] && this.field4575 == this.field4589[2]) {
				this.field4541[0] = this.field4586[this.field4575];
				this.field4541[1] = 5;
				this.field4541[2] = this.field4588[this.field4575];
				this.field4541[3] = 5;
				this.field4541[4] = this.field4587[this.field4575];
				this.field4541[5] = this.field4588[this.field4575];
				var31 = 6;
			} else if (arg11[1 - this.field4574 & 0x3] && this.field4575 == this.field4589[1]) {
				this.field4541[0] = this.field4586[this.field4575];
				this.field4541[1] = 3;
				this.field4541[2] = this.field4588[this.field4575];
				this.field4541[3] = 3;
				this.field4541[4] = this.field4587[this.field4575];
				this.field4541[5] = this.field4588[this.field4575];
				var31 = 6;
			} else if (arg11[3 - this.field4574 & 0x3] && this.field4575 == this.field4589[3]) {
				this.field4541[0] = this.field4586[this.field4575];
				this.field4541[1] = 7;
				this.field4541[2] = this.field4588[this.field4575];
				this.field4541[3] = 7;
				this.field4541[4] = this.field4587[this.field4575];
				this.field4541[5] = this.field4588[this.field4575];
				var31 = 6;
			} else {
				this.field4541[0] = this.field4586[this.field4575];
				this.field4541[1] = this.field4587[this.field4575];
				this.field4541[2] = this.field4588[this.field4575];
				var31 = 3;
			}
			for (int var32 = 0; var32 < var31; var32++) {
				int var33 = this.field4541[var32];
				int var34 = var33 - this.field4574 * 2 & 0x7;
				int var35 = field4580[var33];
				int var36 = field4550[var33];
				int var37;
				int var38;
				if (this.field4574 == 1) {
					var37 = var36;
					var38 = 512 - var35;
				} else if (this.field4574 == 2) {
					var37 = 512 - var35;
					var38 = 512 - var36;
				} else if (this.field4574 == 3) {
					var37 = 512 - var36;
					var38 = var35;
				} else {
					var37 = var35;
					var38 = var36;
				}
				arg13[this.field4576] = var37;
				arg14[this.field4576] = var38;
				if (arg18 != null && field4521[this.field4573][var33]) {
					int var39 = (arg2 << 9) + var37;
					int var40 = (arg3 << 9) + var38;
					arg18[this.field4576] = arg22.method1527(var39, var40) - arg21.method1527(var39, var40);
				}
				if (arg19 != null) {
					if (arg22 != null && !field4521[this.field4573][var33]) {
						int var41 = (arg2 << 9) + var37;
						int var42 = (arg3 << 9) + var38;
						arg19[this.field4576] = arg21.method1527(var41, var42) - arg22.method1527(var41, var42);
					} else if (arg23 != null && !field4552[this.field4573][var33]) {
						int var43 = (arg2 << 9) + var37;
						int var44 = (arg3 << 9) + var38;
						arg19[this.field4576] = arg23.method1527(var43, var44) - arg21.method1527(var43, var44);
					}
				}
				if (var33 < 8 && this.field4551[var34] >= 0) {
					if (arg12 != null) {
						arg12[this.field4576] = this.field4581[var34];
					}
					arg17[this.field4576] = this.field4570[var34];
					arg16[this.field4576] = this.field4543[var34];
					arg15[this.field4576] = this.field4567[var34];
				} else {
					if (this.field4519 && field4521[this.field4573][var33]) {
						arg16[this.field4576] = this.field4508;
						arg17[this.field4576] = this.field4578;
						arg15[this.field4576] = this.field4502;
					} else if (var37 == 0 && var38 == 0) {
						arg15[this.field4576] = arg20[arg2][arg3];
						arg16[this.field4576] = var25.field8542;
						arg17[this.field4576] = var25.field8543;
					} else if (var37 == 0 && var38 == 512) {
						arg15[this.field4576] = arg20[arg2][arg5];
						arg16[this.field4576] = var26.field8542;
						arg17[this.field4576] = var26.field8543;
					} else if (var37 == 512 && var38 == 512) {
						arg15[this.field4576] = arg20[arg4][arg5];
						arg16[this.field4576] = var27.field8542;
						arg17[this.field4576] = var27.field8543;
					} else if (var37 == 512 && var38 == 0) {
						arg15[this.field4576] = arg20[arg4][arg3];
						arg16[this.field4576] = var28.field8542;
						arg17[this.field4576] = var28.field8543;
					} else {
						if (var37 < 256) {
							if (var38 < 256) {
								arg16[this.field4576] = var25.field8542;
								arg17[this.field4576] = var25.field8543;
							} else {
								arg16[this.field4576] = var26.field8542;
								arg17[this.field4576] = var26.field8543;
							}
						} else if (var38 < 256) {
							arg16[this.field4576] = var28.field8542;
							arg17[this.field4576] = var28.field8543;
						} else {
							arg16[this.field4576] = var27.field8542;
							arg17[this.field4576] = var27.field8543;
						}
						int var45 = method9469(arg20[arg2][arg3], arg20[arg4][arg3], var37 << 7 >> 9);
						int var46 = method9469(arg20[arg2][arg5], arg20[arg4][arg5], var37 << 7 >> 9);
						arg15[this.field4576] = method9469(var45, var46, var38 << 7 >> 9);
					}
					if (arg12 != null) {
						arg12[this.field4576] = arg15[this.field4576];
					}
				}
				this.field4576++;
			}
			this.field4575++;
		}
		if (this.field4573 != 0 && arg6.field8544) {
			this.field4507 = true;
		}
	}

	@ObfuscatedName("qg.q(Lcb;Laaz;Lyn;IIIIIIII)V")
	public void method7153(FloorModel arg0, FloorUnderlayType arg1, FloorOverlayType arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = arg0.method1529(arg4, arg5);
		int var12 = arg0.method1529(arg6, arg5);
		int var13 = arg0.method1529(arg6, arg7);
		int var14 = arg0.method1529(arg4, arg7);
		boolean var15 = this.field4522.method7105(arg4, arg5);
		if ((!var15 || arg3 <= 1) && (var15 || arg3 <= 0)) {
			return;
		}
		boolean var16 = true;
		if (arg1 != null && !arg1.field8548) {
			var16 = false;
		} else if (arg8 == 0 && this.field4573 != 0) {
			var16 = false;
		} else if (arg9 > 0 && arg2 != null && !arg2.occlude) {
			var16 = false;
		}
		if (var16 && var11 == var12 && var11 == var13 && var11 == var14) {
			this.field4518[arg3][arg4][arg5] = (byte) (this.field4518[arg3][arg4][arg5] | 0x4);
		}
	}

	@ObfuscatedName("qg.x(Ldh;Lyn;Laaz;IIII[[S[[B[[B[ZI)V")
	public final void method7154(Renderer arg0, FloorOverlayType arg1, FloorUnderlayType arg2, int arg3, int arg4, int arg5, int arg6, short[][] arg7, byte[][] arg8, byte[][] arg9, boolean[] arg10) {
		boolean[] var12 = arg1 != null && arg1.field8161 ? field4527[this.field4573] : field4556[this.field4573];
		if (arg4 > 0) {
			if (arg3 > 0) {
				int var13 = arg7[arg3 - 1][arg4 - 1] & 0x7FFF;
				if (var13 > 0) {
					FloorOverlayType var14 = (FloorOverlayType) this.overlays.list(var13 - 1);
					if (var14.rgb != -1 && var14.field8161) {
						byte var15 = arg8[arg3 - 1][arg4 - 1];
						int var16 = arg9[arg3 - 1][arg4 - 1] * 2 + 4 & 0x7;
						int var17 = method6823(arg0, var14);
						if (field4521[var15][var16]) {
							this.field4567[0] = var14.rgb;
							this.field4581[0] = var17;
							this.field4543[0] = var14.texture;
							this.field4570[0] = var14.field8163;
							this.field4551[0] = var14.field8160;
							this.field4572[0] = 256;
						}
					}
				}
			}
			if (arg3 < arg5 - 1) {
				int var18 = arg7[arg3 + 1][arg4 - 1] & 0x7FFF;
				if (var18 > 0) {
					FloorOverlayType var19 = (FloorOverlayType) this.overlays.list(var18 - 1);
					if (var19.rgb != -1 && var19.field8161) {
						byte var20 = arg8[arg3 + 1][arg4 - 1];
						int var21 = arg9[arg3 + 1][arg4 - 1] * 2 + 6 & 0x7;
						int var22 = method6823(arg0, var19);
						if (field4521[var20][var21]) {
							this.field4567[2] = var19.rgb;
							this.field4581[2] = var22;
							this.field4543[2] = var19.texture;
							this.field4570[2] = var19.field8163;
							this.field4551[2] = var19.field8160;
							this.field4572[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 < arg6 - 1) {
			if (arg3 > 0) {
				int var23 = arg7[arg3 - 1][arg4 + 1] & 0x7FFF;
				if (var23 > 0) {
					FloorOverlayType var24 = (FloorOverlayType) this.overlays.list(var23 - 1);
					if (var24.rgb != -1 && var24.field8161) {
						byte var25 = arg8[arg3 - 1][arg4 + 1];
						int var26 = arg9[arg3 - 1][arg4 + 1] * 2 + 2 & 0x7;
						int var27 = method6823(arg0, var24);
						if (field4521[var25][var26]) {
							this.field4567[6] = var24.rgb;
							this.field4581[6] = var27;
							this.field4543[6] = var24.texture;
							this.field4570[6] = var24.field8163;
							this.field4551[6] = var24.field8160;
							this.field4572[6] = 64;
						}
					}
				}
			}
			if (arg3 < arg5 - 1) {
				int var28 = arg7[arg3 + 1][arg4 + 1] & 0x7FFF;
				if (var28 > 0) {
					FloorOverlayType var29 = (FloorOverlayType) this.overlays.list(var28 - 1);
					if (var29.rgb != -1 && var29.field8161) {
						byte var30 = arg8[arg3 + 1][arg4 + 1];
						int var31 = arg9[arg3 + 1][arg4 + 1] * 2 & 0x7;
						int var32 = method6823(arg0, var29);
						if (field4521[var30][var31]) {
							this.field4567[4] = var29.rgb;
							this.field4581[4] = var32;
							this.field4543[4] = var29.texture;
							this.field4570[4] = var29.field8163;
							this.field4551[4] = var29.field8160;
							this.field4572[4] = 128;
						}
					}
				}
			}
		}
		if (arg4 > 0) {
			int var33 = arg7[arg3][arg4 - 1] & 0x7FFF;
			if (var33 > 0) {
				FloorOverlayType var34 = (FloorOverlayType) this.overlays.list(var33 - 1);
				if (var34.rgb != -1) {
					byte var35 = arg8[arg3][arg4 - 1];
					byte var36 = arg9[arg3][arg4 - 1];
					if (var34.field8161) {
						int var37 = 2;
						int var38 = var36 * 2 + 4;
						int var39 = method6823(arg0, var34);
						for (int var40 = 0; var40 < 3; var40++) {
							var38 &= 0x7;
							var37 &= 0x7;
							if (field4521[var35][var38] && this.field4551[var37] <= var34.field8160) {
								this.field4567[var37] = var34.rgb;
								this.field4581[var37] = var39;
								this.field4543[var37] = var34.texture;
								this.field4570[var37] = var34.field8163;
								if (var34.field8160 == this.field4551[var37]) {
									this.field4572[var37] |= 0x20;
								} else {
									this.field4572[var37] = 32;
								}
								this.field4551[var37] = var34.field8160;
							}
							var38++;
							var37--;
						}
						if (!var12[this.field4574 & 0x3]) {
							arg10[0] = field4527[var35][var36 + 2 & 0x3];
						}
					} else if (!var12[this.field4574 & 0x3]) {
						arg10[0] = field4556[var35][var36 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg6 - 1) {
			int var41 = arg7[arg3][arg4 + 1] & 0x7FFF;
			if (var41 > 0) {
				FloorOverlayType var42 = (FloorOverlayType) this.overlays.list(var41 - 1);
				if (var42.rgb != -1) {
					byte var43 = arg8[arg3][arg4 + 1];
					byte var44 = arg9[arg3][arg4 + 1];
					if (var42.field8161) {
						int var45 = 4;
						int var46 = var44 * 2 + 2;
						int var47 = method6823(arg0, var42);
						for (int var48 = 0; var48 < 3; var48++) {
							var46 &= 0x7;
							var45 &= 0x7;
							if (field4521[var43][var46] && this.field4551[var45] <= var42.field8160) {
								this.field4567[var45] = var42.rgb;
								this.field4581[var45] = var47;
								this.field4543[var45] = var42.texture;
								this.field4570[var45] = var42.field8163;
								if (var42.field8160 == this.field4551[var45]) {
									this.field4572[var45] |= 0x10;
								} else {
									this.field4572[var45] = 16;
								}
								this.field4551[var45] = var42.field8160;
							}
							var46--;
							var45++;
						}
						if (!var12[this.field4574 + 2 & 0x3]) {
							arg10[2] = field4527[var43][var44 & 0x3];
						}
					} else if (!var12[this.field4574 + 2 & 0x3]) {
						arg10[2] = field4556[var43][var44 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			int var49 = arg7[arg3 - 1][arg4] & 0x7FFF;
			if (var49 > 0) {
				FloorOverlayType var50 = (FloorOverlayType) this.overlays.list(var49 - 1);
				if (var50.rgb != -1) {
					byte var51 = arg8[arg3 - 1][arg4];
					byte var52 = arg9[arg3 - 1][arg4];
					if (var50.field8161) {
						int var53 = 6;
						int var54 = var52 * 2 + 4;
						int var55 = method6823(arg0, var50);
						for (int var56 = 0; var56 < 3; var56++) {
							var54 &= 0x7;
							var53 &= 0x7;
							if (field4521[var51][var54] && this.field4551[var53] <= var50.field8160) {
								this.field4567[var53] = var50.rgb;
								this.field4581[var53] = var55;
								this.field4543[var53] = var50.texture;
								this.field4570[var53] = var50.field8163;
								if (var50.field8160 == this.field4551[var53]) {
									this.field4572[var53] |= 0x8;
								} else {
									this.field4572[var53] = 8;
								}
								this.field4551[var53] = var50.field8160;
							}
							var54--;
							var53++;
						}
						if (!var12[this.field4574 + 3 & 0x3]) {
							arg10[3] = field4527[var51][var52 + 1 & 0x3];
						}
					} else if (!var12[this.field4574 + 3 & 0x3]) {
						arg10[3] = field4556[var51][var52 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg5 - 1) {
			int var57 = arg7[arg3 + 1][arg4] & 0x7FFF;
			if (var57 > 0) {
				FloorOverlayType var58 = (FloorOverlayType) this.overlays.list(var57 - 1);
				if (var58.rgb != -1) {
					byte var59 = arg8[arg3 + 1][arg4];
					byte var60 = arg9[arg3 + 1][arg4];
					if (var58.field8161) {
						int var61 = 4;
						int var62 = var60 * 2 + 6;
						int var63 = method6823(arg0, var58);
						for (int var64 = 0; var64 < 3; var64++) {
							var62 &= 0x7;
							var61 &= 0x7;
							if (field4521[var59][var62] && this.field4551[var61] <= var58.field8160) {
								this.field4567[var61] = var58.rgb;
								this.field4581[var61] = var63;
								this.field4543[var61] = var58.texture;
								this.field4570[var61] = var58.field8163;
								if (var58.field8160 == this.field4551[var61]) {
									this.field4572[var61] |= 0x4;
								} else {
									this.field4572[var61] = 4;
								}
								this.field4551[var61] = var58.field8160;
							}
							var62++;
							var61--;
						}
						if (!var12[this.field4574 + 1 & 0x3]) {
							arg10[1] = field4527[var59][var60 + 3 & 0x3];
						}
					} else if (!var12[this.field4574 + 1 & 0x3]) {
						arg10[1] = field4556[var59][var60 + 3 & 0x3];
					}
				}
			}
		}
		if (arg1 == null || !arg1.field8161) {
			return;
		}
		int var65 = method6823(arg0, arg1);
		for (int var66 = 0; var66 < 8; var66++) {
			int var67 = var66 - this.field4574 * 2 & 0x7;
			if (field4521[this.field4573][var66] && this.field4551[var67] <= arg1.field8160) {
				this.field4567[var67] = arg1.rgb;
				this.field4581[var67] = var65;
				this.field4543[var67] = arg1.texture;
				this.field4570[var67] = arg1.field8163;
				if (arg1.field8160 == this.field4551[var67]) {
					this.field4572[var67] |= 0x2;
				} else {
					this.field4572[var67] = 2;
				}
				this.field4551[var67] = arg1.field8160;
			}
		}
	}

	@ObfuscatedName("pd.b(Ldh;Lyn;I)I")
	public static final int method6823(Renderer arg0, FloorOverlayType arg1) {
		if (arg1.field8156 != -1) {
			return arg1.field8156;
		}
		if (arg1.texture != -1) {
			Material var2 = arg0.field1597.method2043(arg1.texture);
			if (!var2.field1342) {
				return var2.field1366;
			}
		}
		return arg1.rgb;
	}

	@ObfuscatedName("vp.h(IIII)I")
	public static final int method9469(int arg0, int arg1, int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		int var3 = 128 - arg2;
		int var4 = (arg0 & 0x7F) * var3 + (arg1 & 0x7F) * arg2 >> 7;
		int var5 = (arg0 & 0x380) * var3 + (arg1 & 0x380) * arg2 >> 7;
		int var6 = (arg0 & 0xFC00) * var3 + (arg1 & 0xFC00) * arg2 >> 7;
		return var6 & 0xFC00 | var5 & 0x380 | var4 & 0x7F;
	}

	@ObfuscatedName("l.a(III)I")
	public static final int method251(int arg0, int arg1) {
		int var2 = method1619(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1619(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1619(arg0, arg1, 1) - 128 >> 2);
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("dd.g(IIIS)I")
	public static final int method1619(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method13989(var3, var5);
		int var8 = method13989(var3 + 1, var5);
		int var9 = method13989(var3, var5 + 1);
		int var10 = method13989(var3 + 1, var5 + 1);
		int var11 = method5171(var7, var8, var4, arg2);
		int var12 = method5171(var9, var10, var4, arg2);
		return method5171(var11, var12, var6, arg2);
	}

	@ObfuscatedName("ki.i(IIIII)I")
	public static final int method5171(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Trig1.field4272[arg2 * 8192 / arg3] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("zu.j(III)I")
	public static final int method13989(int arg0, int arg1) {
		int var2 = method806(arg0 - 1, arg1 - 1) + method806(arg0 + 1, arg1 - 1) + method806(arg0 - 1, arg1 + 1) + method806(arg0 + 1, arg1 + 1);
		int var3 = method806(arg0 - 1, arg1) + method806(arg0 + 1, arg1) + method806(arg0, arg1 - 1) + method806(arg0, arg1 + 1);
		int var4 = method806(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("at.t(III)I")
	public static final int method806(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 << 13 ^ var2;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}
}
