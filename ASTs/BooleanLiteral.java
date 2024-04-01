WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * BooleanLiteral.java
 *
 * Used for representing a single Boolean literal: true or false.
 *
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class BooleanLiteral extends Terminal {

  public BooleanLiteral (String value, SourcePosition position) {
    super (value, position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitBooleanLiteral(this, o);
  }

}
