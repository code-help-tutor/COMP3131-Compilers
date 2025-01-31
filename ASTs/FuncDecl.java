WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * FuncDecl.java      
 *
 *
 * See t4.vc and t5.vc.
 *
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public class FuncDecl extends Decl {

  public List PL;
  public Stmt S;

  public FuncDecl(Type tAST, Ident idAST, List fplAST, 
         Stmt cAST, SourcePosition Position) {
    super (Position);
    T = tAST;
    I = idAST;
    PL = fplAST;
    S = cAST;
    T.parent = I.parent = PL.parent = S.parent = this;
  }

  public Object visit (Visitor v, Object o) {
    return v.visitFuncDecl(this, o);
  }

}
