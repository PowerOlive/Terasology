/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.engine.core.subsystem.headless;

import org.terasology.engine.context.Context;
import org.terasology.engine.core.subsystem.EngineSubsystem;
import org.terasology.engine.input.InputSystem;

public class HeadlessInput implements EngineSubsystem {

    @Override
    public String getName() {
        return "Input";
    }

    @Override
    public void postInitialise(Context context) {
        initControls(context);
    }

    private void initControls(Context context) {
        InputSystem inputSystem = new InputSystem();
        context.put(InputSystem.class, inputSystem);
    }

}