/*************************************************************************
 *                                                                       *
 * Open Dynamics Engine, Copyright (C) 2001,2002 Russell L. Smith.       *
 * All rights reserved.  Email: russ@q12.org   Web: www.q12.org          *
 *                                                                       *
 * This library is free software; you can redistribute it and/or         *
 * modify it under the terms of EITHER:                                  *
 *   (1) The GNU Lesser General Public License as published by the Free  *
 *       Software Foundation; either version 2.1 of the License, or (at  *
 *       your option) any later version. The text of the GNU Lesser      *
 *       General Public License is included with this library in the     *
 *       file LICENSE.TXT.                                               *
 *   (2) The BSD-style license that is included with this library in     *
 *       the file LICENSE-BSD.TXT.                                       *
 *                                                                       *
 * This library is distributed in the hope that it will be useful,       *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the files    *
 * LICENSE.TXT and LICENSE-BSD.TXT for more details.                     *
 *                                                                       *
 *************************************************************************/
package org.ode4j.ode.internal.joints;

import org.ode4j.ode.DNullJoint;
import org.ode4j.ode.internal.DxWorld;
import static org.ode4j.ode.OdeMath.*;


/** 
 * **************************************************************************
 * null joint - for testing only
 */
public class DxJointNull extends DxJoint implements DNullJoint
{

	DxJointNull( DxWorld w ) 
	//dxJoint( w )
	{
		super(w);
	}

	@Override
	public void
	getInfo1( DxJoint.Info1 info )
	{
		info.setM(0);
		info.setNub(0);
	}


	@Override
	public void
	getInfo2( DxJoint.Info2 info )
	{
		dDebug( 0, "this should never get called" );
	}


	@Override
	public double getParam(PARAM_N parameter) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setParam(PARAM_N parameter, double value) {
		throw new UnsupportedOperationException();
	}
}

