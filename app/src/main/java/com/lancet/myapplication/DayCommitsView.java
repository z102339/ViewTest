package com.lancet.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.List;

public class DayCommitsView extends View {

    private int squareSize = (int) (9 * getResources().getDisplayMetrics().density + 0.5f);

    private int gapSize = (int) (squareSize * 0.2f);

    private int singleOne = squareSize + gapSize;

    private int DAYSOFWEEK = 7;

    private long max;

    private int offsetX;
    private int offsetY;

    private Paint paint;

    private final int LESS=0xffebedf0;

    private final int LESSPLUS = 0xff9be9a8;

    private final int LESSPLUSPLUS=0xff40c463;

    private final int MORELESS = 0xff30A14e;

    private final int MORE = 0xff216e39;





    public void setDayCommits(List<List<DayCommit>> dayCommits,long max) {
        this.dayCommits = dayCommits;
        this.max=max;
        requestLayout();
        invalidate();
    }

    List<List<DayCommit>> dayCommits;


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        if (dayCommits != null && dayCommits.size() > 0) {
            int width = dayCommits.size() * singleOne;
            int height = DAYSOFWEEK * singleOne;
            setMeasuredDimension(width, height);
        } else {
            setMeasuredDimension(0, 0);
        }

        // super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public DayCommitsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }


    @Override
    protected void onDraw(Canvas canvas) {

        if (dayCommits != null && dayCommits.size() > 0) {
            for (int i = 0; i < dayCommits.size(); i++) {
                for (int j = 0; j < dayCommits.get(i).size(); j++) {
                    offsetX = i * singleOne;
                    offsetY = singleOne * j;
                    int color = getColor(dayCommits.get(i).get(j));
                    paint.setColor(color);
                    canvas.drawRect(offsetX, offsetY, offsetX + squareSize, offsetY + squareSize, paint);
                }
            }
        }
    }

    private int getColor(DayCommit dayCommit){
        long commits = dayCommit.getCommits();
        long adder=(max - 0) / 5;
        int color=0;
        if(commits==0){
            color=LESS;
        }else if(commits<=adder){
            color = LESSPLUS;
        }else if(commits<=2*adder){
            color = LESSPLUSPLUS;
        }else if(commits<=3*adder){
            color = MORELESS;
        }else{
            color = MORE;
        }

        return color;
    }
}
