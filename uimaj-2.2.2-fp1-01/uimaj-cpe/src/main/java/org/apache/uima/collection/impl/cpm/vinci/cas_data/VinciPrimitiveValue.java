/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.collection.impl.cpm.vinci.cas_data;

import org.apache.uima.cas_data.PrimitiveValue;
import org.apache.uima.cas_data.impl.PrimitiveValueImpl;

/**
 * @deprecated Use PrimitiveValueImpl instead. This is just here for backwards compatibility.
 */
public class VinciPrimitiveValue extends PrimitiveValueImpl implements PrimitiveValue {

  private static final long serialVersionUID = 1668126114372701948L;

  public VinciPrimitiveValue(String aValue) {
    super(aValue);
  }

  public VinciPrimitiveValue(int aValue) {
    super(aValue);
  }

  public VinciPrimitiveValue(float aValue) {
    super(aValue);
  }

  public VinciPrimitiveValue(int[] aValue) {
    super(null);
    throw new UnsupportedOperationException("Arrays are not primitive values");
  }

  public VinciPrimitiveValue(float[] aValue) {
    super(null);
    throw new UnsupportedOperationException("Arrays are not primitive values");
  }

  public VinciPrimitiveValue(String[] aValue) {
    super(null);
    throw new UnsupportedOperationException("Arrays are not primitive values");
  }
}