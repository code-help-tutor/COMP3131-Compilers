WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * IntLiteral.java
 *
 *
 * See, for example, t20.vc.
 *
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class IntLiteral extends Terminal {

  public IntLiteral (String value, SourcePosition position) {
    super (value, position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitIntLiteral(this, o);
  }

}
