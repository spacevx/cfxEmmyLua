// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.comment.psi.LuaDocTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.korioz.intellij.lua.comment.psi.*;
import com.korioz.intellij.lua.ty.ITy;

public class LuaDocVarargParamImpl extends ASTWrapperPsiElement implements LuaDocVarargParam {

  public LuaDocVarargParamImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitVarargParam(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaDocTy getTy() {
    return PsiTreeUtil.getChildOfType(this, LuaDocTy.class);
  }

  @Override
  @NotNull
  public ITy getType() {
    return LuaDocPsiImplUtilKt.getType(this);
  }

}