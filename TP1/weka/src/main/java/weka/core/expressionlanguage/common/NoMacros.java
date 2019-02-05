/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 *    NoMacros.java
 *    Copyright (C) 2015 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.core.expressionlanguage.common;

import weka.core.expressionlanguage.core.Macro;
import weka.core.expressionlanguage.core.MacroDeclarations;

/**
 * A macro declarations that contains no macros at all
 * 
 * @author Benjamin Weber ( benweber at student dot ethz dot ch )
 * @version $Revision: 1000 $
 */
public class NoMacros implements MacroDeclarations {

  /**
   * Whether the macro is declared. Always returns <code>false</code>
   * 
   * @param name name of the macro
   * @return whether the macro is declared. Always <code>false</code>.
   */
  @Override
  public boolean hasMacro(String name) {
    return false;
  }

  /**
   * Tries to fetch a macro. Will always fail.</p>
   * 
   * The same invariant of {@link MacroDeclarations} applies here too.
   * 
   * @param name name of the macro
   * @return nothing
   */
  @Override
  public Macro getMacro(String name) {
    throw new RuntimeException("Macro '" + name + "' doesn't exist!");
  }

}
