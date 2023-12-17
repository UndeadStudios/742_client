/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class294
{
    static int anInt3007 = 7;
    static int anInt3008 = 14;
    static int anInt3009 = 6;
    int[][] anIntArrayArray3010;
    int anInt3011;
    int anInt3012;
    
    public short[] method2918(short[] is, int i) {
	try {
	    if (((Class294) this).anIntArrayArray3010 != null) {
		int i_0_
		    = 14 + (int) ((long) (((Class294) this).anInt3011
					  * 587587057)
				  * (long) is.length
				  / (long) (-1143685883
					    * ((Class294) this).anInt3012));
		int[] is_1_ = new int[i_0_];
		int i_2_ = 0;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
		    int i_5_ = is[i_4_];
		    int[] is_6_ = ((Class294) this).anIntArrayArray3010[i_3_];
		    for (int i_7_ = 0; i_7_ < 14; i_7_++)
			is_1_[i_7_ + i_2_] += i_5_ * is_6_[i_7_] >> 2;
		    i_3_ += 587587057 * ((Class294) this).anInt3011;
		    int i_8_
			= i_3_ / (-1143685883 * ((Class294) this).anInt3012);
		    i_2_ += i_8_;
		    i_3_ -= i_8_ * (-1143685883 * ((Class294) this).anInt3012);
		}
		is = new short[i_0_];
		for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		    int i_10_ = is_1_[i_9_] + 8192 >> 14;
		    if (i_10_ < -32768)
			is[i_9_] = (short) -32768;
		    else if (i_10_ > 32767)
			is[i_9_] = (short) 32767;
		    else
			is[i_9_] = (short) i_10_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.j(")
					  .append
					  (')').toString());
	}
    }
    
    int method2919(int i, int i_11_) {
	try {
	    if (((Class294) this).anIntArrayArray3010 != null)
		i = (int) ((long) (((Class294) this).anInt3011 * 587587057)
			   * (long) i
			   / (long) (((Class294) this).anInt3012
				     * -1143685883)) + 6;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.p(")
					  .append
					  (')').toString());
	}
    }
    
    byte[] method2920(byte[] is, byte i) {
	try {
	    if (null != ((Class294) this).anIntArrayArray3010) {
		int i_12_
		    = 14 + (int) ((long) is.length
				  * (long) (((Class294) this).anInt3011
					    * 587587057)
				  / (long) (-1143685883
					    * ((Class294) this).anInt3012));
		int[] is_13_ = new int[i_12_];
		int i_14_ = 0;
		int i_15_ = 0;
		for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
		    int i_17_ = is[i_16_];
		    int[] is_18_
			= ((Class294) this).anIntArrayArray3010[i_15_];
		    for (int i_19_ = 0; i_19_ < 14; i_19_++)
			is_13_[i_19_ + i_14_] += i_17_ * is_18_[i_19_];
		    i_15_ += ((Class294) this).anInt3011 * 587587057;
		    int i_20_
			= i_15_ / (-1143685883 * ((Class294) this).anInt3012);
		    i_14_ += i_20_;
		    i_15_
			-= i_20_ * (-1143685883 * ((Class294) this).anInt3012);
		}
		is = new byte[i_12_];
		for (int i_21_ = 0; i_21_ < i_12_; i_21_++) {
		    int i_22_ = 32768 + is_13_[i_21_] >> 16;
		    if (i_22_ < -128)
			is[i_21_] = (byte) -128;
		    else if (i_22_ > 127)
			is[i_21_] = (byte) 127;
		    else
			is[i_21_] = (byte) i_22_;
		}
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.r(")
					  .append
					  (')').toString());
	}
    }
    
    public Class294(int i, int i_23_) {
	if (i_23_ != i) {
	    int i_24_ = Class428.method5324(i, i_23_, 743404989);
	    i /= i_24_;
	    i_23_ /= i_24_;
	    ((Class294) this).anInt3012 = i * -1261729843;
	    ((Class294) this).anInt3011 = 1400468241 * i_23_;
	    ((Class294) this).anIntArrayArray3010 = new int[i][14];
	    for (int i_25_ = 0; i_25_ < i; i_25_++) {
		int[] is = ((Class294) this).anIntArrayArray3010[i_25_];
		double d = 6.0 + (double) i_25_ / (double) i;
		int i_26_ = (int) Math.floor(d - 7.0 + 1.0);
		if (i_26_ < 0)
		    i_26_ = 0;
		int i_27_ = (int) Math.ceil(7.0 + d);
		if (i_27_ > 14)
		    i_27_ = 14;
		double d_28_ = (double) i_23_ / (double) i;
		for (/**/; i_26_ < i_27_; i_26_++) {
		    double d_29_ = ((double) i_26_ - d) * 3.141592653589793;
		    double d_30_ = d_28_;
		    if (d_29_ < -1.0E-4 || d_29_ > 1.0E-4)
			d_30_ *= Math.sin(d_29_) / d_29_;
		    d_30_ *= 0.54 + 0.46 * Math.cos(0.2243994752564138
						    * ((double) i_26_ - d));
		    is[i_26_] = (int) Math.floor(0.5 + 65536.0 * d_30_);
		}
	    }
	}
    }
    
    int method2921(int i, int i_31_) {
	try {
	    if (((Class294) this).anIntArrayArray3010 != null)
		i = (int) ((long) (((Class294) this).anInt3011 * 587587057)
			   * (long) i
			   / (long) (((Class294) this).anInt3012
				     * -1143685883));
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.i(")
					  .append
					  (')').toString());
	}
    }
    
    public static Class144 method2922(int i, int i_32_) {
	try {
	    if (((Class144) Class144.aClass144_1572).anInt1575 * 1638740267
		== i)
		return Class144.aClass144_1572;
	    if (i
		== ((Class144) Class144.aClass144_1576).anInt1575 * 1638740267)
		return Class144.aClass144_1576;
	    if (((Class144) Class144.aClass144_1574).anInt1575 * 1638740267
		== i)
		return Class144.aClass144_1574;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.r(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2923(IComponentDefinitions iComponentDefinitions, Class120 class120,
                           Class430 class430, int i) {
	try {
	    iComponentDefinitions.anInt1232
		= (((Class430) class430).anIntArray4387
		   [((((Class430) class430).anInt4376 -= -1390004513)
		     * 1632830751)]) * -419306979;
	    Class404.method4738(iComponentDefinitions, 1970192974);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.fu(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2924(Class430 class430, int i) {
	try {
	    ((Class430) class430).anIntArray4387
		[((((Class430) class430).anInt4376 += -1390004513) * 1632830751
		  - 1)]
		= ((Class430) class430).aClass154_4391.aByte1645;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.xe(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2925(Class430 class430, byte i) {
	try {
	    if (null != client.aByteArray8959)
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = 1;
	    else
		((Class430) class430).anIntArray4387
		    [((((Class430) class430).anInt4376 += -1390004513)
		      * 1632830751) - 1]
		    = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.ajg(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2926(Class430 class430, int i) {
	try {
	    Class472.method5891((String) (((Class430) class430)
					  .anObjectArray4386
					  [(((Class430) class430).anInt4378
					    -= 2087905371) * -1378875437]),
				(byte) -82);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.ty(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2927(Class249 class249, boolean bool, float f,
			   float f_33_, float f_34_, float f_35_, int i,
			   int i_36_, int i_37_) {
	try {
	    int i_38_ = client.aClass304_9030.method2993(-194911978);
	    int i_39_ = client.aClass304_9030.method2992(1403532609);
	    class249.method2493(f, f_33_, f_34_, f_35_, (float) i_39_,
				(float) i_38_, (float) i, (float) i_36_);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.fx(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2928(String string, int i) {
	try {
	    client.aString9111 = string;
	    if (Class147.method1739((byte) -48) != Class331.aClass331_3343) {
		try {
		    String string_40_
			= Class293.anApplet6804.getParameter(Class219
							     .aClass219_2166
							     .aString2175);
		    String string_41_
			= Class293.anApplet6804.getParameter(Class219
							     .aClass219_2151
							     .aString2175);
		    String string_42_
			= new StringBuilder().append(string_40_).append
			      ("settings=").append
			      (string).append
			      ("; version=1; path=/; domain=").append
			      (string_41_).toString();
		    if (string.length() == 0)
			string_42_
			    = new StringBuilder().append(string_42_).append
				  ("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0")
				  .toString();
		    else
			string_42_
			    = new StringBuilder().append(string_42_).append
				  ("; Expires=").append
				  (OutgoingPacket.method2368
				   (Class312.method3111((byte) 115)
				    + 94608000000L))
				  .append
				  ("; Max-Age=").append
				  (94608000L).toString();
		    Class492.method6077(Class293.anApplet6804,
					new StringBuilder().append
					    ("document.cookie=\"").append
					    (string_42_).append
					    ("\"").toString(),
					-756985264);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.nf(")
					  .append
					  (')').toString());
	}
    }
    
    public static Class490 method2929(String string, String string_43_,
				      boolean bool, int i) {
	try {
	    File file = new File(Class60.aFile559, new StringBuilder().append
						       ("preferences").append
						       (string).append
						       (".dat").toString());
	    do {
		if (file.exists()) {
		    Class490 class490;
		    try {
			Class490 class490_44_
			    = new Class490(file, "rw", 10000L);
			class490 = class490_44_;
		    } catch (IOException ioexception) {
			break;
		    }
		    return class490;
		}
	    } while (false);
	    String string_45_ = "";
	    if (-2030411149 * Class330_Sub26_Sub1.anInt9571 == 33)
		string_45_ = "_rc";
	    else if (34 == Class330_Sub26_Sub1.anInt9571 * -2030411149)
		string_45_ = "_wip";
	    File file_46_
		= new File(Class291.aString2978,
			   new StringBuilder().append("jagex_").append
			       (string_43_).append
			       ("_preferences").append
			       (string).append
			       (string_45_).append
			       (".dat").toString());
	    do {
		if (!bool && file_46_.exists()) {
		    Class490 class490;
		    try {
			Class490 class490_47_
			    = new Class490(file_46_, "rw", 10000L);
			class490 = class490_47_;
		    } catch (IOException ioexception) {
			break;
		    }
		    return class490;
		}
	    } while (false);
	    Class490 class490;
	    try {
		Class490 class490_48_ = new Class490(file, "rw", 10000L);
		class490 = class490_48_;
	    } catch (IOException ioexception) {
		throw new RuntimeException();
	    }
	    return class490;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("mh.z(")
					  .append
					  (')').toString());
	}
    }
}
