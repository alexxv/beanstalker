/**
// CHECKSTYLE:OFF
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */
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

package br.com.ingenieux.mojo.beanstalk.cmd.env.waitfor;

public class WaitForEnvironmentContextBuilder extends
    WaitForEnvironmentContextBuilderBase<WaitForEnvironmentContextBuilder> {
	public static WaitForEnvironmentContextBuilder waitForEnvironmentContext() {
		return new WaitForEnvironmentContextBuilder();
	}

	public WaitForEnvironmentContextBuilder() {
		super(new WaitForEnvironmentContext());
	}

	public WaitForEnvironmentContext build() {
		return getInstance();
	}
}

class WaitForEnvironmentContextBuilderBase<GeneratorT extends WaitForEnvironmentContextBuilderBase<GeneratorT>> {
	private WaitForEnvironmentContext instance;

	protected WaitForEnvironmentContextBuilderBase(
	    WaitForEnvironmentContext aInstance) {
		instance = aInstance;
	}

	protected WaitForEnvironmentContext getInstance() {
		return instance;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withApplicationName(String aValue) {
		instance.setApplicationName(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withTimeoutMins(Integer aValue) {
		instance.setTimeoutMins(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withStatusToWaitFor(String aValue) {
		instance.setStatusToWaitFor(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withEnvironmentId(String aValue) {
		instance.setEnvironmentId(aValue);

		return (GeneratorT) this;
	}

	@SuppressWarnings("unchecked")
	public GeneratorT withDomainToWaitFor(String aValue) {
		instance.setDomainToWaitFor(aValue);

		return (GeneratorT) this;
	}
}