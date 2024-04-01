WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * EmptyStmt.java      
 *
 * Used only inside IfStmt.java
 * 
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class EmptyStmt extends Stmt {

  public EmptyStmt(SourcePosition Position) {
    super (Position);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitEmptyStmt(this, o);
  }

}
