/**
 *
 *  ******************************************************************************
 *  MontiCAR Modeling Family, www.se-rwth.de
 *  Copyright (c) 2017, Software Engineering Group at RWTH Aachen,
 *  All rights reserved.
 *
 *  This project is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this project. If not, see <http://www.gnu.org/licenses/>.
 * *******************************************************************************
 */
/* generated by template symboltable.SymbolTableCreator*/




package de.monticore.lang.embeddedmontiarc.embeddedmontiarcbehavior._symboltable;

import de.monticore.lang.embeddedmontiarc.embeddedmontiarc._ast.ASTEMACompilationUnit;
import de.monticore.lang.embeddedmontiarc.embeddedmontiarcbehavior._visitor.CommonEmbeddedMontiArcBehaviorDelegatorVisitor;
import de.monticore.lang.embeddedmontiarc.embeddedmontiarcbehavior._visitor.EmbeddedMontiArcBehaviorVisitor;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.ResolvingConfiguration;
import de.monticore.symboltable.Scope;
import de.se_rwth.commons.logging.Log;

import java.util.Deque;

public class EmbeddedMontiArcBehaviorSymbolTableCreator extends de.monticore.symboltable.CommonSymbolTableCreator
        implements EmbeddedMontiArcBehaviorVisitor {

    public EmbeddedMontiArcBehaviorSymbolTableCreator(
            final ResolvingConfiguration resolvingConfig, final MutableScope enclosingScope) {
        super(resolvingConfig, enclosingScope);
        initSuperSTC();
    }

    public EmbeddedMontiArcBehaviorSymbolTableCreator(final ResolvingConfiguration resolvingConfig, final Deque<MutableScope> scopeStack) {
        super(resolvingConfig, scopeStack);
        initSuperSTC();
    }

    private void initSuperSTC() {
        // TODO doc
        // visitor.set_de_monticore_lang_embeddedmontiarc_embeddedmontiarcmath__visitor_EmbeddedMontiArcMathVisitor(de.monticore.lang.embeddedmontiarc.embeddedmontiarcmath._visitor.EmbeddedMontiArcMathSymbolTableCreator(resolvingConfig, scopeStack));
        // visitor.set_de_monticore_lang_embeddedmontiarc_embeddedmontiarcbehavior__visitor_EmbeddedMontiArcBehaviorVisitor(de.monticore.lang.embeddedmontiarc.embeddedmontiarcbehavior._visitor.EmbeddedMontiArcBehaviorSymbolTableCreator(resolvingConfig, scopeStack));
        // visitor.set_de_monticore_lang_montiarc_math__visitor_MathVisitor(de.monticore.lang.montiarc.math._visitor.MathSymbolTableCreator(resolvingConfig, scopeStack));
    }

    /**
     * Creates the symbol table starting from the <code>rootNode</code> and
     * returns the first scope that was created.
     *
     * @param rootNode the root node
     * @return the first scope that was created
     */
    public Scope createFromAST(ASTEMACompilationUnit rootNode) {
        Log.errorIfNull(rootNode, "0xA7004_184 Error by creating of the EmbeddedMontiArcMathSymbolTableCreatorTOP symbol table: top ast node is null");
        rootNode.accept(realThis);
        return getFirstCreatedScope();
    }

    private EmbeddedMontiArcBehaviorVisitor realThis = this;

    public EmbeddedMontiArcBehaviorVisitor getRealThis() {
        return realThis;
    }

    @Override
    public void setRealThis(EmbeddedMontiArcBehaviorVisitor realThis) {
        if (this.realThis != realThis) {
            this.realThis = realThis;
        }
    }

}
