/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class509
{
    public static int anInt5946;
    static volatile IcmpService_Sub1 anIcmpService_Sub1_5947;
    
    public long method6161(int i) {
	try {
	    return System.nanoTime();
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("va.r(")
					  .append
					  (')').toString());
	}
    }
    
    public Class509() {
	System.nanoTime();
    }
    
    public static Class518 method6162(ItemDefinitions itemDefinitions,
				      Buffer buffer, int i) {
	try {
	    Class518 class518 = new Class518(itemDefinitions);
	    int i_0_ = buffer.readUnsignedByte(1925008033);
	    boolean bool = (i_0_ & 0x1) != 0;
	    boolean bool_1_ = 0 != (i_0_ & 0x2);
	    boolean bool_2_ = 0 != (i_0_ & 0x4);
	    boolean bool_3_ = 0 != (i_0_ & 0x8);
	    if (bool) {
		class518.anIntArray6004[0]
		    = buffer.readBigSmart(-2144710502);
		class518.anIntArray6007[0]
		    = buffer.readBigSmart(-1289610242);
		if (-1 != ((ItemDefinitions) itemDefinitions).maleEquip2 * -1680993213
		    || -1 != -789178437 * ((ItemDefinitions) itemDefinitions).femaleEquip2) {
		    class518.anIntArray6004[1]
			= buffer.readBigSmart(-1755514401);
		    class518.anIntArray6007[1]
			= buffer.readBigSmart(-2107062975);
		}
		if (-1 != ((ItemDefinitions) itemDefinitions).maleEquip3 * 833495753
		    || -1 != ((ItemDefinitions) itemDefinitions).femaleEquip3 * 1740510153) {
		    class518.anIntArray6004[2]
			= buffer.readBigSmart(-1959522065);
		    class518.anIntArray6007[2]
			= buffer.readBigSmart(-1943588341);
		}
	    }
	    if (bool_1_) {
		class518.anIntArray6010[0]
		    = buffer.readBigSmart(-528083250);
		class518.anIntArray6011[0]
		    = buffer.readBigSmart(-1115358399);
		if (654976021 * ((ItemDefinitions) itemDefinitions).anInt6681 != -1
		    || ((ItemDefinitions) itemDefinitions).anInt6718 * 203069975 != -1) {
		    class518.anIntArray6010[1]
			= buffer.readBigSmart(-1467348242);
		    class518.anIntArray6011[1]
			= buffer.readBigSmart(-876145807);
		}
	    }
	    if (bool_2_) {
		int i_4_ = buffer.readUnsignedShort(90663243);
		int[] is = new int[4];
		is[0] = i_4_ & 0xf;
		is[1] = i_4_ >> 4 & 0xf;
		is[2] = i_4_ >> 8 & 0xf;
		is[3] = i_4_ >> 12 & 0xf;
		for (int i_5_ = 0; i_5_ < 4; i_5_++) {
		    if (15 != is[i_5_])
			class518.aShortArray6012[is[i_5_]]
			    = (short) buffer.readUnsignedShort(1817368528);
		}
	    }
	    if (bool_3_) {
		int i_6_ = buffer.readUnsignedByte(1739781758);
		int[] is = new int[2];
		is[0] = i_6_ & 0xf;
		is[1] = i_6_ >> 4 & 0xf;
		for (int i_7_ = 0; i_7_ < 2; i_7_++) {
		    if (15 != is[i_7_])
			class518.aShortArray6009[is[i_7_]]
			    = (short) buffer.readUnsignedShort(-242337559);
		}
	    }
	    return class518;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("va.r(")
					  .append
					  (')').toString());
	}
    }
    
    static void method6163(Class430 class430, byte i) {
	try {
	    int i_8_ = (((Class430) class430).anIntArray4387
			[((((Class430) class430).anInt4376 -= -1390004513)
			  * 1632830751)]);
	    IComponentDefinitions iComponentDefinitions = Class95.method1101(i_8_, -638716674);
	    ((Class430) class430).anIntArray4387
		[((((Class430) class430).anInt4376 += -1390004513) * 1632830751
		  - 1)]
		= 843208871 * iComponentDefinitions.anInt1248;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("va.rt(")
					  .append
					  (')').toString());
	}
    }
    
    static void method6164(Class430 class430, byte i) {
	try {
	    Class330_Sub38 class330_sub38
		= Class325_Sub6.method3228(-1538388090);
	    if (class330_sub38 == null) {
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = -1;
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = -1;
	    } else {
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = class330_sub38.anInt7755 * -558904089;
		int i_9_ = (class330_sub38.anInt7751 * 1693642153 << 28
			    | (Class354.anInt3510
			       + class330_sub38.anInt7756 * -1917247207) << 14
			    | (779987703 * class330_sub38.anInt7753
			       + Class354.anInt3516));
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = i_9_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("va.aeb(")
					  .append
					  (')').toString());
	}
    }
    
    static boolean method6165(int i) {
	try {
	    return Class556.aClass562_6386 != null;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("va.i(")
					  .append
					  (')').toString());
	}
    }
}
