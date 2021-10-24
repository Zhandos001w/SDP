package com.company;

public abstract class Phone {
    protected ITheme theme;
    protected IColor color;

    public void setTheme(ITheme theme){
        this.theme = theme;
    }

    public void setColor(IColor color){
        this.color = color;
    }

    public abstract void useTheme();
    public abstract void useColor();
}
