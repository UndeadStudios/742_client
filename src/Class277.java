/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class277
{
    Class267 aClass267_2862;
    Class282_Sub1[] aClass282_Sub1Array2863;
    BigInteger aBigInteger2864;
    BigInteger aBigInteger2865;
    Class285 aClass285_2866;
    Buffer aClass330_Sub46_2867;
    Class330_Sub36_Sub16_Sub2 aClass330_Sub36_Sub16_Sub2_2868;
    
    public boolean method2731(int i) {
	try {
	    if (((Class277) this).aClass330_Sub46_2867 != null)
		return true;
	    if (((Class277) this).aClass330_Sub36_Sub16_Sub2_2868 == null) {
		if (((Class277) this).aClass285_2866.method2833((byte) 2))
		    return false;
		((Class277) this).aClass330_Sub36_Sub16_Sub2_2868
		    = ((Class277) this).aClass285_2866
			  .method2832(255, 255, (byte) 0, true, (byte) -51);
	    }
	    if (((Class330_Sub36_Sub16_Sub2)
		 ((Class277) this).aClass330_Sub36_Sub16_Sub2_2868)
		.aBoolean9721)
		return false;
	    Buffer class330_sub46
		= new Buffer(((Class277) this)
					 .aClass330_Sub36_Sub16_Sub2_2868
					 .method3511(356740128));
	    class330_sub46.offset = 1618004885;
	    int i_0_ = class330_sub46.readUnsignedByte(32868645);
	    class330_sub46.offset += i_0_ * 1824433864;
	    byte[] is = new byte[(class330_sub46.payload.length
				  - class330_sub46.offset * -824785231)];
	    class330_sub46.readBytes(is, 0, is.length, 1274334002);
	    byte[] is_1_;
	    if (null == ((Class277) this).aBigInteger2864
		|| ((Class277) this).aBigInteger2865 == null || Loader.rsaDisabled)
		is_1_ = is;
	    else {
		BigInteger biginteger = new BigInteger(is);
		BigInteger biginteger_2_
		    = biginteger.modPow(((Class277) this).aBigInteger2864,
					((Class277) this).aBigInteger2865);
		is_1_ = biginteger_2_.toByteArray();
	    }
	    if (is_1_.length != 65)
		throw new RuntimeException();
	    byte[] is_3_
		= Class562.method6473(class330_sub46.payload, 5,
				      (-824785231 * class330_sub46.offset
				       - is.length - 5),
				      (byte) -7);
	    for (int i_4_ = 0; i_4_ < 64; i_4_++) {
		if (is_3_[i_4_] != is_1_[i_4_ + 1])
		    throw new RuntimeException();
	    }
	    ((Class277) this).aClass330_Sub46_2867 = class330_sub46;
	    if (((Class277) this).aClass282_Sub1Array2863 == null)
		((Class277) this).aClass282_Sub1Array2863
		    = new Class282_Sub1[i_0_];
	    else {
		for (int i_5_ = 0;
		     i_5_ < ((Class277) this).aClass282_Sub1Array2863.length;
		     i_5_++) {
		    if (((Class277) this).aClass282_Sub1Array2863[i_5_]
			== null) {
			if (i != 946379215) {
			    /* empty */
			}
		    } else {
			((Class277) this).aClass330_Sub46_2867.offset
			    = 1941605862 + 1824433864 * i_5_;
			int i_6_ = ((Class277) this).aClass330_Sub46_2867
				       .readInt((byte) 88);
			int i_7_ = ((Class277) this).aClass330_Sub46_2867
				       .readInt((byte) 91);
			byte[] is_8_ = new byte[64];
			((Class277) this).aClass330_Sub46_2867
			    .readBytes(is_8_, 0, 64, 1274334002);
			((Class277) this).aClass282_Sub1Array2863[i_5_]
			    .method2824(i_6_, is_8_, i_7_, -269584475);
		    }
		}
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.r(")
					  .append
					  (')').toString());
	}
    }
    
    public Class282_Sub1 method2732(int i, Class339 class339,
				    Class339 class339_9_, short i_10_) {
	try {
	    return method2733(i, class339, class339_9_, true, -1856574829);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.j(")
					  .append
					  (')').toString());
	}
    }
    
    Class282_Sub1 method2733(int i, Class339 class339, Class339 class339_11_,
			     boolean bool, int i_12_) {
	try {
	    if (null == ((Class277) this).aClass330_Sub46_2867)
		throw new RuntimeException();
	    if (i < 0 || i >= ((Class277) this).aClass282_Sub1Array2863.length)
		throw new RuntimeException();
	    if (null != ((Class277) this).aClass282_Sub1Array2863[i])
		return ((Class277) this).aClass282_Sub1Array2863[i];
	    ((Class277) this).aClass330_Sub46_2867.offset
		= 1941605862 + 1824433864 * i;
	    int i_13_ = ((Class277) this).aClass330_Sub46_2867
			    .readInt((byte) 121);
	    int i_14_
		= ((Class277) this).aClass330_Sub46_2867.readInt((byte) 26);
	    byte[] is = new byte[64];
	    ((Class277) this).aClass330_Sub46_2867.readBytes(is, 0, 64,
							      1274334002);
	    Class282_Sub1 class282_sub1
		= new Class282_Sub1(i, class339, class339_11_,
				    ((Class277) this).aClass285_2866,
				    ((Class277) this).aClass267_2862, i_13_,
				    is, i_14_, bool);
	    ((Class277) this).aClass282_Sub1Array2863[i] = class282_sub1;
	    return class282_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.i(")
					  .append
					  (')').toString());
	}
    }
    
    public void method2734(int i) {
	try {
	    if (null != ((Class277) this).aClass282_Sub1Array2863) {
		for (int i_15_ = 0;
		     i_15_ < ((Class277) this).aClass282_Sub1Array2863.length;
		     i_15_++) {
		    if (((Class277) this).aClass282_Sub1Array2863[i_15_]
			!= null)
			((Class277) this).aClass282_Sub1Array2863[i_15_]
			    .method2815(-754236084);
		}
		for (int i_16_ = 0;
		     i_16_ < ((Class277) this).aClass282_Sub1Array2863.length;
		     i_16_++) {
		    if (null
			!= ((Class277) this).aClass282_Sub1Array2863[i_16_])
			((Class277) this).aClass282_Sub1Array2863[i_16_]
			    .method2816((byte) 125);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.p(")
					  .append
					  (')').toString());
	}
    }
    
    public Class277(Class285 class285, Class267 class267,
		    BigInteger biginteger, BigInteger biginteger_17_) {
	((Class277) this).aClass285_2866 = class285;
	((Class277) this).aClass267_2862 = class267;
	((Class277) this).aBigInteger2864 = biginteger;
	((Class277) this).aBigInteger2865 = biginteger_17_;
	if (!((Class277) this).aClass285_2866.method2833((byte) 2))
	    ((Class277) this).aClass330_Sub36_Sub16_Sub2_2868
		= ((Class277) this).aClass285_2866
		      .method2832(255, 255, (byte) 0, true, (byte) -25);
    }
    
    static void method2735(Class430 class430, int i) {
	try {
	    ((Class430) class430).anInt4376 -= 1514958270;
	    if ((((Class430) class430).anIntArray4387
		 [((Class430) class430).anInt4376 * 1632830751])
		== (((Class430) class430).anIntArray4387
		    [1 + ((Class430) class430).anInt4376 * 1632830751]))
		((Class430) class430).anInt4397
		    += (1996761881
			* (((Class430) class430).anIntArray4394
			   [((Class430) class430).anInt4397 * -54918871]));
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.v(")
					  .append
					  (')').toString());
	}
    }
    
    static Class124[] method2736(int i) {
	try {
	    return (new Class124[]
		    { Class124.aClass124_1426, Class124.aClass124_1427,
		      Class124.aClass124_1437, Class124.aClass124_1430,
		      Class124.aClass124_1438, Class124.aClass124_1431,
		      Class124.aClass124_1413, Class124.aClass124_1449,
		      Class124.aClass124_1410, Class124.aClass124_1416,
		      Class124.aClass124_1425, Class124.aClass124_1439,
		      Class124.aClass124_1419, Class124.aClass124_1432,
		      Class124.aClass124_1422, Class124.aClass124_1433,
		      Class124.aClass124_1412, Class124.aClass124_1423,
		      Class124.aClass124_1417, Class124.aClass124_1442,
		      Class124.aClass124_1440, Class124.aClass124_1424,
		      Class124.aClass124_1447, Class124.aClass124_1421,
		      Class124.aClass124_1418, Class124.aClass124_1444,
		      Class124.aClass124_1415, Class124.aClass124_1429,
		      Class124.aClass124_1414, Class124.aClass124_1441,
		      Class124.aClass124_1411, Class124.aClass124_1446,
		      Class124.aClass124_1435, Class124.aClass124_1445,
		      Class124.aClass124_1434, Class124.aClass124_1428,
		      Class124.aClass124_1443, Class124.aClass124_1436 });
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("ln.r(")
					  .append
					  (')').toString());
	}
    }
}
