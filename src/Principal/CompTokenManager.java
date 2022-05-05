/* Generated By:JavaCC: Do not edit this line. CompTokenManager.java */
package Principal;
import java.io.*;

/** Token Manager. */
public class CompTokenManager implements CompConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000L) != 0L)
            return 9;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 37:
         return jjStopAtPos(0, 17);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 40:
         return jjStopAtPos(0, 28);
      case 41:
         return jjStopAtPos(0, 29);
      case 42:
         return jjStopAtPos(0, 23);
      case 43:
         return jjStopAtPos(0, 21);
      case 44:
         return jjStopAtPos(0, 31);
      case 45:
         return jjStopAtPos(0, 22);
      case 46:
         return jjStopAtPos(0, 32);
      case 47:
         return jjStartNfaWithStates_0(0, 24, 9);
      case 59:
         return jjStopAtPos(0, 30);
      case 60:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 61:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 62:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 94:
         return jjStopAtPos(0, 25);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x3000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xa00000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 123:
         return jjStopAtPos(0, 26);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 125:
         return jjStopAtPos(0, 27);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 61:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 102:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1200000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8400000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 124:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4400000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 101:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(3, 37);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x21000000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10200000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(4, 38);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 102:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(4, 36);
         break;
      case 107:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(4, 39);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 116:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(4, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(4, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 103:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(5, 41);
         break;
      case 110:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(5, 40);
         break;
      case 114:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(5, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x0L, 0x7ffffff07ffffffL
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 20;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 9:
                  if (curChar == 47)
                     jjCheckNAddStates(2, 4);
                  else if (curChar == 42)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 1:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 3:
                  if ((0xffffff3b00000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar == 39 && kind > 9)
                     kind = 9;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 6:
                  if (curChar != 46)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 10:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar == 42)
                     jjCheckNAddStates(5, 7);
                  break;
               case 12:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(13, 11);
                  break;
               case 13:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(13, 11);
                  break;
               case 14:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               case 15:
                  if (curChar == 47)
                     jjCheckNAddStates(2, 4);
                  break;
               case 16:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 17:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 18:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 19:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar != 64)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x3ffffffe3fffffffL & l) != 0L)
                     jjAddStates(8, 9);
                  break;
               case 10:
                  jjCheckNAddTwoStates(10, 11);
                  break;
               case 12:
               case 13:
                  jjCheckNAddTwoStates(13, 11);
                  break;
               case 16:
                  jjAddStates(2, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(8, 9);
                  break;
               case 10:
                  if ((jjbitVec1[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 12:
               case 13:
                  if ((jjbitVec1[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(13, 11);
                  break;
               case 16:
                  if ((jjbitVec1[i2] & l2) != 0L)
                     jjAddStates(2, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 15, 16, 17, 19, 11, 12, 14, 3, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\75", null, null, "\76", 
"\76\75", "\74", "\74\75", "\75\75", "\41\75", "\45", "\41", "\46\46", "\174\174", 
"\53", "\55", "\52", "\57", "\136", "\173", "\175", "\50", "\51", "\73", "\54", 
"\56", "\151\156\160\165\164", "\160\162\151\156\164", "\151\146", 
"\145\156\144\151\146", "\145\154\163\145", "\167\150\151\154\145", "\142\162\145\141\153", 
"\162\145\164\165\162\156", "\163\164\162\151\156\147", "\156\165\155\142\145\162", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static final long[] jjtoSpecial = {
   0x60L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[20];
private final int[] jjstateSet = new int[40];
protected char curChar;
/** Constructor. */
public CompTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public CompTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 20; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
