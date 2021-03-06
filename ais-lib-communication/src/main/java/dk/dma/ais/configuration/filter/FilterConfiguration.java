/* Copyright (c) 2011 Danish Maritime Authority.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dk.dma.ais.configuration.filter;

import javax.xml.bind.annotation.XmlSeeAlso;

import dk.dma.ais.filter.IPacketFilter;

/**
 * The type Filter configuration.
 */
@XmlSeeAlso({ PacketFilterCollectionConfiguration.class, DownSampleFilterConfiguration.class,
        ReplayDownSampleFilterConfiguration.class, DuplicateFilterConfiguration.class, GatehouseSourceFilterConfiguration.class,
        TargetCountryFilterConfiguration.class, TaggingFilterConfiguration.class, LocationFilterConfiguration.class,
        MessageTypeFilterConfiguration.class, ExpressionFilterConfiguration.class, SanityFilterConfiguration.class, FutureFilterConfiguration.class, PastFilterConfiguration.class })
public abstract class FilterConfiguration {

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public abstract IPacketFilter getInstance();

}
