/*
 * Copyright 2000-2014 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.cdi.internal;

import com.vaadin.server.VaadinSession;

public class VaadinViewChangeEvent {

    private VaadinSession session;
    private int uiId;
    private String viewName;

    public VaadinViewChangeEvent(VaadinSession session, int uiId,
            String viewName) {
        this.session = session;
        this.uiId = uiId;
        this.viewName = viewName;
    }

    public VaadinSession getSession() {
        return session;
    }

    public int getUiId() {
        return uiId;
    }

    public String getViewName() {
        return viewName;
    }


}
