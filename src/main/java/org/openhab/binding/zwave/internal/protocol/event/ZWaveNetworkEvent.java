/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zwave.internal.protocol.event;

/**
 * Network event signals that a network function has completed.
 * This is used to notify higher layers of network functions so they can be handled by (for example) a network heal
 * process.
 *
 * @author Chris Jackson
 */
public class ZWaveNetworkEvent extends ZWaveEvent {
    Type type;
    State state;

    /**
     * Constructor. Creates a new instance of the ZWaveNetworkEvent class.
     *
     * @param nodeId the nodeId of the event.
     */
    public ZWaveNetworkEvent(Type type, int nodeId, State state) {
        super(nodeId);

        this.type = type;
        this.state = state;
    }

    public Type getEvent() {
        return type;
    }

    public State getState() {
        return state;
    }

    public enum Type {
        AssignSucReturnRoute,
        AssignReturnRoute,
        DeleteSucReturnRoute,
        DeleteReturnRoute,
        NodeNeighborUpdate,
        NodeRoutingInfo,
        AssociationUpdate,
        DeleteNode,
        FailedNode
    }

    public enum State {
        Success,
        Failure
    }
}
