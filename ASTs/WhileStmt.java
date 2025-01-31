WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * WhileStmt.java
 *
 *
 * See t33.vc and t34.vc.
 *
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;
import java.util.LinkedList;

public class WhileStmt extends Stmt {

  public Expr E;
  public Stmt S;

  // ********* NOTE *********
  // The two fields below are not used for this year's assignments
  public AST trueSuccessor, falseSuccessor;

  public WhileStmt (Expr eAST, Stmt sAST, SourcePosition Position) {
    super (Position);
    E = eAST;
    S = sAST;
    E.parent = S.parent = this;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitWhileStmt(this, o);
  }

}
