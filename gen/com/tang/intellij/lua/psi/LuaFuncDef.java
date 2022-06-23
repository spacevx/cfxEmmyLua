// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaFuncStub;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;
import com.korioz.intellij.lua.comment.psi.api.LuaComment;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;
import com.korioz.intellij.lua.ty.ITyClass;

public interface LuaFuncDef extends LuaClassMethod, LuaDeclaration, LuaStatement, StubBasedPsiElement<LuaFuncStub> {

  @Nullable
  LuaFuncBody getFuncBody();

  @Nullable
  PsiElement getId();

  @Nullable
  LuaComment getComment();

  @NotNull
  ItemPresentation getPresentation();

  @NotNull
  List<LuaParamNameDef> getParamNameDefList();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  PsiElement setName(@NotNull String name);

  @Nullable
  String getName();

  int getTextOffset();

  @NotNull
  ITy guessReturnType(@NotNull SearchContext searchContext);

  @NotNull
  ITyClass guessParentType(@NotNull SearchContext searchContext);

  @NotNull
  Visibility getVisibility();

  int getWorth();

  boolean isDeprecated();

  @NotNull
  LuaParamInfo[] getParams();

  @NotNull
  PsiReference[] getReferences();

}
