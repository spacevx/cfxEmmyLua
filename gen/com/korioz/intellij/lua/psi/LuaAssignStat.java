// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaPlaceholderStub;

public interface LuaAssignStat extends LuaStatement, LuaDeclaration, StubBasedPsiElement<LuaPlaceholderStub> {

  @NotNull
  List<LuaExprList> getExprListList();

  @NotNull
  PsiElement getAssign();

  @NotNull
  LuaExprList getVarExprList();

  @Nullable
  LuaExprList getValueExprList();

}
