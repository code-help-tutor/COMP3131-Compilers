WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * BreakStmt.java    
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class BreakStmt extends Stmt {

  public BreakStmt(SourcePosition Position) {
    super (Position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitBreakStmt(this, o);
  }

}
