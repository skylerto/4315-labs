package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

/**
 * Native Peer for java.lang.StrictMath.
 *
 * @author Skyler Layne
 */
public class JPF_java_lang_StrictMath extends NativePeer {
  @MJI
  public double sqrt__D__D(MJIEnv env, int clsObjRef, double a) {
    return StrictMath.sqrt(a);
  }
}
