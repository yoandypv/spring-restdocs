/*
 * Copyright 2014-2016 the original author or authors.
 *
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

package org.springframework.restdocs.operation.preprocess;

/**
 * A strategy for determining whether or not a header should be excluded.
 *
 * @author Andy Wilkinson
 */
interface HeaderFilter {

	/**
	 * Called to determine whether a header should be excluded. Return {@code true} to
	 * exclude a header, otherwise {@code false}.
	 * @param name the name of the header
	 * @return {@code true} to exclude the header, otherwise {@code false}
	 */
	boolean excludeHeader(String name);

}
