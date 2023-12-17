/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class280
{
    Class278 aClass278_2892 = null;
    static int anInt2893;
    Object[][] anObjectArrayArray2894;
    static Class557 aClass557_2895 = new Class557();
    boolean aBoolean2896;
    static int anInt2897 = 0;
    public static int anInt2898 = 1;
    public static int anInt2899 = 2;
    static int anInt2900 = 1;
    Class282 aClass282_2901;
    static int anInt2902 = 0;
    int anInt2903;
    static boolean aBoolean2904 = false;
    Object[] anObjectArray2905;
    public static int anInt2906;
    public static short[] aShortArray2907;
    public static int anInt2908;
    
    public synchronized boolean method2750(int i, int i_0_) {
	try {
	    if (!method2751(1884642756))
		return false;
	    if ((((Class278) ((Class280) this).aClass278_2892)
		 .anIntArray2885).length
		== 1)
		return method2757(0, i, (byte) 32);
	    if (!method2779(i, (byte) -26))
		return false;
	    if (((Class278) ((Class280) this).aClass278_2892).anIntArray2885[i]
		== 1)
		return method2757(i, 0, (byte) 32);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.n(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized boolean method2751(int i) {
	try {
	    if (((Class280) this).aClass278_2892 == null) {
		((Class280) this).aClass278_2892
		    = ((Class280) this).aClass282_2901.method2804((byte) 67);
		if (null == ((Class280) this).aClass278_2892)
		    return false;
		((Class280) this).anObjectArray2905
		    = new Object[1334516995 * (((Class278) (((Class280) this)
							    .aClass278_2892))
					       .anInt2877)];
		((Class280) this).anObjectArrayArray2894
		    = new Object[(((Class278) ((Class280) this).aClass278_2892)
				  .anInt2877) * 1334516995][];
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.r(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2752(int i) {
	try {
	    if (!method2751(1054241968))
		throw new IllegalStateException("");
	    return (((Class278) ((Class280) this).aClass278_2892).anInt2870
		    * 1411825511);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.j(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized boolean method2753(int i, int i_1_, int i_2_) {
	try {
	    if (!method2751(-430164606))
		return true;
	    if (i < 0 || i_1_ < 0
		|| i >= (((Class278) ((Class280) this).aClass278_2892)
			 .anIntArray2885).length
		|| i_1_ >= (((Class278) ((Class280) this).aClass278_2892)
			    .anIntArray2885[i])) {
		if (aBoolean2904)
		    throw new IllegalArgumentException(new StringBuilder()
							   .append
							   (i).append
							   (" ").append
							   (i_1_).toString());
		return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.p(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2754(String string, int i) {
	try {
	    if (!method2751(-1173090533))
		return -1;
	    string = string.toLowerCase();
	    int i_3_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, 1858648396), -1415967906));
	    if (!method2779(i_3_, (byte) 2))
		return -1;
	    return i_3_;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.m(")
					  .append
					  (')').toString());
	}
    }
    
    void method2755(int i, byte i_4_) {
	try {
	    ((Class280) this).aClass282_2901.method2796(i, 1043199040);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.s(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized byte[] method2756(int i, int i_5_, int[] is,
					  int i_6_) {
	try {
	    if (method2753(i, i_5_, 2147154397))
		return null;
	    byte[] is_7_ = null;
	    if (null == ((Class280) this).anObjectArrayArray2894[i]
		|| null == ((Class280) this).anObjectArrayArray2894[i][i_5_]) {
		boolean bool = method2766(i, i_5_, is, -375084581);
		if (!bool) {
		    method2776(i, (byte) 73);
		    bool = method2766(i, i_5_, is, -1628993049);
		    if (!bool)
			return null;
		}
	    }
	    if (((Class280) this).anObjectArrayArray2894[i] == null)
		throw new RuntimeException("");
	    if (null == ((Class280) this).anObjectArrayArray2894[i][i_5_]) {
		if (i_6_ <= -2031137038)
		    throw new IllegalStateException();
	    } else {
		is_7_ = Class400.method4707((((Class280) this)
					     .anObjectArrayArray2894[i][i_5_]),
					    false, -1360507949);
		if (is_7_ == null)
		    throw new RuntimeException("");
	    }
	    if (null != is_7_) {
		if (1 == ((Class280) this).anInt2903 * -1572544573) {
		    ((Class280) this).anObjectArrayArray2894[i][i_5_] = null;
		    if ((((Class278) ((Class280) this).aClass278_2892)
			 .anIntArray2885[i])
			== 1)
			((Class280) this).anObjectArrayArray2894[i] = null;
		} else if (-1572544573 * ((Class280) this).anInt2903 == 2)
		    ((Class280) this).anObjectArrayArray2894[i] = null;
	    }
	    return is_7_;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.z(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized boolean method2757(int i, int i_8_, byte i_9_) {
	try {
	    if (method2753(i, i_8_, 2126514523))
		return false;
	    if (null != ((Class280) this).anObjectArrayArray2894[i]
		&& ((Class280) this).anObjectArrayArray2894[i][i_8_] != null)
		return true;
	    if (null != ((Class280) this).anObjectArray2905[i])
		return true;
	    method2776(i, (byte) 18);
	    if (((Class280) this).anObjectArray2905[i] != null)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.w(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized boolean method2758(byte i) {
	try {
	    if (!method2751(-1659304119))
		return false;
	    boolean bool = true;
	    for (int i_10_ = 0;
		 i_10_ < (((Class278) ((Class280) this).aClass278_2892)
			  .anIntArray2869).length;
		 i_10_++) {
		int i_11_ = (((Class278) ((Class280) this).aClass278_2892)
			     .anIntArray2869[i_10_]);
		if (((Class280) this).anObjectArray2905[i_11_] == null) {
		    method2776(i_11_, (byte) 58);
		    if (null == ((Class280) this).anObjectArray2905[i_11_])
			bool = false;
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.b(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized int method2759(int i, int i_12_) {
	try {
	    if (!method2779(i, (byte) -86))
		return 0;
	    if (null != ((Class280) this).anObjectArray2905[i])
		return 100;
	    return ((Class280) this).aClass282_2901.method2797(i, (short) 255);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.k(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized int method2760(byte i) {
	try {
	    if (!method2751(1564780716))
		return 0;
	    int i_13_ = 0;
	    int i_14_ = 0;
	    for (int i_15_ = 0;
		 i_15_ < ((Class280) this).anObjectArray2905.length; i_15_++) {
		if ((((Class278) ((Class280) this).aClass278_2892)
		     .anIntArray2872[i_15_])
		    > 0) {
		    i_13_ += 100;
		    i_14_ += method2759(i_15_, -1626968450);
		}
	    }
	    if (i_13_ == 0)
		return 100;
	    int i_16_ = 100 * i_14_ / i_13_;
	    return i_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.q(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized byte[] method2761(int i, int i_17_) {
	try {
	    if (!method2751(-1773582883))
		return null;
	    if ((((Class278) ((Class280) this).aClass278_2892)
		 .anIntArray2885).length
		== 1)
		return method2771(0, i, (byte) 101);
	    if (!method2779(i, (byte) -35))
		return null;
	    if (((Class278) ((Class280) this).aClass278_2892).anIntArray2885[i]
		== 1)
		return method2771(i, 0, (byte) 101);
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.u(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized int[] method2762(int i, byte i_18_) {
	try {
	    if (!method2779(i, (byte) -108))
		return null;
	    int[] is = (((Class278) ((Class280) this).aClass278_2892)
			.anIntArrayArray2882[i]);
	    if (null == is) {
		is = new int[(((Class278) ((Class280) this).aClass278_2892)
			      .anIntArray2872[i])];
		for (int i_19_ = 0; i_19_ < is.length; i_19_++)
		    is[i_19_] = i_19_;
	    }
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.x(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2763(int i, int i_20_) {
	try {
	    if (!method2779(i, (byte) -84))
		return 0;
	    return (((Class278) ((Class280) this).aClass278_2892)
		    .anIntArray2885[i]);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.g(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2764(int i) {
	try {
	    if (!method2751(964798636))
		return -1;
	    return (((Class278) ((Class280) this).aClass278_2892)
		    .anIntArray2885).length;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.d(")
					  .append
					  (')').toString());
	}
    }
    
    public Class280(Class282 class282, boolean bool, int i) {
	if (i < 0 || i > 2)
	    throw new IllegalArgumentException("");
	((Class280) this).aClass282_2901 = class282;
	((Class280) this).aBoolean2896 = bool;
	((Class280) this).anInt2903 = i * 487426283;
    }
    
    public void method2765(boolean bool, boolean bool_21_, int i) {
	try {
	    if (method2751(-1724322873)) {
		if (bool) {
		    ((Class278) ((Class280) this).aClass278_2892)
			.anIntArray2875
			= null;
		    ((Class278) ((Class280) this).aClass278_2892)
			.aClass139_2871
			= null;
		}
		if (bool_21_) {
		    ((Class278) ((Class280) this).aClass278_2892)
			.anIntArrayArray2876
			= null;
		    ((Class278) ((Class280) this).aClass278_2892)
			.aClass139Array2884
			= null;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.a(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized boolean method2766(int i, int i_22_, int[] is, int i_23_) {
	try {
	    if (!method2779(i, (byte) -67))
		return false;
	    if (((Class280) this).anObjectArray2905[i] == null)
		return false;
	    int i_24_ = (((Class278) ((Class280) this).aClass278_2892)
			 .anIntArray2872[i]);
	    int[] is_25_ = (((Class278) ((Class280) this).aClass278_2892)
			    .anIntArrayArray2882[i]);
	    if (((Class280) this).anObjectArrayArray2894[i] == null)
		((Class280) this).anObjectArrayArray2894[i]
		    = new Object[(((Class278) ((Class280) this).aClass278_2892)
				  .anIntArray2885[i])];
	    Object[] objects = ((Class280) this).anObjectArrayArray2894[i];
	    boolean bool = true;
	    for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
		int i_27_;
		if (is_25_ == null)
		    i_27_ = i_26_;
		else
		    i_27_ = is_25_[i_26_];
		if (objects[i_27_] == null) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	    byte[] is_28_;
	    if (null != is
		&& (is[0] != 0 || 0 != is[1] || is[2] != 0 || is[3] != 0)) {
		is_28_ = Class400.method4707((((Class280) this)
					      .anObjectArray2905[i]),
					     true, -1652939279);
		Buffer class330_sub46 = new Buffer(is_28_);
		class330_sub46.method3805(is, 5,
					  class330_sub46.payload.length,
					  (byte) 12);
	    } else
		is_28_ = Class400.method4707((((Class280) this)
					      .anObjectArray2905[i]),
					     false, 510039995);
	    byte[] is_29_;
	    try {
		is_29_ = Class143.method1659(is_28_, (short) -27440);
	    } catch (RuntimeException runtimeexception) {
		throw Class476.method5964
			  (runtimeexception,
			   new StringBuilder().append(null != is).append
			       (" ").append
			       (i).append
			       (" ").append
			       (is_28_.length).append
			       (" ").append
			       (Class125.method1528(is_28_, is_28_.length,
						    270291308))
			       .append
			       (" ").append
			       (Class125.method1528(is_28_, is_28_.length - 2,
						    -508790943))
			       .append
			       (" ").append
			       (((Class278) ((Class280) this).aClass278_2892)
				.anIntArray2878[i])
			       .append
			       (" ").append
			       ((((Class278) ((Class280) this).aClass278_2892)
				 .anInt2870) * 1411825511)
			       .toString());
	    }
	    if (((Class280) this).aBoolean2896)
		((Class280) this).anObjectArray2905[i] = null;
	    if (i_24_ > 1) {
		if (-1572544573 * ((Class280) this).anInt2903 != 2) {
		    int i_30_ = is_29_.length;
		    int i_31_ = is_29_[--i_30_] & 0xff;
		    i_30_ -= i_31_ * i_24_ * 4;
		    Buffer class330_sub46 = new Buffer(is_29_);
		    int[] is_32_ = new int[i_24_];
		    class330_sub46.offset = i_30_ * 323600977;
		    for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
			int i_34_ = 0;
			for (int i_35_ = 0; i_35_ < i_24_; i_35_++) {
			    i_34_ += class330_sub46.readInt((byte) 126);
			    is_32_[i_35_] += i_34_;
			}
		    }
		    byte[][] is_36_ = new byte[i_24_][];
		    for (int i_37_ = 0; i_37_ < i_24_; i_37_++) {
			is_36_[i_37_] = new byte[is_32_[i_37_]];
			is_32_[i_37_] = 0;
		    }
		    class330_sub46.offset = i_30_ * 323600977;
		    int i_38_ = 0;
		    for (int i_39_ = 0; i_39_ < i_31_; i_39_++) {
			int i_40_ = 0;
			for (int i_41_ = 0; i_41_ < i_24_; i_41_++) {
			    i_40_ += class330_sub46.readInt((byte) 120);
			    System.arraycopy(is_29_, i_38_, is_36_[i_41_],
					     is_32_[i_41_], i_40_);
			    is_32_[i_41_] += i_40_;
			    i_38_ += i_40_;
			}
		    }
		    for (int i_42_ = 0; i_42_ < i_24_; i_42_++) {
			int i_43_;
			if (null == is_25_)
			    i_43_ = i_42_;
			else
			    i_43_ = is_25_[i_42_];
			if (((Class280) this).anInt2903 * -1572544573 == 0)
			    objects[i_43_]
				= Class433.method5557(is_36_[i_42_], false,
						      (byte) 5);
			else
			    objects[i_43_] = is_36_[i_42_];
		    }
		} else {
		    int i_44_ = is_29_.length;
		    int i_45_ = is_29_[--i_44_] & 0xff;
		    i_44_ -= 4 * (i_24_ * i_45_);
		    Buffer class330_sub46 = new Buffer(is_29_);
		    int i_46_ = 0;
		    int i_47_ = 0;
		    class330_sub46.offset = 323600977 * i_44_;
		    for (int i_48_ = 0; i_48_ < i_45_; i_48_++) {
			int i_49_ = 0;
			for (int i_50_ = 0; i_50_ < i_24_; i_50_++) {
			    i_49_ += class330_sub46.readInt((byte) 83);
			    int i_51_;
			    if (null == is_25_)
				i_51_ = i_50_;
			    else
				i_51_ = is_25_[i_50_];
			    if (i_51_ == i_22_) {
				i_46_ += i_49_;
				i_47_ = i_51_;
			    }
			}
		    }
		    if (0 == i_46_)
			return true;
		    byte[] is_52_ = new byte[i_46_];
		    i_46_ = 0;
		    class330_sub46.offset = i_44_ * 323600977;
		    int i_53_ = 0;
		    for (int i_54_ = 0; i_54_ < i_45_; i_54_++) {
			int i_55_ = 0;
			for (int i_56_ = 0; i_56_ < i_24_; i_56_++) {
			    i_55_ += class330_sub46.readInt((byte) 108);
			    int i_57_;
			    if (is_25_ == null)
				i_57_ = i_56_;
			    else
				i_57_ = is_25_[i_56_];
			    if (i_57_ == i_22_) {
				System.arraycopy(is_29_, i_53_, is_52_, i_46_,
						 i_55_);
				i_46_ += i_55_;
			    }
			    i_53_ += i_55_;
			}
		    }
		    objects[i_47_] = is_52_;
		}
	    } else {
		int i_58_;
		if (is_25_ == null)
		    i_58_ = 0;
		else
		    i_58_ = is_25_[0];
		if (0 == ((Class280) this).anInt2903 * -1572544573)
		    objects[i_58_]
			= Class433.method5557(is_29_, false, (byte) -15);
		else
		    objects[i_58_] = is_29_;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.e(")
					  .append
					  (')').toString());
	}
    }
    
    boolean method2767(String string, String string_59_, byte i) {
	try {
	    if (!method2751(-1564513768))
		return false;
	    string = string.toLowerCase();
	    string_59_ = string_59_.toLowerCase();
	    int i_60_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, 1223612190), -1415967906));
	    if (!method2779(i_60_, (byte) -39))
		return false;
	    int i_61_ = (((Class278) ((Class280) this).aClass278_2892)
			     .aClass139Array2884[i_60_].method1607
			 (Class331.method3877(string_59_, -1901934757),
			  -1415967906));
	    return method2757(i_60_, i_61_, (byte) 32);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.ay(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2768(int i, byte i_62_) {
	try {
	    if (!method2751(-1829123442))
		return -1;
	    int i_63_ = ((Class278) ((Class280) this).aClass278_2892)
			    .aClass139_2871.method1607(i, -1415967906);
	    if (!method2779(i_63_, (byte) -30))
		return -1;
	    return i_63_;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.t(")
					  .append
					  (')').toString());
	}
    }
    
    public boolean method2769(String string, int i) {
	try {
	    if (!method2751(-1664003481))
		return false;
	    string = string.toLowerCase();
	    int i_64_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, -2098884120), -1415967906));
	    if (i_64_ < 0)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.h(")
					  .append
					  (')').toString());
	}
    }
    
    public boolean method2770(String string, String string_65_, int i) {
	try {
	    if (!method2751(-531547607))
		return true;
	    string = string.toLowerCase();
	    string_65_ = string_65_.toLowerCase();
	    int i_66_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, 1595885880), -1415967906));
	    if (i_66_ < 0)
		return true;
	    int i_67_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139Array2884[i_66_].method1607
		   (Class331.method3877(string_65_, 1020519540), -1415967906));
	    if (i_67_ < 0)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.y(")
					  .append
					  (')').toString());
	}
    }
    //file system
    public byte[] method2771(int i, int i_68_, byte i_69_) {
	try {
	    return method2756(i, i_68_, null, -1243515290);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.f(")
					  .append
					  (')').toString());
	}
    }
    
    public boolean method2772(String string, int i) {
	try {
	    int i_70_ = method2754("", 323600977);
	    if (i_70_ != -1)
		return method2767("", string, (byte) -43);
	    return method2767(string, "", (byte) -15);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.ac(")
					  .append
					  (')').toString());
	}
    }
    
    public boolean method2773(String string, int i) {
	try {
	    if (!method2751(-711832092))
		return false;
	    string = string.toLowerCase();
	    int i_71_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, 1383567305), -1415967906));
	    return method2777(i_71_, (byte) -97);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.al(")
					  .append
					  (')').toString());
	}
    }
    
    public void method2774(String string, int i) {
	try {
	    if (method2751(-84466128)) {
		string = string.toLowerCase();
		int i_72_
		    = (((Class278) ((Class280) this).aClass278_2892)
			   .aClass139_2871.method1607
		       (Class331.method3877(string, -172104390), -1415967906));
		method2755(i_72_, (byte) 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.at(")
					  .append
					  (')').toString());
	}
    }
    
    public int method2775(String string, byte i) {
	try {
	    if (!method2751(-123675123))
		return 0;
	    string = string.toLowerCase();
	    int i_73_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, -31137284), -1415967906));
	    return method2759(i_73_, -1906319716);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.aw(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized void method2776(int i, byte i_74_) {
	try {
	    if (((Class280) this).aBoolean2896)
		((Class280) this).anObjectArray2905[i]
		    = ((Class280) this).aClass282_2901.method2801(i,
								  (byte) 90);
	    else
		((Class280) this).anObjectArray2905[i]
		    = Class433.method5557(((Class280) this).aClass282_2901
					      .method2801(i, (byte) 56),
					  false, (byte) 67);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.o(")
					  .append
					  (')').toString());
	}
    }
    
    static {
	anInt2893 = 0;
    }
    
    public synchronized boolean method2777(int i, byte i_75_) {
	try {
	    if (!method2779(i, (byte) -13))
		return false;
	    if (((Class280) this).anObjectArray2905[i] != null)
		return true;
	    method2776(i, (byte) 109);
	    if (null != ((Class280) this).anObjectArray2905[i])
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.l(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized void method2778(int i, byte i_76_) {
	try {
	    if (method2779(i, (byte) -23)) {
		if (null != ((Class280) this).anObjectArrayArray2894)
		    ((Class280) this).anObjectArrayArray2894[i] = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.c(")
					  .append
					  (')').toString());
	}
    }
    
    synchronized boolean method2779(int i, byte i_77_) {
	try {
	    if (!method2751(580462342))
		return false;
	    if (i < 0
		|| i >= (((Class278) ((Class280) this).aClass278_2892)
			 .anIntArray2885).length
		|| (((Class278) ((Class280) this).aClass278_2892)
		    .anIntArray2885[i]) == 0) {
		if (aBoolean2904)
		    throw new IllegalArgumentException(Integer.toString(i));
		return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.i(")
					  .append
					  (')').toString());
	}
    }
    
    public synchronized byte[] method2780(String string, String string_78_,
					  int i) {
	try {
	    if (!method2751(-316795192))
		return null;
	    string = string.toLowerCase();
	    string_78_ = string_78_.toLowerCase();
	    int i_79_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139_2871.method1607
		   (Class331.method3877(string, -165127418), -1415967906));
	    if (!method2779(i_79_, (byte) -120))
		return null;
	    int i_80_
		= (((Class278) ((Class280) this).aClass278_2892)
		       .aClass139Array2884[i_79_].method1607
		   (Class331.method3877(string_78_, 2065637621), -1415967906));
	    return method2771(i_79_, i_80_, (byte) 101);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.v(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2781(Class430 class430, int i) {
	try {
	    int i_81_ = (((Class430) class430).anIntArray4387
			 [((((Class430) class430).anInt4376 -= -1390004513)
			   * 1632830751)]);
	    IComponentDefinitions iComponentDefinitions = Class95.method1101(i_81_, 1966504884);
	    Class120 class120 = Class3.aClass120Array56[i_81_ >> 16];
	    Class196.method2146(iComponentDefinitions, class120, class430, (byte) -86);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.dg(")
					  .append
					  (')').toString());
	}
    }
    
    static void method2782(IComponentDefinitions iComponentDefinitions, Class120 class120,
                           Class430 class430, int i) {
	try {
	    String string = (String) (((Class430) class430).anObjectArray4386
				      [(((Class430) class430).anInt4378
					-= 2087905371) * -1378875437]);
	    if (Class278.method2740(string, class430, (byte) 0) != null)
		string = string.substring(0, string.length() - 1);
	    iComponentDefinitions.anObjectArray1175
		= Class288.method2886(string, class430, 1322426201);
	    iComponentDefinitions.aBoolean1293 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.no(")
					  .append
					  (')').toString());
	}
    }
    
    public static boolean method2783(int i, String string, int i_82_) {
	try {
	    Class507.aClass498_5930 = new Class498();
	    Class507.aClass498_5930.anInt5889 = -1143720213 * i;
	    Class507.aClass498_5930.aString5886 = string;
	    if (Class457.aClass457_6834 != Class404.aClass457_4162) {
		Class507.aClass498_5930.anInt5887
		    = (Class507.aClass498_5930.anInt5889 * 116751407
		       + 1405932864);
		Class507.aClass498_5930.anInt5885
		    = (-1149535984
		       + 523924231 * Class507.aClass498_5930.anInt5889);
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("lq.j(")
					  .append
					  (')').toString());
	}
    }
}
