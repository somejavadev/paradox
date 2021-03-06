/*
 *     Copyright (C) 2017 Hein Smith
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.heinsmith.paradox.commands.area.arm;

/**
 * Created by Hein Smith on 2017/05/31.
 */
public enum ArmType {

    REGULAR_ARM("A"),
    FORCE_ARM("F"),
    STAY_ARM("S"),
    INSTANT_ARM("I");

    private String key;

    ArmType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
