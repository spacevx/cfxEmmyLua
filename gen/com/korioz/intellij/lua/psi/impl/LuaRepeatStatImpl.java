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

public class LuaRepeatStatImpl extends LuaStatementImpl implements LuaRepeatStat {

  public LuaRepeatStatImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitRepeatStat(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, LuaExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getUntil() {
    return findChildByType(UNTIL);
  }

}
