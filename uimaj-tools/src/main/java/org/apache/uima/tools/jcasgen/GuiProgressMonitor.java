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

package org.apache.uima.tools.jcasgen;

import org.apache.uima.UIMAFramework;
import org.apache.uima.util.Level;

public class GuiProgressMonitor implements IProgressMonitor {

  public void beginTask(String name, int totalWork) { // do nothing
  }

  public void done() {
    UIMAFramework.getLogger().log(Level.INFO, GUI.theGUI.pnG.showInStatus(" ** JCasGen Done."));
    GUI.theGUI.pnG.lbResult.setText("Finished");
  }

  public void subTask(String message) {
    GUI.theGUI.pnG.showInStatus(message);
    UIMAFramework.getLogger().log(Level.INFO, " >>JCasGen " + message);
  }

  public void worked(int work) { // do nothing
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IProgressMonitor#internalWorked(double)
   */
  public void internalWorked(double work) { // do nothing
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IProgressMonitor#isCanceled()
   */
  public boolean isCanceled() {
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IProgressMonitor#setCanceled(boolean)
   */
  public void setCanceled(boolean value) { // do nothing
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.core.runtime.IProgressMonitor#setTaskName(java.lang.String)
   */
  public void setTaskName(String name) { // do nothing
  }

}
