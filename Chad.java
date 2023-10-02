/*
 * -----------------------------------------------------------------------------
 * Chad
 * -----------------------------------------------------------------------------
 *
 * %Z%%M% %I% %W% %G% %U%
 * @(#) Chad.java - $Header: $
 * @(#) Chad.java - $Id: $
 *
 * -----------------------------------------------------------------------------
 *
 * Created on Nov 3, 2009
 *
 * -----------------------------------------------------------------------------
 * Change Log:
 * -----------------------------------------------------------------------------
 * When       + Who + Ver + What
 * -----------+-----+-----+-----------------------------------------------------
 * 2009-11-03 + AS  + 000 + Initial development
 * -----------------------------------------------------------------------------
 */

/**
 * Chad
 *
 * @author Alan Sampson - alansamps@gmail.com
 * @version 0.1
 */
public class Chad {

  private static String[] chad = {
    " -------------------------------------------------------------------",
    "",
    "     \"\\|||/\"",
    "       (@@)",
    "   _ooO_(_)_Ooo___________________________________",
    "  |______|_____|_____|_____|_____|_____|_____|_____|",
    "  |___Wot, no FORTRAN?_|_____|_____|_____|_____|____|",
    "  |______|_____|_____|_____|_____|_____|_____|_____|",
    "  |___|____|_____|_____|_____|_____|_____|_____|_",
    "  |______|_____|_____|_____|_____|__",
    "  |__ !    !     !     !",
    "",
    "",
    " -------------------------------------------------------------------",
    "",
    "                 (  @ @  )",
    " +------------oOOo-(_)-oOOo----------------------------------------+",
    "/|\\                                                               /|\\",
    "\\|/   Wot, no COBOL?                                              \\|/",
    "/|\\                                                               /|\\",
    "\\|/                                                               \\|/",
    " +---------------------Oooo----------------------------------------+",
    "                oooO   (   )",
    "               (   )    ) /",
    "                \\ (    (_/",
    "                 \\_)",
    "",
    " -------------------------------------------------------------------",
  };

  /**
   * Constructor
   */
  public Chad() {

    return;
  }

  /**
   * Getter
   */
  public static String[] getChad() {

    return chad;
  }

  /**
   * Main entry
   */
  public static void main(String[] args) {

    String[] chad = getChad();

    for (String line : chad) {
      System.out.println(line);
    }

    return;
  }
}
