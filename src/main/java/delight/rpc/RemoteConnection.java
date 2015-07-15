package delight.rpc;

import de.mxro.service.callbacks.ShutdownCallback;

public interface RemoteConnection extends DeprecatedRemoteConnection {

	public void stop(ShutdownCallback callback);

}
