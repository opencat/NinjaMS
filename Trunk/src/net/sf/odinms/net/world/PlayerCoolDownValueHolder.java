/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc> 
                       Matthias Butz <matze@odinms.de>
                       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation. You may not use, modify
    or distribute this program under any other version of the
    GNU Affero General Public License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.sf.odinms.net.world;

import java.io.Serializable;

/**
 *
 * @author Danny
 */
public class PlayerCoolDownValueHolder implements Serializable {
	static final long serialVersionUID = 9179541993413738569L;
	public int skillId;
	public long startTime;
	public long length;
	private int id;

	public PlayerCoolDownValueHolder(int skillId, long startTime, long length) {
		this.skillId = skillId;
		this.startTime = startTime;
		this.length = length;
		this.id = (int) (Math.random()*100);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PlayerCoolDownValueHolder other = (PlayerCoolDownValueHolder) obj;
		if (id != other.id)
			return false;
		return true;
	}
}