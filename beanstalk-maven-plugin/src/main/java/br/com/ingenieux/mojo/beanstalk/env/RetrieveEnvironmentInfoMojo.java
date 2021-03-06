package br.com.ingenieux.mojo.beanstalk.env;

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

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.jfrog.maven.annomojo.annotations.MojoGoal;
import org.jfrog.maven.annomojo.annotations.MojoParameter;
import org.jfrog.maven.annomojo.annotations.MojoRequiresDirectInvocation;
import org.jfrog.maven.annomojo.annotations.MojoSince;

import br.com.ingenieux.mojo.beanstalk.AbstractNeedsEnvironmentMojo;

import com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest;
import com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult;

/**
 * Returns Environment Info
 * 
 * See the docs for <a href=
 * "http://docs.amazonwebservices.com/elasticbeanstalk/latest/api/API_RetrieveEnvironmentInfo.html"
 * >RetrieveEnvironmentInfo API</a> call.
 * 
 * @author Aldrin Leal
 */
@MojoGoal("retrieve-environment-info")
@MojoSince("0.2.6")
@MojoRequiresDirectInvocation
public class RetrieveEnvironmentInfoMojo extends AbstractNeedsEnvironmentMojo {
	/**
	 * Type of information ro retrieve. Accepted: <code>tail</code>
	 */
	@MojoParameter(expression="${beanstalk.infoType}", defaultValue="tail", required=true)
	private String infoType;

	@Override
	protected Object executeInternal() throws MojoExecutionException,
	    MojoFailureException {
		RetrieveEnvironmentInfoRequest request = new RetrieveEnvironmentInfoRequest()
		    .withEnvironmentId(environmentId).withEnvironmentName(environmentName)
		    .withInfoType(infoType);

		RetrieveEnvironmentInfoResult result = getService()
		    .retrieveEnvironmentInfo(request);

		return result;
	}
}
