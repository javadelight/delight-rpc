/*******************************************************************************
 * Copyright 2011 Max Erik Rohde http://www.mxro.de
 * 
 * All rights reserved.
 ******************************************************************************/
package delight.rpc;

import java.io.Serializable;

/**
 * A simple marker interface for messages, which should be transported between
 * remote systems.<br />
 * <br />
 * These messages in turn may contain a wide range of other {@link Serializable}
 * classes within framework.
 * 
 * @author Max Rohde
 * 
 */
public interface RemoteMessage extends Serializable {

}
