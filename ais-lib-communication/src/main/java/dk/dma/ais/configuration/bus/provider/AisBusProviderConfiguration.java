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
package dk.dma.ais.configuration.bus.provider;

import javax.xml.bind.annotation.XmlSeeAlso;

import dk.dma.ais.bus.AisBusProvider;
import dk.dma.ais.configuration.bus.AisBusSocketConfiguration;

/**
 * The type Ais bus provider configuration.
 */
@XmlSeeAlso({ TcpClientProviderConfiguration.class, TcpServerProviderConfiguration.class, FileReaderProviderConfiguration.class,
        CollectorProviderConfiguration.class, RepeatingFileReaderProviderConfiguration.class })
public abstract class AisBusProviderConfiguration extends AisBusSocketConfiguration {

    /**
     * Instantiates a new Ais bus provider configuration.
     */
    public AisBusProviderConfiguration() {

    }

    /**
     * Configure ais bus provider.
     *
     * @param provider the provider
     * @return the ais bus provider
     */
    protected AisBusProvider configure(AisBusProvider provider) {
        super.configure(provider);
        return provider;
    }

}
