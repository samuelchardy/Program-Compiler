//@author: Samuel Hardy

import java.io.* ;

public class SyntaxAnalyser extends AbstractSyntaxAnalyser
{
    private String fileName;

    public SyntaxAnalyser(String fileName) throws IOException
    {
        this.fileName = fileName;
        this.lex = new LexicalAnalyser(this.fileName);
    }


    /** Accept a token based on context.  Requires implementation. */
    public void acceptTerminal(int symbol) throws IOException, CompilationException
    {
        if(nextToken.symbol == symbol){
            myGenerate.insertTerminal(nextToken);
            nextToken = this.lex.getNextToken();
        }else{
            String explanatoryMessage = "Compilation Error: (" + this.fileName + ":" + nextToken.lineNumber + ")";
            throw new CompilationException(explanatoryMessage, nextToken.lineNumber);
        }
    }


    /** Begin processing the first (top level) token.*/
	public void _statementPart_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _statement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _assigmentStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _ifStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _whileStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _procedureStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _untilStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _forStatement_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _argumentList_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _condition_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _conditionalOperator_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _expression_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _term_() throws IOException, CompilationException
    {

    }


    /**
     * @throws IOException Error when reading/ writing to the file.
     * @throws CompilationException Error when processing a token in the compiler.
     */
    private void _factor_() throws IOException, CompilationException
    {

    }


    
}