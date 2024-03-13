package com.jagex.game.config.invtype;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ConfigRelated;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("ady")
public class InvType extends SecondaryNode implements ConfigType, ConfigRelated {

	@ObfuscatedName("ady.k")
	public int stockLength = 0;

	@ObfuscatedName("ady.f")
	public int[] stockobj;

	@ObfuscatedName("ady.w")
	public int[] stockcount;

	@ObfuscatedName("ady.l")
	public int size = 0;

	@ObfuscatedName("ady.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int count = buf.g1();
			if (count == 0) {
				return;
			}
			this.method15306(buf, count);
		}
	}

	@ObfuscatedName("ady.u(Lalw;II)V")
	public void method15306(Packet buf, int code) {
		if (code == 2) {
			this.size = buf.g2();
		} else if (code == 4) {
			this.stockLength = buf.g1();
			this.stockobj = new int[this.stockLength];
			this.stockcount = new int[this.stockLength];
			for (int var3 = 0; var3 < this.stockLength; var3++) {
				this.stockobj[var3] = buf.g2();
				this.stockcount[var3] = buf.g2();
			}
		}
	}

	@ObfuscatedName("ady.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("ady.z(IB)V")
	public void method2998(int arg0) {
	}
}
