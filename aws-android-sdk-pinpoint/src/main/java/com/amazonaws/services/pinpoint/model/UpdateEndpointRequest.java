/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Use to update an endpoint.
 */
public class UpdateEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * The new value for the endpointId property for this object.
     */
    private String endpointId;

    /**
     * Endpoint update request
     */
    private EndpointRequest endpointRequest;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns the value of the endpointId property for this object.
     *
     * @return The value of the endpointId property for this object.
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Sets the value of endpointId
     *
     * @param endpointId The new value for the endpointId property for this
     *            object.
     */
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * Sets the value of the endpointId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointId The new value for the endpointId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Endpoint update request
     *
     * @return Endpoint update request
     */
    public EndpointRequest getEndpointRequest() {
        return endpointRequest;
    }

    /**
     * Endpoint update request
     *
     * @param endpointRequest Endpoint update request
     */
    public void setEndpointRequest(EndpointRequest endpointRequest) {
        this.endpointRequest = endpointRequest;
    }

    /**
     * Endpoint update request
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointRequest Endpoint update request
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateEndpointRequest withEndpointRequest(EndpointRequest endpointRequest) {
        this.endpointRequest = endpointRequest;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getEndpointId() != null)
            sb.append("EndpointId: " + getEndpointId() + ",");
        if (getEndpointRequest() != null)
            sb.append("EndpointRequest: " + getEndpointRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointRequest() == null) ? 0 : getEndpointRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null
                && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointRequest() == null ^ this.getEndpointRequest() == null)
            return false;
        if (other.getEndpointRequest() != null
                && other.getEndpointRequest().equals(this.getEndpointRequest()) == false)
            return false;
        return true;
    }
}