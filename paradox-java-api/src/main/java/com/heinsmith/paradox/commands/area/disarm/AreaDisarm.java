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

package com.heinsmith.paradox.commands.area.disarm;

import com.heinsmith.paradox.CommonValidationUtils;
import com.heinsmith.paradox.commands.CommandId;
import com.heinsmith.paradox.commands.CommandValidationException;
import com.heinsmith.paradox.commands.TxCommand;

/**
 * Created by Hein Smith on 2017/03/24.
 */
public class AreaDisarm extends TxCommand {

    private int area;
    private char[] password;

    public AreaDisarm(int area, char[] password) throws CommandValidationException {
        super(CommandId.AREA_DISARM);

        if (CommonValidationUtils.invalidAreaNumber(area)) {
            throw new CommandValidationException();
        }

        if (CommonValidationUtils.invalidPanelCode(password)) {
            throw new CommandValidationException();
        }

        this.area = area;
        this.password = password;
    }

    @Override
    protected String buildCommand() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%03d", area));
        builder.append(password);
        return builder.toString();
    }

    public int getArea() {
        return area;
    }

    public char[] getPassword() {
        return password;
    }
}
