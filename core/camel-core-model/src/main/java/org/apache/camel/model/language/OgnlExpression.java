/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.camel.spi.Metadata;

/**
 * Evaluates an OGNL expression (Apache Commons OGNL).
 */
@Metadata(firstVersion = "1.1.0", label = "language,java", title = "OGNL")
@XmlRootElement(name = "ognl")
@XmlAccessorType(XmlAccessType.FIELD)
public class OgnlExpression extends ExpressionDefinition {

    public OgnlExpression() {
    }

    public OgnlExpression(String expression) {
        super(expression);
    }

    private OgnlExpression(Builder builder) {
        super(builder);
    }

    @Override
    public String getLanguage() {
        return "ognl";
    }

    /**
     * {@code Builder} is a specific builder for {@link OgnlExpression}.
     */
    @XmlTransient
    public static class Builder extends AbstractBuilder<Builder, OgnlExpression> {

        @Override
        public OgnlExpression end() {
            return new OgnlExpression(this);
        }
    }
}
