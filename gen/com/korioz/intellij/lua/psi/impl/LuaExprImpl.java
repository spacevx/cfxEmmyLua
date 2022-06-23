// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.psi.LuaTypes.*;
import com.korioz.intellij.lua.psi.*;
import com.korioz.intellij.lua.stubs.LuaExprStubImpl;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import com.korioz.intellij.lua.stubs.LuaExprStub;

public class LuaExprImpl extends LuaExprMixin implements LuaExpr {

  public LuaExprImpl(@NotNull LuaExprStubImpl<?> stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaExprImpl(@NotNull LuaExprStubImpl<?> stub, @NotNull IElementType type, @NotNull ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

}
