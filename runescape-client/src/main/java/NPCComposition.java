import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1508200545
	)
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1564645859
	)
	@Export("size")
	public int size;
	@ObfuscatedName("q")
	@Export("models")
	int[] models;
	@ObfuscatedName("m")
	int[] field1946;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 541580335
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -78721377
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 292428627
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2069211337
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 152147103
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 820412661
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -461750405
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1886310483
	)
	public int field1944;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -66228151
	)
	public int field1945;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1958989157
	)
	public int field1956;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -348653305
	)
	public int field1947;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1358820143
	)
	public int field1971;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1330583085
	)
	public int field1949;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1745057803
	)
	public int field1950;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1023278713
	)
	public int field1941;
	@ObfuscatedName("z")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("o")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("as")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ac")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ao")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ar")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 305115789
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 621143359
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -145970533
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("aa")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -748389131
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1558773009
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -907008953
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 362388019
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("az")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1358213547
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 178529429
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("aj")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ax")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("av")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 19
	}

	NPCComposition() {
		this.name = "null"; // L: 21
		this.size = 1; // L: 22
		this.idleSequence = -1; // L: 25
		this.turnLeftSequence = -1; // L: 26
		this.turnRightSequence = -1; // L: 27
		this.walkSequence = -1; // L: 28
		this.walkBackSequence = -1; // L: 29
		this.walkLeftSequence = -1; // L: 30
		this.walkRightSequence = -1; // L: 31
		this.field1944 = -1; // L: 32
		this.field1945 = -1; // L: 33
		this.field1956 = -1; // L: 34
		this.field1947 = -1; // L: 35
		this.field1971 = -1; // L: 36
		this.field1949 = -1; // L: 37
		this.field1950 = -1; // L: 38
		this.field1941 = -1; // L: 39
		this.actions = new String[5]; // L: 44
		this.drawMapDot = true; // L: 45
		this.combatLevel = -1; // L: 46
		this.widthScale = 128; // L: 47
		this.heightScale = 128; // L: 48
		this.isVisible = false; // L: 49
		this.ambient = 0; // L: 50
		this.contrast = 0; // L: 51
		this.headIconPrayer = -1; // L: 52
		this.rotation = 32; // L: 53
		this.transformVarbit = -1; // L: 55
		this.transformVarp = -1; // L: 56
		this.isInteractable = true; // L: 57
		this.isClickable = true; // L: 58
		this.isFollower = false; // L: 59
	} // L: 62

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494695451"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 76

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "36"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 80
			if (var2 == 0) { // L: 81
				return; // L: 84
			}

			this.decodeNext(var1, var2); // L: 82
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-1721734339"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 87
			var3 = var1.readUnsignedByte(); // L: 88
			this.models = new int[var3]; // L: 89

			for (var4 = 0; var4 < var3; ++var4) { // L: 90
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 92
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 93
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 94
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 95
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 96
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 97
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 98
			this.walkSequence = var1.readUnsignedShort(); // L: 99
			this.walkBackSequence = var1.readUnsignedShort(); // L: 100
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 101
			this.walkRightSequence = var1.readUnsignedShort(); // L: 102
		} else if (var2 == 18) { // L: 104
			var1.readUnsignedShort(); // L: 105
		} else if (var2 >= 30 && var2 < 35) { // L: 107
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 108
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 109
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 111
			var3 = var1.readUnsignedByte(); // L: 112
			this.recolorFrom = new short[var3]; // L: 113
			this.recolorTo = new short[var3]; // L: 114

			for (var4 = 0; var4 < var3; ++var4) { // L: 115
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 116
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 117
			}
		} else if (var2 == 41) { // L: 120
			var3 = var1.readUnsignedByte(); // L: 121
			this.retextureFrom = new short[var3]; // L: 122
			this.retextureTo = new short[var3]; // L: 123

			for (var4 = 0; var4 < var3; ++var4) { // L: 124
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 125
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 126
			}
		} else if (var2 == 60) { // L: 129
			var3 = var1.readUnsignedByte(); // L: 130
			this.field1946 = new int[var3]; // L: 131

			for (var4 = 0; var4 < var3; ++var4) { // L: 132
				this.field1946[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 134
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 135
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 136
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 137
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 138
			this.isVisible = true;
		} else if (var2 == 100) { // L: 139
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 140
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) { // L: 141
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 142
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 143
			if (var2 == 107) { // L: 161
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 162
				this.isClickable = false;
			} else if (var2 == 111) { // L: 163
				this.isFollower = true;
			} else if (var2 == 114) { // L: 164
				this.field1944 = var1.readUnsignedShort();
			} else if (var2 == 115) { // L: 165
				this.field1944 = var1.readUnsignedShort(); // L: 166
				this.field1945 = var1.readUnsignedShort(); // L: 167
				this.field1956 = var1.readUnsignedShort(); // L: 168
				this.field1947 = var1.readUnsignedShort(); // L: 169
			} else if (var2 == 116) { // L: 171
				this.field1971 = var1.readUnsignedShort();
			} else if (var2 == 117) { // L: 172
				this.field1971 = var1.readUnsignedShort(); // L: 173
				this.field1949 = var1.readUnsignedShort(); // L: 174
				this.field1950 = var1.readUnsignedShort(); // L: 175
				this.field1941 = var1.readUnsignedShort(); // L: 176
			} else if (var2 == 249) { // L: 178
				this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 144
			if (this.transformVarbit == 65535) { // L: 145
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 146
			if (this.transformVarp == 65535) { // L: 147
				this.transformVarp = -1;
			}

			var3 = -1; // L: 148
			if (var2 == 118) { // L: 149
				var3 = var1.readUnsignedShort(); // L: 150
				if (var3 == 65535) { // L: 151
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 153
			this.transforms = new int[var4 + 2]; // L: 154

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 155
				this.transforms[var5] = var1.readUnsignedShort(); // L: 156
				if (this.transforms[var5] == 65535) { // L: 157
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 159
		}

	} // L: 180

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgd;ILgd;II)Lha;",
		garbageValue = "-301424104"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 183
			NPCComposition var12 = this.transform(); // L: 184
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 185 186
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 188
			if (var5 == null) { // L: 189
				boolean var6 = false; // L: 190

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 191
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 192
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 194

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 195
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 196
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 197
				}

				if (this.recolorFrom != null) { // L: 198
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 199
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 200
					}
				}

				if (this.retextureFrom != null) { // L: 203
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 204
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 205
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 208
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 209
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 212
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 213
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 214
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 215
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 216
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 217
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "1544732553"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 221
			NPCComposition var7 = this.transform(); // L: 222
			return var7 == null ? null : var7.getModelData(); // L: 223 224
		} else if (this.field1946 == null) { // L: 226
			return null;
		} else {
			boolean var1 = false; // L: 227

			for (int var2 = 0; var2 < this.field1946.length; ++var2) { // L: 228
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1946[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 229
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1946.length]; // L: 230

				for (int var3 = 0; var3 < this.field1946.length; ++var3) { // L: 231
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1946[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) { // L: 233
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length); // L: 234
				}

				int var4;
				if (this.recolorFrom != null) { // L: 235
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 236
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 237
					}
				}

				if (this.retextureFrom != null) { // L: 240
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 241
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 242
					}
				}

				return var6; // L: 245
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lfs;",
		garbageValue = "-1247651174"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 249
		if (this.transformVarbit != -1) { // L: 250
			var1 = UserComparator8.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 251
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 253
			var2 = this.transforms[var1]; // L: 254
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class193.getNpcDefinition(var2) : null; // L: 255 256
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "395195336"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 260
			return true;
		} else {
			int var1 = -1; // L: 261
			if (this.transformVarbit != -1) { // L: 262
				var1 = UserComparator8.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 263
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 264
				return this.transforms[var1] != -1; // L: 265
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "30"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return PlayerCompositionColorTextureOverride.method3508(this.params, var1, var2); // L: 269
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-55"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 274
		String var3;
		if (var4 == null) { // L: 276
			var3 = var2; // L: 277
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 280
			if (var5 == null) { // L: 281
				var3 = var2; // L: 282
			} else {
				var3 = (String)var5.obj; // L: 285
			}
		}

		return var3; // L: 287
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-67"
	)
	static void method3663(int var0, int var1) {
		World.method1782(class146.tempMenuAction, var0, var1); // L: 11469
		class146.tempMenuAction = null; // L: 11470
	} // L: 11471
}
