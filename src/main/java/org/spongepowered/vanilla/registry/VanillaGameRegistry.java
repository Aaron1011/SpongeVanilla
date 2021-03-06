/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.vanilla.registry;

import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.api.GameDictionary;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.event.state.PostInitializationEvent;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.common.registry.SpongeGameRegistry;

import javax.inject.Singleton;

@Singleton
public class VanillaGameRegistry extends SpongeGameRegistry {

    @Override
    public GameDictionary getGameDictionary() {
        throw new NotImplementedException("TODO");
    }

    @Subscribe
    public void onPreInit(PreInitializationEvent event) {
        preInit();
    }

    @Subscribe
    public void onInit(InitializationEvent event) {
        init();
    }

    @Subscribe
    public void onPostInit(PostInitializationEvent event) {
        postInit();
    }

}
