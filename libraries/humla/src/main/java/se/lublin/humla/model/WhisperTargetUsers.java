/*
 * Copyright (C) 2016 Andrew Comminos <andrew@comminos.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package se.lublin.humla.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import se.lublin.humla.protobuf.Mumble;

/**
 * Created by andrew on 28/04/16.
 */
public class WhisperTargetUsers implements WhisperTarget {
    private final List<IUser> mUsers;

    public WhisperTargetUsers(Collection<? extends IUser> users) {
        mUsers = new ArrayList<>(users);
    }

    @Override
    public Mumble.VoiceTarget.Target createTarget() {
        Mumble.VoiceTarget.Target.Builder vtb = Mumble.VoiceTarget.Target.newBuilder();
        for (IUser user : mUsers) {
            vtb.addSession(user.getSession());
        }
        return vtb.build();
    }

    @Override
    public String getName() {
        if (mUsers.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mUsers.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mUsers.get(i).getName());
        }
        return sb.toString();
    }
}
