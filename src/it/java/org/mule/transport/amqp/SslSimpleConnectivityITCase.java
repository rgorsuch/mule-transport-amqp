/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.amqp;

import java.io.IOException;

public class SslSimpleConnectivityITCase extends AbstractSslConnectivityITCase
{
    public SslSimpleConnectivityITCase() throws IOException
    {
        super();
    }

    @Override
    protected String getConfigResources()
    {
        return "ssl-simple-tests-config.xml";
    }
}