/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class2 {
	public static BigInteger aBigInteger40;
	static BigInteger aBigInteger41;
	public static BigInteger aBigInteger42;
	static BigInteger aBigInteger43 = new BigInteger("10001", 16);
	public static Class523 aClass523_44;

	static {
		aBigInteger41 = (new BigInteger(
				"b53461e2ecd4a79d360d17da997fc8e919dde09ea7cc6f11a815de567331db43818671aa0104f7384481002397b75efb0a86aa323260b9b8258c96baf3d23edf",
				16));
		aBigInteger42 = new BigInteger("10001", 16);
		aBigInteger40 = (new BigInteger(
				"8cdd67f974541c1355b6f61061e719cf5ef3986ab10078cc4c9b800f98365505137d22af11a1b2ae3e16c766c12e881e0062fb9546dee3ae415b27253c60a784a3d401bd85804d0dd33792e22d1ebce4f0af7d0c5397a07a8564defb6f75e51d2ce198e14da98beb0cc9c8f1f137154b55e96e25711574b7f555171103603f09063e7eb1baf388bd4b3fb98f9a813ebddd94b814903efc991f5c302ad2618f2474e66dece5b1c62b5f719e5204e80fe13eb37f5ee9e14f005702a77e62a23ec758d2441c68ca56b795b1ae873642a01c46afa03976d6afb06c538894ae05ca17afe432a8aea0e02f19390930ca5c80abaf151f64721083ca91114d795f313ca069990ce24a9aa16d5f24c1dc1d07790109f1c1a0d28f995671913c3778b5cf758968c08d26a0b135ceb582ac85d3effa71400d209e05317a031727cff5b54fed68d2bfdeb12e839354e18c1ba9f0b3a5541a78d172e40c10fe2bfb6630fa83cb4ae328b49f40dddf19bfb93610709d10aa4b311a9dbda756bc171108edce3837f5ab3d1729612e96cc0d28ca6fe6cbe6a49689be336d1ec9a26861c528ff6246cfc226ea564af380f92f4c931be1b2b14cac452e1158f80c79a469d23b26e5d03494662820fef2fb9db75b69f9a6ef0d9d352d4b7f752bdcddd43cf98629d8a3ac9d1625020dcc5c7f3a4e113432d4f75d8fafa048fc65cf1eb66cc19ebc0217",
				16));
		new BigInteger("10001", 16);
		new BigInteger(
				"9fbfdd5dafef6afb733604583ba216ac75d2262120143ee262ade85e8cd6f1d349e28062926132d446219b37c99dc0f021b1eec0b8b0f627e19d28ca0299255f",
				16);
	}

	Class2() throws Throwable {
		throw new Error();
	}

	static void method390(Class430 class430, int i) {
		try {
			Class458.method5670(
					(((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]),
					-1, -1, false, 1036240917);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder()
					.append("ac.aeo(").append(')').toString());
		}
	}

	static void method391(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 2]);
			Class208.method2204(
					(((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067),
					i_0_ & 0xffff, i_1_, i_2_,
					((Class430) class430).aBoolean4398, class430, 1429987943);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder()
					.append("ac.aqg(").append(')').toString());
		}
	}

	static void decodeNpcMasks(int i) {
		try {
			Class330_Sub46_Sub2 buffer = ((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17;
			for (int i_3_ = 0; i_3_ < -351876829 * client.anInt9019; i_3_++) {
				int i_4_ = client.anIntArray9020[i_3_];
				Class432_Sub1_Sub1_Sub1_Sub2 class432_sub1_sub1_sub1_sub2 = ((Class432_Sub1_Sub1_Sub1_Sub2) (((Class330_Sub35) client.aClass497_9014
						.method6094((long) i_4_)).anObject7733));

				int i_5_ = buffer.readUnsignedByte(1771747028);
				if ((i_5_ & 0x4) != 0)
					i_5_ += buffer.readUnsignedByte(942427220) << 8;
				if (0 != (i_5_ & 0x400))
					i_5_ += buffer.readUnsignedByte(285386114) << 16;
				if ((i_5_ & 0x20000) != 0)
					i_5_ += buffer.readUnsignedByte(50851324) << 24;

				if (0 != (i_5_ & 0x800000)) {
					//change combat
					class432_sub1_sub1_sub1_sub2.anInt10258 = (buffer
							.readUnsignedShort(155393609) * -544389187);
					if (65535 == (class432_sub1_sub1_sub1_sub2.anInt10258 * 1541581717))
						class432_sub1_sub1_sub1_sub2.anInt10258 = 810663093 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6348);
				}
				if (0 != (i_5_ & 0x2000000)) {
					//graphics 3
					int i_6_ = buffer.readUnsignedShort(1890157712);
					int i_7_ = buffer.readInt2(-793658723);
					if (65535 == i_6_)
						i_6_ = -1;
					int i_8_ = buffer.readUnsignedByteC(-243015761);
					int i_9_ = i_8_ & 0x7;
					int i_10_ = i_8_ >> 3 & 0xf;
					if (i_10_ == 15)
						i_10_ = -1;
					boolean bool = (i_8_ >> 7 & 0x1) == 1;
					class432_sub1_sub1_sub1_sub2.sendGraphics(i_6_, i_7_, i_9_,
							i_10_, bool, 2, (byte) -79);
				}
				if ((i_5_ & 0x100) != 0) {
					class432_sub1_sub1_sub1_sub2.anInt10257 = (buffer
							.readUnsignedShortA((byte) -57) * 1164465883);
					if (65535 == class432_sub1_sub1_sub1_sub2.anInt10257 * 423212371)
						class432_sub1_sub1_sub1_sub2.anInt10257 = -1164465883;
				}
				if ((i_5_ & 0x1000) != 0) {
					int i_11_ = buffer.readUnsignedByteC(-243015761);
					int[] is = new int[i_11_];
					int[] is_12_ = new int[i_11_];
					int[] is_13_ = new int[i_11_];
					for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
						int i_15_ = buffer.readBigSmart(-1509866246);
						is[i_14_] = i_15_;
						is_12_[i_14_] = buffer.readUnsignedByteA(-741334169);
						is_13_[i_14_] = buffer.readUnsignedShort(-132390179);
					}
					Class110.method1363(class432_sub1_sub1_sub1_sub2, is,
							is_12_, is_13_, (byte) -84);
				}
				if ((i_5_ & 0x10000) != 0) {
					int i_16_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.anIntArray6297).length;
					int i_17_ = 0;
					if ((class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6301) != null)
						i_17_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6301).length;
					int i_18_ = 0;
					if (null != (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6349))
						i_17_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6349).length;
					int i_19_ = buffer.readUnsignedByteS(-400233324);
					if ((i_19_ & 0x1) == 1) {
						if (i >= 1395100258)
							break;
					} else {
						int[] is = null;
						if ((i_19_ & 0x2) == 2) {
							is = new int[i_16_];
							for (int i_20_ = 0; i_20_ < i_16_; i_20_++)
								is[i_20_] = buffer.readBigSmart(-740799635);
						}
						short[] is_21_ = null;
						if ((i_19_ & 0x4) == 4) {
							is_21_ = new short[i_17_];
							for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
								is_21_[i_22_] = (short) buffer
										.readUnsignedShortA((byte) -75);
						}
						short[] is_23_ = null;
						if ((i_19_ & 0x8) == 8) {
							is_23_ = new short[i_18_];
							for (int i_24_ = 0; i_24_ < i_18_; i_24_++)
								is_23_[i_24_] = (short) buffer
										.readUnsignedLEShort(15163594);
						}
						long l = (long) ((Class432_Sub1_Sub1_Sub1_Sub2.anInt10256 += -247557835)
								* -392562403 - 1);
						new Class538(l, is, is_21_, is_23_);
					}
				}
				if (0 != (i_5_ & 0x80000)) {
					class432_sub1_sub1_sub1_sub2.aByte10043 = buffer
							.readByteA(1925295993);
					class432_sub1_sub1_sub1_sub2.aByte10044 = buffer
							.readByteA(-2058479998);
					class432_sub1_sub1_sub1_sub2.aByte10063 = buffer
							.readByteC(-2071748996);
					class432_sub1_sub1_sub1_sub2.aByte10025 = (byte) buffer
							.readUnsignedByteC(-243015761);
					class432_sub1_sub1_sub1_sub2.anInt10041 = ((822953439 * client.anInt8981 + buffer
							.readUnsignedShort(-293553987)) * 1442866505);
					class432_sub1_sub1_sub1_sub2.anInt10042 = ((822953439 * client.anInt8981 + buffer
							.readUnsignedShort(684420173)) * -887346907);
				}
				if ((i_5_ & 0x100000) != 0) {
					int i_25_ = ((buffer.payload[(buffer.offset += 323600977)
							* -824785231 - 1]) & 0xff);
					for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
						int i_27_ = buffer.readUnsignedShortA((byte) -88);
						int i_28_ = buffer.readInt2(-793658723);
						class432_sub1_sub1_sub1_sub2.aClass67_10260.method791(
								i_27_, i_28_, -1354361898);
					}
				}
				if ((i_5_ & 0x2000) != 0) {
					int i_29_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.anIntArray6296).length;
					int i_30_ = 0;
					if (null != (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6301))
						i_30_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6301).length;
					int i_31_ = 0;
					if ((class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6349) != null)
						i_31_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aShortArray6349).length;
					int i_32_ = buffer.readUnsignedByte(513764726);
					if (1 == (i_32_ & 0x1))
						class432_sub1_sub1_sub1_sub2.aClass538_10254 = null;
					else {
						int[] is = null;
						if (2 == (i_32_ & 0x2)) {
							is = new int[i_29_];
							for (int i_33_ = 0; i_33_ < i_29_; i_33_++)
								is[i_33_] = buffer.readBigSmart(-583988213);
						}
						short[] is_34_ = null;
						if (4 == (i_32_ & 0x4)) {
							is_34_ = new short[i_30_];
							for (int i_35_ = 0; i_35_ < i_30_; i_35_++)
								is_34_[i_35_] = (short) buffer
										.readUnsignedLEShort(15163594);
						}
						short[] is_36_ = null;
						if ((i_32_ & 0x8) == 8) {
							is_36_ = new short[i_31_];
							for (int i_37_ = 0; i_37_ < i_31_; i_37_++)
								is_36_[i_37_] = (short) buffer
										.readUnsignedLEShortA(1537377029);
						}
						long l = (long) ((Class432_Sub1_Sub1_Sub1_Sub2.anInt10253 += 1097384721) * 1240501745 - 1);
						class432_sub1_sub1_sub1_sub2.aClass538_10254 = new Class538(
								l, is, is_34_, is_36_);
					}
				}
				if (0 != (i_5_ & 0x40000)) {
					class432_sub1_sub1_sub1_sub2.aString10259 = buffer
							.readString(-1249148465);
					if ("".equals(class432_sub1_sub1_sub1_sub2.aString10259)
							|| (class432_sub1_sub1_sub1_sub2.aString10259
									.equals(class432_sub1_sub1_sub1_sub2.aClass551_10251.aString6323)))
						class432_sub1_sub1_sub1_sub2.aString10259 = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aString6323);
				}
				if (0 != (i_5_ & 0x200)) {
					//graphics 2
					int i_38_ = buffer.readUnsignedShort(349897342);
					int i_39_ = buffer.readLEInt(-776660178);
					if (65535 == i_38_)
						i_38_ = -1;
					int i_40_ = buffer.readUnsignedByteS(-400233324);
					int i_41_ = i_40_ & 0x7;
					int i_42_ = i_40_ >> 3 & 0xf;
					if (i_42_ == 15)
						i_42_ = -1;
					boolean bool = 1 == (i_40_ >> 7 & 0x1);
					class432_sub1_sub1_sub1_sub2.sendGraphics(i_38_, i_39_,
							i_41_, i_42_, bool, 1, (byte) -126);
				}
				if ((i_5_ & 0x400000) != 0) {
					class432_sub1_sub1_sub1_sub2.aClass67_10260
							.method790(-709981182);
					int i_43_ = ((buffer.payload[(buffer.offset += 323600977)
							* -824785231 - 1]) & 0xff);
					for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
						int i_45_ = buffer.readUnsignedShortA((byte) -110);
						int i_46_ = buffer.readInt2(-793658723);
						class432_sub1_sub1_sub1_sub2.aClass67_10260.method791(
								i_45_, i_46_, -209685854);
					}
				}
				if ((i_5_ & 0x80) != 0) {
					//transform
					if (class432_sub1_sub1_sub1_sub2.aClass551_10251
							.method6372((byte) 22))
						Class324.method3202(class432_sub1_sub1_sub1_sub2,
								1255542902);
					class432_sub1_sub1_sub1_sub2
							.method5475((Class158_Sub3.aClass553_8875
									.method6392(
											buffer.readBigSmart(-1177087791),
											901884994)), 1918950667);
					class432_sub1_sub1_sub1_sub2
							.method5420(
									(class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)
											* -1943771105, (short) -16240);
					class432_sub1_sub1_sub1_sub2.anInt10051 = (543987723 * (-922219293
							* (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6325) << 3));
					if (class432_sub1_sub1_sub1_sub2.aClass551_10251
							.method6372((byte) 79))
						Class_ra.method4809(
								class432_sub1_sub1_sub1_sub2.aByte8658,
								class432_sub1_sub1_sub1_sub2.anIntArray10018[0],
								class432_sub1_sub1_sub1_sub2.anIntArray10059[0],
								0, null, class432_sub1_sub1_sub1_sub2, null,
								199270945);
				}
				if ((i_5_ & 0x200000) != 0) {
					int i_47_ = ((buffer.payload[(buffer.offset += 323600977)
							* -824785231 - 1]) & 0xff);
					for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
						int i_49_ = buffer.readUnsignedByteS(-400233324);
						int i_50_ = buffer.readLEInt(1638088459);
						int i_51_ = buffer.method3788((byte) 12);
						class432_sub1_sub1_sub1_sub2.method5476(i_49_, i_50_,
								i_51_, 740069388);
					}
				}
				if ((i_5_ & 0x8000) != 0) {
					//force movement
					class432_sub1_sub1_sub1_sub2.anInt10034 = (buffer
							.readByteC(-1908097373) * -255360127);
					class432_sub1_sub1_sub1_sub2.anInt10045 = (buffer
							.readByteA(-229182089) * -1628463801);
					class432_sub1_sub1_sub1_sub2.anInt10057 = (buffer
							.readByteC(-2021860441) * 1071045921);
					class432_sub1_sub1_sub1_sub2.anInt10036 = (buffer
							.readByte((byte) 40) * -698613551);
					class432_sub1_sub1_sub1_sub2.anInt10058 = (buffer
							.readUnsignedShort(-270225857) + 822953439 * client.anInt8981) * 2098850419;
					class432_sub1_sub1_sub1_sub2.anInt10038 = (buffer
							.readUnsignedShort(-276686098) + 822953439 * client.anInt8981)
							* -1118573647;
					class432_sub1_sub1_sub1_sub2.anInt10040 = (buffer
							.readUnsignedShort(-161556373) * -1597232317);
					class432_sub1_sub1_sub1_sub2.anInt10034 += (class432_sub1_sub1_sub1_sub2.anIntArray10018[0] * -255360127);
					class432_sub1_sub1_sub1_sub2.anInt10045 += (class432_sub1_sub1_sub1_sub2.anIntArray10059[0] * -1628463801);
					class432_sub1_sub1_sub1_sub2.anInt10057 += (class432_sub1_sub1_sub1_sub2.anIntArray10018[0] * 1071045921);
					class432_sub1_sub1_sub1_sub2.anInt10036 += (class432_sub1_sub1_sub1_sub2.anIntArray10059[0] * -698613551);
					class432_sub1_sub1_sub1_sub2.anInt10056 = 393772355;
					class432_sub1_sub1_sub1_sub2.anInt10006 = 0;
				}
				if (0 != (i_5_ & 0x4000)) {
					int i_52_ = buffer.readUnsignedByteA(-741334169);
					int[] is = new int[i_52_];
					int[] is_53_ = new int[i_52_];
					for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
						int i_55_ = buffer.readUnsignedLEShortA(-511039615);
						if (49152 == (i_55_ & 0xc000)) {
							int i_56_ = buffer.readUnsignedLEShort(15163594);
							is[i_54_] = i_55_ << 16 | i_56_;
						} else
							is[i_54_] = i_55_;
						is_53_[i_54_] = buffer
								.readUnsignedLEShortA(-1757914152);
					}
					class432_sub1_sub1_sub1_sub2.method5413(is, is_53_,
							(byte) 16);
				}
				if ((i_5_ & 0x8) != 0) {
					// hits
					int size = buffer.readUnsignedByteC(-243015761);
					if (size > 0) {
						for (int i_58_ = 0; i_58_ < size; i_58_++) {
							int i_59_ = -1;
							int i_60_ = -1;
							int i_61_ = -1;
							int i_62_ = buffer.readSmart(-611843192);
							if (i_62_ == 32767) {
								i_62_ = buffer.readSmart(-795609037);
								i_60_ = buffer.readSmart(-1273759143);
								i_59_ = buffer.readSmart(-632630559);
								i_61_ = buffer.readSmart(92315265);
							} else if (i_62_ != 32766)
								i_60_ = buffer.readSmart(-1839833324);
							else {
								i_62_ = -1;
								i_60_ = buffer.readUnsignedByteC(-243015761);
							}
							int i_63_ = buffer.readSmart(59816641);
							class432_sub1_sub1_sub1_sub2.method5423(i_62_,
									i_60_, i_59_, i_61_,
									client.anInt8981 * 822953439, i_63_,
									-1401542499);
						}
					}
					int i_64_ = buffer.readUnsignedByte(1950737094);
					if (i_64_ > 0) {
						for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
							int i_66_ = buffer.readSmart(40933834);
							int i_67_ = buffer.readSmart(-401044723);
							if (32767 != i_67_) {
								int i_68_ = buffer.readSmart(265246854);
								int i_69_ = buffer
										.readUnsignedByteC(-243015761);
								int i_70_ = (i_67_ > 0 ? buffer
										.readUnsignedByteA(-741334169) : i_69_);
								class432_sub1_sub1_sub1_sub2.method5417(i_66_,
										822953439 * client.anInt8981, i_67_,
										i_68_, i_69_, i_70_, 1897972712);
							} else
								class432_sub1_sub1_sub1_sub2.method5418(i_66_,
										-384448259);
						}
					}
				}
				if (0 != (i_5_ & 0x2)) {
					class432_sub1_sub1_sub1_sub2.anInt10261 = (buffer
							.readUnsignedShort(866967018) * -1889414385);
					class432_sub1_sub1_sub1_sub2.anInt10252 = buffer
							.readUnsignedLEShort(15163594) * 257803485;
				}
				if (0 != (i_5_ & 0x40)) {
					//graphics 1
					int i_71_ = buffer.readUnsignedShortA((byte) -118);
					int i_72_ = buffer.readLEInt(49003431);
					if (i_71_ == 65535)
						i_71_ = -1;
					int i_73_ = buffer.readUnsignedByteC(-243015761);
					int i_74_ = i_73_ & 0x7;
					int i_75_ = i_73_ >> 3 & 0xf;
					if (i_75_ == 15)
						i_75_ = -1;
					boolean bool = (i_73_ >> 7 & 0x1) == 1;
					class432_sub1_sub1_sub1_sub2.sendGraphics(i_71_, i_72_,
							i_74_, i_75_, bool, 0, (byte) 5);
				}
				if ((i_5_ & 0x20) != 0) {
					//face mortal
					class432_sub1_sub1_sub1_sub2.anInt10028 = (buffer
							.readUnsignedShortA((byte) -79) * -825108897);
					if (65535 == (class432_sub1_sub1_sub1_sub2.anInt10028 * -2029779553))
						class432_sub1_sub1_sub1_sub2.anInt10028 = 825108897;
				}
				if (0 != (i_5_ & 0x10)) // force text
					class432_sub1_sub1_sub1_sub2.method5481(
							buffer.readString(613064676), 0, 0, (byte) -61);
				if ((i_5_ & 0x1) != 0) {
					// anim
					int[] is = new int[Class487_Sub1.method6040(-335014354).length];
					for (int i_76_ = 0; i_76_ < Class487_Sub1
							.method6040(-1455479983).length; i_76_++)
						is[i_76_] = buffer.readBigSmart(-682897967);
					int i_77_ = buffer.readUnsignedByteC(-243015761);
					Class150_Sub2.method1772(class432_sub1_sub1_sub1_sub2, is,
							i_77_, true, (byte) 75);
				}
				if ((i_5_ & 0x1000000) != 0) {
					//graphics 4
					int i_78_ = buffer.readUnsignedLEShort(15163594);
					int i_79_ = buffer.readLEInt(-1971018838);
					if (65535 == i_78_)
						i_78_ = -1;
					int i_80_ = buffer.readUnsignedByteS(-400233324);
					int i_81_ = i_80_ & 0x7;
					int i_82_ = i_80_ >> 3 & 0xf;
					if (i_82_ == 15)
						i_82_ = -1;
					boolean bool = (i_80_ >> 7 & 0x1) == 1;
					class432_sub1_sub1_sub1_sub2.sendGraphics(i_78_, i_79_,
							i_81_, i_82_, bool, 3, (byte) -100);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder()
					.append("ac.kh(").append(')').toString());
		}
	}

	public static void method393(String string, boolean bool, int i) {
		try {
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_83_ = 0;
			int i_84_ = bool ? 32768 : 0;
			int i_85_ = i_84_
					+ (bool ? aClass523_44.anInt6025 * -1985204715
							: -1817680511 * aClass523_44.anInt6028);
			for (int i_86_ = i_84_; i_86_ < i_85_; i_86_++) {
				Class330_Sub36_Sub4 class330_sub36_sub4 = aClass523_44
						.method6233(i_86_, 1487140002);
				if (!class330_sub36_sub4.aBoolean9662) {
					if (i == -834257506)
						return;
				} else if (class330_sub36_sub4.method3451((byte) -58)
						.toLowerCase().indexOf(string) == -1) {
					if (i == -834257506)
						throw new IllegalStateException();
				} else {
					if (i_83_ >= 50) {
						Class440.anInt4482 = -1950675111;
						Class282_Sub1.aShortArray7443 = null;
						return;
					}
					if (i_83_ >= is.length) {
						short[] is_87_ = new short[is.length * 2];
						for (int i_88_ = 0; i_88_ < i_83_; i_88_++)
							is_87_[i_88_] = is[i_88_];
						is = is_87_;
					}
					is[i_83_++] = (short) i_86_;
				}
			}
			Class282_Sub1.aShortArray7443 = is;
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
			Class440.anInt4482 = 1950675111 * i_83_;
			String[] strings = new String[-2048805097 * Class440.anInt4482];
			for (int i_89_ = 0; i_89_ < Class440.anInt4482 * -2048805097; i_89_++)
				strings[i_89_] = aClass523_44.method6233(is[i_89_], 1987320441)
						.method3451((byte) -49);
			Class389.method4592(strings, Class282_Sub1.aShortArray7443,
					-2075931773);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder()
					.append("ac.nc(").append(')').toString());
		}
	}

	static void method394(Class330_Sub36_Sub13 class330_sub36_sub13, int i,
			int i_90_) {
		try {
			if (Class484.aBoolean5782) {
				Class524 class524 = Class359.method4239((byte) 79);
				int i_91_ = 0;
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716
						.method5884((byte) 64)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716
						.method5886((short) 8192))) {
					int i_92_ = Class7.method409(class330_sub36_sub10,
							class524, 936672521);
					if (i_92_ > i_91_)
						i_91_ = i_92_;
				}
				i_91_ += 8;
				int i_93_ = ((((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715
						* -213703795 * (Class484.anInt5779 * 1764744137)) + 21);
				Class95_Sub13.anInt7181 = -1535169181
						* ((Class484.aBoolean5807 ? 26 : 22) + (1764744137 * Class484.anInt5779 * (-213703795 * (((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715))));
				int i_94_ = (Class89.anInt736 * 1574464115 + Class550.anInt6288 * 1151799299);
				if (i_94_ + i_91_ > Class300.anInt3058 * -1969079741)
					i_94_ = Class89.anInt736 * 1574464115 - i_91_;
				if (i_94_ < 0)
					i_94_ = 0;
				int i_95_ = (Class484.aBoolean5807 ? 1 + (-2093225349
						* class524.anInt6033 + 20) : 31);
				int i_96_ = 1 + (class524.anInt6033 * -2093225349 + (i - i_95_));
				if (i_96_ + i_93_ > Class146.anInt1615 * -1548608507)
					i_96_ = -1548608507 * Class146.anInt1615 - i_93_;
				if (i_96_ < 0)
					i_96_ = 0;
				Class62.anInt561 = 246288603 * i_94_;
				Class246.anInt6586 = 2112207123 * i_96_;
				Class116.anInt1374 = i_91_ * -877690161;
				Class484.aClass330_Sub36_Sub13_5784 = class330_sub36_sub13;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder()
					.append("ac.l(").append(')').toString());
		}
	}
}
