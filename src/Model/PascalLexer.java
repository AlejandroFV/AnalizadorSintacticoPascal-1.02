/* The following code was generated by JFlex 1.5.1 */

package Model;
import static Model.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>src/Model/pascal.flex</tt>
 */
public final class PascalLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\4\1\2\1\1\1\47\1\2\1\1\16\4\4\0\1\2\1\44"+
    "\1\12\1\0\1\3\2\0\1\13\1\40\1\40\1\40\1\11\1\40"+
    "\1\11\1\7\1\40\1\5\11\5\1\45\1\46\1\42\1\41\1\43"+
    "\2\0\1\15\1\22\1\25\1\17\1\10\1\6\1\23\1\37\1\24"+
    "\2\3\1\33\1\35\1\16\1\27\1\36\1\3\1\20\1\26\1\30"+
    "\1\34\1\31\1\32\1\3\1\21\1\3\1\40\1\14\1\40\1\0"+
    "\1\3\1\0\1\15\1\22\1\25\1\17\1\10\1\6\1\23\1\37"+
    "\1\24\2\3\1\33\1\35\1\16\1\27\1\36\1\3\1\20\1\26"+
    "\1\30\1\34\1\31\1\32\1\3\1\21\1\3\4\0\6\4\1\50"+
    "\32\4\2\0\4\3\4\0\1\3\2\0\1\4\7\0\1\3\4\0"+
    "\1\3\5\0\27\3\1\0\37\3\1\0\70\3\2\24\115\3\1\26"+
    "\u0142\3\4\0\14\3\16\0\5\3\7\0\1\3\1\0\1\3\21\0"+
    "\160\4\5\3\1\0\2\3\2\0\4\3\10\0\1\3\1\0\3\3"+
    "\1\0\1\3\1\0\24\3\1\0\123\3\1\0\213\3\1\0\5\4"+
    "\2\0\236\3\11\0\46\3\2\0\1\3\7\0\47\3\7\0\1\3"+
    "\1\0\55\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\1\4"+
    "\10\0\33\3\5\0\3\3\15\0\5\4\6\0\1\3\4\0\13\4"+
    "\5\0\53\3\37\4\4\0\2\3\1\4\143\3\1\0\1\3\10\4"+
    "\1\0\6\4\2\3\2\4\1\0\4\4\2\3\12\4\3\3\2\0"+
    "\1\3\17\0\1\4\1\3\1\4\36\3\33\4\2\0\131\3\13\4"+
    "\1\3\16\0\12\4\41\3\11\4\2\3\4\0\1\3\5\0\26\3"+
    "\4\4\1\3\11\4\1\3\3\4\1\3\5\4\22\0\31\3\3\4"+
    "\104\0\1\3\1\0\13\3\67\0\33\4\1\0\4\4\66\3\3\4"+
    "\1\3\22\4\1\3\7\4\12\3\2\4\2\0\12\4\1\0\7\3"+
    "\1\0\7\3\1\0\3\4\1\0\10\3\2\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\1\3\3\0\4\3\2\0\1\4\1\3\7\4"+
    "\2\0\2\4\2\0\3\4\1\3\10\0\1\4\4\0\2\3\1\0"+
    "\3\3\2\4\2\0\12\4\4\3\7\0\1\3\5\0\3\4\1\0"+
    "\6\3\4\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3\1\0"+
    "\2\3\1\0\2\3\2\0\1\4\1\0\5\4\4\0\2\4\2\0"+
    "\3\4\3\0\1\4\7\0\4\3\1\0\1\3\7\0\14\4\3\3"+
    "\1\4\13\0\3\4\1\0\11\3\1\0\3\3\1\0\26\3\1\0"+
    "\7\3\1\0\2\3\1\0\5\3\2\0\1\4\1\3\10\4\1\0"+
    "\3\4\1\0\3\4\2\0\1\3\17\0\2\3\2\4\2\0\12\4"+
    "\1\0\1\3\17\0\3\4\1\0\10\3\2\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\2\3\1\0\5\3\2\0\1\4\1\3\7\4"+
    "\2\0\2\4\2\0\3\4\10\0\2\4\4\0\2\3\1\0\3\3"+
    "\2\4\2\0\12\4\1\0\1\3\20\0\1\4\1\3\1\0\6\3"+
    "\3\0\3\3\1\0\4\3\3\0\2\3\1\0\1\3\1\0\2\3"+
    "\3\0\2\3\3\0\3\3\3\0\14\3\4\0\5\4\3\0\3\4"+
    "\1\0\4\4\2\0\1\3\6\0\1\4\16\0\12\4\11\0\1\3"+
    "\7\0\3\4\1\0\10\3\1\0\3\3\1\0\27\3\1\0\12\3"+
    "\1\0\5\3\3\0\1\3\7\4\1\0\3\4\1\0\4\4\7\0"+
    "\2\4\1\0\2\3\6\0\2\3\2\4\2\0\12\4\22\0\2\4"+
    "\1\0\10\3\1\0\3\3\1\0\27\3\1\0\12\3\1\0\5\3"+
    "\2\0\1\4\1\3\7\4\1\0\3\4\1\0\4\4\7\0\2\4"+
    "\7\0\1\3\1\0\2\3\2\4\2\0\12\4\1\0\2\3\17\0"+
    "\2\4\1\0\10\3\1\0\3\3\1\0\51\3\2\0\1\3\7\4"+
    "\1\0\3\4\1\0\4\4\1\3\10\0\1\4\10\0\2\3\2\4"+
    "\2\0\12\4\12\0\6\3\2\0\2\4\1\0\22\3\3\0\30\3"+
    "\1\0\11\3\1\0\1\3\2\0\7\3\3\0\1\4\4\0\6\4"+
    "\1\0\1\4\1\0\10\4\22\0\2\4\15\0\60\3\1\4\2\3"+
    "\7\4\4\0\10\3\10\4\1\0\12\4\47\0\2\3\1\0\1\3"+
    "\2\0\2\3\1\0\1\3\2\0\1\3\6\0\4\3\1\0\7\3"+
    "\1\0\3\3\1\0\1\3\1\0\1\3\2\0\2\3\1\0\4\3"+
    "\1\4\2\3\6\4\1\0\2\4\1\3\2\0\5\3\1\0\1\3"+
    "\1\0\6\4\2\0\12\4\2\0\4\3\40\0\1\3\27\0\2\4"+
    "\6\0\12\4\13\0\1\4\1\0\1\4\1\0\1\4\4\0\2\4"+
    "\10\3\1\0\44\3\4\0\24\4\1\0\2\4\5\3\13\4\1\0"+
    "\44\4\11\0\1\4\71\0\53\3\24\4\1\3\12\4\6\0\6\3"+
    "\4\4\4\3\3\4\1\3\3\4\2\3\7\4\3\3\4\4\15\3"+
    "\14\4\1\3\17\4\2\0\46\3\1\0\1\3\5\0\1\3\2\0"+
    "\53\3\1\0\u014d\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0"+
    "\4\3\2\0\51\3\1\0\4\3\2\0\41\3\1\0\4\3\2\0"+
    "\7\3\1\0\1\3\1\0\4\3\2\0\17\3\1\0\71\3\1\0"+
    "\4\3\2\0\103\3\2\0\3\4\40\0\20\3\20\0\125\3\14\0"+
    "\u026c\3\2\0\21\3\1\0\32\3\5\0\113\3\3\0\3\3\17\0"+
    "\15\3\1\0\4\3\3\4\13\0\22\3\3\4\13\0\22\3\2\4"+
    "\14\0\15\3\1\0\3\3\1\0\2\4\14\0\64\3\40\4\3\0"+
    "\1\3\3\0\2\3\1\4\2\0\12\4\41\0\3\4\2\0\12\4"+
    "\6\0\130\3\10\0\51\3\1\4\1\3\5\0\106\3\12\0\35\3"+
    "\3\0\14\4\4\0\14\4\12\0\12\4\36\3\2\0\5\3\13\0"+
    "\54\3\4\0\21\4\7\3\2\4\6\0\12\4\46\0\27\3\5\4"+
    "\4\0\65\3\12\4\1\0\35\4\2\0\13\4\6\0\12\4\15\0"+
    "\1\3\130\0\5\4\57\3\21\4\7\3\4\0\12\4\21\0\11\4"+
    "\14\0\3\4\36\3\15\4\2\3\12\4\54\3\16\4\14\0\44\3"+
    "\24\4\10\0\12\4\3\0\3\3\12\4\44\3\122\0\3\4\1\0"+
    "\25\4\4\3\1\4\4\3\3\4\2\3\11\0\300\3\47\4\25\0"+
    "\4\4\u0116\3\2\0\6\3\2\0\46\3\2\0\6\3\2\0\10\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\3\1\0\37\3\2\0\65\3"+
    "\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3\3\0\4\3"+
    "\2\0\6\3\4\0\15\3\5\0\3\3\1\0\7\3\16\0\5\4"+
    "\30\0\1\47\1\47\5\4\20\0\2\3\23\0\1\3\13\0\5\4"+
    "\5\0\6\4\1\0\1\3\15\0\1\3\20\0\15\3\3\0\33\3"+
    "\25\0\15\4\4\0\1\4\3\0\14\4\21\0\1\3\4\0\1\3"+
    "\2\0\12\3\1\0\1\3\3\0\5\3\6\0\1\3\1\0\1\3"+
    "\1\0\1\3\1\0\4\3\1\0\13\3\2\0\4\3\5\0\5\3"+
    "\4\0\1\3\21\0\51\3\u0a77\0\57\3\1\0\57\3\1\0\205\3"+
    "\6\0\4\3\3\4\2\3\14\0\46\3\1\0\1\3\5\0\1\3"+
    "\2\0\70\3\7\0\1\3\17\0\1\4\27\3\11\0\7\3\1\0"+
    "\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0\7\3\1\0"+
    "\7\3\1\0\7\3\1\0\40\4\57\0\1\3\u01d5\0\3\3\31\0"+
    "\11\3\6\4\1\0\5\3\2\0\5\3\4\0\126\3\2\0\2\4"+
    "\2\0\3\3\1\0\132\3\1\0\4\3\5\0\51\3\3\0\136\3"+
    "\21\0\33\3\65\0\20\3\u0200\0\u19b6\3\112\0\u51cd\3\63\0\u048d\3"+
    "\103\0\56\3\2\0\u010d\3\3\0\20\3\12\4\2\3\24\0\57\3"+
    "\1\4\4\0\12\4\1\0\31\3\7\0\1\4\120\3\2\4\45\0"+
    "\11\3\2\0\147\3\2\0\4\3\1\0\4\3\14\0\13\3\115\0"+
    "\12\3\1\4\3\3\1\4\4\3\1\4\27\3\5\4\20\0\1\3"+
    "\7\0\64\3\14\0\2\4\62\3\21\4\13\0\12\4\6\0\22\4"+
    "\6\3\3\0\1\3\4\0\12\4\34\3\10\4\2\0\27\3\15\4"+
    "\14\0\35\3\3\0\4\4\57\3\16\4\16\0\1\3\12\4\46\0"+
    "\51\3\16\4\11\0\3\3\1\4\10\3\2\4\2\0\12\4\6\0"+
    "\27\3\3\0\1\3\1\4\4\0\60\3\1\4\1\3\3\4\2\3"+
    "\2\4\5\3\2\4\1\3\1\4\1\3\30\0\3\3\2\0\13\3"+
    "\5\4\2\0\3\3\2\4\12\0\6\3\2\0\6\3\2\0\6\3"+
    "\11\0\7\3\1\0\7\3\221\0\43\3\10\4\1\0\2\4\2\0"+
    "\12\4\6\0\u2ba4\3\14\0\27\3\4\0\61\3\u2104\0\u016e\3\2\0"+
    "\152\3\46\0\7\3\14\0\5\3\5\0\1\3\1\4\12\3\1\0"+
    "\15\3\1\0\5\3\1\0\1\3\1\0\2\3\1\0\2\3\1\0"+
    "\154\3\41\0\u016b\3\22\0\100\3\2\0\66\3\50\0\15\3\3\0"+
    "\20\4\20\0\7\4\14\0\2\3\30\0\3\3\31\0\1\3\6\0"+
    "\5\3\1\0\207\3\2\0\1\4\4\0\1\3\13\0\12\4\7\0"+
    "\32\3\4\0\1\3\1\0\32\3\13\0\131\3\3\0\6\3\2\0"+
    "\6\3\2\0\6\3\2\0\3\3\3\0\2\3\3\0\2\3\22\0"+
    "\3\4\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\3\1\5\1\3"+
    "\1\6\2\1\21\3\2\6\1\1\1\7\2\4\1\0"+
    "\4\3\2\0\4\3\1\10\3\3\1\10\11\3\1\4"+
    "\1\0\2\3\1\11\33\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\51\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e"+
    "\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386"+
    "\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u0453\0\51"+
    "\0\51\0\u04a5\0\u04ce\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b"+
    "\0\u05c4\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3"+
    "\0\u070c\0\173\0\u0735\0\u075e\0\u0787\0\u07b0\0\u07d9\0\u0802"+
    "\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\51"+
    "\0\u094a\0\u0973\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40\0\u0a69"+
    "\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1"+
    "\0\u0bda\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9"+
    "\0\u0d22\0\u0d4b\0\u0d74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17"+
    "\1\4\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\4\1\11"+
    "\1\35\1\36\1\35\1\37\1\35\1\40\54\0\2\3"+
    "\51\0\4\4\1\0\1\4\4\0\23\4\10\0\1\4"+
    "\5\0\1\5\1\41\1\42\1\43\43\0\4\4\1\0"+
    "\1\4\4\0\7\4\1\44\2\4\1\25\4\4\1\45"+
    "\3\4\10\0\1\4\5\0\1\42\1\0\1\11\44\0"+
    "\4\4\1\0\1\4\4\0\1\4\1\46\14\4\1\47"+
    "\4\4\10\0\1\4\1\50\1\0\10\50\1\0\1\50"+
    "\1\0\34\50\1\51\1\0\11\51\2\0\34\51\3\0"+
    "\4\4\1\0\1\4\4\0\1\4\1\46\1\4\1\52"+
    "\17\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\7\4\1\53\2\4\1\54\10\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\7\4\1\55\2\4\1\56"+
    "\10\4\10\0\1\4\3\0\4\4\1\0\1\57\4\0"+
    "\23\4\10\0\1\4\3\0\4\4\1\0\1\60\4\0"+
    "\23\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\12\4\1\61\10\4\10\0\1\4\3\0\3\4\1\62"+
    "\1\0\1\4\4\0\1\4\1\62\21\4\10\0\1\4"+
    "\3\0\4\4\1\0\1\4\4\0\1\47\11\4\1\63"+
    "\10\4\10\0\1\4\3\0\4\4\1\0\1\64\4\0"+
    "\23\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\3\4\1\62\17\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\4\4\1\65\5\4\1\62\7\4\1\66"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\1\25"+
    "\22\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\7\4\1\67\12\4\1\70\10\0\1\4\3\0\4\4"+
    "\1\0\1\4\4\0\1\71\22\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\1\4\1\72\21\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\12\4\1\46"+
    "\10\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\3\4\1\73\17\4\10\0\1\4\41\0\1\11\50\0"+
    "\1\11\1\0\1\11\12\0\1\42\1\41\1\0\1\43"+
    "\45\0\1\74\3\0\1\75\42\0\4\4\1\0\1\4"+
    "\4\0\16\4\1\76\4\4\10\0\1\4\3\0\4\4"+
    "\1\0\1\4\4\0\1\4\1\77\21\4\10\0\1\4"+
    "\3\0\4\4\1\0\1\4\4\0\2\4\1\62\20\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\11\4"+
    "\1\76\11\4\10\0\1\4\1\50\1\0\10\50\1\100"+
    "\1\50\1\0\34\50\1\51\1\0\11\51\1\100\1\0"+
    "\34\51\3\0\4\4\1\0\1\4\4\0\3\4\1\101"+
    "\17\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\16\4\1\62\4\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\13\4\1\102\7\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\14\4\1\62\6\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\15\4\1\103"+
    "\5\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\10\4\1\104\10\4\1\105\1\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\6\4\1\106\14\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\13\4\1\107"+
    "\7\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\1\4\1\110\21\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\13\4\1\62\7\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\21\4\1\76\1\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\111\4\0\23\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\13\4\1\112"+
    "\7\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\7\4\1\44\13\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\5\4\1\113\15\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\13\4\1\114\7\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\12\4\1\115"+
    "\10\4\10\0\1\4\5\0\1\74\1\41\47\0\1\74"+
    "\46\0\4\4\1\0\1\62\4\0\23\4\10\0\1\4"+
    "\3\0\4\4\1\0\1\4\4\0\10\4\1\116\12\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\1\117"+
    "\22\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\12\4\1\120\10\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\1\4\1\61\21\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\12\4\1\121\10\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\122\4\0\23\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\7\4\1\111"+
    "\13\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\12\4\1\62\10\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\11\4\1\64\11\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\1\4\1\62\21\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\22\4\1\62"+
    "\10\0\1\4\3\0\4\4\1\0\1\53\4\0\23\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\7\4"+
    "\1\53\13\4\10\0\1\4\3\0\4\4\1\0\1\4"+
    "\4\0\6\4\1\123\1\4\1\124\12\4\10\0\1\4"+
    "\3\0\4\4\1\0\1\4\4\0\13\4\1\125\7\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\4\4"+
    "\1\62\16\4\10\0\1\4\3\0\3\4\1\62\1\0"+
    "\1\4\4\0\23\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\3\4\1\46\17\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\1\64\22\4\10\0\1\4"+
    "\3\0\4\4\1\0\1\4\4\0\3\4\1\126\17\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\127\4\0\23\4"+
    "\10\0\1\4\3\0\4\4\1\0\1\4\4\0\7\4"+
    "\1\130\13\4\10\0\1\4\3\0\4\4\1\0\1\4"+
    "\4\0\1\131\22\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\2\4\1\132\20\4\10\0\1\4\3\0"+
    "\4\4\1\0\1\4\4\0\12\4\1\111\10\4\10\0"+
    "\1\4\3\0\4\4\1\0\1\4\4\0\20\4\1\62"+
    "\2\4\10\0\1\4\3\0\4\4\1\0\1\4\4\0"+
    "\17\4\1\133\3\4\10\0\1\4\3\0\4\4\1\0"+
    "\1\4\4\0\3\4\1\76\17\4\10\0\1\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3485];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\26\1\2\11\1\1\1\0"+
    "\4\1\2\0\23\1\1\0\2\1\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public PascalLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public PascalLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2304) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return ERROR;
          }
        case 10: break;
        case 2: 
          { return BLANCO;
          }
        case 11: break;
        case 3: 
          { return IDENT;
          }
        case 12: break;
        case 4: 
          { return NUMERO;
          }
        case 13: break;
        case 5: 
          { return DOT;
          }
        case 14: break;
        case 6: 
          { return OP;
          }
        case 15: break;
        case 7: 
          { return SEMI;
          }
        case 16: break;
        case 8: 
          { return RESERVADA;
          }
        case 17: break;
        case 9: 
          { return CADENA;
          }
        case 18: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
