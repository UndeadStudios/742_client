/* Class330_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class330_Sub51 extends Class330
{
    int anInt7912;
    static int anInt7913 = 1;
    static int anInt7914 = 8;
    static int anInt7915 = 3;
    static int anInt7916 = 4;
    int anInt7917;
    boolean aBoolean7918;
    static int anInt7919 = 1;
    static int anInt7920 = 2;
    static int anInt7921 = 3;
    static int anInt7922 = 4;
    static int anInt7923 = 5;
    static int anInt7924 = 6;
    static int anInt7925 = 7;
    public int anInt7926;
    static int anInt7927 = 9;
    static int anInt7928 = 20;
    static int anInt7929 = 21;
    int anInt7930;
    static int anInt7931 = 4;
    static int anInt7932 = 22;
    static int anInt7933 = 23;
    static int anInt7934 = 2;
    static int anInt7935 = 3;
    int anInt7936;
    int anInt7937;
    String aString7938;
    int anInt7939;
    public int anInt7940;
    boolean aBoolean7941;
    int anInt7942;
    static int anInt7943 = 0;
    int anInt7944;
    public static int anInt7945 = 0;
    public int anInt7946;
    int anInt7947;
    String aString7948;
    static int anInt7949 = 6;
    String aString7950;
    String aString7951;
    int anInt7952;
    static int anInt7953 = 1;
    static int anInt7954 = 2;
    int anInt7955;
    String aString7956;
    String aString7957;
    int[] anIntArray7958 = new int[3];
    int anInt7959;
    
    void method3862(byte i) {
	try {
	    if (((Class330_Sub51) this).aString7948.length() > 40)
		((Class330_Sub51) this).aString7948
		    = ((Class330_Sub51) this).aString7948.substring(0, 40);
	    if (((Class330_Sub51) this).aString7938.length() > 40)
		((Class330_Sub51) this).aString7938
		    = ((Class330_Sub51) this).aString7938.substring(0, 40);
	    if (((Class330_Sub51) this).aString7950.length() > 10)
		((Class330_Sub51) this).aString7950
		    = ((Class330_Sub51) this).aString7950.substring(0, 10);
	    if (((Class330_Sub51) this).aString7951.length() > 10)
		((Class330_Sub51) this).aString7951
		    = ((Class330_Sub51) this).aString7951.substring(0, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("aer.r(")
					  .append
					  (')').toString());
	}
    }
    
    public void method3863(Buffer class330_sub46, int i) {
	try {
	    class330_sub46.addByte(6, (byte) 127);
	    class330_sub46.addByte((-493391781
				       * ((Class330_Sub51) this).anInt7912),
				      (byte) 20);
	    class330_sub46.addByte((((Class330_Sub51) this).aBoolean7918 ? 1
				       : 0),
				      (byte) 94);
	    class330_sub46.addByte((((Class330_Sub51) this).anInt7936
				       * -1696295171),
				      (byte) 46);
	    class330_sub46.addByte((-29529041
				       * ((Class330_Sub51) this).anInt7930),
				      (byte) 87);
	    class330_sub46.addByte(-1235770795 * anInt7926, (byte) 60);
	    class330_sub46.addByte((688728211
				       * ((Class330_Sub51) this).anInt7939),
				      (byte) 105);
	    class330_sub46.addByte(anInt7940 * 2083986933, (byte) 92);
	    class330_sub46.addByte((((Class330_Sub51) this).aBoolean7941 ? 1
				       : 0),
				      (byte) 87);
	    class330_sub46.addShort((404837255
				       * ((Class330_Sub51) this).anInt7942),
				      (byte) 23);
	    class330_sub46.addByte((1198430373
				       * ((Class330_Sub51) this).anInt7917),
				      (byte) 3);
	    class330_sub46.method3743(anInt7946 * -140064631, -1050205881);
	    class330_sub46.addShort((1696245795
				       * ((Class330_Sub51) this).anInt7947),
				      (byte) 92);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7948,
				      614248632);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7938,
				      400943458);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7950,
				      -764561767);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7951,
				      -692562270);
	    class330_sub46.addByte((((Class330_Sub51) this).anInt7937
				       * 430769571),
				      (byte) 53);
	    class330_sub46.addShort((-1249585143
				       * ((Class330_Sub51) this).anInt7952),
				      (byte) 78);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7956,
				      1964359268);
	    class330_sub46.method3794(((Class330_Sub51) this).aString7957,
				      -880009250);
	    class330_sub46.addByte((((Class330_Sub51) this).anInt7944
				       * -698350865),
				      (byte) 93);
	    class330_sub46.addByte((-390259173
				       * ((Class330_Sub51) this).anInt7955),
				      (byte) 92);
	    for (int i_0_ = 0;
		 i_0_ < ((Class330_Sub51) this).anIntArray7958.length; i_0_++)
		class330_sub46.addInt((((Class330_Sub51) this)
					   .anIntArray7958[i_0_]),
					  1965508160);
	    class330_sub46.addInt((((Class330_Sub51) this).anInt7959
				       * -871760447),
				      1965508160);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("aer.j(")
					  .append
					  (')').toString());
	}
    }
    
    public int method3864(int i) {
	try {
	    int i_1_ = 38;
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7948),
					     -1844058675);
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7938),
					     -1844058675);
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7950),
					     -1844058675);
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7951),
					     -1844058675);
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7956),
					     -1844058675);
	    i_1_ += Class158_Sub3.method1856((((Class330_Sub51) this)
					      .aString7957),
					     -1844058675);
	    return i_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("aer.i(")
					  .append
					  (')').toString());
	}
    }
    
    @SuppressWarnings("unchecked")
    public Class330_Sub51(boolean bool) {
	if (bool) {
	    if (Class212.aString6533.startsWith("win"))
		((Class330_Sub51) this).anInt7912 = 1343766483;
	    else if (Class212.aString6533.startsWith("mac"))
		((Class330_Sub51) this).anInt7912 = -1607434330;
	    else if (Class212.aString6533.startsWith("linux"))
		((Class330_Sub51) this).anInt7912 = -263667847;
	    else
		((Class330_Sub51) this).anInt7912 = 1080098636;
	    if (Class152.aString1629.startsWith("amd64")
		|| Class152.aString1629.startsWith("x86_64"))
		((Class330_Sub51) this).aBoolean7918 = true;
	    else
		((Class330_Sub51) this).aBoolean7918 = false;
	    if (1 == -493391781 * ((Class330_Sub51) this).anInt7912) {
		if (Class332.aString6629.indexOf("4.0") != -1)
		    ((Class330_Sub51) this).anInt7936 = -764758443;
		else if (Class332.aString6629.indexOf("4.1") != -1)
		    ((Class330_Sub51) this).anInt7936 = -1529516886;
		else if (Class332.aString6629.indexOf("4.9") != -1)
		    ((Class330_Sub51) this).anInt7936 = 2000691967;
		else if (Class332.aString6629.indexOf("5.0") != -1)
		    ((Class330_Sub51) this).anInt7936 = 1235933524;
		else if (Class332.aString6629.indexOf("5.1") != -1)
		    ((Class330_Sub51) this).anInt7936 = 471175081;
		else if (Class332.aString6629.indexOf("5.2") != -1)
		    ((Class330_Sub51) this).anInt7936 = -1823100248;
		else if (Class332.aString6629.indexOf("6.0") != -1)
		    ((Class330_Sub51) this).anInt7936 = -293583362;
		else if (Class332.aString6629.indexOf("6.1") != -1)
		    ((Class330_Sub51) this).anInt7936 = -1058341805;
		else if (Class332.aString6629.indexOf("6.2") != -1)
		    ((Class330_Sub51) this).anInt7936 = 1707108605;
	    } else if (2 == ((Class330_Sub51) this).anInt7912 * -493391781) {
		if (Class332.aString6629.indexOf("10.4") != -1)
		    ((Class330_Sub51) this).anInt7936 = 1884700324;
		else if (Class332.aString6629.indexOf("10.5") != -1)
		    ((Class330_Sub51) this).anInt7936 = 1119941881;
		else if (Class332.aString6629.indexOf("10.6") != -1)
		    ((Class330_Sub51) this).anInt7936 = 355183438;
		else if (Class332.aString6629.indexOf("10.7") != -1)
		    ((Class330_Sub51) this).anInt7936 = -409575005;
	    }
	    if (Class556.aString6391.toLowerCase().indexOf("sun") != -1)
		((Class330_Sub51) this).anInt7930 = -1136436529;
	    else if (Class556.aString6391.toLowerCase().indexOf("microsoft")
		     != -1)
		((Class330_Sub51) this).anInt7930 = 2022094238;
	    else if (Class556.aString6391.toLowerCase().indexOf("apple") != -1)
		((Class330_Sub51) this).anInt7930 = 885657709;
	    else
		((Class330_Sub51) this).anInt7930 = -250778820;
	    int i = 2;
	    int i_2_ = 0;
	    try {
		for (/**/; i < Class116.aString1375.length(); i++) {
		    int i_3_ = Class116.aString1375.charAt(i);
		    if (i_3_ < 48 || i_3_ > 57)
			break;
		    i_2_ = i_2_ * 10 + (i_3_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt7926 = -996652291 * i_2_;
	    i = Class116.aString1375.indexOf('.', 2) + 1;
	    i_2_ = 0;
	    try {
		for (/**/; i < Class116.aString1375.length(); i++) {
		    int i_4_ = Class116.aString1375.charAt(i);
		    if (i_4_ < 48 || i_4_ > 57)
			break;
		    i_2_ = i_2_ * 10 + (i_4_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((Class330_Sub51) this).anInt7939 = -1256835685 * i_2_;
	    i = Class116.aString1375.indexOf('_', 4) + 1;
	    i_2_ = 0;
	    try {
		for (/**/; i < Class116.aString1375.length(); i++) {
		    int i_5_ = Class116.aString1375.charAt(i);
		    if (i_5_ < 48 || i_5_ > 57)
			break;
		    i_2_ = i_2_ * 10 + (i_5_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    anInt7940 = 1959847517 * i_2_;
	    ((Class330_Sub51) this).aBoolean7941 = false;
	    ((Class330_Sub51) this).anInt7942 = Class332.anInt6617 * 983483151;
	    if (anInt7926 * -1235770795 > 3)
		((Class330_Sub51) this).anInt7917
		    = 1801415501 * Class332.anInt6637;
	    else
		((Class330_Sub51) this).anInt7917 = 0;
	    try {
		int[] is = HardwareInfo.getCPUInfo();
		if (is != null && is.length == 3) {
		    ((Class330_Sub51) this).anInt7944 = -955421681 * is[0];
		    ((Class330_Sub51) this).anInt7947 = is[1] * 1180125067;
		    anInt7946 = 1831939513 * is[2];
		}
		int[] is_6_ = HardwareInfo.getRawCPUInfo();
		if (null != is_6_ && 0 == is_6_.length % 5) {
		    HashMap hashmap = new HashMap();
		    for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
			int i_8_ = is_6_[5 * i_7_];
			int i_9_ = is_6_[5 * i_7_ + 1];
			int i_10_ = is_6_[2 + i_7_ * 5];
			int i_11_ = is_6_[i_7_ * 5 + 3];
			int i_12_ = is_6_[4 + i_7_ * 5];
			Class494 class494
			    = new Class494(i_8_, i_9_, i_10_, i_11_, i_12_);
			hashmap.put(Integer.valueOf(i_8_), class494);
		    }
		    Class494 class494
			= (Class494) hashmap.get(Integer.valueOf(0));
		    if (null != class494) {
			Buffer class330_sub46 = new Buffer(13);
			class330_sub46.method3813((1720525567
						   * (((Class494) class494)
						      .anInt5869)),
						  (byte) 17);
			class330_sub46.method3813((((Class494) class494)
						   .anInt5865) * -1025849121,
						  (byte) 103);
			class330_sub46.method3813((-1344249777
						   * (((Class494) class494)
						      .anInt5868)),
						  (byte) 53);
			class330_sub46.offset = 0;
			((Class330_Sub51) this).aString7956
			    = class330_sub46.readString(15527640);
		    }
		    Class494 class494_13_
			= (Class494) hashmap.get(Integer.valueOf(1));
		    if (class494_13_ != null) {
			((Class330_Sub51) this).anInt7959
			    = 704561501 * ((Class494) class494_13_).anInt5866;
			int i_14_
			    = 1720525567 * ((Class494) class494_13_).anInt5869;
			((Class330_Sub51) this).anInt7955
			    = -1065317357 * (i_14_ >> 16 & 0xff);
			((Class330_Sub51) this).anIntArray7958[0]
			    = (-1344249777
			       * ((Class494) class494_13_).anInt5868);
			((Class330_Sub51) this).anIntArray7958[1]
			    = (((Class494) class494_13_).anInt5865
			       * -1025849121);
		    }
		    Class494 class494_15_
			= (Class494) hashmap.get(Integer.valueOf(-2147483647));
		    if (class494_15_ != null)
			((Class330_Sub51) this).anIntArray7958[2]
			    = (((Class494) class494_15_).anInt5865
			       * -1025849121);
		    Buffer class330_sub46 = new Buffer(49);
		    for (int i_16_ = -2147483646; i_16_ <= -2147483644;
			 i_16_++) {
			Class494 class494_17_
			    = (Class494) hashmap.get(Integer.valueOf(i_16_));
			if (class494_17_ != null) {
			    class330_sub46.method3813((1450029085
						       * (((Class494)
							   class494_17_)
							  .anInt5866)),
						      (byte) 85);
			    class330_sub46.method3813((1720525567
						       * (((Class494)
							   class494_17_)
							  .anInt5869)),
						      (byte) 106);
			    class330_sub46.method3813((-1344249777
						       * (((Class494)
							   class494_17_)
							  .anInt5868)),
						      (byte) 124);
			    class330_sub46.method3813((-1025849121
						       * (((Class494)
							   class494_17_)
							  .anInt5865)),
						      (byte) 100);
			}
		    }
		    class330_sub46.offset = 0;
		    ((Class330_Sub51) this).aString7957
			= class330_sub46.readString(1243729550);
		}
		String[][] strings
		    = HardwareInfo.getDXDiagDisplayDevicesProps();
		if (null != strings && strings.length > 0
		    && strings[0] != null) {
		    for (int i_18_ = 0; i_18_ < strings[0].length;
			 i_18_ += 2) {
			if (strings[0][i_18_]
				.equalsIgnoreCase("szDescription"))
			    ((Class330_Sub51) this).aString7948
				= strings[0][1 + i_18_];
			else if (strings[0][i_18_].equalsIgnoreCase
				 ("szDriverDateEnglish")) {
			    String string = strings[0][i_18_ + 1];
			    try {
				int i_19_ = string.indexOf("/");
				int i_20_ = string.indexOf("/", i_19_ + 1);
				((Class330_Sub51) this).anInt7937
				    = ((Integer.parseInt
					(string.substring(0, i_19_)))
				       * 1180980747);
				((Class330_Sub51) this).anInt7952
				    = ((Integer.parseInt
					(string.substring
					 (1 + i_20_,
					  string.indexOf(" ", i_20_))))
				       * 59389497);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
		String[] strings_21_ = HardwareInfo.getDXDiagSystemProps();
		if (strings_21_ != null) {
		    String string = "";
		    String string_22_ = "";
		    String string_23_ = "";
		    for (int i_24_ = 0; i_24_ < strings_21_.length;
			 i_24_ += 2) {
			if (strings_21_[i_24_]
				.equalsIgnoreCase("dwDirectXVersionMajor"))
			    string = strings_21_[1 + i_24_];
			else if (strings_21_[i_24_].equalsIgnoreCase
				 ("dwDirectXVersionMinor"))
			    string_22_ = strings_21_[1 + i_24_];
			else if (strings_21_[i_24_].equalsIgnoreCase
				 ("dwDirectXVersionLetter"))
			    string_23_ = strings_21_[1 + i_24_];
		    }
		    ((Class330_Sub51) this).aString7950
			= new StringBuilder().append(string).append(".").append
			      (string_22_).append
			      (string_23_).toString();
		}
	    } catch (Throwable throwable) {
		anInt7946 = 0;
	    }
	}
	if (((Class330_Sub51) this).aString7948 == null)
	    ((Class330_Sub51) this).aString7948 = "";
	if (((Class330_Sub51) this).aString7938 == null)
	    ((Class330_Sub51) this).aString7938 = "";
	if (((Class330_Sub51) this).aString7950 == null)
	    ((Class330_Sub51) this).aString7950 = "";
	if (((Class330_Sub51) this).aString7951 == null)
	    ((Class330_Sub51) this).aString7951 = "";
	if (((Class330_Sub51) this).aString7956 == null)
	    ((Class330_Sub51) this).aString7956 = "";
	if (((Class330_Sub51) this).aString7957 == null)
	    ((Class330_Sub51) this).aString7957 = "";
	method3862((byte) 3);
    }
    
    static void method3865(Class430 class430, short i) {
	try {
	    int i_25_ = (((Class430) class430).anIntArray4387
			 [((((Class430) class430).anInt4376 -= -1390004513)
			   * 1632830751)]);
	    if (i_25_ < 0 || i_25_ > 1)
		i_25_ = 0;
	    Class243.method2411(1 == i_25_, -1537125612);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append
					  ("aer.akg(").append
					  (')').toString());
	}
    }
}
