package MiniJava.codeGenerator;

import MiniJava.scanner.token.Token;

/**
 * This class handles the execution of semantic functions in the compiler.
 */
public class SemanticFunctionHandler {

    private CodeGenerator codeGenerator;

    public SemanticFunctionHandler(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void handle(int func, Token next) {
        switch (func) {
            case 0:
                noOp();
                break;
            case 1:
                checkID();
                break;
            case 2:
                pid(next);
                break;
            case 3:
                fpid();
                break;
            case 4:
                kpid(next);
                break;
            case 5:
                intpid(next);
                break;
            case 6:
                startCall();
                break;
            case 7:
                call();
                break;
            case 8:
                arg();
                break;
            case 9:
                assign();
                break;
            case 10:
                add();
                break;
            case 11:
                sub();
                break;
            case 12:
                mult();
                break;
            case 13:
                label();
                break;
            case 14:
                save();
                break;
            case 15:
                _while();
                break;
            case 16:
                jpf_save();
                break;
            case 17:
                jpHere();
                break;
            case 18:
                print();
                break;
            case 19:
                equal();
                break;
            case 20:
                less_than();
                break;
            case 21:
                and();
                break;
            case 22:
                not();
                break;
            case 23:
                defClass();
                break;
            case 24:
                defMethod();
                break;
            case 25:
                popClass();
                break;
            case 26:
                extend();
                break;
            case 27:
                defField();
                break;
            case 28:
                defVar();
                break;
            case 29:
                methodReturn();
                break;
            case 30:
                defParam();
                break;
            case 31:
                lastTypeBool();
                break;
            case 32:
                lastTypeInt();
                break;
            case 33:
                defMain();
                break;
        }
    }

    private void noOp() {
        // Do nothing
    }

    private void checkID() {
        codeGenerator.checkID();
    }

    private void pid(Token next) {
        codeGenerator.pid(next);
    }

    private void fpid() {
        codeGenerator.fpid();
    }

    private void kpid(Token next) {
        codeGenerator.kpid(next);
    }

    private void intpid(Token next) {
        codeGenerator.intpid(next);
    }

    private void startCall() {
        codeGenerator.startCall();
    }

    private void call() {
        codeGenerator.call();
    }

    private void arg() {
        codeGenerator.arg();
    }

    private void assign() {
        codeGenerator.assign();
    }

    private void add() {
        codeGenerator.add();
    }

    private void sub() {
        codeGenerator.sub();
    }

    private void mult() {
        codeGenerator.mult();
    }

    private void label() {
        codeGenerator.label();
    }

    private void save() {
        codeGenerator.save();
    }

    private void _while() {
        codeGenerator._while();
    }

    private void jpf_save() {
        codeGenerator.jpf_save();
    }

    private void jpHere() {
        codeGenerator.jpHere();
    }

    private void print() {
        codeGenerator.print();
    }

    private void equal() {
        codeGenerator.equal();
    }

    private void less_than() {
        codeGenerator.less_than();
    }

    private void and() {
        codeGenerator.and();
    }

    private void not() {
        codeGenerator.not();
    }

    private void defClass() {
        codeGenerator.defClass();
    }

    private void defMethod() {
        codeGenerator.defMethod();
    }

    private void popClass() {
        codeGenerator.popClass();
    }

    private void extend() {
        codeGenerator.extend();
    }

    private void defField() {
        codeGenerator.defField();
    }

    private void defVar() {
        codeGenerator.defVar();
    }

    private void methodReturn() {
        codeGenerator.methodReturn();
    }

    private void defParam() {
        codeGenerator.defParam();
    }

    private void lastTypeBool() {
        codeGenerator.lastTypeBool();
    }

    private void lastTypeInt() {
        codeGenerator.lastTypeInt();
    }

    private void defMain() {
        codeGenerator.callDefMain();
    }
}
