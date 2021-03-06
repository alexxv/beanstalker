package br.com.ingenieux.mojo.simpledb;

import org.apache.commons.lang.StringUtils;

import br.com.ingenieux.mojo.aws.AbstractAWSMojo;

import com.amazonaws.services.simpledb.AmazonSimpleDBClient;

/*
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

/**
 * Represents the generic set of SimpleDB Operations
 * 
 * @author Aldrin Leal
 * 
 */
public abstract class AbstractSimpleDbMojo extends
		AbstractAWSMojo<AmazonSimpleDBClient> {

	protected void validate(String message, boolean condition) {
        if (!condition)
			throw new RuntimeException(message);
    }

	@Override
	protected String getEndpoint() {
		if (StringUtils.isNotBlank(region))
			return String.format("sdb.%s.amazonaws.com", region);

		return null;
	}
}