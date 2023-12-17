/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class386
{
    static int anInt3987 = 7;
    static int anInt3988 = 63;
    public static Class524 aClass524_3989;
    
    Class386() throws Throwable {
	throw new Error();
    }
    
    public static Class136 method4430(int i, byte i_0_) {
	try {
	    if (1277923993 * ((Class136) Class136.aClass136_1524).anInt1522
		== i)
		return Class136.aClass136_1524;
	    if (i
		== 1277923993 * ((Class136) Class136.aClass136_1523).anInt1522)
		return Class136.aClass136_1523;
	    if (1277923993 * ((Class136) Class136.aClass136_1525).anInt1522
		== i)
		return Class136.aClass136_1525;
	    if (((Class136) Class136.aClass136_1526).anInt1522 * 1277923993
		== i)
		return Class136.aClass136_1526;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.r(").append
					  (')').toString());
	}
    }
    
    public static IncomingPacket[] method4431(int i) {
	try {
	    return (new IncomingPacket[]
		    { IncomingPacket.switchWindowPane, IncomingPacket.aClass222_2193,
		      IncomingPacket.sendMessage, IncomingPacket.aClass222_2190,
		      IncomingPacket.sendStat, IncomingPacket.aClass222_2241,
		      IncomingPacket.sendCoords, IncomingPacket.aClass222_2194,
		      IncomingPacket.aClass222_2195, IncomingPacket.aClass222_2230,
		      IncomingPacket.sendConfig1, IncomingPacket.aClass222_2198,
		      IncomingPacket.sendPing, IncomingPacket.aClass222_2255,
		      IncomingPacket.aClass222_2201, IncomingPacket.aClass222_2213,
		      IncomingPacket.aClass222_2203, IncomingPacket.sendAnimateInterface,
		      IncomingPacket.aClass222_2308, IncomingPacket.aClass222_2206,
		      IncomingPacket.aClass222_2207, IncomingPacket.aClass222_2328,
		      IncomingPacket.sendGlobalConfig1, IncomingPacket.sendFriendsChat,
		      IncomingPacket.aClass222_2211, IncomingPacket.aClass222_2290,
		      IncomingPacket.aClass222_2191, IncomingPacket.aClass222_2247,
		      IncomingPacket.aClass222_2215, IncomingPacket.sendClientScript,
		      IncomingPacket.sendGroundItem, IncomingPacket.aClass222_2325,
		      IncomingPacket.aClass222_2219, IncomingPacket.aClass222_2236,
		      IncomingPacket.aClass222_2188, IncomingPacket.aClass222_2222,
		      IncomingPacket.aClass222_2223, IncomingPacket.aClass222_2304,
		      IncomingPacket.aClass222_2343, IncomingPacket.aClass222_2251,
		      IncomingPacket.aClass222_2227, IncomingPacket.aClass222_2228,
		      IncomingPacket.sendItemOnInterface, IncomingPacket.sendCreateObject,
		      IncomingPacket.aClass222_2208, IncomingPacket.sendWindowPane,
		      IncomingPacket.aClass222_2233, IncomingPacket.sendInterface,
		      IncomingPacket.aClass222_2235, IncomingPacket.sendPlayerOnInterface,
		      IncomingPacket.sendGlobalString1, IncomingPacket.aClass222_2238,
		      IncomingPacket.aClass222_2239, IncomingPacket.aClass222_2221,
		      IncomingPacket.aClass222_2197, IncomingPacket.sendGlobalString2,
		      IncomingPacket.aClass222_2243, IncomingPacket.sendPublicChat,
		      IncomingPacket.aClass222_2224, IncomingPacket.aClass222_2225,
		      IncomingPacket.aClass222_2293, IncomingPacket.sendURL,
		      IncomingPacket.aClass222_2249, IncomingPacket.aClass222_2229,
		      IncomingPacket.aClass222_2210, IncomingPacket.aClass222_2252,
		      IncomingPacket.aClass222_2253, IncomingPacket.sendItems,
		      IncomingPacket.aClass222_2261, IncomingPacket.sendRunEnergy,
		      IncomingPacket.aClass222_2317, IncomingPacket.sendRemoveGroundItem,
		      IncomingPacket.sendNpcUpdates, IncomingPacket.sendPlayersOverNpcs,
		      IncomingPacket.sendHintIcon, IncomingPacket.sendGameBarStages,
		      IncomingPacket.aClass222_2263, IncomingPacket.aClass222_2264,
		      IncomingPacket.aClass222_2240, IncomingPacket.aClass222_2266,
		      IncomingPacket.aClass222_2267, IncomingPacket.aClass222_2268,
		      IncomingPacket.sendConfig2, IncomingPacket.aClass222_2212,
		      IncomingPacket.aClass222_2271, IncomingPacket.aClass222_2187,
		      IncomingPacket.sendFriendsChatMessage, IncomingPacket.aClass222_2274,
		      IncomingPacket.aClass222_2275, IncomingPacket.sendMapRegion,
		      IncomingPacket.sendPlayerUpdates, IncomingPacket.aClass222_2189,
		      IncomingPacket.aClass222_2279, IncomingPacket.aClass222_2280,
		      IncomingPacket.aClass222_2281, IncomingPacket.aClass222_2282,
		      IncomingPacket.aClass222_2283, IncomingPacket.aClass222_2284,
		      IncomingPacket.sendAddIgnore, IncomingPacket.sendConfigByFile2,
		      IncomingPacket.aClass222_2287, IncomingPacket.aClass222_2292,
		      IncomingPacket.aClass222_2289, IncomingPacket.aClass222_2204,
		      IncomingPacket.aClass222_2291, IncomingPacket.aClass222_2196,
		      IncomingPacket.aClass222_2250, IncomingPacket.sendString,
		      IncomingPacket.aClass222_2295, IncomingPacket.aClass222_2296,
		      IncomingPacket.aClass222_2297, IncomingPacket.aClass222_2298,
		      IncomingPacket.aClass222_2257, IncomingPacket.sendInterfaceConfig,
		      IncomingPacket.sendWorldList, IncomingPacket.aClass222_2302,
		      IncomingPacket.aClass222_2303, IncomingPacket.aClass222_2246,
		      IncomingPacket.sendAccessMask, IncomingPacket.aClass222_2205,
		      IncomingPacket.aClass222_2307, IncomingPacket.aClass222_2244,
		      IncomingPacket.aClass222_2309, IncomingPacket.aClass222_2278,
		      IncomingPacket.aClass222_2311, IncomingPacket.aClass222_2312,
		      IncomingPacket.aClass222_2313, IncomingPacket.sendProjectile,
		      IncomingPacket.aClass222_2315, IncomingPacket.sendAnimateObject,
		      IncomingPacket.aClass222_2254, IncomingPacket.aClass222_2318,
		      IncomingPacket.aClass222_2319, IncomingPacket.aClass222_2320,
		      IncomingPacket.sendNpcOnInterface, IncomingPacket.aClass222_2200,
		      IncomingPacket.sendReceivedPrivateMessage, IncomingPacket.sendSentPrivateMessage,
		      IncomingPacket.aClass222_2192, IncomingPacket.aClass222_2326,
		      IncomingPacket.sendAddFriend, IncomingPacket.aClass222_2306,
		      IncomingPacket.aClass222_2245, IncomingPacket.aClass222_2330,
		      IncomingPacket.aClass222_2214, IncomingPacket.aClass222_2332,
		      IncomingPacket.aClass222_2333, IncomingPacket.sendSystemUpdate,
		      IncomingPacket.sendCloseInterface, IncomingPacket.aClass222_2336,
		      IncomingPacket.aClass222_2337, IncomingPacket.sendPlayerOption,
		      IncomingPacket.sendGlobalConfig2, IncomingPacket.aClass222_2340,
		      IncomingPacket.aClass222_2341, IncomingPacket.aClass222_2342,
		      IncomingPacket.sendConfigByFile1, IncomingPacket.aClass222_2344,
		      IncomingPacket.aClass222_2345, IncomingPacket.sendMiniMapStatus,
		      IncomingPacket.aClass222_2237, IncomingPacket.aClass222_2348,
		      IncomingPacket.aClass222_2349, IncomingPacket.aClass222_2350 });
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.r(").append
					  (')').toString());
	}
    }
    
    public static void method4432(int i, byte i_1_) {
	try {
	    Class330_Sub34 class330_sub34
		= Class238.method2377(OutgoingPacket.aClass234_2516,
				      client.aClass1_9025.aClass488_22,
				      1792125355);
	    class330_sub34.aClass330_Sub46_Sub2_7729.addInt(-1,
								1965508160);
	    client.aClass1_9025.method378(class330_sub34, -1878604036);
	    Class333.aClass106_3352 = new Class106(Class89.aClass280_735, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.ay(")
					  .append
					  (')').toString());
	}
    }
    
    static void method4433(Class430 class430, byte i) {
	try {
	    ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396.method5445
		((((Class430) class430).anIntArray4387
		  [((((Class430) class430).anInt4376 -= -1390004513)
		    * 1632830751)]),
		 -463346525);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.aqi(")
					  .append
					  (')').toString());
	}
    }
    
    static void method4434(Class430 class430, int i) {
	try {
	    int i_2_ = (((Class430) class430).anIntArray4387
			[((((Class430) class430).anInt4376 -= -1390004513)
			  * 1632830751)]);
	    IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, 1082175604);
	    Class120 class120 = Class3.aClass120Array56[i_2_ >> 16];
	    Class330_Sub1.method3261(iComponentDefinitions, class120, class430, 35632);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.ow(")
					  .append
					  (')').toString());
	}
    }
    
    static void method4435(Class430 class430, int i) {
	try {
	    Class426 class426 = (((Class430) class430).aBoolean4398
				 ? ((Class430) class430).aClass426_4384
				 : ((Class430) class430).aClass426_4370);
	    IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
	    Class120 class120 = ((Class426) class426).aClass120_4346;
	    Class330_Sub36_Sub16.method3512(iComponentDefinitions, class120, class430,
					    (byte) -21);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.jw(")
					  .append
					  (')').toString());
	}
    }
    
    public static Class355 method4436(Component component, short i) {
	try {
	    return new Class355_Sub1(component);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.r(").append
					  (')').toString());
	}
    }
    
    static void method4437(Class430 class430, byte i) {
	try {
	    ((Class430) class430).anIntArray4387
		[((((Class430) class430).anInt4376 += -1390004513) * 1632830751
		  - 1)]
		= Class434.method5564(-1484705796) ? 1 : 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.ajx(")
					  .append
					  (')').toString());
	}
    }
    
    static void method4438(int i) {
	try {
	    Class354_Sub1.aClass497_7990.method6100(65280);
	    Class354_Sub1.aClass497_7991.method6100(65280);
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.ch(")
					  .append
					  (')').toString());
	}
    }
    
    public static Class330_Sub44_Sub1 method4439(int i, int i_3_, int i_4_,
						 int i_5_, int i_6_) {
	try {
	    synchronized (Class330_Sub44_Sub1.aClass330_Sub44_Sub1Array9821) {
		Class330_Sub44_Sub1 class330_sub44_sub1;
		if (0 == Class330_Sub39.anInt7767 * -1651793303)
		    class330_sub44_sub1 = new Class330_Sub44_Sub1();
		else
		    class330_sub44_sub1
			= (Class330_Sub44_Sub1.aClass330_Sub44_Sub1Array9821
			   [((Class330_Sub39.anInt7767 -= 1036258777)
			     * -1651793303)]);
		((Class330_Sub44_Sub1) class330_sub44_sub1).anInt9826
		    = 1260310277 * i;
		((Class330_Sub44_Sub1) class330_sub44_sub1).anInt9827
		    = -1359119041 * i_3_;
		((Class330_Sub44_Sub1) class330_sub44_sub1).anInt9807
		    = i_4_ * 1653193937;
		((Class330_Sub44_Sub1) class330_sub44_sub1).anInt9824
		    = -34098255 * i_5_;
		((Class330_Sub44_Sub1) class330_sub44_sub1).aLong9825
		    = Class312.method3111((byte) 47) * -11492724761148013L;
		Class330_Sub44_Sub1 class330_sub44_sub1_7_
		    = class330_sub44_sub1;
		return class330_sub44_sub1_7_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class476.method5964(runtimeexception,
				      new StringBuilder().append("q.at(")
					  .append
					  (')').toString());
	}
    }
}
