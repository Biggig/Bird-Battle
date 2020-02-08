package com.example.huangzilin.spacebattle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameObjects {
    private Context context;
    private Canvas canvas;
    Buttons buttons;
    Sprites sprites;
    Sprite mySprite = null;  // 本玩家精灵
    String myName = null;    // 本玩家精灵的名字
    boolean existed;


    GameObjects(Context context, Canvas canvas){
        this.context = context;
        this.canvas = canvas;
        buttons = new Buttons(context);
        buttons.pos();
        existed = false;
    }
    void draw(long loopTime){
        drawBackground(canvas);
        buttons.draw(canvas);
        if(existed){
            mySprite.draw(canvas, loopTime);
        }
    }

    void drawBackground(Canvas canvas){
        if(canvas==null) return;
    }

    String getPressedButton(float x,float y){
        return buttons.getPressedButton(x,y);
    }

    void addSprite(){
        if(!existed){
            mySprite = new Sprite(context);
            existed = true;
        }
    }

    boolean isExistedSprite(){
        return existed;
    }

}

