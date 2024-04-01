WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * Terminal.java    
 */

package VC.ASTs;

import VC.Scanner.SourcePosition;

abstract public class Terminal extends AST {

  public String spelling;

  public Terminal (String value, SourcePosition Position) {
    super (Position);
    spelling = value;
  }

}
