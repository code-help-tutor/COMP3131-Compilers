WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * ContinueStmt.java    
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class ContinueStmt extends Stmt {

  public ContinueStmt(SourcePosition Position) {
    super (Position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitContinueStmt(this, o);
  }

}
