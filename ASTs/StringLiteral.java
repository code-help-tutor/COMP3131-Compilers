WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * StringLiteral.java
 *
 *
 * See t24c.vc.
 *
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class StringLiteral extends Terminal {

  public StringLiteral (String value, SourcePosition position) {
    super (value, position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitStringLiteral(this, o);
  }

}
