/*******************************************************************************
 * Copyright 2011 Max Erik Rohde http://www.mxro.de
 * 
 * All rights reserved.
 ******************************************************************************/
package delight.rpc;

import delight.async.callbacks.ListCallback;

import java.util.List;

/**
 * <p>
 * Use {@link RemoteConnection} instead.
 * <p>
 * RemoteConnections are used to connect distributed systems (eg client and
 * server).
 * 
 * @author Max Rohde
 * 
 */
public interface DeprecatedRemoteConnection {

    public void call(List<RemoteMessage> messages, ListCallback<RemoteResponse> callback);

}
