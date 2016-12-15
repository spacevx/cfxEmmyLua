package com.tang.intellij.lua.stubs.impl;

import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.tang.intellij.lua.psi.LuaClassMethodDef;
import com.tang.intellij.lua.psi.LuaElementType;
import com.tang.intellij.lua.stubs.LuaClassMethodStub;

/**
 *
 * Created by tangzx on 2016/12/4.
 */
public class LuaClassMethodStubImpl extends StubBase<LuaClassMethodDef> implements LuaClassMethodStub {

    private String shortName;
    private String className;
    private boolean isStatic;

    public LuaClassMethodStubImpl(String shortName, String className, boolean isStatic, StubElement parent) {
        super(parent, LuaElementType.CLASS_METHOD_DEF);
        this.shortName = shortName;
        this.className = className;
        this.isStatic = isStatic;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public boolean isStatic() {
        return isStatic;
    }
}
