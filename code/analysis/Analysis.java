/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAClassDeclsProgram(AClassDeclsProgram node);
    void caseAMultClassDeclClassDecls(AMultClassDeclClassDecls node);
    void caseASingleClassDeclClassDecls(ASingleClassDeclClassDecls node);
    void caseAEmptyClassDeclClassDecl(AEmptyClassDeclClassDecl node);
    void caseAClassDeclClassDecl(AClassDeclClassDecl node);
    void caseAClassHdrClassHdr(AClassHdrClassHdr node);
    void caseAMultMemberDeclMemberDecls(AMultMemberDeclMemberDecls node);
    void caseASingleMemberDeclMemberDecls(ASingleMemberDeclMemberDecls node);
    void caseAFieldMember(AFieldMember node);
    void caseAMethodMember(AMethodMember node);
    void caseANoMemberMember(ANoMemberMember node);
    void caseAFieldDeclField(AFieldDeclField node);
    void caseAFieldDeclAndInitField(AFieldDeclAndInitField node);
    void caseAArrDeclField(AArrDeclField node);
    void caseABoolTypeType(ABoolTypeType node);
    void caseACharTypeType(ACharTypeType node);
    void caseAFloatTypeType(AFloatTypeType node);
    void caseAIntTypeType(AIntTypeType node);
    void caseAStringTypeType(AStringTypeType node);
    void caseAMethodDeclMethod(AMethodDeclMethod node);
    void caseANoParamMethodDeclMethod(ANoParamMethodDeclMethod node);
    void caseAMethodHdrDeclVoidMethodHdr(AMethodHdrDeclVoidMethodHdr node);
    void caseAMethodHdrDeclMethodHdr(AMethodHdrDeclMethodHdr node);
    void caseAMultFormalFormals(AMultFormalFormals node);
    void caseASingleFormalFormals(ASingleFormalFormals node);
    void caseAFormalDeclFormal(AFormalDeclFormal node);
    void caseAArrFormalDeclFormal(AArrFormalDeclFormal node);
    void caseABlockDeclBlock(ABlockDeclBlock node);
    void caseAEmptyBlockBlock(AEmptyBlockBlock node);
    void caseAMultStmtStmts(AMultStmtStmts node);
    void caseAStmtStmts(AStmtStmts node);
    void caseASimpleStmtStmt(ASimpleStmtStmt node);
    void caseAIfElseStmtStmt(AIfElseStmtStmt node);
    void caseAConditionCondition(AConditionCondition node);
    void caseALocalDeclSimpleStmt(ALocalDeclSimpleStmt node);
    void caseAAssignmentSimpleStmt(AAssignmentSimpleStmt node);
    void caseAMethodCallSimpleStmt(AMethodCallSimpleStmt node);
    void caseAReturnVoidSimpleStmt(AReturnVoidSimpleStmt node);
    void caseAReturnExprSimpleStmt(AReturnExprSimpleStmt node);
    void caseABlockSimpleStmt(ABlockSimpleStmt node);
    void caseAWhileLoopSimpleStmt(AWhileLoopSimpleStmt node);
    void caseADoWhileLoopSimpleStmt(ADoWhileLoopSimpleStmt node);
    void caseANoStatementSimpleStmt(ANoStatementSimpleStmt node);
    void caseAVarDeclLocalDecl(AVarDeclLocalDecl node);
    void caseAVarDeclAndInitLocalDecl(AVarDeclAndInitLocalDecl node);
    void caseAArrDeclLocalDecl(AArrDeclLocalDecl node);
    void caseAFieldSelfFieldAccess(AFieldSelfFieldAccess node);
    void caseAFieldDotAccessFieldAccess(AFieldDotAccessFieldAccess node);
    void caseAArrayRefFieldAccess(AArrayRefFieldAccess node);
    void caseAIdentifierArrayRefArrayRef(AIdentifierArrayRefArrayRef node);
    void caseAArrayDotRefArrayRef(AArrayDotRefArrayRef node);
    void caseAMethodCallNoArgMethodCall(AMethodCallNoArgMethodCall node);
    void caseAMethodCallWithArgMethodCall(AMethodCallWithArgMethodCall node);
    void caseAMethodCallWithDotOperNoArgMethodCall(AMethodCallWithDotOperNoArgMethodCall node);
    void caseAMethodCallWithDotOperAndArgMethodCall(AMethodCallWithDotOperAndArgMethodCall node);
    void caseAMultArgArgs(AMultArgArgs node);
    void caseASingleArgArgs(ASingleArgArgs node);
    void caseAExprDeclExpr(AExprDeclExpr node);

    void caseTComment(TComment node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTCharLiteral(TCharLiteral node);
    void caseTEscapeStringLiteral(TEscapeStringLiteral node);
    void caseTEscape(TEscape node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTLessThan(TLessThan node);
    void caseTLessThanOrEq(TLessThanOrEq node);
    void caseTGreaterThan(TGreaterThan node);
    void caseTGreaterThanOrEq(TGreaterThanOrEq node);
    void caseTEquals(TEquals node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTNot(TNot node);
    void caseTColon(TColon node);
    void caseTSemicolon(TSemicolon node);
    void caseTComma(TComma node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTLBkt(TLBkt node);
    void caseTRBkt(TRBkt node);
    void caseTNotEquals(TNotEquals node);
    void caseTEqualTo(TEqualTo node);
    void caseTPointer(TPointer node);
    void caseTDot(TDot node);
    void caseTModulo(TModulo node);
    void caseTFloatLit(TFloatLit node);
    void caseTWhiteSpace(TWhiteSpace node);
    void caseTBool(TBool node);
    void caseTBreak(TBreak node);
    void caseTChar(TChar node);
    void caseTConst(TConst node);
    void caseTContinue(TContinue node);
    void caseTKclass(TKclass node);
    void caseTDo(TDo node);
    void caseTElse(TElse node);
    void caseTFalse(TFalse node);
    void caseTFloat(TFloat node);
    void caseTIf(TIf node);
    void caseTInt(TInt node);
    void caseTNew(TNew node);
    void caseTNull(TNull node);
    void caseTPrivate(TPrivate node);
    void caseTProtected(TProtected node);
    void caseTPublic(TPublic node);
    void caseTReturn(TReturn node);
    void caseTStatic(TStatic node);
    void caseTString(TString node);
    void caseTStruct(TStruct node);
    void caseTThis(TThis node);
    void caseTTrue(TTrue node);
    void caseTWhile(TWhile node);
    void caseTVoid(TVoid node);
    void caseTIntegerLiteral(TIntegerLiteral node);
    void caseTIdentifier(TIdentifier node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
