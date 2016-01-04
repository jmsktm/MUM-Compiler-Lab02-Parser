/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClassDeclsProgram(AClassDeclsProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultClassDeclClassDecls(AMultClassDeclClassDecls node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleClassDeclClassDecls(ASingleClassDeclClassDecls node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyClassDeclClassDecl(AEmptyClassDeclClassDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClassDeclClassDecl(AClassDeclClassDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClassHdrClassHdr(AClassHdrClassHdr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultMemberDeclMemberDecls(AMultMemberDeclMemberDecls node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleMemberDeclMemberDecls(ASingleMemberDeclMemberDecls node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldMember(AFieldMember node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodMember(AMethodMember node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoMemberMember(ANoMemberMember node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldDeclField(AFieldDeclField node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldDeclAndInitField(AFieldDeclAndInitField node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrDeclField(AArrDeclField node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTypeType(ABoolTypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTypeType(ACharTypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatTypeType(AFloatTypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTypeType(AIntTypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringTypeType(AStringTypeType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodDeclMethod(AMethodDeclMethod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoParamMethodDeclMethod(ANoParamMethodDeclMethod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodHdrDeclVoidMethodHdr(AMethodHdrDeclVoidMethodHdr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodHdrDeclMethodHdr(AMethodHdrDeclMethodHdr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFormalFormals(AMultFormalFormals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleFormalFormals(ASingleFormalFormals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFormalDeclFormal(AFormalDeclFormal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrFormalDeclFormal(AArrFormalDeclFormal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockDeclBlock(ABlockDeclBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyBlockBlock(AEmptyBlockBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultStmtStmts(AMultStmtStmts node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStmtStmts(AStmtStmts node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASimpleStmtStmt(ASimpleStmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElseStmtStmt(AIfElseStmtStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConditionCondition(AConditionCondition node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDeclSimpleStmt(ALocalDeclSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentSimpleStmt(AAssignmentSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodCallSimpleStmt(AMethodCallSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnVoidSimpleStmt(AReturnVoidSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnExprSimpleStmt(AReturnExprSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlockSimpleStmt(ABlockSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileLoopSimpleStmt(AWhileLoopSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADoWhileLoopSimpleStmt(ADoWhileLoopSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANoStatementSimpleStmt(ANoStatementSimpleStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclLocalDecl(AVarDeclLocalDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclAndInitLocalDecl(AVarDeclAndInitLocalDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrDeclLocalDecl(AArrDeclLocalDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldSelfFieldAccess(AFieldSelfFieldAccess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFieldDotAccessFieldAccess(AFieldDotAccessFieldAccess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayRefFieldAccess(AArrayRefFieldAccess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentifierArrayRefArrayRef(AIdentifierArrayRefArrayRef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayDotRefArrayRef(AArrayDotRefArrayRef node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodCallNoArgMethodCall(AMethodCallNoArgMethodCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodCallWithArgMethodCall(AMethodCallWithArgMethodCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodCallWithDotOperNoArgMethodCall(AMethodCallWithDotOperNoArgMethodCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMethodCallWithDotOperAndArgMethodCall(AMethodCallWithDotOperAndArgMethodCall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultArgArgs(AMultArgArgs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleArgArgs(ASingleArgArgs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprAndLogicalExprExpr(AExprAndLogicalExprExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprOrLogicalExprExpr(AExprOrLogicalExprExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALogicalExprExpr(ALogicalExprExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanLogicalExpr(ALessThanLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanLogicalExpr(AGreaterThanLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessThanOrEqLogicalExpr(ALessThanOrEqLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterThanOrEqLogicalExpr(AGreaterThanOrEqLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualsLogicalExpr(AEqualsLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotEqualsLogicalExpr(ANotEqualsLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusMinusExprLogicalExpr(APlusMinusExprLogicalExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAdditionPlusMinusExpr(AAdditionPlusMinusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubtractionPlusMinusExpr(ASubtractionPlusMinusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultDivModExprPlusMinusExpr(AMultDivModExprPlusMinusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplicationMultDivModExpr(AMultiplicationMultDivModExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivisionMultDivModExpr(ADivisionMultDivModExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModuloMultDivModExpr(AModuloMultDivModExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnitaryExprMultDivModExpr(AUnitaryExprMultDivModExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryNotUnitaryExpr(AUnaryNotUnitaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryPlusUnitaryExpr(AUnaryPlusUnitaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryMinusUnitaryExpr(AUnaryMinusUnitaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryUnitaryExpr(APrimaryUnitaryExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryFieldPrimary(APrimaryFieldPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryMethodCallPrimary(APrimaryMethodCallPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryIntegerLiteralPrimary(APrimaryIntegerLiteralPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryCharLiteralPrimary(APrimaryCharLiteralPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryStringLiteralPrimary(APrimaryStringLiteralPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryFloatLiteralPrimary(APrimaryFloatLiteralPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryTruePrimary(APrimaryTruePrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryFalsePrimary(APrimaryFalsePrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrimaryExprPrimary(APrimaryExprPrimary node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringLiteral(TStringLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCharLiteral(TCharLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscapeStringLiteral(TEscapeStringLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscape(TEscape node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThan(TLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThanOrEq(TLessThanOrEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThan(TGreaterThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreaterThanOrEq(TGreaterThanOrEq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrace(TLBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrace(TRBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNotEquals(TNotEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqualTo(TEqualTo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPointer(TPointer node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTModulo(TModulo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloatLit(TFloatLit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhiteSpace(TWhiteSpace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBreak(TBreak node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTContinue(TContinue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTKclass(TKclass node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNew(TNew node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNull(TNull node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrivate(TPrivate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProtected(TProtected node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPublic(TPublic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStatic(TStatic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStruct(TStruct node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThis(TThis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntegerLiteral(TIntegerLiteral node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}