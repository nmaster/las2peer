package i5.las2peer.communication;

import java.io.Serializable;
import java.security.PublicKey;


/**
 * simple content signalling, that an (executing) agent has to be unlocked
 * 
 * @author Holger Janssen
 * @version $Revision: 1.1 $, $Date: 2013/02/26 17:57:28 $
 *
 */
public class RMIUnlockContent implements Serializable {

	
	private PublicKey nodeKey;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3609309756057033725L;

	public RMIUnlockContent ( PublicKey nodeKey ) {
		this.nodeKey = nodeKey;
	}
	
	
	/**
	 * get the key of the node sending this UnlockContent as answer
	 * @return a public key
	 */
	public PublicKey getNodeKey () {
		return nodeKey;
	}
	
}
