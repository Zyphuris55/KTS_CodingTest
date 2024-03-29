/*
 * Copyright (C) 2016 Miguel Ángel Moreno
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.nitrico.lastadapter

interface Handler

interface TypeHandler : Handler {
    fun getItemType(item: Any, position: Int): BaseType?
}

interface LayoutHandler : Handler {
    fun getItemLayout(item: Any, position: Int): Int
}

interface StableId {
    /**
     * Unique identifier for this data in a recycler view.
     *
     * Required to be set if [LastAdapter.stableIds] is set to true.
     */
    val stableId: Long
}
