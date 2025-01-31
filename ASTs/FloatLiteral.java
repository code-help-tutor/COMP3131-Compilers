WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * FloatLiteral.java
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class FloatLiteral extends Terminal {

  public FloatLiteral (String value, SourcePosition position) {
    super (value, position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitFloatLiteral(this, o);
  }

}
