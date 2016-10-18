/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.ui.push;

import java.util.List;

import org.eclipse.hawkbit.repository.eventbus.event.TargetInfoUpdateEvent;

/**
 * EventHolder for {@link TargetInfoUpdateEvent}s.
 *
 */
public class TargetInfoUpdateEventContainer implements EventContainer<TargetInfoUpdateEvent> {
    private final List<TargetInfoUpdateEvent> events;

    TargetInfoUpdateEventContainer(final List<TargetInfoUpdateEvent> events) {
        this.events = events;
    }

    @Override
    public List<TargetInfoUpdateEvent> getEvents() {
        return events;
    }

}