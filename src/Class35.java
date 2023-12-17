/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class35
{
    static int anInt362 = 35632;
    static int anInt363 = 35633;
    static int anInt364 = 35634;
    static int[] anIntArray364 = new int[2];
	
    Class_ra_Sub1 aClass_ra_Sub1_365;
    int anInt366;
    
    static Class35 method506(Class_ra_Sub1 class_ra_sub1, int i,
			     String string) {
	int i_0_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_0_, string);
	OpenGL.glCompileShader(i_0_);
	OpenGL.glGetShaderiv(i_0_, 35713, anIntArray364, 0);
	if (anIntArray364[0] == 0) {
	    if (anIntArray364[0] == 0)
		System.out.println("");
	    OpenGL.glGetShaderiv(i_0_, 35716, anIntArray364, 1);
	    if (anIntArray364[1] > 1) {
		byte[] is = new byte[anIntArray364[1]];
		OpenGL.glGetShaderInfoLog(i_0_, anIntArray364[1],
					  anIntArray364, 0, is, 0);
		System.out.println(new String(is));
	    }
	    if (anIntArray364[0] == 0) {
		OpenGL.glDeleteShader(i_0_);
		return null;
	    }
	}
	return new Class35(class_ra_sub1, i_0_, i);
    }
    
    Class35(Class_ra_Sub1 class_ra_sub1, int i, int i_1_) {
	((Class35) this).aClass_ra_Sub1_365 = class_ra_sub1;
	((Class35) this).anInt366 = i;
    }
}
