/*
 * This file is part of MEGATrace.
 *
 * Copyright (C) 2024-2025 The MEGA Team
 * All Rights Reserved
 *
 * The above copyright notice, this permission notice and the word "MEGA"
 * shall be included in all copies or substantial portions of the Software.
 *
 * MEGATrace is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, only version 3 of the License.
 *
 * MEGATrace is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MEGATrace.  If not, see <https://www.gnu.org/licenses/>.
 */

package mega.trace.service;

import java.util.ServiceLoader;

public interface MEGATraceService {
    MEGATraceService INSTANCE = find();

    static MEGATraceService find() {
        for (MEGATraceService service : ServiceLoader.load(MEGATraceService.class))
            return service;
        return null;
    }

    void message(byte[] msg);

    void messageColor(byte[] msg, int color);
}
