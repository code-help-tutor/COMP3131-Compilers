WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * Var.java                   
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

public abstract class Var extends AST {

  public Type type;

  public Var (SourcePosition Position) {
    super (Position);
    type = null;
  }

}
