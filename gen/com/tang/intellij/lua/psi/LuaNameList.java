// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaPlaceholderStub;

public interface LuaNameList extends LuaPsiElement, StubBasedPsiElement<LuaPlaceholderStub> {

  @NotNull
  List<LuaAttribute> getAttributeList();

  @NotNull
  List<LuaNameDef> getNameDefList();

}
