/* Copyright (c) 2011 Danish Maritime Safety Administration
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.enav.ais.message;

import dk.dma.enav.ais.binary.SixbitException;
import dk.dma.enav.ais.sentence.Vdm;

/**
 * AIS message 13
 * 
 * Acknowledge message as defined by ITU-R M.1371-4
 * 
 */
public class AisMessage13 extends AisMessage7 {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    public AisMessage13() {
        super(13);
    }

    public AisMessage13(Vdm vdm) throws AisMessageException, SixbitException {
        super(vdm);
    }

}